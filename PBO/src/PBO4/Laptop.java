package PBO4;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Laptop {
    private String merk;
    private Processor proc;   
    Laptop(){
        
    }
    Laptop(String merk, Processor proc){
        this.merk = merk;
        this.proc = proc;
    }
    public void setMerk(String newMerk){
        merk = newMerk;
    }
    public void setProc(Processor proc){
        this.proc = proc;
    }
    public void info(){
        System.out.println("Merk Laptop = "+merk);
        proc.info();
    }
}