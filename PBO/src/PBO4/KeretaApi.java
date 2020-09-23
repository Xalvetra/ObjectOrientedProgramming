package PBO4;
/**
 *
 * @author Faris Ikhlasul H
 */
public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    KeretaApi (String nama,String kelas,Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }
    KeretaApi(String nama,String kelas,Pegawai masinis,Pegawai asisten){
        this.nama =nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        info += "Asisten: " + this.asisten.info() + "\n";
        return info;
    }
}
