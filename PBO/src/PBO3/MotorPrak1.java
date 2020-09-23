package PBO3;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MotorPrak1 {
    public int kecepatan =0;
    public boolean kontakOn = false;
    
    public void printstatus(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"/n");
    }
}