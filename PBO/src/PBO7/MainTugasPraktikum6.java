package PBO7;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MainTugasPraktikum6 {
    public static void main(String[] args) {
        System.out.println("Windows");
        Windows W = new Windows("Windows Hello", "Li-Polymer", "Asus", 3, 16, "Ryzen 7");
        W.tampilWindows();
        System.out.println("MAC");
        Mac M = new Mac("Fingerprint", "Li-Polymer", "MacBook Pro", 2, 16, "i7");
        M.tampilMac();
        System.out.println("Laptop");
        PC P = new PC(24,"MSI",8,4,"Ryzen 7");
        P.tampilPC();
    }
}