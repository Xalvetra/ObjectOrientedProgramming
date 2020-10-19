package PBO7;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Komputer {
    public String merk;
    public int kecProcessor;
    public int sizeMemory;
    public String jenisProcessor;
    public Komputer(){    
    }
    public Komputer(String merk, int kecProcessor, int sizeMemory, String jenisProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jenisProcessor = jenisProcessor;
    }
    public void tampil(){
        System.out.println("====================");
        System.out.println("Merk : "+merk);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("Jenis Processor : "+jenisProcessor);
    }
}