package PBO6;
/**
 *
 * @author Faris Ikhlasul H
 */
public class MainTugas6 {

     public static void main(String[] args) {
        Dosen ds = new Dosen("1202","Ikhlasul" , "Sidoarjo");
        ds.getNama();
        ds.setSKS(22);
        ds.getGaji();

        Dosen ds2 = new Dosen();
        ds2.nama = "Faris";
        ds2.nip = "2032";
        ds2.alamat = "Surabaya";
        ds2.setSKS(19);
        ds2.getGaji();
        
        DaftarGaji dg = new DaftarGaji(5);
        dg.addPegawai(ds);
        dg.addPegawai(ds2);
        dg.printSemuaGaji();
    }
}