package PBO5;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Staff extends Karyawan {
    public int lembur, potongan;
    public Staff(){
        
    }
    public Staff(int lembur, int potongan, String nama, String alamat, String jk, int umut, int gaji) {
        super(nama, alamat, jk, umut, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void tampilDataStaff(){
        super.tampilDataKaryawan();
        System.out.println("Lembuar     = "+lembur);
        System.out.println("Potongan    = "+potongan);
        System.out.println("Total Gaji  = "+(gaji+lembur-potongan));
    }
}