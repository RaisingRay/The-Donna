/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Raiisa
 */
public class AccessDBModel {
    private String DBName;
    private String User;
    private String Password;

    public AccessDBModel(){}
    public AccessDBModel(String DBName, String User,String Password) {
        this.DBName = DBName;
        this.User = User;
        this.Password=Password;
    }
    public AccessDBModel(AccessDBModel abdm){
        DBName=abdm.getDBName();
        User=abdm.getUser();
        Password=abdm.getPassword();
    }

    public String getDBName() {
        return DBName;
    }

    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
    
    
    
}
