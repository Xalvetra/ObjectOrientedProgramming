package PBO11;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Keledai extends Binatang implements IHerbivora {
    private String suara;
    private String warnaBulu;
    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan     : Tumbuhan");
    }
    @Override
    public void displayBinatang() {
        System.out.println("Nama        : "+this.nama); 
        System.out.println("Jumlah Kaki : "+this.jmlKaki); 
        System.out.println("Suara       : "+suara); 
        System.out.println("Warna Bulu  : "+warnaBulu);
    }
    public void displayData() {
        System.out.println("Jenis       : Herbivora");
        displayMakan();
        displayBinatang();
    }
}