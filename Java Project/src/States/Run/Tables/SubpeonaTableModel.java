package States.Run.Tables;

import Entity.Subpeona;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Raiisa
 */
public class SubpeonaTableModel extends AbstractTableModel {

    /*
    private int IdSubpeona;
    private File Document;
    private Date PostDate;
    private Case Case;
    */
    
    public final static int IDSUBPEONA=0;
    public final static int POSTDATE=1;
    public final static int CASENAME=2;
    
    private String[] ColumnsNames={"Identity","Post, Date","Case's Name"};
    private List<Subpeona> Subpeonas=new ArrayList<Subpeona>();
    
    public SubpeonaTableModel(List<Subpeona> Subpeonas){
        this.Subpeonas=Subpeonas;
    }
    @Override
    public int getRowCount() {
        return Subpeonas.size();
    }

    @Override
    public int getColumnCount() {
        return ColumnsNames.length;
    }

    @Override
    public Object getValueAt(int roxIndex, int columnIndex) {
        Subpeona SubpeonaTemp=Subpeonas.get(roxIndex);
        switch(columnIndex){
            case IDSUBPEONA:return SubpeonaTemp.getIdSubpeona();
            case POSTDATE:return SubpeonaTemp.getPostDate();
            case CASENAME:return SubpeonaTemp.getCase().getCaseName();
            default:return SubpeonaTemp.getIdSubpeona();
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
