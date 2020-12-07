package PBO14;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Biodata {
    private String nim,nama,jurusan,gender,alamat;
    private boolean baca,makan,tidur;

    public Biodata(String nim, String nama, String jurusan, String gender, boolean baca, boolean makan, boolean tidur, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.gender = gender;
        this.alamat = alamat;
        this.baca = baca;
        this.makan = makan;
        this.tidur = tidur;
    }

    public Biodata() {
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean isBaca() {
        return baca;
    }

    public void setBaca(boolean baca) {
        this.baca = baca;
    }

    public boolean isMakan() {
        return makan;
    }

    public void setMakan(boolean makan) {
        this.makan = makan;
    }

    public boolean isTidur() {
        return tidur;
    }

    public void setTidur(boolean tidur) {
        this.tidur = tidur;
    }
    
}
