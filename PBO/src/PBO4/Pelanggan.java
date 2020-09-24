package PBO4;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    Pelanggan(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setHari(int hari){
        this.hari = hari;
    }
    public int getHari(){
        return hari;
    }
    public void setMobil(Mobil mobil){
        this.mobil = mobil;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public void setSopir(Sopir sopir){
        this.sopir = sopir;
    }
    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari)+sopir.hitungBiayaSopir(hari);
    }
}