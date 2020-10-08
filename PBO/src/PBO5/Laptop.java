package PBO5;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Laptop extends Komputer {

    public String jenisBaterai;

    public Laptop(String jenisBaterai) {
        this.jenisBaterai = jenisBaterai;
    }

    public Laptop(String jenisBaterai, String merk, int kecProcessor, int sizeMemory, String jenisProcessor) {
        super(merk, kecProcessor, sizeMemory, jenisProcessor);
        this.jenisBaterai = jenisBaterai;
    }
    public void tampilLaptop(){
        super.tampil();
        System.out.println("Jenis Baterai : "+jenisBaterai);
    }

}
