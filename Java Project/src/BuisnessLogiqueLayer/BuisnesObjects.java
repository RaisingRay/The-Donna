/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuisnessLogiqueLayer;

import DataAccessLayer.DataBaseOperation;
import Entity.*;
import GUITools.ErrorDisplayer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Raiisa
 */
public class BuisnesObjects {
    
    private final DataBaseOperation dbo;
    
    
    //constractors
    public BuisnesObjects(){
        dbo=new DataBaseOperation();
    }
    
    
    //inputes
    public void inputBill(Bill bill){
        dbo.insertBill(bill);
    }
    
    public void inputSubpeona(Subpeona subpeona){
        dbo.insertSubpeona(subpeona);
    }
    
    public void inputAppointment(Appointment appointment){
        dbo.insertAppointment(appointment);
    }
    //Selection all
    
    public List<Bill> getAllBill(){
        return EntityBillConverter(dbo.selectAllBill());
    }
    
    public List<Subpeona> getAllSubpeona(){
        return EntitySubpeonaConverter(dbo.selectAllSubpeona());
    }
    
    public List<Appointment> getAllAppointment(){
        return EntityAppointmentConverter(dbo.selectAllAppointment());
    }
    
    //Select by id
    
    public Bill getBillById(Bill bill){
        return EntityBillConverter(dbo.selectBillById(bill.getIdBill())).get(0);
    }
    
    public Subpeona getSubpeonaById(Subpeona subpeona){
        return EntitySubpeonaConverter(dbo.selectSubpeonaById(subpeona.getIdSubpeona())).get(0);
    }
    
    public Appointment getAppointmentById(Appointment appointment){
        return EntityAppointmentConverter(dbo.selectappointmentById(appointment.getIdAppointment())).get(0);
    }
    
    
    //updates
    public void updateBill(Bill bill){
        dbo.updateBillById(bill);
    }
    
    public void updateSubpeona(Subpeona subpeona){
        dbo.updatesubpeonaById(subpeona);
    }
    
    public void updateAppointment(Appointment appointment){
        dbo.updateAppointmentById(appointment);
    }
    
    //deletes
    public void deleteBill(Bill bill){
        dbo.deleteBillById(bill);
    }
    
    public void deleteSubpeona(Subpeona subpeona){
        dbo.deleteSubpeonaById(subpeona);
    }
    
    public void deleteAppointment(Appointment appointment){
        dbo.deleteAppointmentById(appointment);
    }
    
    
    
    
    //Converters
    
    private List<Bill> EntityBillConverter(ResultSet rs){
        try{
            List<Bill> billList=new ArrayList<Bill>();
            while(rs.next()){
                    billList.add(new Bill(rs.getInt("id_retainer"), rs.getDouble("retainer_fee"), rs.getDate("deadline"), rs.getDouble("deposit_fee"),rs.getBoolean("payed"),new Case(rs.getInt("id_case"))));
            }
            return billList;
        }catch(Exception e){
            new ErrorDisplayer("Bill Convert Error");
            return null;
        }
    }
    
    private List<Subpeona> EntitySubpeonaConverter(ResultSet rs){
        try{
            List<Subpeona> subpeonaList=new ArrayList<Subpeona>();
            while(rs.next()){
                Subpeona sub=new Subpeona(rs.getInt("id_subpeona"), rs.getDate("post_date"),new Case(rs.getInt("id_case")));
                InputStream input=rs.getBinaryStream("document");
                File file=new File(sub.getIdSubpeona()+".pdf");
                FileOutputStream out=new FileOutputStream(file);
                byte[] buffer=new byte[1024];
                while(input.read(buffer)>0){
                    out.write(buffer);
                }
                subpeonaList.add(sub);
            }
            return subpeonaList;
        }catch(Exception e){
            new ErrorDisplayer("Subpeona Converter Error");
            return null;
        }
    }
    
    
    private List<Appointment> EntityAppointmentConverter(ResultSet rs){
        try{
                List<Appointment> appointmentList=new ArrayList<Appointment>();
                while(rs.next()){
                    appointmentList.add(new Appointment(rs.getInt("id_appointment"), rs.getDate("appointment_date"), rs.getTime("duration"), rs.getBoolean("done"), rs.getBoolean("canceled"), rs.getBoolean("postponed"),new Client(rs.getInt("id_client"))));
                }
                return appointmentList;
        }catch(Exception e){
            new ErrorDisplayer("Appointment Converter Error");
            return null;
        }
    }
}
