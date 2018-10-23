/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Setup;

import DataAccessLayer.DataBaseConection;
import Entity.AccessDBModel;
import GUITools.ErrorDisplayer;
import Workshop.Workshop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Raiisa
 */

public class SetupTools extends Workshop {
    private File TheDonnaDBAccessDataFile;
    private AccessDBModel ADBM;
    private DataBaseConection AccessDataBase;
    private String TheDonnaDBAccessDataRoot;
    

    public SetupTools(AccessDBModel adbm){
        super();
        SetupWorkshop();
        ADBM=new AccessDBModel(adbm);
        TheDonnaDBAccessDataFile=new File(getTheDonnaDBAccessDataRoot());
    }
    public SetupTools(){
        super();
        ADBM=new AccessDBModel();
        TheDonnaDBAccessDataFile=new File(getTheDonnaDBAccessDataRoot());
    }
    
    public void Create(){
        try{
            TheDonnaDBAccessDataFile.createNewFile();
        }catch(IOException e){
            new ErrorDisplayer("Couldn't Create File");
        }
    }
    
    public boolean isSet(){
        return TheDonnaDBAccessDataFile.exists();
    }
    
    
    public void Write(){
       try{
        PrintWriter pw =new PrintWriter(TheDonnaDBAccessDataFile);
        pw.println(ADBM.getDBName());
        pw.println(ADBM.getUser());
        pw.println(ADBM.getPassword());
        pw.flush();
        pw.close();
       }catch(FileNotFoundException e){
           new ErrorDisplayer("Counldn't Write in File");
       }
    }
    
    public AccessDBModel ReadAccessDBModel(){
        try{
            BufferedReader br=new BufferedReader(new FileReader(getTheDonnaDBAccessDataRoot()));
            
            ADBM.setDBName(br.readLine());
            ADBM.setUser(br.readLine());
            ADBM.setPassword(br.readLine());
            br.close();
            return ADBM;
        }catch(IOException e){
            new ErrorDisplayer("Couldn't Read From File");
            return null;
        }
    }
    
    public void init(){
        AccessDataBase=new DataBaseConection(ADBM);
    }

    
    public String getTheDonnaDBAccessDataRoot() {
        return getPrivateDirRoot()+"\\"+"TheDonnaDBAccesData.txt";
    }
    
    
}
