package PBO3;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Anggota {
    private int noKTP;
    private String nama;
    private int limit = 5000000;
    private int jumlahPinjam;
    Anggota(int noKTP, String nama, int limit) {
        this.noKTP = noKTP;
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public int getNoKTP() {
        return noKTP;
    }
    public void setLimitPinjam(int limit) {
        this.limit = limit;
    }
    public int getLimitPinjam() {
        return limit;
    }
    public int getJumlahPinjam() {
        return jumlahPinjam;
    }
    public int pinjam(int pinjam) {
        if (pinjam <= limit) {
            jumlahPinjam += pinjam;
        } else {
            System.out.println("Maafm Jumlah Pinjaman Limit");
        }
        return jumlahPinjam;
    }
    public int angsur(int angsur) {
        jumlahPinjam -= angsur;
        if (angsur > (0.01 * jumlahPinjam)) {
            System.out.println("Angsuran anda diterima");
        } else {
            System.out.println("Maaf Angsuran harus 10% dari jumlah pinjaman");
        }
        return jumlahPinjam;
    }
}