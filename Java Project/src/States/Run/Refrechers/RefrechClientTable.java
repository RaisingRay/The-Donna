/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Refrechers;

import BuisnessLogiqueLayer.SecuredObjects;
import GUITools.Tweakers.TweakedTable;
import States.Run.Tables.ClientTableModel;
import javax.swing.JTable;

/**
 *
 * @author Raiisa
 */
public class RefrechClientTable {
    SecuredObjects os;
    JTable table;
    public RefrechClientTable(JTable table){
        os=new SecuredObjects();
        this.table=table;
        myInit();
    }

    private void myInit() {
      table.setModel(new ClientTableModel(os.getAllClient()));
      new TweakedTable(table);
    }
}
