package PBO11;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Mahasiswa {
    protected String nama;
    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    public void kuliahDiKampus() {
        System.out.println("Aku Mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah dikampus.");
    }
}