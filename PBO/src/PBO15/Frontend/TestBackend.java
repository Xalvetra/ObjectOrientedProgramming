package PBO15.Frontend;

/**
 *
 * @author Faris Ikhlasul H
 */
import PBO15.Backend.*;
import PBO15.Backend.Kategori;

public class TestBackend {
    public static void main(String[] args) {
        Kategori kat1 = new Kategori("novel", "Koleksi buku novel");
        Kategori kat2 = new Kategori("referensi", "Buku referensi ilmiah");
        Kategori kat3 = new Kategori("komik", "Komik anak-anak");
        // test insert
        kat1.save();
        kat2.save();
        kat3.save();
        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();
        // test delete
        kat3.delete();
        // test select all
        for (Kategori k : new Kategori().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
        // test search
        for (Kategori k : new Kategori().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}