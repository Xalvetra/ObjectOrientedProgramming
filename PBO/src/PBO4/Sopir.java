package PBO4;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Sopir {   
    private String nama;
    private int biaya;
    Sopir(){
        
    } 
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setBiaya(int biaya){
        this.biaya = biaya;
    }
    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}