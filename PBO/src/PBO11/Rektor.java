package PBO11;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Rektor {
    
    
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silahkan Perkenalkan Diri Anda...");
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-----------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mah) {
        System.out.println("Saya rektor, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");

        mah.menjuaraiKompetisi();
        mah.membuatPublikasiIlmiah();
        System.out.println("-----------------------------------------------");
    }
}
