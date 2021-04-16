package formpendaftaran;

import static formpendaftaran.MainForm.DeskPane;
import static formpendaftaran.MainForm.labelCreated;
import java.sql.*;
import java.awt.Font;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.beans.PropertyVetoException;

public class TabelPendaftarSMA_Frame extends javax.swing.JInternalFrame {
    TampilkanData_Frame frame = null;
    public static boolean isLoading = true;
    public static TabelPendaftarSMA_Frame obj;

    public TabelPendaftarSMA_Frame() {
        initComponents();
        obj = this;
        refreshTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelSMA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tampilBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        tambahBtn = new javax.swing.JButton();
        loadLbl = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();

        setClosable(true);
        setTitle("Tabel Pendaftar");

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        TabelSMA.setBackground(new java.awt.Color(240, 157, 140));
        TabelSMA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TabelSMA.setForeground(new java.awt.Color(0, 0, 0));
        TabelSMA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Calon", "Jenis Kelamin", "NISN", "Asal Sekolah", "Rata-rata UN", "Pilihan 1", "Pilihan 2"
            }
        ));
        TabelSMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelSMAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelSMA);

        jLabel1.setText("Daftar Peserta Didik Yang Telah Mendaftar :");

        tampilBtn.setBackground(new java.awt.Color(0, 160, 255));
        tampilBtn.setForeground(new java.awt.Color(0, 0, 0));
        tampilBtn.setText("Tampilkan Data");
        tampilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilBtnActionPerformed(evt);
            }
        });

        hapusBtn.setBackground(new java.awt.Color(0, 160, 255));
        hapusBtn.setText("Hapus Data");
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(0, 160, 255));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        closeBtn.setBackground(new java.awt.Color(0, 160, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        tambahBtn.setBackground(new java.awt.Color(0, 160, 255));
        tambahBtn.setText("Tambah Data");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(0, 160, 255));
        editBtn.setText("Edit Data");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(loadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(tampilBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapusBtn)
                        .addGap(12, 12, 12)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tambahBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(closeBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 27, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tampilBtn)
                            .addComponent(hapusBtn)
                            .addComponent(refreshBtn)
                            .addComponent(closeBtn)
                            .addComponent(tambahBtn)
                            .addComponent(editBtn))
                        .addGap(25, 25, 25))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(loadLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelSMAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelSMAMouseClicked
        int row = TabelSMA.getSelectedRow();
    }//GEN-LAST:event_TabelSMAMouseClicked

    private void tampilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilBtnActionPerformed
       int row = TabelSMA.getSelectedRow();
       if(row == -1) {
           JOptionPane.showMessageDialog(this, "Harap pilih data yang ingin ditampilkan !");
       } else {
           loading();
           Thread tr = new Thread(new Runnable() {
               @Override
               public void run() {
                   if(frame != null) {
                        DeskPane.remove(frame);
                   }
                   String nisn = TabelSMA.getValueAt(row, 1).toString();
                   String nama = TabelSMA.getValueAt(row, 2).toString();
                   frame = new TampilkanData_Frame(nisn, "read");
                   DeskPane.add(frame);
                   DeskPane.repaint();
                   DeskPane.revalidate();
                   frame.setVisible(true);
                   frame.setTitle("Data dari : Nama = " + nama + ", NISN = " + nisn);
                   frame.setLocation(190, 38);
                }
           });
           tr.start();          
       }
    }//GEN-LAST:event_tampilBtnActionPerformed

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        int row = TabelSMA.getSelectedRow();
        if(row != -1) {
            String nisn = TabelSMA.getValueAt(row, 1).toString();
            try {
                int input = JOptionPane.showConfirmDialog(this, "Yakin ingin Menghapus Data ini ?");
                if(input == 0) {
                    loading();
                    Thread tr = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            boolean isComplete = DataHelper.hapusData(nisn);
                            if(isComplete) {
                                try {refreshTable();} catch(Exception e) {System.out.println(e.getMessage());}
                            }
                        }
                    });
                    tr.start();
                }              
            } catch(Exception e) {
                System.out.println("GAGAL HAPUS : " + e.getMessage());
            }       
        } else {
            JOptionPane.showMessageDialog(this, "Harap pilih data yang ingin dihapus !");
        }
        
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {
            refreshTable();
        } catch (Exception e) {System.out.println("GAGAL REFRESH");}
       
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        try {
            setClosed(true);
        } catch (PropertyVetoException e) {System.out.println("GAGAL CLOSE");}
    }//GEN-LAST:event_closeBtnActionPerformed

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();

        DaftarSMA_Frame frame = new DaftarSMA_Frame("");

        DeskPane.add(frame);
        DeskPane.add(labelCreated);
        DeskPane.repaint();
        DeskPane.revalidate();

        frame.setVisible(true);
        frame.setLocation(78, 20);
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        int row = TabelSMA.getSelectedRow();
       if(row == -1) {
           JOptionPane.showMessageDialog(this, "Harap pilih data yang ingin diedit !");
       } else {
           loading();
           Thread tr = new Thread(new Runnable() {
               @Override
               public void run() {
                   if(frame != null) {
                        DeskPane.remove(frame);
                   }
                   String nisn = TabelSMA.getValueAt(row, 1).toString();
                   String nama = TabelSMA.getValueAt(row, 2).toString();
                   frame = new TampilkanData_Frame(nisn, "edit");
                   DeskPane.add(frame);
                   DeskPane.repaint();
                   DeskPane.revalidate();
                   frame.setVisible(true);
                   frame.setTitle("Data dari : Nama = " + nama + ", NISN = " + nisn);
                   frame.setLocation(190, 38);
                }
           });
           tr.start();          
       }
    }//GEN-LAST:event_editBtnActionPerformed

    
    public void refreshTable() {
        loading();
        Thread tr = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    JTableHeader header = TabelSMA.getTableHeader();
                    header.setFont(new Font("Dialog", Font.BOLD, 12));
                    TabelSMA.setModel(DataHelper.getData());
                    TabelSMA.setShowGrid(true);
                    TabelSMA.setRowHeight(40);
                    setSizeTabelData();
                } catch(Exception e) {
                    System.out.println("ERROR SAAT REFRESH : " + e.getMessage());
                }
            }
        });
        tr.start();
    }
     
     private void setSizeTabelData() {
        //NO
        TableColumn col1 = TabelSMA.getColumnModel().getColumn(0);
        col1.setPreferredWidth(40);
        
        //NISN
        TableColumn col5 = TabelSMA.getColumnModel().getColumn(1);
        col5.setPreferredWidth(75);
        
        //Nama Calon
        TableColumn col2 = TabelSMA.getColumnModel().getColumn(2);
        col2.setPreferredWidth(180);
        //Jenis Kelamin
        TableColumn col4 = TabelSMA.getColumnModel().getColumn(3);
        col4.setPreferredWidth(95);
       
        //Rata-rata UN
        TableColumn col6 = TabelSMA.getColumnModel().getColumn(4);
        col6.setPreferredWidth(90);
        //Asal Sekolah
        TableColumn col7 = TabelSMA.getColumnModel().getColumn(5);
        col7.setPreferredWidth(110);
        //Pilihan 1
        TableColumn col8 = TabelSMA.getColumnModel().getColumn(6);
        col8.setPreferredWidth(160);
        //pilihan 2
        TableColumn col9 = TabelSMA.getColumnModel().getColumn(7);
        col9.setPreferredWidth(160);
    }
     
     private void loading() {
         isLoading = true;       
         Thread tr = new Thread(new Runnable() {
             int index = 0;
             @Override
             public void run() {            
                 while(isLoading) {
                     if(index == 0) {
                         loadLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formpendaftaran/img/spin3.gif"))); // NOI18N
                         System.out.println("Load");                       
                     }
                     index++;
                 }
                 loadLbl.setIcon(null); // NOI18N
             }
         });
         tr.start();
     }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable TabelSMA;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loadLbl;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JButton tampilBtn;
    // End of variables declaration//GEN-END:variables
}

