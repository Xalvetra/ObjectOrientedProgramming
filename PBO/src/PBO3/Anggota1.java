package PBO3;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Anggota1 {
    private int noKtp;
    private String nama;
    private String alamat;
    private float simpanan;
    private int limit=5000000;
    private int jumlahPinjam;
    
    Anggota1(String alamat, String nama){
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNama(){
    return nama;
    }

         public void setNama(String nama){
    this.nama = nama;
    }
    public void setAlamat(String alamat){
    this.alamat = alamat;
    }
     public String getAlamat(){
    return alamat;
    }
     public void setor(float uang){
    simpanan += uang;
    }
    public void pinjam(float uang){
    simpanan -= uang;
    }
    public float getSimpanan(){
    return simpanan;
    }
}