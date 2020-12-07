package PBO13Quiz;
/**
 *
 * @author Faris Ikhlasul H
 */
public class KapalPesiar implements iLayananExtra {
    //Membuat Variabel private agar hanya dapat diakses class ini saja
    private int biayaReservasi;
    private int biayaVisa;
    private int hargaTiket;
    //Melakukan Override dari Class Interface ILayananExtra method Karaoke
    @Override
    public int karoeke() {
        hargaTiket += 3000;
        return hargaTiket;
    }
    //Melakukan Override dari Class Interface ILayananExtra method Karaoke
    @Override
    public int restorasi() {
        hargaTiket += 4000;
        return hargaTiket;
    }
    //Mengambil Variabel / Nilai dari biayaReservasi
    public int getBiayaReservasi() {
        return biayaReservasi;
    }
    
    //Mengeset Variabel / Nilai dari biayaReservasi
    public void setBiayaReservasi(int biayaReservasi) {
        this.biayaReservasi = biayaReservasi;
    }
    //Mengambil Variabel / Nilai dari biayaVisa
    public int getBiayaVisa() {
        return biayaVisa;
    }
    //Mengeset Variabel / Nilai dari biayaVisa
    public void setBiayaVisa(int biayaVisa) {
        this.biayaVisa = biayaVisa;
    }
    
    //Mengambil Variabel / Nilai dari hargaTiket
    public int getHargaTiket() {
        return hargaTiket;
    }
    
    //Mengeset Variabel / Nilai dari hargaTiket
    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    } 
}
