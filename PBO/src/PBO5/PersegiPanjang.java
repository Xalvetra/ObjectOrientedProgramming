package PBO5;

/**
 *
 * @author Faris Ikhlasul H
 */
public class PersegiPanjang {

    float panjang;
    float lebar;

    float luas() {
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;
    }

    float keliling() {
        float kll = 2 * panjang + 2 * lebar;
        System.out.println("Keliling Persegi Panjang: " + kll);
        return kll;
    }

}
