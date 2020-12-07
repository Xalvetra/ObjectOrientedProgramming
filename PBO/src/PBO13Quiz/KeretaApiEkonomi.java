package PBO13Quiz;

/**
 *
 * @author Faris Ikhlasul H
 */
public class KeretaApiEkonomi {
    //Membuat Variabel Harga Tiket (Tidak Digunakan Private Karena tidak dapat 
    //di access di Class Turunan maka bisa dibuat default / protected)
    int hargaTiket;
    //Mengeset hargaTiket yang telah diinputkan di Class Main
    public void setHargaTiket(int hargaTiket){
        this.hargaTiket = hargaTiket;
    }
    //Mengambil Nilai hargaTiket untuk dapat diakses diclass Pembayaran
    public int getHargaTiket() {
        return this.hargaTiket;
    }
}
