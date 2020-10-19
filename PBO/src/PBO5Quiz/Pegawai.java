package PBO5Quiz;
/**
 *
 * @author Faris Ikhlasul H
 */
//Nama  : Faris Ikhlasul Haq
//NIM   : 1941720062
public class Pegawai {
    private int nip;
    private String nama;
    public int masaKerja;
    private Gaji gaj;
    Pegawai() {
        
    }
    public Pegawai(int nip, String nama, int masaKerja){
        this.nip = nip;
        this.nama = nama;
        this.masaKerja = masaKerja;
    }
    public int getNip() {
        return nip;
    }
    public void setNip(int nip) {
        this.nip = nip;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public Gaji getGaji() {
        return gaj;
    }

    public void setGaji(Gaji gaj) {
        this.gaj = gaj;
    }
    
    public double getMasaKerja() {
        return masaKerja;
    }
    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }
    public void tampilPegawai() {
        System.out.println("Nama = " + nama);
        System.out.println("Nip  = " + nip);
        System.out.println("Masa Kerja : " + masaKerja);
    }

}
