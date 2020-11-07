package PBO10;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Orang {
    private String nama;
    private Hewan peliharaHewan;
    public Orang(String nama) {
        this.nama = nama;
    }
    public void peliharaHewan(Hewan peliharaHewan) {
        this.peliharaHewan = peliharaHewan;
    }
    public void ajakPeliharaanJalanJalan() {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan Peliharaan Berjalan dengan cara: ");
        this.peliharaHewan.bergerak();
        System.out.println("----------------------------------------");
    }
}
