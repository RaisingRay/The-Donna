/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import Entity.AccessDBModel;
import GUITools.ErrorDisplayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Raiisa
 */
public class DataBaseConection {
    
    private Connection MyCon=null;
    private static String DbName;
    private static String BaseTrajectory="jdbc:mysql://localhost:3306/";
    private static String User;
    private static String Password;
    private boolean Connected=false;
    
    public DataBaseConection(){
     MyCon=getConnection();
    }
    
    public DataBaseConection(AccessDBModel ADBM){
        this.DbName=ADBM.getDBName();
        this.User=ADBM.getUser();
        this.Password=ADBM.getPassword();
    }
    
    
    private Connection getConnection(){
        Connection co=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            co=DriverManager.getConnection(BaseTrajectory+"the_donna", "root", "pass");
            Connected=true;
            return co;
        } catch(Exception e){
         new ErrorDisplayer("Couldn't Connect");
         return null;
        }
    }

    
    public boolean isConnected() {
        return Connected;
    }

    public void setConnected(boolean Connected) {
        this.Connected = Connected;
    }
    
    
    public PreparedStatement prepareQuery(String query){
        try{
            
        return MyCon.prepareStatement(query);
        }
        catch(Exception e){
            new ErrorDisplayer("Query is not prepared!!");
        return null;
        }
        
        
    }
    
    
    public ResultSet offlineSelect(String Query){
        try{
        PreparedStatement q= prepareQuery(Query);
        return(q.executeQuery());
        
        }
        catch(Exception e)
        {
             new ErrorDisplayer("Query is not executed!!");
               return null;
        }
    }
    
    
    
    public ResultSet onlineSelect(PreparedStatement state){
        
        try {
            return state.executeQuery();
        } catch (Exception e) {
            new ErrorDisplayer("Query is not executed!!");
               return null;
        }
    }
    
    public boolean cudOperation(PreparedStatement state)
    {
        try {
            return state.execute();
        } catch (Exception e) {
             new ErrorDisplayer("Query is not executed!!");
             
             e.printStackTrace();
             return false;
        }
    }
    
}
