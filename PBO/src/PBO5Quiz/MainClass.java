package PBO5Quiz;
import java.util.Scanner;
/**
 *
 * @author Faris Ikhlasul H
 */
//Nama  : Faris Ikhlasul Haq
//NIM   : 1941720062
public class MainClass {

    public static void main(String[] args) {
        Scanner Faris = new Scanner(System.in);
        Scanner farisInt = new Scanner(System.in);
        Pegawai P = new Pegawai();
        Gaji G = new Gaji();
        System.out.print("Masukkan Nama Anda : ");
        String nm = Faris.next();
        System.out.print("Masukkan NIP Anda : ");
        int np = farisInt.nextInt();
        System.out.print("Masa Kerja Anda : ");
        int mk = farisInt.nextInt();
        System.out.print("Masukkan Gaji Pokok Anda :");
        int gp = farisInt.nextInt();
        System.out.println("======== Permintaan Anda Sedang Kami Proses Mohon Bersabar :) ========== ");
        P.setNama(nm);
        P.setNip(np);
        P.setMasaKerja(mk);
//        G.setMasaKerja(mk);
        G.setGajiPokok(gp);
        P.setGaji(G);
        System.out.println("============ BERIKUT LAPORAN YANG ANDA MINTA ===============");
        P.tampilPegawai();
        G.tampilGajiSemua();
        P.getGaji().tampilGajiSemua();
    }
}
