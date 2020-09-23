package PBO3;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Koperasi {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        Anggota agt = new Anggota(1941720062, "Faris", 5000000);
        System.out.println("No KTP                   : " + agt.getNoKTP());
        System.out.println("Nama Anggota             : " + agt.getNama());
        System.out.println("Limit Pinjaman           : " + agt.getLimitPinjam());

        System.out.print("\nMeminjam Uang : ");
        int pinjam = faris.nextInt();
        System.out.println("Jumlah Pinjaman Saat Ini : " + agt.pinjam(pinjam));

        System.out.print("\nMeminjam Uang : ");
        pinjam = faris.nextInt();
        System.out.println("Jumlah Pinjaman Saat Ini : " + agt.pinjam(pinjam));

        System.out.print("\nMembayar Angsuran : ");
        int angsur = faris.nextInt();
        agt.angsur(angsur);
        System.out.println("Jumlah Pinjaman Saat Ini : " + agt.getJumlahPinjam());

        System.out.print("Masukkan Jumlah Angsuran : ");
        angsur = faris.nextInt();
        agt.angsur(angsur);
        System.out.println("Jumlah Pinjaman Saat Ini : " + agt.getJumlahPinjam());
//        System.out.println("\nMemasukkan Jumlah Angsuran 3.000.000");
//        agt.angsur(3000000);
//        System.out.println("Jumlah Pinjaman Saat Ini : "+agt.getJumlahPinjam());
    }
}
