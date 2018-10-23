/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer;

import Entity.*;
import GUITools.ErrorDisplayer;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Med
 */
public class DataBaseOperation {
 
   private DataBaseConection Con;
    private PreparedStatement State;
    private String Query;
    private ResultSet Rset;

    public DataBaseOperation(){
        Con=new DataBaseConection();
    }
    
    
    public ResultSet selectAllClient(){
        
        try {
            Query="SELECT * FROM clients";
            return Con.offlineSelect(Query);
        } catch (Exception e) {
            new ErrorDisplayer("Query is not executed in Operation!!");
            return null;
        }
    }
    public ResultSet selectAllCases(){
        
        try {
            Query="SELECT * FROM cases";
            return Con.offlineSelect(Query);
        } catch (Exception e) {
            new ErrorDisplayer("Query is not executed in Operation!!");
            return null;
        }
    }
    public ResultSet selectAllSubpeona(){
        
        try {
            Query="SELECT * FROM subpeona";
            return Con.offlineSelect(Query);
        } catch (Exception e) {
            new ErrorDisplayer("Query is not executed in Operation!!");
            return null;
        }
    }
    
    public ResultSet selectAllAppointment(){
        
        try {
            Query="SELECT * FROM appointment";
            return Con.offlineSelect(Query);
        } catch (Exception e) {
            new ErrorDisplayer("Query is not executed in Operation!!");
            return null;
        }
    }
    public ResultSet selectAllBill(){
        
        try {
            Query="SELECT * FROM bill";
            return Con.offlineSelect(Query);
        } catch (Exception e) {
            new ErrorDisplayer("Query is not executed in Operation!!");
            return null;
        }
    }
    
    public ResultSet selectClientById(int id){
        try {
            Query="SELECT * FROM clients Where id_client=?";
            State=Con.prepareQuery(Query);
            State.setInt(1, id);
            return Con.onlineSelect(State);
        } catch (Exception e) {
          new ErrorDisplayer("Row doesn't exist!!");
            return null;   
        }
    }
     public ResultSet selectCasesById(int id){
        try {
            Query="SELECT * FROM cases Where id_case=?";
            State=Con.prepareQuery(Query);
            State.setInt(1, id);
            return Con.onlineSelect(State);
        } catch (Exception e) {
          new ErrorDisplayer("Row doesn't exist!!");
            return null;   
        }
    } 
     public ResultSet selectSubpeonaById(int id){
        try {
            Query="SELECT * FROM subpeona Where id_subpeona=?";
            State=Con.prepareQuery(Query);
            State.setInt(1, id);
            return Con.onlineSelect(State);
        } catch (Exception e) {
          new ErrorDisplayer("Row doesn't exist!!");
            return null;   
        }
    } 
    public ResultSet selectappointmentById(int id){
        try {
            Query="SELECT * FROM appointment Where id_appointment=?";
            State=Con.prepareQuery(Query);
            State.setInt(1, id);
            return Con.onlineSelect(State);
        } catch (Exception e) {
          new ErrorDisplayer("Row doesn't exist!!");
            return null;   
        }
    } 
    
    public ResultSet selectBillById(int id){
        try {
            Query="SELECT * FROM bill Where id_retainer=?";
            State=Con.prepareQuery(Query);
            State.setInt(1, id);
            return Con.onlineSelect(State);
        } catch (Exception e) {
          new ErrorDisplayer("Row doesn't exist!!");
            return null;   
        }
    }
    
    
    public boolean updateClientById( Client C){
        try {
            Query="UPDATE clients SET first_name=? , last_name=? , phone_number=? , address=?"
                    + " WHERE id_client=?";
            State=Con.prepareQuery(Query);
            State.setString(1, C.getFirstName());
            State.setString(2, C.getLastName());
            State.setInt(3, C.getPhoneNumber());
            State.setString(4, C.getAdress());
            State.setInt(5, C.getIdClient());
            return Con.cudOperation(State);
        } catch (Exception e) {
             new ErrorDisplayer("Row doesn't exist!!");
             e.printStackTrace();
            return false;   
        }
    }
    public boolean updateCasesById( Case Ca){
        try {
            Query="UPDATE cases SET case_name=? , address=?  , case_hearing=? , "
                    + " post_date=? , done=?  WHERE id_case=?";
            State=Con.prepareQuery(Query);
            State.setString(1, Ca.getCaseName());
            State.setString(2, Ca.getAddress());
            State.setDate(3,Ca.getCaseHearing());
            State.setDate(4, Ca.getPostTime());
            State.setBoolean(5, Ca.isDone());
            State.setInt(6, Ca.getIdCase());
            return Con.cudOperation(State);
        } catch (Exception e) {
             new ErrorDisplayer("Row doesn't exist!!");
            return false;   
        }
    }
    
