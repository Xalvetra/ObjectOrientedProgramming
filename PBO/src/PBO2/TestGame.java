package PBO2;

public class TestGame {
    public static void main(String[] args) {
       Game game1 = new Game();
       game1.id="005";
       game1.namaMember="Faris Ikhlasul H";
       game1.namaGame="Battlefield 5";
       game1.harga=70000;
       game1.tampilBiodata();
       System.out.println("Total Harga  : " +game1.hitungHargaSewa(3));
       
       Game game2 = new Game();
       game2.id="002";
       game2.namaMember="Daffa Cahyo A";
       game2.namaGame="DOTA 2";
       game2.harga=10000;
       game2.tampilBiodata();
       System.out.println("Total Harga  : " +game1.hitungHargaSewa(1));
       
       Game game3 = new Game();
       game3.id="004";
       game3.namaMember="Dhimas Arbi S.H";
       game3.namaGame="Age Of Empire";
       game3.harga=90000;
       game3.tampilBiodata();
       System.out.println("Total Harga  : " +game1.hitungHargaSewa(5));
    }
}
       

