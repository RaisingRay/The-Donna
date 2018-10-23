/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop;

import GUITools.ErrorDisplayer;
import java.io.File;

/**
 *
 * @author Raiisa
 */
public class Workshop {
    
    private String AppDirRoot;
    
    private String TheDonnaDirRoot;
    private String PublicDirRoot;
    private String OperationsDirRoot;
    private String PrivateDirRoot;
    
    
    public static final String TheDonnaDirName="TheDonna";
   
    public static final String PublicDirName="Public";
    public static final String OperationsDirName="Operations";
    public static final String PrivateDirName="Private";
    
    
    public Workshop(){
        if ((System.getProperty("os.name")).toUpperCase().contains("WIN"))
            AppDirRoot = System.getenv("AppData");
        else
            AppDirRoot = System.getProperty("user.home");
    }
    
    public void SetupWorkshop(){
        File TheDonna=new File(getTheDonnaDirRoot());
        File Public=new File(getPublicDirRoot());
        File Private=new File(getPrivateDirRoot());
        File Operations=new File(getOperationsDirRoot());
        try{
            TheDonna.mkdir();
            Public.mkdir();
            Private.mkdir();
            Operations.mkdir();
        }catch(Exception e){
            new ErrorDisplayer("Couldn't Setup Diractorys");
        }
    }
    
    public boolean isSet(){
        File TheDonna=new File(getTheDonnaDirRoot());
        return TheDonna.exists();
    }

    
    
    
    
    
    public String getAppDirRoot() {
        return AppDirRoot;
    }

    public String getTheDonnaDirRoot() {
        return AppDirRoot+"\\"+TheDonnaDirName;
    }

    public String getPublicDirRoot() {
        return getTheDonnaDirRoot()+"\\"+PublicDirName;
    }

    public String getOperationsDirRoot() {
        return getTheDonnaDirRoot()+"\\"+OperationsDirName;
    }

    public String getPrivateDirRoot() {
        return getTheDonnaDirRoot()+"\\"+PrivateDirName;
    }
    
    
    
}
