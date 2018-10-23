/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.File;
import java.sql.Date;

/**
 *
 * @author Raiisa
 */
public class Case {
    private int IdCase;
    private String CaseName;
    private String Address;
    private File legalDocument;
    private Date CaseHearing;
    private Date PostTime;
    private boolean Done;
    private Client Client;
    private File iv;
    private File sa;
    
    public Case(){}
    public Case(int IdCase){
    this.IdCase=IdCase;
    }

    public Case(int IdCase, String CaseName, String Address, Date CaseHearing, Date PostTime, boolean Done, Client Client) {
        this.IdCase = IdCase;
        this.CaseName = CaseName;
        this.Address = Address;
        this.CaseHearing = CaseHearing;
        this.PostTime = PostTime;
        this.Done = Done;
        this.Client=Client;
    }

    public int getIdCase() {
        return IdCase;
    }

    public void setIdCase(int IdCase) {
        this.IdCase = IdCase;
    }

    public String getCaseName() {
        return CaseName;
    }

    public void setCaseName(String CaseName) {
        this.CaseName = CaseName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public File getLegalDocument() {
        return legalDocument;
    }

    public void setLegalDocument(File legalDocument) {
        this.legalDocument = legalDocument;
    }

    public Date getCaseHearing() {
        return CaseHearing;
    }

    public void setCaseHearing(Date CaseHearing) {
        this.CaseHearing = CaseHearing;
    }

    public Date getPostTime() {
        return PostTime;
    }

    public void setPostTime(Date PostTime) {
        this.PostTime = PostTime;
    }

    public boolean isDone() {
        return Done;
    }

    public void setDone(boolean Done) {
        this.Done = Done;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client Client) {
        this.Client = Client;
    }

    public File getIv() {
        return iv;
    }

    public void setIv(File iv) {
        this.iv = iv;
    }

    public File getSa() {
        return sa;
    }

    public void setSa(File sa) {
        this.sa = sa;
    }
    
    
    
      
    
}

