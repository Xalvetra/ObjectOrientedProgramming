package PBO5;
/**
 *
 * @author Faris Ikhlasul H
 */
public class ClassA1 {
    private int x;
    private int y;
    
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    } 
    public void getNilai(){
        System.out.println("Nilai x : "+x);
        System.out.println("Nilai Y : "+y);
    }
}