package PBO3;

/**
 *
 * @author Faris Ikhlasul H
 */
public class EncapTest {
    public static void main(String[] Args){
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);    
        System.out.println("Name    : "+ encap.getName());
        System.out.println("Age     : " + encap.getAge());
    }
}