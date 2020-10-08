package PBO5;

/**
 *
 * @author Faris Ikhlasul H
 */
public class PC extends Komputer{
    public int ukuranMonitor;

    public PC() {
    }

    public PC(int ukuranMonitor, String merk, int kecProcessor, int sizeMemory, String jenisProcessor) {
        super(merk, kecProcessor, sizeMemory, jenisProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPC(){
        super.tampil();
        System.out.println("Ukuran Monitor : "+ukuranMonitor);
    }
    
}
