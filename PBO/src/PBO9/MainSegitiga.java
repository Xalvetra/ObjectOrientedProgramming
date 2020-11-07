package PBO9;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MainSegitiga {

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Besar Sudut ke-1 : " + s.totalSudut(60));
        System.out.println("Besar Sudut ke-2 : " + s.totalSudut(30, 30));
        System.out.println("Keliling diketahui 3 sisi : " + s.keliling(60, 80, 100));
        System.out.println("Keliling diketahui 2 sisi : " + s.keliling(60, 80));
    }
}