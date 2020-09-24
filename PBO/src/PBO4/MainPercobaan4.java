package PBO4;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MainPercobaan4 {

    public static void main(String[] Args) {
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        Penumpang p1 = new Penumpang("54321", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(p1, 1);
        System.out.println(gerbong.info());

    }
}
