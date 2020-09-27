package PBO4;

public class PelayanT {
    private String nama;
    private int id;
    private String alamat;
    
    PelayanT() {
    }
    
    PelayanT(String nama, int id, String alamat) {
        this.nama = nama;
        this.id = id;
        this.alamat = alamat;
    }
    public void setNama(String nama) {
    this.nama = nama;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public int getId() {
        return id;
    }
    public String getAlamat() {
        return alamat;
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Id: " + this.id + "\n";
        info += "Alamat: " + this.alamat + "\n";
        return info;
    }
}
