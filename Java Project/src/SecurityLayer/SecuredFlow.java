/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecurityLayer;

import Entity.Case;
import Entity.Client;
import GUITools.ErrorDisplayer;
import Workshop.Workshop;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Raiisa
 */
public class SecuredFlow extends Workshop{
    //This is the Core of our SecurityLayer Package 
    //We recommend you to read RivestShamirAdleman and AdvancedEncryptionStandard Class first
    //after reading those you won't need comments to understand what we are doing in every single step
    //cause these method simply contains protols with the help of both of these two Classes
    //and after reading this that's it you should know most important classes of our programme,so feel free to read all the programme and
    //thank you for your patience, you can contatc us if you are having a hard time understanding anything.
    private AdvancedEncryptionStandard aes;
    private RivestShamirAdleman rsa;
    
    private final String publicKey="publicKey.pub";
    private final String privateKey="privateKey.key";
    private final String Skey="sa.enc";
    private final String Iv="iv";
    private final String CSkey="cskey.enc";
    private final String DSKey="dskey.enc";
    private final String Documents="Documents.pdf";
    private final String CrytedDocuments="CryptedDocuments.pdf";
    private final String DecryptedDocuments="DecryptedDocuments.pdf";
    
    public SecuredFlow(){
        super();
        rsa=new RivestShamirAdleman();
        aes=new AdvancedEncryptionStandard();
    }
    
    public void mkRSAkey(){
        rsa.initKeyPair(2048);
        rsa.generatePrivateKey();
        rsa.generatePublicKey();
        rsa.storePrivKey(new File(getPrivateKeyRoot()));
        rsa.storePubKey(new File(getPublicKeyRoot()));
    }
    
    private void EncryptAESKey(File key){
        rsa.retriavePrivKey(new File(getPrivateKeyRoot()));
        rsa.EncryptFile(key,getCryptedSKeyRoot());
    }
    
    private void decryptAESKey(File key){
        rsa.retrievePubKey(new File(getPublicKeyRoot()));
        rsa.DecryptFile(key, getDecryptedSKeyRoot());
    }
    
    
    public Client mkEncryptedClient(Client client){
        aes.initVector(16);
        aes.generateKey();
        Client c =new Client(client.getIdClient(), aes.EncryptString(client.getFirstName()), aes.EncryptString(client.getLastName()),client.getPhoneNumber(), aes.EncryptString(client.getAdress()));
        aes.storeIv(new File(getIvRoot()));
        aes.storeKey(new File(getSKeyRoot()));
        rsa.retriavePrivKey(new File(getPrivateKeyRoot()));
        rsa.EncryptFile(new File(getSKeyRoot()), getCryptedSKeyRoot());
        c.setIv(new File(getIvRoot()));
        c.setSa(new File(getCryptedSKeyRoot()));
       return c;
    }
    
    public Case mkEncryptedCase(Case Case){
        aes.initVector(16);
        aes.generateKey();
        Case c=new Case(Case.getIdCase(), aes.EncryptString(Case.getCaseName()), aes.EncryptString(Case.getAddress()), Case.getCaseHearing(),Case.getPostTime() , Case.isDone(), Case.getClient());
        aes.EncryptFile(Case.getLegalDocument(), getCryptedDocumentsRoot());
        c.setLegalDocument(new File(getCryptedDocumentsRoot()));
        aes.storeIv(new File(getIvRoot()));
        aes.storeKey(new File(getSKeyRoot()));
        rsa.retriavePrivKey(new File(getPrivateKeyRoot()));
        rsa.EncryptFile(new File(getSKeyRoot()), getCryptedSKeyRoot());
        c.setIv(new File(getIvRoot()));
        c.setSa(new File(getCryptedSKeyRoot()));
        return c;
    }
    
    public Client cryptClient(Client client){
        rsa.retrievePubKey(new File(getPublicKeyRoot()));
        rsa.DecryptFile(client.getSa(), getDecryptedSKeyRoot());
        aes.retrieveIv(client.getIv());
        aes.retrieveKey(new File(getDecryptedSKeyRoot()));
        Client c =new Client(client.getIdClient(), aes.EncryptString(client.getFirstName()), aes.EncryptString(client.getLastName()),client.getPhoneNumber(), aes.EncryptString(client.getAdress()));
        c.setIv(client.getIv());
        c.setSa(client.getSa());
        return c;
    }
    
