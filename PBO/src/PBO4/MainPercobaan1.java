package PBO4;
/**
 *
 * @author Faris Ikhlasul H
 */
public class MainPercobaan1 {
    public static void main(String[] Args) {

        Processor P = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", P);
        L.info();
        Processor P1 = new Processor();
        P1.setMerk("Intel i5");
        P1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(P1);
        L1.info();
    }
}