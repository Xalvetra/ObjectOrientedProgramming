package PBO2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim=105;
        mhs2.nama="Budiman";
        mhs2.alamat="Jl. Puncak No 8B";
        mhs2.kelas="1C";
        mhs2.tampilBiodata(); 
        
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim=111;
        mhs3.nama="Ayundari Wulan";
        mhs3.alamat="Jl. Pahlawan No 109";
        mhs3.kelas="2C";
        mhs3.tampilBiodata();           
    }
}

