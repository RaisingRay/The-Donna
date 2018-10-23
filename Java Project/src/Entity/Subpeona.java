package Entity;

import java.io.File;
import java.sql.Date;


/**
 *
 * @author Raiisa
 */

public class Subpeona {
    private int IdSubpeona;
    private File Document;
    private Date PostDate;
    private Case Case;

    public Subpeona() {
    }

    public Subpeona(int IdSubpeona) {
        this.IdSubpeona = IdSubpeona;
    }

    public Subpeona(int IdSubpeona, Date PostDate,Case Case) {
        this.IdSubpeona = IdSubpeona;
        this.PostDate = PostDate;
        this.Case=Case;
    }

    public int getIdSubpeona() {
        return IdSubpeona;
    }

    public void setIdSubpeona(int IdSubpeona) {
        this.IdSubpeona = IdSubpeona;
    }

    public File getDocument() {
        return Document;
    }

    public void setDocument(File Document) {
        this.Document = Document;
    }

    public Date getPostDate() {
        return PostDate;
    }

    public void setPostDate(Date PostDate) {
        this.PostDate = PostDate;
    }

    public Case getCase() {
        return Case;
    }

    public void setCase(Case Case) {
        this.Case = Case;
    }
    
    
}
