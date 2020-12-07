package PBO14;

import javax.swing.JOptionPane;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MenggunakanOptionPane {
    public static void main(String[] args) {
        String nama= JOptionPane.showInputDialog(null, "Siapa Namamu ?");
        
        int pilihan = JOptionPane.showConfirmDialog(null, "Coding itu mudah kan , "+ nama +"?");
        
        if (pilihan == JOptionPane.YES_NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Tentu saja!"+"Bahkan anak umur 4 tahun sudah bisa coding java");
        }else{
            JOptionPane.showMessageDialog(null, "Susah sih ! Soalnya saya malas");
        }
    }
}
