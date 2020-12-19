package PBO15.Backend;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.ArrayList;
import java.sql.*;
import PBO15.Backend.*;

public class Anggota {
    private int IdAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota() {
    }
   
    public Anggota( String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdAnggota() {
        return IdAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.IdAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
    
    public Anggota getById(int id) {
        Anggota ang = new Anggota();
        ResultSet rs2 = DBHelper.selectQuery("SELECT * FROM anggota " 
                                        + "WHERE idanggota - '"+id+"'");
        
        try {
            while (rs2.next()) {
                ang = new Anggota();
                ang.setIdAnggota(rs2.getInt("idAnggota"));
                ang.setNama(rs2.getString("nama"));
                ang.setAlamat(rs2.getString("alamat"));
                ang.setTelepon(rs2.getString("alamat"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }
    public ArrayList<Anggota> getAll() {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        ResultSet rs2 = DBHelper.selectQuery("SELECT * FROM anggota");

        try {
            while (rs2.next()) {
                Anggota ang = new Anggota();
                ang.setIdAnggota(rs2.getInt("idKategori"));
                ang.setNama(rs2.getString("nama"));
                ang.setAlamat(rs2.getString("alamat"));
                ang.setTelepon(rs2.getString("alamat"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    public ArrayList<Anggota> search(String keyword) {
        ArrayList<Anggota> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or keterangan like '%" + keyword + "%' ";

        ResultSet rs2 = DBHelper.selectQuery(sql);
        try {
            while (rs2.next()) {
                Anggota ang = new Anggota();
                ang.setIdAnggota(rs2.getInt("idAnggota"));
                ang.setNama(rs2.getString("nama"));
                ang.setAlamat(rs2.getString("alamat"));
                ang.setTelepon(rs2.getString("alamat"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
     public void save() {
        if (getById(setIdAnggota).getIdAnggota() == 0) {
            String SQL = "Insert into kategori (nama,keterangan) values("
                    + " '" + this.nama + "', "
                    + " '" + this.keterangan + "' "
                    + " )";
            this.IdAnggota = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "Update kategori set"
                    + " nama = '" + this.nama + "', "
                    + " keterangan = '" + this.keterangan + "' "
                    + "Where idKategori = '" + this.IdAnggota + "'";
            DBHelper.executeQuery(SQL);
        }
    }
     
    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idKategori = '" 
                + this.IdAnggota + "'";
        DBHelper.executeQuery(SQL);
    }
}