    public Case cryptCase(Case Case){
        rsa.retrievePubKey(new File(getPublicKeyRoot()));
        rsa.DecryptFile(Case.getSa(), getDecryptedSKeyRoot());
        aes.retrieveIv(Case.getIv());
        aes.retrieveKey(new File(getDecryptedSKeyRoot()));
        Case c=new Case(Case.getIdCase(), aes.EncryptString(Case.getCaseName()), aes.EncryptString(Case.getAddress()), Case.getCaseHearing(),Case.getPostTime() , Case.isDone(), Case.getClient());
        aes.EncryptFile(Case.getLegalDocument(), getCryptedDocumentsRoot());
        c.setLegalDocument(new File(getCryptedDocumentsRoot()));
        c.setIv(Case.getIv());
        c.setSa(Case.getSa());
        return c;
    }
    
    
    public Client decryptClient(Client client){
        rsa.retrievePubKey(new File(getPublicKeyRoot()));
        rsa.DecryptFile(client.getSa(), getDecryptedSKeyRoot());
        aes.retrieveIv(client.getIv());
        aes.retrieveKey(new File(getDecryptedSKeyRoot()));
        Client c=new Client(client.getIdClient(), aes.DecryptString(client.getFirstName()), aes.DecryptString(client.getLastName()), client.getPhoneNumber(), aes.DecryptString(client.getAdress()));
        c.setIv(client.getIv());
        c.setSa(client.getSa());
        return c;
    }
    
    
    public Case decryptCase(Case Case){
        rsa.retrievePubKey(new File(getPublicKeyRoot()));
        rsa.DecryptFile(Case.getSa(), getDecryptedSKeyRoot());
        aes.retrieveIv(Case.getIv());
        aes.retrieveKey(new File(getDecryptedSKeyRoot()));
        Case c=new Case(Case.getIdCase(), aes.DecryptString(Case.getCaseName()), aes.DecryptString(Case.getAddress()), Case.getCaseHearing(),Case.getPostTime() , Case.isDone(), Case.getClient());
        aes.DecryptFile(Case.getLegalDocument(), getDecryptedDocumentsRoot());
        c.setLegalDocument(new File(getDecryptedDocumentsRoot()));
        c.setIv(Case.getIv());
        c.setSa(Case.getSa());
        return c;
    }
    
    public void deleteAllOperations(){
        File Key=new File(getSKeyRoot());
        File Iv=new File(getIvRoot());
        File CryptedSkey=new File(getCryptedSKeyRoot());
        File DecryptedSkey=new File(getDecryptedSKeyRoot());
        Key.delete();
        Iv.delete();
        CryptedSkey.delete();
        DecryptedSkey.delete();
    }
    public void delete(String Root){
        try
        {
            Files.deleteIfExists(Paths.get(Root));
        }catch(Exception e){
            new ErrorDisplayer("Couldn't Delete");
            e.printStackTrace();
        }
    }
    public String getPublicKeyRoot(){
        return getPublicDirRoot()+"\\"+publicKey;
    }
    public String getPrivateKeyRoot(){
        return getPrivateDirRoot()+"\\"+privateKey;
    }
    public String getSKeyRoot(){
        return getOperationsDirRoot()+"\\"+Skey;
    }
    public String getIvRoot(){
        return getOperationsDirRoot()+"\\"+Iv;
    }
    public String getCryptedSKeyRoot(){
        return getOperationsDirRoot()+"\\"+CSkey;
    }
    public String getDecryptedSKeyRoot(){
        return getOperationsDirRoot()+"\\"+DSKey;
    }
    public String getDocumentsRoot(){
        return getOperationsDirRoot()+"\\"+Documents;
    }
    public String getCryptedDocumentsRoot(){
        return getOperationsDirRoot()+"\\"+CrytedDocuments;
    }
    public String getDecryptedDocumentsRoot(){
        return getOperationsDirRoot()+"\\"+DecryptedDocuments;
    }
}
