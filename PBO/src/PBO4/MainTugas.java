package PBO4;

public class MainTugas {

    public static void main(String[] args) {
        BarangT brg = new BarangT();
        brg.setJenis("Jaket");
        brg.setMerk("Cole");
        brg.setHarga(300000);
        System.out.println("====== BARANG ======");
        System.out.println(brg.info());

        SupplierT spl = new SupplierT();
        spl.setToko("Three Second");
        spl.setAlamat("Soekarno Hatta, Malang, Jawa Timur.");
        spl.setBiaya(43000);
        System.out.println("===== SUPPLIER =====");
        System.out.println(spl.info());

        PelayanT pel = new PelayanT("Siraf Qah", 1941720026, "Jalan Dinoyo No.9");
        System.out.println("===== PELAYAN =====");
        System.out.println(pel.info());

        OrderT order = new OrderT(8764, "23 Juli 2020", "Lunas", 0);
        System.out.println("===== ORDER =====");
        System.out.println(order.info());

        PelangganT p = new PelangganT();
        p.setNama("Faris Ikhlasul Haq");
        p.setid(1941720062);
        p.setAlamat("Perumahan Griya Permata Alam C-16, Malang");
        p.setBarang(brg);
        p.setSupplier(spl);
        p.setJumlah(10);
        System.out.println("===== PELANGGAN =====");
        System.out.println(p.info());

        System.out.println("===== HARGA TOTAL =====");
        System.out.println("Harga Total = " + p.hitungHargaTotal());
        System.out.println(p.getBarang().getMerk());
        System.out.println("===== INVOICE =====");

            System.out.println("        --- TOKO FARIS MAKMUR MALANG ----");
            System.out.println("Pelayan      : " + pel.getNama());
            System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Pelanggan    : " + p.getNama());
            System.out.println("Alamat       : " + p.getAlamat());
            System.out.println("Barang       : " + brg.getNama() + " " + brg.getMerk());
            System.out.println("Supplier     : " + p.getSupplier().getNama());
            System.out.println("Harga Total  : " + p.hitungHargaTotal() + "\n");
            System.out.println(" --- Terima Kasih Telah Berbelanja Di Toko Kami --- ");
            System.out.println();
    }
}