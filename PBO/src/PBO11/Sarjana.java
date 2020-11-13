package PBO11;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    public Sarjana(String nama) {
        super(nama);
    }
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelsaikan skripsi");
    }
    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-Ku lebih dari 3,80");
    }
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya telah menerbitkan artikel di jurnal NASIONAL");
    }
}
      