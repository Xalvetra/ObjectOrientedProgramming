package PBO13Quiz;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Main {
    public static void main(String[] args) {
        //Instansiasi Constructor Class Pembayaran
        Pembayaran p = new Pembayaran();
        //Instansiasi Constructor Class kae
        KeretaApiEksekutif kae = new KeretaApiEksekutif();
        //Melakukan Pengesetan Harga Tiket
        kae.setHargaTiket(2000);
        //Menampilkan Harga Tiket KAI
        System.out.println("Harga Total Kereta Api eksekutif = "+p.bayar(kae));
        //Instansiasi Constructor Class pes
        Pesawat pes = new Pesawat();
        //Melakukan Pengesetan Harga Tiket
        pes.setHargaTiket(5000);
        //Melakukan Pengesetan Harga Tiket
        pes.setBiayaCheckIn(10000);
        //Menampilkan Harga Tiket Pesawat
        System.out.println("Harga total pesawat = "+p.bayar(pes));
    }
}
