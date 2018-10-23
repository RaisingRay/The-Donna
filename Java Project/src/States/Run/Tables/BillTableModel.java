/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Tables;

import BuisnessLogiqueLayer.SecuredObjects;
import Entity.Bill;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Raiisa
 */
public class BillTableModel extends AbstractTableModel{

    public final static int IDBILL=0;
    public final static int DEPOSITFEE=3;
    public final static int RETAINERFEE=1;
    public final static int DEADLINE=2;
    public final static int PAYED=4;
    public final static int CLIENTNAME=5;
    
    
    private String [] ColumnsNames={"Identity","Deposit Fee","DeadLine Date","Retainer Fee","Payed","Client's Name"};
    private List<Bill> Bills=new ArrayList<Bill>();
    
    public BillTableModel(List<Bill> Bills){
    this.Bills=Bills;
    }
    
    @Override
    public int getRowCount() {
        return Bills.size();
    }

    @Override
    public int getColumnCount() {
        return ColumnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SecuredObjects so=new SecuredObjects();
        Bill billTemp=Bills.get(rowIndex);
        switch(columnIndex){
            case IDBILL:return billTemp.getIdBill();
            case DEPOSITFEE:return billTemp.getDepositFee();
            case RETAINERFEE:return billTemp.getRetainerFee();
            case DEADLINE:return billTemp.getDeadline();
            case PAYED:return billTemp.getPayed();
            case CLIENTNAME:return so.getClientById(so.getCaseById(billTemp.getCase()).getClient()).getFirstName();
            default:return billTemp.getIdBill();
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
