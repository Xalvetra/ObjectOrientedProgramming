package PBO8UTS;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.ArrayList;
import java.util.Scanner;

//Nama : Faris Ikhlasul Haq
//Nim  : 1941720062
public class Pasien {
    private String nama;
    private int jumObat;
    private Obat obat;
    private int pembayaran;
    public void setPembayaran(int pembayaran) {
        this.pembayaran = pembayaran;
        pembayaran = 100000;
    }

    public int getPembayaran() {
        return pembayaran;
    }
    public Pasien() {

    }
    public Pasien(String nama) {
        this.nama = nama;
    }
    public Obat getObat() {
        return obat;
    }
    public void setObat(Obat obat) {
        this.obat = obat;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumObat() {
        return jumObat;
    }
    public void setJumObat(int jumObat) {
        this.jumObat = jumObat;
    }

//    public ArrayList getArrObat() {
//        return arrObat;
//    }
//
//    public void setArrObat(ArrayList arrObat) {
//        this.arrObat = arrObat;
//
//    }
    public void pilihan(int jns) {
        Scanner haq = new Scanner(System.in);
        switch (jns) {
            case 1:
                System.out.println("Anda Termasuk Pasien Umum");
                break;
            case 2:
                System.out.println("Anda Termasuk Pasien Asuransi");
                System.out.println("Masukkan Nomor Asuransi Anda : ");
                int noAs = haq.nextInt();
                if (noAs == 1941720062) {
                    
                } else {
                    System.out.println("Nomor Yang Anda Masukkan Salah / "
                            + "Anda Bukan termasuk Pasien Asuransi");
                }
                break;
            default:
                System.out.println("Data Yang Anda Masukkan Salah");
                break;
        }
    }
    public void tampil(){
        System.out.println("Nama : "+nama);
        System.out.println("Biaya Rumah Sakit : ");
    }
}