    public boolean updateBillById( Bill B){
        try {
            Query="UPDATE bill SET retainer_fee=? , deadline=?  , deposit_fee=? , payed=?  WHERE id_retainer=?";
            State=Con.prepareQuery(Query);
            State.setDouble(1,B.getRetainerFee());
            State.setDate(2,B.getDeadline());
            State.setDouble(3,B.getDepositFee());
            State.setBoolean(4,true);
            State.setInt(5,B.getIdBill());
            return Con.cudOperation(State);
        } catch (Exception e) {
             new ErrorDisplayer("Row doesn't exist!!");
             e.printStackTrace();
            return false;   
        }
    }
        
        public boolean updatesubpeonaById( Subpeona S){
        try {
            Query="UPDATE subpeona SET post_date=?  "
                    + " WHERE id_subpeona=?";
            State=Con.prepareQuery(Query);
            State.setDate(1,S.getPostDate());
             State.setInt(2,S.getIdSubpeona());
            return Con.cudOperation(State);
        } catch (Exception e) {
             new ErrorDisplayer("Row doesn't exist!!");
            return false;   
        }
    }
    
        public boolean updateAppointmentById( Appointment A){
        try {
            Query="UPDATE appointment SET appointment_date=? , duration=?  , done=? , "
                    + " canceled=? , postponed=? WHERE id_appointment=?";
            State=Con.prepareQuery(Query);
            State.setDate(1,A.getAppointmentDate());
            State.setTime(2, A.getDuration());
            State.setBoolean(3,A.isDone());
            State.setBoolean(4,A.isCancelled());
            State.setBoolean(5, A.isPostPoned());
            State.setInt(6, A.getIdAppointment());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Row doesn't exist!!");
                  return false;   
                      }
        
        }
        
        
    public boolean insertAppointment( Appointment A){
        try {
            Query="INSERT INTO appointment(appointment_date,duration,done,canceled,postponed,id_client) "
                    +" values(?,?,?,?,?,?) ";
            State=Con.prepareQuery(Query);
            State.setDate(1,A.getAppointmentDate());
            State.setTime(2, A.getDuration());
            State.setBoolean(3,A.isDone());
            State.setBoolean(4,A.isCancelled());
            State.setBoolean(5, A.isPostPoned());
            State.setInt(6, A.getClient().getIdClient());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Adding a row didn't happen!!");
                  return false;   
                      }
        
        }
    
    public boolean insertClient( Client C){
        try {
            Query="INSERT INTO clients(first_name,last_name,phone_number,address,iv,sa) "
                    +" values(?,?,?,?,?,?) ";
            State=Con.prepareQuery(Query);
            State.setString(1,C.getFirstName());
            State.setString(2, C.getLastName());
            State.setInt(3,C.getPhoneNumber());
            State.setString(4,C.getAdress());
            State.setBinaryStream(5, new FileInputStream(C.getIv()));
            State.setBinaryStream(6, new FileInputStream(C.getSa()));
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Adding a row didn't happen!!");
                e.printStackTrace();
                  return false;   
                      }
        
        }
    
