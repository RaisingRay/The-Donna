/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Tables;

import Entity.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Raiisa
 */
public class ClientTableModel extends AbstractTableModel{
    public static final int IDCLIENT=0;
    public static final int FIRSTNAME=1;
    public static final int LASTNAME=2;
    public static final int PHONENUMBER=3;
    public static final int ADDRESS=4;
    
    
    private final String[] columnsNames={"Identity","First Name","Last Name","Phone Number","Address"};
    private List<Client> clients=new ArrayList<Client>();
    
    public ClientTableModel(List<Client> clients){
    this.clients=clients;
    }

    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return columnsNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Client ctTemp=clients.get(rowIndex);
       switch(columnIndex){
           case IDCLIENT:return ctTemp.getIdClient();
           case FIRSTNAME:return ctTemp.getFirstName();
           case LASTNAME:return ctTemp.getLastName();
           case PHONENUMBER:return ctTemp.getPhoneNumber();
           case ADDRESS:return ctTemp.getAdress();
           default:return ctTemp.getIdClient();
       }
    }
    
    @Override
    public String getColumnName(int col){
    return columnsNames[col];
    }
    
    @Override
    public Class getColumnClass(int c){
        return getValueAt(0, c).getClass();
    }
}
