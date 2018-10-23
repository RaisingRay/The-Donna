package States.Run.Tables;

import BuisnessLogiqueLayer.BuisnesObjects;
import BuisnessLogiqueLayer.SecuredObjects;
import Entity.Appointment;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Raiisa
 */
public class AppointmentTableModel extends AbstractTableModel{
    
    public static final int IDAPPOINTMENT=0;
    public static final int DATE=1;
    public static final int DURATION=2;
    public static final int STATE=3;
    public static final int CLIENTNAME=4;
    
    private String[] ColumnsNames={"Identity","Date","Duration","State","Client's Name"};
    private List<Appointment> Appointments=new ArrayList<>();
    
    public AppointmentTableModel(List<Appointment> Appointments){
        this.Appointments=Appointments;
    }
    
    @Override
    public int getRowCount() {
        return Appointments.size();
    }

    @Override
    public int getColumnCount() {
        return ColumnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Appointment AppointmentTemp=Appointments.get(rowIndex);
        SecuredObjects so=new SecuredObjects();
        switch(columnIndex){
            case IDAPPOINTMENT:return AppointmentTemp.getIdAppointment();
            case DATE:return AppointmentTemp.getAppointmentDate();
            case DURATION:return AppointmentTemp.getDuration();
            case STATE:
                if(AppointmentTemp.isDone())
                    return "Occurred";
                else if(AppointmentTemp.isPostPoned())
                    return "Scheduled";
                else if(AppointmentTemp.isCancelled())
                   return "Canceled";
                else
                    return "On";
            case CLIENTNAME:return so.getClientById(AppointmentTemp.getClient()).getFirstName();
            default:return AppointmentTemp.getIdAppointment();
                
        }
    }
    
    @Override
    public String getColumnName(int col){
    return ColumnsNames[col];
    }
    
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
}
