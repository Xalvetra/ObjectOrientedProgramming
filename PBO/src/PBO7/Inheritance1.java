package PBO7;

import PBO6.Manager;
import PBO7.StaffHarian;
import PBO7.Staff;
import PBO7.StaffTetap;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Inheritance1 {

    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama = "vivin";
        M.alamat = "Jl. Vinolia";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 3000000;
        M.tunjangan = 10000000;
        M.tampilDataManager();

        Staff S = new Staff();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();
        
        System.out.println("===================== PERCOBAAN 6 =================================");
        StaffTetap st = new StaffTetap("2A", 100000, 200000,250000,"Faris","Malang","Laki laki",20,2000000);
        st.tampilStaffTetap();

        StaffHarian sh = new StaffHarian(100, 10000,50000, "Nabila", "Malang", "Perumpuan", 27, 100000);
        sh.tampilStaffHarian();
    }

    public Inheritance1() {
    }
}
