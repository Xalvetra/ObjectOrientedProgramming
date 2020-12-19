package PBO15.Backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Kategori {
    private int IdKategori;
    private String nama;
    private String keterangan;

    public Kategori() {
    }

    
    public Kategori(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    public Kategori getById(int id) {
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori " 
                                        + "WHERE idkategori - '"+id+"'");
        
        try {
            while (rs.next()) {
                kat = new Kategori();
                kat.setIdKategori(rs.getInt("idKategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }
    
    public ArrayList<Kategori> getAll() {
        ArrayList<Kategori> ListKategori = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idKategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }
    
    public ArrayList<Kategori> search(String keyword) {
        ArrayList<Kategori> ListKategori = new ArrayList();

        String sql = "Select * from kategori where " + " nama like '%" + keyword + "%' " + " or keterangan like '%" + keyword + "%' ";

        ResultSet rs = DBHelper.selectQuery(sql);
        try {
            while (rs.next()) {
                Kategori kat = new Kategori();
                kat.setIdKategori(rs.getInt("idKategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }
    public void save() {
        if (getById(IdKategori).getIdKategori() == 0) {
            String SQL = "Insert into kategori (nama,keterangan) values("
                    + " '" + this.nama + "', "
                    + " '" + this.keterangan + "' "
                    + " )";
            this.IdKategori = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "Update kategori set"
                    + " nama = '" + this.nama + "', "
                    + " keterangan = '" + this.keterangan + "' "
                    + "Where idKategori = '" + this.IdKategori + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idKategori = '" 
                + this.IdKategori + "'";
        DBHelper.executeQuery(SQL);
    }
    public int getIdKategori() {
        return IdKategori;
    }
    public void setIdKategori(int idkategori) {
        this.IdKategori = idkategori;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getKeterangan() {
        return keterangan;
    }
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}