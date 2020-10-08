package PBO5;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MainTugasTeori6 {

    public static void main(String[] args) {
        Windows W = new Windows("Windows Hello", "Li-Polymer", "Asus", 3, 16, "Ryzen 7");
        W.tampilWindows();
        Mac M = new Mac("Fingerprint", "Li-Polymer", "MacBook Pro", 2, 16, "i7");
        M.tampilMac();
        PC P = new PC(24,"MSI",8,4,"Ryzen 7");
        P.tampilPC();
    }
}
