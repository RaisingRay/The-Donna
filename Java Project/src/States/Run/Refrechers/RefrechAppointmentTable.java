/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Refrechers;

import BuisnessLogiqueLayer.BuisnesObjects;
import GUITools.Tweakers.TweakedTable;
import States.Run.Tables.AppointmentTableModel;
import javax.swing.JTable;

/**
 *
 * @author Raiisa
 */
public class RefrechAppointmentTable {
    
    private BuisnesObjects os;
    private JTable table;
    public RefrechAppointmentTable(JTable table){
        os=new BuisnesObjects();
        this.table=table;
        myInit();
    }
    
    private void myInit() {
      table.setModel(new AppointmentTableModel(os.getAllAppointment()));
      new TweakedTable(table);
    }
}
