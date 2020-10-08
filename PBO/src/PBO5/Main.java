package PBO5;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("===== INHERITANCE =====");
        BangunDatar bangunDatar = new BangunDatar();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        bangunDatar.luas();
        bangunDatar.keliling();
        lingkaran.luas();
        lingkaran.keliling();
        persegiPanjang.luas();
        persegiPanjang.keliling();
    }
}
