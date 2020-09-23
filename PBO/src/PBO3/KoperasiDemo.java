package PBO3;
/**
 *
 * @author Faris Ikhlasul H
 */
public class KoperasiDemo {
    public static void main(String[] Args){
    Anggota1 anggota1 = new Anggota1("Iwan","Jalan Mawar");
    System.out.println("Simpanan "+ anggota1.getNama() +" : Rp "+anggota1.getSimpanan());
        anggota1.setor(100000);
        System.out.println("Simpanan "+ anggota1.getNama() +" : Rp "+anggota1.getSimpanan());
        anggota1.pinjam(5000);
        System.out.println("Simpanan "+ anggota1.getNama() +" : Rp "+anggota1.getSimpanan());
    }
}