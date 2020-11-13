package PBO11;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Singa extends Binatang implements IKarnivora {

    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    public void setBinatang(){
        
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan     : Daging");
    }
    
    @Override
    public void displayBinatang() {
        System.out.println("Nama        : " + this.nama);
        System.out.println("Jumlah Kaki : " + this.jmlKaki);
        System.out.println("Suara       : " + suara);
        System.out.println("Warna Bulu  : " + warnaBulu);
    }

    public void displayData() {
        System.out.println("Jenis       : Karnivora");
        displayMakan();
        displayBinatang();

    }
}
