package PBO13Quiz;
/**
 *
 * @author Faris Ikhlasul H
 */

//Kereta Api Eksekutif merupakan turunan dari Kereta Api Ekonomi dan memiliki hubungan 
//implements dengan ILayananExtra
public class KeretaApiEksekutif extends KeretaApiEkonomi implements iLayananExtra { 
    
    //Constructor untuk mengambil nilai Hargatiket atau sebagai landing untuk 
    //Constructor Default
    KeretaApiEksekutif() {
    }    
    //Melakukan Override dari Class Interface ILayananExtra method Karaoke
    @Override
    public int karoeke() {
        return 1000;
    }
    //Melakukan Override dari Class Interface ILayananExtra method Karaoke
    @Override
    public int restorasi() { 
       return 2000;
    }   
}