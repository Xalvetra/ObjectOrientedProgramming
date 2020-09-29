package PBO4;
public class SupplierT {
    private String nama;
    private String alamat;
    private int biaya;
    
    SupplierT() {
    }
    public void setToko(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getBiaya() {
        return biaya;
    }
    public int hitungBiayaSupplier(int jarak) {
        return biaya*jarak;
    }
     public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Alamat: " + this.alamat + "\n";
        info += "Biaya: " + this.biaya + "\n";
        return info;
     }
}
