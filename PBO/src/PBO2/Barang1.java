package PBO2;

public class Barang1 {
    public int kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    public float hargaJual;
    
    public int hitungHargaJual(int jumlah) {
        int hargaJual2=(int)(jumlah*hargaDasar -(diskon*hargaDasar));
        return hargaJual2;
    }
    public void tampilData() {
        System.out.println("Kode               : " +kode);
        System.out.println("Nama Barang        : " +namaBarang);
        System.out.println("Harga Dasar        : Rp." +hargaDasar);
        System.out.println("Diskon             : " +diskon*100+"%");
        System.out.println("Harga Jual         : Rp." +hargaJual);     
    }
}