/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Raiisa
 */
public class Appointment {
    private int IdAppointment;
    private Date AppointmentDate ;
    private Time Duration;
    private Boolean Done;
    private Boolean Cancelled;
    private Boolean PostPoned;
    private Client Client;
    
    
    public Appointment(){}
    public Appointment(int IdAppointment){
        this.IdAppointment=IdAppointment;
    }

    public Appointment(int IdAppointment, Date AppointmentDate, Time Duration, Boolean Done, Boolean Cancelled, Boolean PostPoned, Client Client) {
        this.IdAppointment = IdAppointment;
        this.AppointmentDate = AppointmentDate;
        this.Duration = Duration;
        this.Done = Done;
        this.Cancelled = Cancelled;
        this.PostPoned = PostPoned;
        this.Client=Client;
    }

    public int getIdAppointment() {
        return IdAppointment;
    }

    public void setIdAppointment(int IdAppointment) {
        this.IdAppointment = IdAppointment;
    }

    public Date getAppointmentDate() {
        return AppointmentDate;
    }

    public void setAppointmentDate(Date AppointmentDate) {
        this.AppointmentDate = AppointmentDate;
    }

    public Time getDuration() {
        return Duration;
    }

    public void setDuration(Time Duration) {
        this.Duration = Duration;
    }

    public Boolean isDone() {
        return Done;
    }

    public void setDone(Boolean Done) {
        this.Done = Done;
    }

    public Boolean isCancelled() {
        return Cancelled;
    }

    public void setCancelled(Boolean Cancelled) {
        this.Cancelled = Cancelled;
    }

    public Boolean isPostPoned() {
        return PostPoned;
    }

    public void setPostPoned(Boolean PostPoned) {
        this.PostPoned = PostPoned;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client Client) {
        this.Client = Client;
    }
    
    
}
