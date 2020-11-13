package PBO11;
/**
 *
 * @author Faris Ikhlasul H
 */
public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getKaki() {
        return jmlKaki;
    }
    public void setKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }
    public abstract void displayBinatang();  
}