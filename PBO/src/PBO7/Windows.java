package PBO7;


/**
 *
 * @author Faris Ikhlasul H
 */
public class Windows extends Laptop {
    public String fitur;
    public Windows() {
    }
    public Windows(String fitur, String jenisBaterai, String merk, int kecProcessor, int sizeMemory, String jenisProcessor) {
        super(jenisBaterai, merk, kecProcessor, sizeMemory, jenisProcessor);
        this.fitur = fitur;
    }
     public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur : "+fitur);
    }
}