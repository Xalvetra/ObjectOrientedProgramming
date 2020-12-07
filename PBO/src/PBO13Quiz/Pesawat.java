package PBO13Quiz;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Pesawat implements iLayananExtra{
    //Membuat Variabel Private agar hanya dapat di akses di class ini saja
    private int biayaCheckIn;
    private int hargaTiket;
    
    //Membuat Constructor Untuk Mengambil dan mendeklarasikan Variabel
    //Dan nilai inputan dari Class main
    public Pesawat(int biayaCheckIn, int hargaTiket) {
        this.biayaCheckIn = biayaCheckIn;
        this.hargaTiket = hargaTiket;
    }
    Pesawat() {
    }
    //Melakukan Override dari Class Interface ILayananExtra method Karaoke
    @Override
    public int karoeke() {
        return 5000;
    }
    //Melakukan Override dari Class Interface ILayananExtra method restorasi
    @Override
    public int restorasi() {
       return 6000;
    }
    //Mengeset Variabel / Nilai dari biayaCheckIn yang ditambakan dengan
    //hargaTiket agar dapat diambil nilainya langsung di getHargaTiet
    public void setBiayaCheckIn(int biayaCheckIn) {
        hargaTiket += biayaCheckIn;        
    }
    //Mengeset hargaTiket yang telah diinputkan di Class Main
    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    //Mengambil hargaTiket yang nantinya akan diambil oleh Class Pembayaran
    public int getHargaTiket() {
        return this.hargaTiket ;
    }
}