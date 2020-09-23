package PBO4;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Processor {
    private String merk;
    private double cache;
    Processor(){
        
    }
    Processor(String merk,double cache){
        this.merk = merk;
        this.cache = cache;
    }
    public void setMerk(String newMerk){
        this.merk = newMerk;
    } 
    public String getMerk(String newMerk){
        return merk;
    }
    public String getCache(){
        return merk;
    }
    public void setCache(double newCache){
        cache = newCache;
    } 
    public void info() {
        System.out.println("Merk Processor = "+ merk);
        System.out.println("Cache Memory = "+ cache);
    }
}