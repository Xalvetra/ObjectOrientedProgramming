package PBO9;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MainManusia {

    public static void main(String[] args) {
        Manusia m = new Manusia();
        Mahasiswa s = new Mahasiswa();
        Dosen d = new Dosen();
        System.out.println("Manusia");
        m.bernafas();
        m.makan();
        System.out.println();
        System.out.println("Mahasiswa");
        s.makan();
        s.tidur();
        System.out.println();
        System.out.println("Dosen");
        d.makan();
        d.lembur();
    }
}