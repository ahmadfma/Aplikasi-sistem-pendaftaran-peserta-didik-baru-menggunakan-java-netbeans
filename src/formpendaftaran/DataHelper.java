/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formpendaftaran;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class DataHelper {
    TabelPendaftarSMA_Frame obj;

    public static boolean masukkanData(String nama, String kelamin,String nisn, String nilaiUN, String asalSekolah, String pil1, String pil2 ) throws IOException{      
        boolean isComplete = true;
        try {
            String sql = String.format("insert into pendaftar_sma values('%s','%s','%s','%s','%s','%s','%s')", nisn, nama, kelamin, asalSekolah, nilaiUN, pil1, pil2);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pendaftaraansiswabaru", "root", "");
            conn.createStatement().executeUpdate(sql);
            DaftarSMA_Frame.isLoading = false;
            JOptionPane.showMessageDialog(null, "Pendaftaran Berhasil !");
        } catch (Exception e) {
            System.out.println("GAGAL TAMBAH : " + e.getMessage());
            DaftarSMA_Frame.isLoading = false;
            JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Pendaftaran Gagal !", JOptionPane.ERROR_MESSAGE);
            isComplete = false;
        }
        return isComplete;
    }
    
    public static void masukkanAllData(
            String nama, 
            String ttl,
            String alamat, 
            String kelamin, 
            String agama, 
            String asalsekolah, 
            String nmrhp,
            String nisn,
            String nilaiUN,
            String pil1,
            String pil2,
            String namaAyah,
            String pekerjaanAyah,
            String nmrhpAyah,
            String gajiAyah,
            String namaIbu,
            String pekerjaanIbu,
            String nmrHpIbu,
            String gajiIbu
            ) throws IOException{
        try {
            String sql = String.format("insert into data_pendaftar_sma values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')",
                    nama, ttl, alamat,kelamin, agama, asalsekolah, nmrhp, nisn, nilaiUN, pil1, pil2, namaAyah, pekerjaanAyah, nmrhpAyah, gajiAyah, namaIbu, pekerjaanIbu, nmrHpIbu, gajiIbu);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pendaftaraansiswabaru", "root", "");
            conn.createStatement().executeUpdate(sql);        
        } catch (Exception e) {
            System.out.println("GAGAL TAMBAH ALL : " + e.getMessage());
        }
    }
    
    public static DefaultTableModel getData() {
         int no = 1;
         DefaultTableModel model = new DefaultTableModel() {
             @Override
             public boolean isCellEditable(int row, int column) {
                 return false;
             }
             
         };
         model.addColumn("NO");
         model.addColumn("NISN");
         model.addColumn("NAMA");
         model.addColumn("JENIS KELAMIN");
         model.addColumn("ASAL SEKOLAH");
         model.addColumn("RATA-RATA UN");
         model.addColumn("PILIHAN 1");
         model.addColumn("PILIHAN 2");
         try {          
            String sql = "SELECT * FROM pendaftar_sma ORDER BY nama";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pendaftaraansiswabaru", "root", "");
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);

            while(res.next()) {
                model.addRow(new Object[] {
                    no++, res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)
                });
            }         
             System.out.println("BERHASIL AMBIL DATA");
             TabelPendaftarSMA_Frame.isLoading = false;
         } catch (SQLException e) {
             TabelPendaftarSMA_Frame.isLoading = false;
             System.out.println("GAGAL AMBIL DATA : " + e.getMessage());
             JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Error !", JOptionPane.ERROR_MESSAGE);
         }
         
         return model;
     }
    
    public static ArrayList<String> getAllData(String nisn) {
        ArrayList<String> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM data_pendaftar_sma WHERE nisn = " + nisn;
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pendaftaraansiswabaru", "root", "");
            Statement stm = conn.createStatement();
            ResultSet res = stm.executeQuery(sql);

            while(res.next()) {
                for(int i = 1; i <= 19;i++) {
                    list.add(res.getString(i));
                }
            }  
            TabelPendaftarSMA_Frame.isLoading = false;
         } catch (SQLException e) {
             TabelPendaftarSMA_Frame.isLoading = false;
             System.out.println("GAGAL AMBIL DATA : " + e.getMessage());
             JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Gagal Tampilkan Data !", JOptionPane.ERROR_MESSAGE);
         }
        
        return list;
    }
    
    public static boolean hapusData(String nisn) {
        boolean isComplete = true;
        try {
            String sql1 = String.format("delete from pendaftar_sma where nisn = %s", nisn);
            String sql2 = String.format("delete from data_pendaftar_sma where nisn = %s", nisn);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pendaftaraansiswabaru", "root", "");
            conn.createStatement().executeUpdate(sql1);
            conn.createStatement().executeUpdate(sql2);
            TabelPendaftarSMA_Frame.isLoading = false;
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch(SQLException e) {
            TabelPendaftarSMA_Frame.isLoading = false;
            JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Gagal Hapus Data !", JOptionPane.ERROR_MESSAGE);
            isComplete = false;
        }    
        
        return isComplete;
    }
    
    public static boolean editData(
            String key,
            String nama, 
            String ttl,
            String alamat, 
            String kelamin, 
            String agama, 
            String asalsekolah, 
            String nmrhp,
            String nisn,
            String nilaiUN,
            String pil1,
            String pil2,
            String namaAyah,
            String pekerjaanAyah,
            String nmrhpAyah,
            String gajiAyah,
            String namaIbu,
            String pekerjaanIbu,
            String nmrHpIbu,
            String gajiIbu) {
        boolean isComplete = true;
        try {
            String sql1 = String.format("update pendaftar_sma set nisn = '%s', nama = '%s', jenis_kelamin = '%s', asal_sekolah = '%s', rata_un = '%s', pilihan1 = '%s', pilihan2 = '%s' where nisn = '%s'", 
                    nisn, nama, kelamin, asalsekolah, nilaiUN, pil1, pil2, key);
            String sql2 = String.format("update data_pendaftar_sma set nama = '%s', ttl = '%s', alamat = '%s', jenis_kelamin = '%s', agama = '%s', asal_sekolah = '%s', nomor_hp = '%s', nisn = '%s', nilai_un = '%s', pilihan1 = '%s', pilihan2 = '%s', nama_ayah = '%s', pekerjaan_ayah = '%s', nomorhp_ayah = '%s', gaji_ayah = '%s', nama_ibu = '%s', pekerjaan_ibu = '%s', nomorhp_ibu = '%s', gaji_ibu = '%s' where nisn= '%s'", 
                    nama,ttl,alamat, kelamin, agama, asalsekolah, nmrhp, nisn, nilaiUN, pil1, pil2, namaAyah, pekerjaanAyah, nmrhpAyah, gajiAyah, namaIbu, pekerjaanIbu, nmrHpIbu, gajiIbu, key );
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/pendaftaraansiswabaru", "root", "");
            conn.createStatement().executeUpdate(sql1);
            conn.createStatement().executeUpdate(sql2);
            TampilkanData_Frame.isLoading = false;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            TampilkanData_Frame.isLoading = false;
            JOptionPane.showMessageDialog(null, "Gagal Connect ke Database : " + e.getMessage(), "Gagal Hapus Data !", JOptionPane.ERROR_MESSAGE);
            isComplete = false;
        }    
        return isComplete;
    }
    
}
