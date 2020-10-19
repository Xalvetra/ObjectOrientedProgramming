package PBO5Quiz;
/**
 *
 * @author Faris Ikhlasul H
 */
//Nama  : Faris Ikhlasul Haq
//NIM   : 1941720062
public class Gaji {
    private int gajiPokok;
    private int tunjangan;
    private int potongan;
    private int asuransi = 100000;
    private Pegawai peg;
    public int masaKerja;
    Gaji() {

    }
    public Gaji(int gaji_pokok, int tunjangan, int potongan, int asuransi) {
        this.gajiPokok = gaji_pokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.asuransi = asuransi;
    }
    public int getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    public Pegawai getPeg() {
        return peg;
    }
    public void setPeg(Pegawai peg) {
        this.peg = peg;
    }
    public int getAsuransi() {
        return asuransi;
    }
    //SETELAH SAYA COBA INI MENIMBULKAN NILAI 0
    public void setTunjangan(int tunjangan) {
        if (peg.getMasaKerja() > 5) {
            tunjangan = getGajiPokok() * 20 / 100;
        } else if (peg.getMasaKerja() < 5) {
            tunjangan = getGajiPokok() * 10 / 100;
        } else if (peg.getMasaKerja() < 1) {
            tunjangan = 0;
        } else {
            System.out.println("Anda Belum Menginputkan Lama Kerja");
        }
    }
     public int getTunjangan(){
        return tunjangan;
    }
//    public int hitungTunjangan() {
//        if (masaKerja > 5) {
//            tunjangan = getGajiPokok() * 20 / 100;
//        } else if (masaKerja < 5) {
//            tunjangan = getGajiPokok() * 10 / 100;
//        } else if (masaKerja < 1) {
//            tunjangan = 0;
//        } else {
//            System.out.println("Anda Belum Menginputkan Lama Kerja");
//        }
//        return tunjangan;
//    }
//    public int hitungPotongan() {
//        if (masaKerja > 5) {
//            potongan = gajiPokok * 5 / 100;
//        } else if (masaKerja < 5) {
//            potongan = gajiPokok * 3 / 100;
//        } else if (masaKerja < 1) {
//            potongan = gajiPokok * 1 / 100;
//        } else {
//            System.out.println("Anda Belum Menginputkan Lama Kerja");
//        }
//        return potongan;
//    }
    //SETELAH SAYA COBA INI MENIMBULKAN NILAI 0
    public int getPotongan(){
        return potongan;
    }
    public void setPotongan() {
        if (masaKerja > 5) {
            potongan = gajiPokok * 5 / 100;
        } else if (masaKerja < 5) {
            potongan = gajiPokok * 3 / 100;
        } else if (masaKerja < 1) {
            potongan = gajiPokok * 1 / 100;
        } else {
            System.out.println("Anda Belum Menginputkan Lama Kerja");
        }
    }
    public double getMasaKerja() {
        return masaKerja;
    }
    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    public int getPerhitunganPotongan() {
        return tunjangan;
    }
    public void tampilGajiSemua() {
        System.out.println("==================================================");
        System.out.println("Gaji Pokok     = " + gajiPokok);
        System.out.println("Tunjangan      = " + getTunjangan());
        System.out.println("Potongan       = " + getPotongan());
        System.out.println("Asuransi       = " + asuransi);
        System.out.println("==================================================");
        System.out.println("Gaji Bersih    = " + (gajiPokok - getTunjangan() - asuransi + getPotongan()));
    }
}