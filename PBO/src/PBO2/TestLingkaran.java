package PBO2;

public class TestLingkaran {
    public static void main(String[] args) {
       Lingkaran lingkaran1 = new Lingkaran();
       lingkaran1.phi=3.14;
       lingkaran1.r=10;
        System.out.println("Luas Lingkaran: " +lingkaran1.hitungLuas(3.0));
        System.out.println("Luas Lingkaran: " +lingkaran1.hitungKeliling(3.0));       
    }
}

