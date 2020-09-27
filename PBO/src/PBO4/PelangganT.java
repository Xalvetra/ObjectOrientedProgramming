package PBO4;

public class PelangganT {
    private String nama;
    private int id;
    private String alamat;
    private BarangT barang;
    private SupplierT supplier;
    private int jumlah;
    
    PelangganT() {       
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setid(int id) {
        this.id = id;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setBarang(BarangT barang) {
        this.barang = barang;
    }
    public void setSupplier(SupplierT supplier) {
        this.supplier = supplier;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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
    public BarangT getBarang() {
        return barang;
    }
    public SupplierT getSupplier() {
        return supplier;
    }
    public int getJumlah() {
        return jumlah;
    }
    public int hitungHargaTotal() {
        return barang.hitungHargaBarang(jumlah) + supplier.hitungBiayaSupplier(jumlah);
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Id: " + this.id + "\n";
        info += "Alamat: " + this.alamat + "\n";
        return info;
    }

    Object setNama(PelangganT p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
    
