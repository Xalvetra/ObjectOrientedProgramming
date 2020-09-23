package PBO2;

public class TestBarang1 {
  public static void main(String[] args) {
       Barang1 barang1 = new Barang1();
       barang1.kode=8872;
       barang1.namaBarang="Sweater Polo";
       barang1.hargaDasar=150000;
       barang1.diskon=(float)45/100;
       barang1.hargaJual=barang1.hitungHargaJual(1);
       barang1.tampilData();
    }
}