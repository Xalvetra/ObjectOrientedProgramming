package PBO6;
/**
 *
 * @author Faris Ikhlasul H
 */
public class ClassB1 extends ClassA1{
    private int z;
    public void setZ(int z) {
        this.z = z;
    }
    public void getNilaiz() {
        System.out.println("Nilai Z : " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah : "+(getX()+getY()+z));
    }
}