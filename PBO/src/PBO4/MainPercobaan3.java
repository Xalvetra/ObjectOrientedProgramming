package PBO4;
/**
 *
 * @author Faris Ikhlasul H
 */
public class MainPercobaan3 {
    public static void main(String[] Args) {
        Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants");
        Pegawai asisten = new Pegawai("4567", "Patrick Star");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru",
                "Bisnis", masinis, asisten);
        System.out.println(keretaApi.info());
    }
}