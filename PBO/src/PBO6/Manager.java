package PBO6;

import PBO7.Karyawan;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Manager extends Karyawan {
    public int tunjangan;  
    public Manager(){
        
    }
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("Total Gaji      = "+(super.gaji + tunjangan));
    }
}