/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;

/**
 *
 * @author Raiisa
 */
public class Bill {
    private int IdBill;
    private double RetainerFee;
    private Date Deadline;
    private double DepositFee;
    private Boolean Payed;
    private Client Client;
    private Case Case;
    public Bill() {
    }

    public Bill(int IdBill) {
        this.IdBill = IdBill;
    }

    
    
    public Bill(int IdBill, double RetainerFee, Date Deadline, double DepositFee, Boolean Payed,Case Case) {
        this.IdBill = IdBill;
        this.RetainerFee = RetainerFee;
        this.Deadline = Deadline;
        this.DepositFee = DepositFee;
        this.Payed = Payed;
        this.Case = Case;
    }

    public int getIdBill() {
        return IdBill;
    }

    public void setIdBill(int IdBill) {
        this.IdBill = IdBill;
    }

    public double getRetainerFee() {
        return RetainerFee;
    }

    public void setRetainerFee(double RetainerFee) {
        this.RetainerFee = RetainerFee;
    }

    public Date getDeadline() {
        return Deadline;
    }

    public void setDeadline(Date Deadline) {
        this.Deadline = Deadline;
    }

    public double getDepositFee() {
        return DepositFee;
    }

    public void setDepositFee(double DepositFee) {
        this.DepositFee = DepositFee;
    }

    public Boolean getPayed() {
        return Payed;
    }

    public void setPayed(Boolean Payed) {
        this.Payed = Payed;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client Client) {
        this.Client = Client;
    }

    public Case getCase() {
        return Case;
    }

    public void setCase(Case Case) {
        this.Case = Case;
    }
        
}
