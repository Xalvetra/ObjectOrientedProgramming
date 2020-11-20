package PBO11;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
    private String suara;
    private String warnaBulu;
    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        this.nama = nama;
        this.jmlKaki = jmlKaki;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    @Override
    public void displayMakan() {
        System.out.println("Makanan     : Daging + Tumbuhan");
    }
    @Override
    public void displayBinatang() {
        System.out.println("Nama        : " +this.getNama()); 
        System.out.println("Jumlah Kaki : " +this.getKaki()); 
        System.out.println("Suara       : " + suara);
        System.out.println("Warna Bulu  : " + warnaBulu);
    }
    public void displayData() {
        System.out.println("Jenis       : Karnivora + Herbivora");
        displayMakan();
        displayBinatang();
    }
}
