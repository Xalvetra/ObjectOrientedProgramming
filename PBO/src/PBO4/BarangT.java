package PBO4;
public class BarangT {
    private String nama;
    private String merk;
    private int harga;
    
    BarangT() {
    }
    public void setJenis(String nama) {
        this.nama = nama;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public String getMerk() {
        return merk;
    }
    public int harga() {
        return harga;
    }
    public int hitungHargaBarang(int jumlah) {
        return harga*jumlah;
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Merk: " + this.merk + "\n";
        info += "Harga: " + this.harga + "\n";
        return info;
    }
}