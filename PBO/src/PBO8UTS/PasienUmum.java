package PBO8UTS;
/**
 *
 * @author Faris Ikhlasul H
 */
//Nama : Faris Ikhlasul Haq
//Nim  : 1941720062
public class PasienUmum extends Pasien{
    private int BiayaADM;
    private Pasien pasien;
    public PasienUmum(){   
    }
    public PasienUmum(int BiayaADM, String nama) {
        super(nama);
        this.BiayaADM = BiayaADM;
    }
    public Pasien getPasien() {
        return pasien;
    }
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
    public int getBiayaADM() {
        return BiayaADM;
    }
    public void setBiayaADM(int BiayaADM) {
        BiayaADM = pasien.getJumObat() * 500;
    }
    public void tampil(){
        System.out.println("Biaya ADM : "+getBiayaADM());
        System.out.println("Biaya Total Anda Adalah : "+(100000+getBiayaADM()));
    }
}