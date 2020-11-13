package PBO11;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MultipleInterfaceMul {
    public static void main(String[] args) {
//        IBerprestasi prestasi = new IBerprestasi;
        Rektor pakRektor = new Rektor();
//        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);
        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
