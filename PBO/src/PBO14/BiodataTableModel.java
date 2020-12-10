package PBO14;

/**
 *
 * @author Faris Ikhlasul H
 */
import javax.swing.table.AbstractTableModel;

public class BiodataTableModel extends AbstractTableModel {

    private final Biodata[] data;
    private final String[] namaKolom;

    public BiodataTableModel(Biodata[] data) {
        this.data = data;
        this.namaKolom = new String[]{
            "Nim",
            "Nama",
            "Jurusan",
            "Gender",
            "Membaca",
            "Tidur",
            "Makan",
            "Alamat"
        };
    }

    public int getRowCount() {
        //Mengembalikan Jumlah Baris, berdasarkan Jumlah Data
        return data.length;
    }

    public int getColomncount() {
        //Mengembalikan Jumlah Kolom Dari Tabel
        return 7;
    }

    public String getColumnName(int column) {
        return namaKolom[column];
    }

    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex < 4) {
            return String.class;
        } else {
            return Boolean.class;
        }
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return data[rowIndex].getNim();
            case 1:
                return data[rowIndex].getNama();
            case 2:
                return data[rowIndex].getJurusan();
            case 3:
                return data[rowIndex].getGender();
            case 4:
                return data[rowIndex].isBaca();
            case 5:
                return data[rowIndex].isMakan();
            case 6:
                return data[rowIndex].isTidur();
        }
        return null;
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
