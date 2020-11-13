package PBO11;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MainTugas {
    public static void main(String[] args){
        Keledai kele = new Keledai("Keledai",4,"Hehehe","Abu-Abu");
        Gorilla gori = new Gorilla("Gulali",4,"Haum Haum","Hitam Manis");
        Singa sing = new Singa("CingaCing",4,"Roarrrr","Coklat");
        
        kele.displayData();
        System.out.println("");
        gori.displayData();
        System.out.println("");
        sing.displayData();
    }
}
