package PBO7;

/**
 *
 * @author Faris Ikhlasul H
 */
public class StaffHarian extends Staff{
    public int jmlJamKerja;
    
    public StaffHarian(){
        
    }

    public StaffHarian(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, String jk, int umut, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umut, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("============================Data Staff Harian===================================");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja ="+jmlJamKerja);
        System.out.println("Gaji Bersih      = "+(gaji+jmlJamKerja+lembur-potongan));
    }
}
