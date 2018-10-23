/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raiisa
 */
public class Client {
    
    private int IdClient;
    private String FirstName;
    private String LastName;
    private int PhoneNumber;
    private String Adress;
    private File iv;
    private File sa;
    private List<Case> Cases=new ArrayList<Case>();
    private List<Appointment> Appointment=new ArrayList<Appointment>();
    
    public Client(){}
    public Client(int IdClient){
        this.IdClient=IdClient;
    }
    public Client(int IdClient,String FirstName,String LastName,int PhoneNumber,String Adress){
        this.IdClient=IdClient;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.PhoneNumber=PhoneNumber;
        this.Adress=Adress;
    }
    
    public int getIdClient() {
        return IdClient;
    }

    public void setIdClient(int IdClient) {
        this.IdClient = IdClient;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public List<Case> getCases() {
        return Cases;
    }

    public void setCases(List<Case> Cases) {
        this.Cases = Cases;
    }

    public List<Appointment> getAppointment() {
        return Appointment;
    }

    public void setAppointment(List<Appointment> Appointment) {
        this.Appointment = Appointment;
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
