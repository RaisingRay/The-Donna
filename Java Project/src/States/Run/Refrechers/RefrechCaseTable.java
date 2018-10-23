/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Refrechers;

import BuisnessLogiqueLayer.SecuredObjects;
import GUITools.Tweakers.TweakedTable;
import States.Run.Tables.CaseTableModel;
import javax.swing.JTable;

/**
 *
 * @author Raiisa
 */
public class RefrechCaseTable {
    private SecuredObjects os;
    private JTable table;
    public RefrechCaseTable(JTable table){
        os=new SecuredObjects();
        this.table=table;
        myInit();
    }

    private void myInit() {
      table.setModel(new CaseTableModel(os.getAllCase()));
      new TweakedTable(table);
    }
}
