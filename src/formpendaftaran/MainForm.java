package formpendaftaran;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class MainForm extends javax.swing.JFrame {
    
    public MainForm() {
        initComponents();
        UIManager.put("menuBar.background", Color.BLUE);
        setLocationRelativeTo(null);
        
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();

        HalamanAwalFrame frame = new HalamanAwalFrame();

        DeskPane.add(frame);
        DeskPane.add(labelCreated);
        DeskPane.repaint();
        DeskPane.revalidate();

        frame.setVisible(true);
        frame.setLocation(78, 20);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeskPane = new javax.swing.JDesktopPane() {
            ImageIcon icon = new ImageIcon(getClass().getResource("/formpendaftaran/img/BG-9.jpg"));
            Image image = icon.getImage();

            Image newimage = image.getScaledInstance(1127, 657, Image.SCALE_SMOOTH);

            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                g.drawImage(newimage, 0, 0, this);
            }
        };
        labelCreated = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        HalamanAwalItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        daftarSMAItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        TabelSMAItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pendaftaran");
        setResizable(false);

        labelCreated.setBackground(new java.awt.Color(255, 255, 255));
        labelCreated.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelCreated.setForeground(new java.awt.Color(255, 255, 255));
        labelCreated.setText("Created By : Ahmad Fathanah M.Adil");

        DeskPane.setLayer(labelCreated, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DeskPaneLayout = new javax.swing.GroupLayout(DeskPane);
        DeskPane.setLayout(DeskPaneLayout);
        DeskPaneLayout.setHorizontalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskPaneLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(labelCreated)
                .addContainerGap(668, Short.MAX_VALUE))
        );
        DeskPaneLayout.setVerticalGroup(
            DeskPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DeskPaneLayout.createSequentialGroup()
                .addContainerGap(635, Short.MAX_VALUE)
                .addComponent(labelCreated)
                .addContainerGap())
        );

        MenuBar.setForeground(new java.awt.Color(60, 63, 65));

        jMenu1.setText("Home");

        HalamanAwalItem.setText("Halaman Awal");
        HalamanAwalItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HalamanAwalItemActionPerformed(evt);
            }
        });
        jMenu1.add(HalamanAwalItem);

        MenuBar.add(jMenu1);

        jMenu2.setText("Formulir");

        daftarSMAItem.setText("Pendaftaran Siswa/i Baru SMA");
        daftarSMAItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarSMAItemActionPerformed(evt);
            }
        });
        jMenu2.add(daftarSMAItem);

        MenuBar.add(jMenu2);

        jMenu3.setText("Pendaftar");

        TabelSMAItem.setText("Tabel Pendaftar SMA");
        TabelSMAItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelSMAItemActionPerformed(evt);
            }
        });
        jMenu3.add(TabelSMAItem);

        MenuBar.add(jMenu3);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DeskPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HalamanAwalItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HalamanAwalItemActionPerformed
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();

        HalamanAwalFrame frame = new HalamanAwalFrame();

        DeskPane.add(frame);
        DeskPane.add(labelCreated);
        DeskPane.repaint();
        DeskPane.revalidate();

        frame.setVisible(true);
        frame.setLocation(78, 20);
    }//GEN-LAST:event_HalamanAwalItemActionPerformed

    private void daftarSMAItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarSMAItemActionPerformed
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
    }//GEN-LAST:event_daftarSMAItemActionPerformed

    private void TabelSMAItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelSMAItemActionPerformed
        DeskPane.removeAll();
        DeskPane.repaint();
        DeskPane.revalidate();

        TabelPendaftarSMA_Frame frame = new TabelPendaftarSMA_Frame();

        DeskPane.add(frame);
        DeskPane.add(labelCreated);
        DeskPane.repaint();
        DeskPane.revalidate();

        frame.setVisible(true);
        frame.setLocation(78, 20);
    }//GEN-LAST:event_TabelSMAItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane DeskPane;
    private javax.swing.JMenuItem HalamanAwalItem;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem TabelSMAItem;
    private javax.swing.JMenuItem daftarSMAItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    public static javax.swing.JLabel labelCreated;
    // End of variables declaration//GEN-END:variables
}

