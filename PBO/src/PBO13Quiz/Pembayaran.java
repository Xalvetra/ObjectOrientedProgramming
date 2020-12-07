package PBO13Quiz;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Pembayaran {
        //Membuat Variabel private agar hanya dapat diakses class ini saja/
        //Dan menambah variabel ini digunakan untuk menyimpan sementara nilai
        //Agar dapat diproses
        private int x ;
        private int y ;
        
        //Membuat Method bayar dengan berhubungan oleh iLayananExtra sebagai
        //Inputan Classnya dan dideklrasikan sebagai le
    public int bayar(iLayananExtra le) {
        //Bila KeretaApiEksekutif memiliki hubungan dengan LayananExtra
        //Dan sesuai dengan Class main bila dipanggil kae maka akan di
        //proses di kelas ini.
        if (le instanceof KeretaApiEksekutif) {
            //Instansiasi KeretaApiEksekutif dan dilakukan Upcasting pada 
            //class iLayanaextra
            KeretaApiEksekutif kae = (KeretaApiEksekutif) le;
            // Memroses Method dari KeretaApiEksekutif yaitu karoeke dan 
            //restorasi lalu ditambahkan 
            y = ((KeretaApiEksekutif) le).karoeke() +((KeretaApiEksekutif) le).restorasi();
            //Melakukan Pemoresan pengganggilan hargatiket yang ditambahkan
            //dengan biaya sebelumnya
            x = ((KeretaApiEksekutif) le).getHargaTiket()+y;
            
        } else if (le instanceof Pesawat) {
            //Instansiasi Pesawat dan dilakukan Upcasting pada 
            //class iLayanaextra
            Pesawat pes = (Pesawat) le;
            //NOTE : bila menambah pemanggian method ini digunakan untuk 
            //ingin menambah biaya dalam restorasi dan karaoke
            //Bila tidak maka method pemanggilan ini bisa di comment terlebih
            //Dahulu
            
            y = ((Pesawat) le).karoeke() +((Pesawat) le).restorasi();

            //Melakukan Pemanggilan hargaTiket / dan bila ingin menm=ambah biaya
            //karoeke dan restorasi dapat dilakukan penambahan variabel y
            x = ((Pesawat) le).getHargaTiket()+y;
      
        } else if (le instanceof KapalPesiar) {
            //Instansiasi Kapal Pesiardan dilakukan Upcasting pada 
            //class iLayanaextra
            KapalPesiar kap = (KapalPesiar) le;
            x = ((KapalPesiar) le).getHargaTiket();
            
        }
        //Nilai dikembalikan ke X yang akan dikembalikan ke Main Class
         return x;
    }
}
