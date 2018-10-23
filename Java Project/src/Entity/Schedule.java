/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Raiisa
 */
public class Schedule {
    private Date Date;
    private String Address;
    private String Type;
    private Client client;
    public Schedule() {
    }
    
    public Schedule(Date Date, String Address, String Type,Client client) {
        this.Date = Date;
        this.Address = Address;
        this.Type = Type;
        this.client=client;
    }
    
    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
    
 }
