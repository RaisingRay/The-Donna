/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Tables;

import BuisnessLogiqueLayer.SecuredObjects;
import Entity.Case;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Raiisa
 */
public class CaseTableModel extends AbstractTableModel{
    public static final int IDCASE=0;
    public static final int CASENAME=1;
    public static final int ADDRESS=2;
    public static final int CASEHEARING=3;
    public static final int CLIENTNAME=4;
    
    private List<Case> Cases=new ArrayList<Case>();
    private String[] ColumnsNames={"Identity","Name","Adress","HearingDate","Client's Name"};
    
    public CaseTableModel(List<Case> Cases){
        this.Cases=Cases;
    }
    
    @Override
    public int getRowCount() {
      return  Cases.size();
    }

    @Override
    public int getColumnCount() {
      return ColumnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Case caseTemp=Cases.get(rowIndex);
        SecuredObjects so=new SecuredObjects();
        switch(columnIndex){
            case IDCASE:return caseTemp.getIdCase();
            case CASENAME:return caseTemp.getCaseName();
            case ADDRESS:return caseTemp.getAddress();
            case CASEHEARING:return caseTemp.getCaseHearing();
            case CLIENTNAME:return so.getClientById(caseTemp.getClient()).getFirstName();
            default:return caseTemp.getIdCase();
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