    public boolean insertCase( Case Ca){
        try {
            Query="INSERT INTO cases(id_case,case_name,address,legal_document,case_hearing,post_date,done,id_client,iv,sa)  values(?,?,?,?,?,?,?,?,?,?)";
            State=Con.prepareQuery(Query);
            State.setInt(1, Ca.getIdCase());
            State.setString(2,Ca.getCaseName());
            State.setString(3, Ca.getAddress());
            State.setBinaryStream(4, new FileInputStream(Ca.getLegalDocument()));
            State.setDate(5,Ca.getCaseHearing());
            State.setDate(6,Ca.getPostTime());
            State.setBoolean(7,Ca.isDone());
            State.setInt(8,Ca.getClient().getIdClient());
            State.setBinaryStream(9, new FileInputStream(Ca.getIv()));
            State.setBinaryStream(10, new FileInputStream(Ca.getSa()));
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Adding a row didn't happen!!");
                e.printStackTrace();
                  return false;   
                      }
        
        }
    
    
    public boolean insertBill( Bill B){
        try {
            Query="INSERT INTO bill(retainer_fee,deadline,deposit_fee,payed,id_case) values(?,?,?,?,?) ";
            State=Con.prepareQuery(Query);
            State.setDouble(1,B.getRetainerFee());
            State.setDate(2, B.getDeadline());
            State.setDouble(3,B.getDepositFee());
            State.setBoolean(4,B.getPayed());
            State.setInt(5,B.getCase().getIdCase());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Adding a row didn't happen!!");
                  return false;   
                      }
        
        }
    
      public boolean insertSubpeona( Subpeona S){
        try {
            Query="INSERT INTO subpeona(id_subpeona,document,post_date,id_case)"
                    +" values(?,?,?,?) ";
            State=Con.prepareQuery(Query);
            State.setInt(1,S.getIdSubpeona());
            State.setBinaryStream(2,new FileInputStream(S.getDocument()));   
            State.setDate(3,S.getPostDate());
            State.setInt(4,S.getCase().getIdCase());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Adding a row didn't happen!!");
                  return false;   
                      }
        
        }
    
      
      
      public boolean deleteSubpeonaById( Subpeona S){
        try {
            Query="DELETE from subpeona WHERE id_subpeona=?";
            State=Con.prepareQuery(Query);
            State.setInt(1,S.getIdSubpeona());
            
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Deleting a row didn't happen!!");
                  return false;   
                      }
        
        }
      
      public boolean deleteBillById( Bill B){
        try {
            Query="DELETE from bill WHERE id_retainer=?";
            State=Con.prepareQuery(Query);
            State.setInt(1,B.getIdBill());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Deleting a row didn't happen!!");
                  return false;   
                      }
        
        }
      public boolean deleteAppointmentById( Appointment A){
        try {
            Query="DELETE from  appointment WHERE id_appointment=?";
            State=Con.prepareQuery(Query);
            State.setInt(1,A.getIdAppointment());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Deleting a row didn't happen!!");
                  return false;   
                      }
        
        }
      
        public boolean deleteCasesById( Case Ca){
        try {
            Query="DELETE from  cases WHERE id_case=?";
            State=Con.prepareQuery(Query);
            State.setInt(1,Ca.getIdCase());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Deleting a row didn't happen!!");
                  return false;   
                      }
        
        }
      
        
          public boolean deleteClientById( Client C){
        try {
            Query="DELETE from  clients WHERE id_client=?";
            State=Con.prepareQuery(Query);
            State.setInt(1,C.getIdClient());
            return Con.cudOperation(State);
            }
              catch (Exception e) {
                new ErrorDisplayer("Deleting a row didn't happen!!");
                  return false;   
                      }
        
        }
      
      
    
    
    
        
        
        
        
      
      
    
      
      
   // Generated Getters and Setters 
    public PreparedStatement getState() {
        return State;
    }

    public void setState(PreparedStatement State) {
        this.State = State;
    }

    public String getQuery() {
        return Query;
    }

    public void setQuery(String Query) {
        this.Query = Query;
    }

    public ResultSet getRset() {
        return Rset;
    }

    public void setRset(ResultSet Rset) {
        this.Rset = Rset;
    }

    
    
}
