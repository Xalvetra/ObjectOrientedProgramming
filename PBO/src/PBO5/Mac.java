package PBO5;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Mac extends Laptop{
    public String security;
    public Mac() {
        
    }
    public Mac(String security, String jenisBaterai, String merk, int kecProcessor, int sizeMemory, String jenisProcessor) {
        super(jenisBaterai, merk, kecProcessor, sizeMemory, jenisProcessor);
        this.security = security;
    }
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Keamanan : "+security);
    }
}
