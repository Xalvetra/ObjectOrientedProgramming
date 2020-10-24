package PBO8UTS;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
import java.util.ArrayList;

//Nama : Faris Ikhlasul Haq
//Nim  : 1941720062

public class Main {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner(System.in);
        ArrayList arrObat = new ArrayList();
        Pasien pas = new Pasien();
        PasienUmum pu = new PasienUmum();
        PasienAsuransi pa = new PasienAsuransi();
        Obat ob = new Obat();
        System.out.println("- Selamat Datang Di Poliklinik -");
        System.out.print("Nama Anda : ");
        String nama = faris.next();
        pas.setNama(nama);
        System.out.print("Masukkan Jumlah Obat Anda : ");
        int jumObat = haq.nextInt();
        pas.setJumObat(jumObat);
        for (int i = 0; i < jumObat; i++) {
            System.out.print("Masukkan Nama Obat Ke -" + (i + 1) + " Anda : ");
            arrObat.add(new Scanner(System.in).nextLine());
        }
        System.out.println("= Jenis Pasien =");
        System.out.println("1. Pasien Umum");
        System.out.println("2. Pasien Asuransi");
        System.out.print("Anda Termasuk Pasien Apa : ");
        int jns = haq.nextInt();  
        pas.pilihan(jns);
        System.out.println("STRUK PEMBAYARAN DAN KETERANGAN");
        for (Object o : arrObat) {
            System.out.println(o);
        }
        pas.tampil();
        if(jns == 1){
            pu.tampil();
        }else if(jns == 2){
            pa.tampil();
        }else{
            System.out.println("Data Tidak Ada");
        }
    }
}