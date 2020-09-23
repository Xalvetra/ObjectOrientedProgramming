package PBO2;

public class Game {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    
    public void tampilBiodata() {
        System.out.println("id                  : " +id);
        System.out.println("Nama Member         : " +namaMember);
        System.out.println("Nama Game           : " +namaGame);
        System.out.println("harga               : " +harga);
    }            
    public int hitungHargaSewa(int lamaSewa) {
        int hargaTotal=lamaSewa*harga;
        return hargaTotal;
    }
}

