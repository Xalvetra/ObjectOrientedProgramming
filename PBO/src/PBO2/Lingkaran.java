package PBO2;

public class Lingkaran {
    double phi;
    double r;
    
    public double hitungLuas(double jumlahLingkaran) {
        double luas=jumlahLingkaran*phi*r*r;
        return luas;
    }      
    public double hitungKeliling(double jumlahLingkaran) {
        double keliling=jumlahLingkaran*2*phi*r;
        return keliling;
}
}
