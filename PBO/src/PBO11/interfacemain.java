package PBO11;

/**
 *
 * @author Faris Ikhlasul H
 */
public class interfacemain {

    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");

//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
//        sarjanaCumlaude.kuliahDiKampus();
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        masterCumlaude.kuliahDiKampus();
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
//        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
//        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
