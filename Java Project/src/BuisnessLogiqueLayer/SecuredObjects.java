/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuisnessLogiqueLayer;

import DataAccessLayer.DataBaseOperation;
import Entity.Case;
import Entity.Client;
import GUITools.ErrorDisplayer;
import SecurityLayer.SecuredFlow;
import java.sql.ResultSet;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
/**
 *
 * @author Raiisa
 */
public class SecuredObjects {
    
    private final DataBaseOperation dbo;
    private final SecuredFlow sf;
    //Welcome to SecuredObject
    public SecuredObjects(){
        dbo=new DataBaseOperation();
        
        //we use SecuredFlow  to encrypt and dycrypt data , after reading all of these comments you actualy must go through SecuredFlow to 
        //see that this code is not a Copy past one
        sf=new SecuredFlow();
    }
    
    /*
     *this Class contains a secured CRUD, so to make this easy you won't have to read all of the method
     *simply one CRUD for one entity is more then enough
     *and we are going to read Case CRUD since it's the complexe one
     */
    
    
     public boolean inputeCase(Case Case){
        boolean ok;
        //this method does the Creating part, it takes Case as parameter and insert it encrypted inside the database
        //and to do that we use mkEncryptedCase method as you may see this takes a Case and return a EncryptedCase Case
        //what this method does is it create AES key and IV,  encrypt Case data with them and then Encrypt the AES Iv and Key with private RSA key then we stored,
        //and then we send them to dataBase safely while no one can spy on us or even when he hacks the database he won't be able to read our data
        ok=dbo.insertCase(sf.mkEncryptedCase(Case));
        
        //in every encrypt and decrypt operation we leave Files inside Operation Folder so we delete them every time 
        sf.deleteAllOperations();
        return ok;
    }
      public boolean updateCase(Case Case){
        boolean ok;
        //if you notice this doesn't use mKEncryptedCase like the inputeCase method does, and that's because this  Case already have it's own 
        //Key and Iv parameter so we simply encrypt with RSA private key the Case with the and update it encrypted 
        ok=dbo.updateCasesById(sf.cryptCase(Case));
        sf.deleteAllOperations();
        return ok;
    }
   
    public boolean deleteCase(Case Case){
        //i don't think that deleteCase need to be Secured
        return dbo.deleteCasesById(Case);
    }
    
    public List<Case> getAllCase(){
        //both get AllCase and getCaseById use the same method, EntityCaseConverter this is a good programming practice to do more in less code
        //let's see what our EntityCaeConverter Does,
        return EntityCaseConverter(dbo.selectAllCases());
    }
    
    public Case getCaseById(Case Case){
        sf.deleteAllOperations();
        return EntityCaseConverter(dbo.selectCasesById(Case.getIdCase())).get(0);
    }
    
    
       
    
    private List<Case> EntityCaseConverter(ResultSet rs){
        try{
            List<Case> ListCase=new ArrayList<Case>();
            //this takes as parameter ResultSet this should contains the crypted Case data so let's see what we do to decrypt it
            while(rs.next()){
                //first we make sure our Operation Folder is Clean 
                sf.deleteAllOperations();
                //then we extract the data inside a Case entity this should be encypted as well
                Case encryptedCase=new Case(rs.getInt("id_case"), rs.getString("case_name"), rs.getString("address"), rs.getDate("case_hearing"), rs.getDate("post_date"), rs.getBoolean("done"), new Client(rs.getInt("id_client")));
                //we take the iv and key inide InputeStream object we'll see why in a sec and by the way Iv is not crypted we just encrypt the Key
                InputStream ivInput=rs.getBinaryStream("iv");
                InputStream saInput=rs.getBinaryStream("sa");
                //these two file just for having those iv and key inside the opeartion folder to work with them
                File iv=new File(sf.getIvRoot());
                File CSk=new File(sf.getCryptedSKeyRoot());
                //inpute iv and key just to read the data from inputeStream object and store them inside operation folder
                InputivReader(ivInput, iv);
                InputSReader(saInput,CSk);
                //now we can retrive them and give them to our cryptedCase
                encryptedCase.setIv(iv);
                encryptedCase.setSa(CSk);
                //we do the same for our LegalDocument
                InputStream LDInput=rs.getBinaryStream("legal_document");
                File LD=new File(sf.getOperationsDirRoot()+"\\"+encryptedCase.getIdCase()+".pdf");
                InputSReader(LDInput, LD);
                encryptedCase.setLegalDocument(LD);
                //now is about time to give the SecuredFlow the Case with it's Iv and encrypted the Key to decrypt the key and with it we decrypt Case
                Case decryptedCase=sf.decryptCase(encryptedCase);
                //and last but not least we add the decyrypted Case to our list
                
                //NOW you can go and read what SecuredFlow Class Contains it's inside SecuredLayer Package
                ListCase.add(decryptedCase);
            }
            return ListCase;
        }catch(Exception e){
            new ErrorDisplayer("Entity Convert Case Error");
            e.printStackTrace();
            return null;
        }
    } 
    
    private void InputSReader(InputStream input,File file){
        try{
        FileOutputStream out=new FileOutputStream(file);
                byte[] buffer=new byte[256];
                while(input.read(buffer)>0){
                    out.write(buffer);
                }
                out.close();
                input.close();
        }catch(Exception e){
            new ErrorDisplayer("InputReader Error");
        }
    }
    
    private void InputivReader(InputStream input,File file){
        try{
        FileOutputStream out=new FileOutputStream(file);
                byte[] buffer=new byte[16];
                while(input.read(buffer)>0){
                    out.write(buffer);
                }
                out.close();
                input.close();
        }catch(Exception e){
            new ErrorDisplayer("InputReader Error");
        }
    }
    
    
    
    public boolean inputeClient(Client client){
        boolean ok;
        ok= dbo.insertClient(sf.mkEncryptedClient(client));
        sf.deleteAllOperations();
        return ok;
    }
    
    
    public boolean updateClient(Client client){
        boolean ok;
        ok=dbo.updateClientById(sf.cryptClient(client));
        sf.deleteAllOperations();
        return ok;
    }
    
   
    
    public boolean deleteClient(Client client){
        return dbo.deleteClientById(client);
    }
    
    
    public List<Client> getAllClient(){
        return EntityClientConverter(dbo.selectAllClient());
    }
    
    
    public Client getClientById(Client client){
        return EntityClientConverter(dbo.selectClientById(client.getIdClient())).get(0);
    }
    
    
    
    
    //MODEL COVERTER
    private List<Client> EntityClientConverter(ResultSet rs){
        try{
            List<Client> ListClient=new ArrayList<Client> ();
            while(rs.next()){
                sf.deleteAllOperations();
                Client encryptedClient=new Client(rs.getInt("id_client"), rs.getString("first_name"), rs.getString("last_name"),rs.getInt("phone_number"), rs.getString("address"));
                InputStream ivInput=rs.getBinaryStream("iv");
                InputStream saInput=rs.getBinaryStream("sa");
                File iv=new File(sf.getIvRoot());
                File CSk=new File(sf.getCryptedSKeyRoot());
                InputivReader(ivInput, iv);
                InputSReader(saInput,CSk);
                encryptedClient.setIv(iv);
                encryptedClient.setSa(CSk);
                Client decryptedClient=sf.decryptClient(encryptedClient);
                ListClient.add(decryptedClient);
            }
            return ListClient;
        }catch(Exception e){
            new ErrorDisplayer("Entity Convert Client Error");
            e.printStackTrace();
            return null;
        }
    }

}
