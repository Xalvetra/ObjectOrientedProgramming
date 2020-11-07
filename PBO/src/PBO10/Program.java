package PBO10;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang ani = new Orang("Ani");
        Orang kusuma = new Orang("Budi");
        
        ani.peliharaHewan(kucingKampung);
        kusuma.peliharaHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        kusuma.ajakPeliharaanJalanJalan();
    }
}