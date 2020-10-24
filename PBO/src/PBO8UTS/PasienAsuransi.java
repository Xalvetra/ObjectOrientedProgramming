package PBO8UTS;
/**
 *
 * @author Faris Ikhlasul H
 */
//Nama : Faris Ikhlasul Haq
//Nim  : 1941720062
public class PasienAsuransi extends Pasien{
    private int BebasFee;
    private int PotonganAsuransi;
    private Pasien pasien;
    public PasienAsuransi(){
        
    }
    public PasienAsuransi(int BebasFee, int PotonganAsuransi, String nama) {
        super(nama);
        this.BebasFee = BebasFee;
        this.PotonganAsuransi = PotonganAsuransi;
    }
    public Pasien getPasien() {
        return pasien;
    }
    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }
    public int getBebasFee() {
        return BebasFee;
    }
    public void setBebasFee(int BebasFee) {
        BebasFee = pasien.getJumObat() * 500;
    }
    public int getPotonganAsuransi() {
        return PotonganAsuransi;
    }
    public void setPotonganAsuransi(int PotonganAsuransi) {
        PotonganAsuransi = 100000 - 10000;
    }
    public void tampil(){
        System.out.println("Bebas Fee : "+BebasFee);
        System.out.println("Potongan Asuransi : "+PotonganAsuransi);
        System.out.println("Bebas Uang Sebesar : "+(BebasFee + PotonganAsuransi));
        System.out.println("Total : "+(100000-(BebasFee + PotonganAsuransi)));
    }
}