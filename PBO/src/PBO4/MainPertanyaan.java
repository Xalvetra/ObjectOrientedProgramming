package PBO4;

/**
 *
 * @author Faris Ikhlasul H
 */
public class MainPertanyaan {

    public static void main(String[] Args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());

    }
}
