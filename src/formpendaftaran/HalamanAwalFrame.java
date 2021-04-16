package formpendaftaran;

import static formpendaftaran.MainForm.DeskPane;
import static formpendaftaran.MainForm.labelCreated;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumn;

public class HalamanAwalFrame extends javax.swing.JInternalFrame {

    public HalamanAwalFrame() {
        initComponents();
        setSizeTabelInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        MainPanel = new javax.swing.JPanel();
        SideBarPanel = new javax.swing.JPanel();
        homeBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        KontakBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        ContentPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SideBarHome = new javax.swing.JPanel();
        BerandaBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JadwalBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BeasiswaBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ContentPanelHome = new javax.swing.JPanel();
        BerandaPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        daftarBtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        pendaftarBtn = new javax.swing.JButton();
        JadwalPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelInfo = new javax.swing.JTable();
        BeasiswaPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        KontakPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setClosable(true);
        setTitle("Welcome");
        setFocusTraversalPolicyProvider(true);

        MainPanel.setLayout(new java.awt.BorderLayout());

        SideBarPanel.setBackground(new java.awt.Color(0, 150, 255));

        homeBtn.setBackground(new java.awt.Color(0, 160, 255));
        homeBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Home");

        javax.swing.GroupLayout homeBtnLayout = new javax.swing.GroupLayout(homeBtn);
        homeBtn.setLayout(homeBtnLayout);
        homeBtnLayout.setHorizontalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        homeBtnLayout.setVerticalGroup(
            homeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        KontakBtn.setBackground(new java.awt.Color(0, 160, 255));
        KontakBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        KontakBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KontakBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KontakBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KontakBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KontakBtnMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kontak");

        javax.swing.GroupLayout KontakBtnLayout = new javax.swing.GroupLayout(KontakBtn);
        KontakBtn.setLayout(KontakBtnLayout);
        KontakBtnLayout.setHorizontalGroup(
            KontakBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KontakBtnLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        KontakBtnLayout.setVerticalGroup(
            KontakBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KontakBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        closeBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KontakBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SideBarPanelLayout.createSequentialGroup()
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(KontakBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(55, 55, 55))
        );

        MainPanel.add(SideBarPanel, java.awt.BorderLayout.LINE_START);

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formpendaftaran/img/tutwuri.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Situs Pendaftaran Siswa/Siswi Baru Tahun 2020/2021");

        jPanel1.setLayout(new java.awt.BorderLayout());

        SideBarHome.setBackground(new java.awt.Color(0, 150, 255));

        BerandaBtn.setBackground(new java.awt.Color(0, 160, 255));
        BerandaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BerandaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BerandaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BerandaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BerandaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BerandaBtnMouseExited(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Beranda");

        javax.swing.GroupLayout BerandaBtnLayout = new javax.swing.GroupLayout(BerandaBtn);
        BerandaBtn.setLayout(BerandaBtnLayout);
        BerandaBtnLayout.setHorizontalGroup(
            BerandaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BerandaBtnLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BerandaBtnLayout.setVerticalGroup(
            BerandaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BerandaBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        JadwalBtn.setBackground(new java.awt.Color(0, 160, 255));
        JadwalBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JadwalBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JadwalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JadwalBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JadwalBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JadwalBtnMouseExited(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jadwal");

        javax.swing.GroupLayout JadwalBtnLayout = new javax.swing.GroupLayout(JadwalBtn);
        JadwalBtn.setLayout(JadwalBtnLayout);
        JadwalBtnLayout.setHorizontalGroup(
            JadwalBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JadwalBtnLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        JadwalBtnLayout.setVerticalGroup(
            JadwalBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JadwalBtnLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        BeasiswaBtn.setBackground(new java.awt.Color(0, 160, 255));
        BeasiswaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BeasiswaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BeasiswaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BeasiswaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BeasiswaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BeasiswaBtnMouseExited(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Beasiswa");

        javax.swing.GroupLayout BeasiswaBtnLayout = new javax.swing.GroupLayout(BeasiswaBtn);
        BeasiswaBtn.setLayout(BeasiswaBtnLayout);
        BeasiswaBtnLayout.setHorizontalGroup(
            BeasiswaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeasiswaBtnLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
        );
        BeasiswaBtnLayout.setVerticalGroup(
            BeasiswaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeasiswaBtnLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout SideBarHomeLayout = new javax.swing.GroupLayout(SideBarHome);
        SideBarHome.setLayout(SideBarHomeLayout);
        SideBarHomeLayout.setHorizontalGroup(
            SideBarHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideBarHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BerandaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(SideBarHomeLayout.createSequentialGroup()
                        .addGroup(SideBarHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JadwalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BeasiswaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SideBarHomeLayout.setVerticalGroup(
            SideBarHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarHomeLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(BerandaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(JadwalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BeasiswaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jPanel1.add(SideBarHome, java.awt.BorderLayout.LINE_END);

        ContentPanelHome.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanelHome.setLayout(new java.awt.CardLayout());

        BerandaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Peningkatan kualitas proses seleksi penerimaan Siswa/siswi baru telah menjadi kebutuhan dan kebijakan nasional. Upaya peningkatan kualitas penerimaan Siswa/siswi telah dilakukan sejak tahun 1976. Merespon kebutuhan terhadap peningkatan kualitas proses seleksi penerimaan Siswa baru berupa: \n\na). tes yang mampu memprediksi kemampuan calon Siswa/Siswi \nb). tes kompetensi calon Siswa yang akan melanjutkan di jenjang SMA\nc). pentingnya lembaga permanen yang melaksanakan tes terstandar secara Nasional, maka diperlukan Lembaga yang dapat memfasilitasi pelaksanaan tes secara berkelanjutan.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jScrollPane5.setViewportView(jTextArea1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Bagi Peserta Didik Baru yang Ingin Mendaftar Silahkan  Memencet Tombol dibawah");

        daftarBtn.setText("Daftar");
        daftarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarBtnActionPerformed(evt);
            }
        });

        jLabel17.setText("Daftar Peserta Didik Yang telah mendaftar");

        pendaftarBtn.setText("Pendaftar");
        pendaftarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendaftarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel16))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(daftarBtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(pendaftarBtn)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daftarBtn)
                .addGap(50, 50, 50)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pendaftarBtn)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jPanel2);

        javax.swing.GroupLayout BerandaPanelLayout = new javax.swing.GroupLayout(BerandaPanel);
        BerandaPanel.setLayout(BerandaPanelLayout);
        BerandaPanelLayout.setHorizontalGroup(
            BerandaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BerandaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        BerandaPanelLayout.setVerticalGroup(
            BerandaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BerandaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContentPanelHome.add(BerandaPanel, "card2");

        JadwalPanel.setBackground(new java.awt.Color(255, 255, 255));

        TabelInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Penerimaan Siswa/siswi Baru", "15-20 April 2021"},
                {"2", "Tes Masuk", "22-25 April 2021"},
                {"3", "Pendaftaran Ulang", "28-30 April 2021"},
                {"4", "Masuk Sekolah", "2 Mei 2021"}
            },
            new String [] {
                "No", "Kegiatan", "Tanggal"
            }
        ));
        jScrollPane1.setViewportView(TabelInfo);

        javax.swing.GroupLayout JadwalPanelLayout = new javax.swing.GroupLayout(JadwalPanel);
        JadwalPanel.setLayout(JadwalPanelLayout);
        JadwalPanelLayout.setHorizontalGroup(
            JadwalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JadwalPanelLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        JadwalPanelLayout.setVerticalGroup(
            JadwalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JadwalPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        ContentPanelHome.add(JadwalPanel, "card3");

        BeasiswaPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Maaf Saat ini beasiswa belum tersedia");

        javax.swing.GroupLayout BeasiswaPanelLayout = new javax.swing.GroupLayout(BeasiswaPanel);
        BeasiswaPanel.setLayout(BeasiswaPanelLayout);
        BeasiswaPanelLayout.setHorizontalGroup(
            BeasiswaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BeasiswaPanelLayout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(161, 161, 161))
        );
        BeasiswaPanelLayout.setVerticalGroup(
            BeasiswaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BeasiswaPanelLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel15)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        ContentPanelHome.add(BeasiswaPanel, "card4");

        jPanel1.add(ContentPanelHome, java.awt.BorderLayout.CENTER);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Kota Kendari");

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(260, 260, 260)))
                .addComponent(jLabel5)
                .addGap(15, 15, 15))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGroup(HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(HomePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, HomePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContentPanel.add(HomePanel, "card2");

        KontakPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setText(":  ahmadfathanah15@gmail.com");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setText(":  AhmadFMA_");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel10.setText(":  +62822 9145 3878");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formpendaftaran/img/gmail.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formpendaftaran/img/whatsapp.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formpendaftaran/img/instagram.png"))); // NOI18N

        javax.swing.GroupLayout KontakPanelLayout = new javax.swing.GroupLayout(KontakPanel);
        KontakPanel.setLayout(KontakPanelLayout);
        KontakPanelLayout.setHorizontalGroup(
            KontakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KontakPanelLayout.createSequentialGroup()
                .addGap(0, 199, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(274, 274, 274))
            .addGroup(KontakPanelLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(KontakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KontakPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(KontakPanelLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        KontakPanelLayout.setVerticalGroup(
            KontakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KontakPanelLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(KontakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(KontakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(KontakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(257, 257, 257))
        );

        ContentPanel.add(KontakPanel, "card3");

        MainPanel.add(ContentPanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void setSizeTabelInfo() {
        TableColumn col1 = TabelInfo.getColumnModel().getColumn(0);
        col1.setPreferredWidth(30);
        
        TableColumn col2 = TabelInfo.getColumnModel().getColumn(1);
        col2.setPreferredWidth(220);
        
        TableColumn col3 = TabelInfo.getColumnModel().getColumn(2);
        col3.setPreferredWidth(220);
        TabelInfo.setRowHeight(30);
    }
    
    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(HomePanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setBackground(new Color(0, 120, 255));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setBackground(new Color(0, 160, 255));
    }//GEN-LAST:event_homeBtnMouseExited

    private void KontakBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KontakBtnMouseClicked
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(KontakPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_KontakBtnMouseClicked

    private void KontakBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KontakBtnMouseEntered
       KontakBtn.setBackground(new Color(0,120,255));
    }//GEN-LAST:event_KontakBtnMouseEntered

    private void KontakBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KontakBtnMouseExited
        KontakBtn.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_KontakBtnMouseExited

    private void BerandaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BerandaBtnMouseClicked
        ContentPanelHome.removeAll();
        ContentPanelHome.repaint();
        ContentPanelHome.revalidate();
        
        ContentPanelHome.add(BerandaPanel);
        ContentPanelHome.repaint();
        ContentPanelHome.revalidate();
    }//GEN-LAST:event_BerandaBtnMouseClicked

    private void BerandaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BerandaBtnMouseEntered
        BerandaBtn.setBackground(new Color(0, 120, 255));
    }//GEN-LAST:event_BerandaBtnMouseEntered

    private void BerandaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BerandaBtnMouseExited
        BerandaBtn.setBackground(new Color(0, 160, 255));
    }//GEN-LAST:event_BerandaBtnMouseExited

    private void JadwalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JadwalBtnMouseClicked
        ContentPanelHome.removeAll();
        ContentPanelHome.repaint();
        ContentPanelHome.revalidate();
        
        ContentPanelHome.add(JadwalPanel);
        ContentPanelHome.repaint();
        ContentPanelHome.revalidate();
    }//GEN-LAST:event_JadwalBtnMouseClicked

    private void JadwalBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JadwalBtnMouseEntered
        JadwalBtn.setBackground(new Color(0, 120, 255));
    }//GEN-LAST:event_JadwalBtnMouseEntered

    private void JadwalBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JadwalBtnMouseExited
        JadwalBtn.setBackground(new Color(0, 160, 255));
    }//GEN-LAST:event_JadwalBtnMouseExited

    private void BeasiswaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeasiswaBtnMouseClicked
        ContentPanelHome.removeAll();
        ContentPanelHome.repaint();
        ContentPanelHome.revalidate();
        
        ContentPanelHome.add(BeasiswaPanel);
        ContentPanelHome.repaint();
        ContentPanelHome.revalidate();
    }//GEN-LAST:event_BeasiswaBtnMouseClicked

    private void BeasiswaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeasiswaBtnMouseEntered
        BeasiswaBtn.setBackground(new Color(0, 120, 255));
    }//GEN-LAST:event_BeasiswaBtnMouseEntered

    private void BeasiswaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BeasiswaBtnMouseExited
        BeasiswaBtn.setBackground(new Color(0, 160, 255));
    }//GEN-LAST:event_BeasiswaBtnMouseExited

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        try {
            setClosed(true);
        } catch (PropertyVetoException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void daftarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarBtnActionPerformed
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
    }//GEN-LAST:event_daftarBtnActionPerformed

    private void pendaftarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendaftarBtnActionPerformed
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
    }//GEN-LAST:event_pendaftarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BeasiswaBtn;
    private javax.swing.JPanel BeasiswaPanel;
    private javax.swing.JPanel BerandaBtn;
    private javax.swing.JPanel BerandaPanel;
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel ContentPanelHome;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel JadwalBtn;
    private javax.swing.JPanel JadwalPanel;
    private javax.swing.JPanel KontakBtn;
    private javax.swing.JPanel KontakPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideBarHome;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JTable TabelInfo;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton daftarBtn;
    private javax.swing.JPanel homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton pendaftarBtn;
    // End of variables declaration//GEN-END:variables
}

