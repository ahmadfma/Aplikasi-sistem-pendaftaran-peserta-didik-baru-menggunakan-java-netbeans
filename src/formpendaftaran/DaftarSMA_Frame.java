package formpendaftaran;

import static formpendaftaran.MainForm.DeskPane;
import static formpendaftaran.MainForm.labelCreated;
import java.awt.Color;
import java.awt.TextField;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DaftarSMA_Frame extends javax.swing.JInternalFrame {
    String type = "";

    String namacalon = "",
            ttl = "",
            alamat = "",
            nisn = "",
            noHpCalon = "",
            jenisKelamin = "",
            agama = "",
            asalSekolah = "",
            
            namaAyah = "",
            namaIbu = "",
            pekerjaanAyah = "",
            pekerjannIbu = "",
            noHpAyah = "",
            noHpIbu = "",
            penghasilanBulananAyah = "",
            penghasilanBulananIbu = "",
            
            bindo = "",
            bing = "",
            mtk = "",
            ipa = "",
            
            sma1 = "", sma2 = "", jurusan1 = "", jurusan2 = "";
    float rata2UN;
    boolean isFilled = true;
    public static boolean isLoading = true;

    public DaftarSMA_Frame(String type) {
        this.type = type;
        initComponents();
    }
    
    private void getAllData() {
        namacalon = namaPendaftarTF.getText();
        ttl = ttlTF.getText();
        nisn = nisnTF.getText();
        alamat = alamatTA.getText();
        if(lakilakiBtn.isSelected()) {
            jenisKelamin = lakilakiBtn.getText();
        } else if(perempuanBtn.isSelected()) {
            jenisKelamin = perempuanBtn.getText();
        }
        agama = agamaTF.getText();
        asalSekolah = asalSekolahTF.getText();
        noHpCalon = nomorHpPendaftarTF.getText();
        
        namaAyah = namaAyahTF.getText();
        pekerjaanAyah = pekerjaanAyahTF.getText();
        noHpAyah = nmrHpAyahTF.getText();
        penghasilanBulananAyah = gajiBulananAyahBox.getSelectedItem().toString();
        
        namaIbu = namaIbuTF.getText();
        pekerjannIbu = pekerjaanIbuTF.getText();
        noHpIbu = nmrHpIbuTF.getText();
        penghasilanBulananIbu = gajiBulananIbuBox.getSelectedItem().toString();
        
        bindo = bindoTF.getText();
        bing = bingTF.getText();
        mtk = mtkTF.getText();
        ipa = ipaTF.getText();
        sma1 = smaPil1Box.getSelectedItem().toString();
        jurusan1 = jurusanPil1Box.getSelectedItem().toString();
        sma2 = smaPil2Box.getSelectedItem().toString();
        jurusan2 = jurusanPil2Box.getSelectedItem().toString();
        rata2UN = (Float.parseFloat(bindo) + Float.parseFloat(bing) + Float.parseFloat(mtk) + Float.parseFloat(ipa)) / 4.0f;
    }
    
    private void refreshComponent() {
        namaPendaftarTF.setText("");
        ttlTF.setText("");
        nisnTF.setText("");
        alamatTA.setText("");
       
        agamaTF.setText("");
        asalSekolahTF.setText("");
        nomorHpPendaftarTF.setText("");
        
        buttonGroup1.clearSelection();
        
        namaAyahTF.setText("");
        pekerjaanAyahTF.setText("");
        nmrHpAyahTF.setText("");
        gajiBulananAyahBox.setSelectedIndex(0);
        
        namaIbuTF.setText("");
        pekerjaanIbuTF.setText("");
        nmrHpIbuTF.setText("");
        gajiBulananIbuBox.setSelectedIndex(0);
        
        bindoTF.setText("");
        bingTF.setText("");
        mtkTF.setText("");
        ipaTF.setText("");
        smaPil1Box.setSelectedIndex(0);
        jurusanPil1Box.setSelectedIndex(0);
        smaPil2Box.setSelectedIndex(0);
        jurusanPil2Box.setSelectedIndex(0);
        setujuCheckBox.setSelected(false);
    }
    
    private void checkData() {
        ArrayList<JTextField> fields = new ArrayList<>();
        fields.add(namaPendaftarTF);
        fields.add(ttlTF);
        fields.add(agamaTF);
        fields.add(asalSekolahTF);
        fields.add(nomorHpPendaftarTF);
        fields.add(nisnTF);
        
        fields.add(bindoTF);
        fields.add(bingTF);
        fields.add(mtkTF);
        fields.add(ipaTF);
        
        fields.add(namaAyahTF);
        fields.add(pekerjaanAyahTF);
        fields.add(nmrHpAyahTF);
        fields.add(namaIbuTF);
        fields.add(pekerjaanIbuTF);
        fields.add(nmrHpIbuTF);
        
        ArrayList<JTextArea> areas = new ArrayList<>();
        areas.add(alamatTA);
        
        ArrayList<JComboBox> combos = new ArrayList<>();
        combos.add(smaPil1Box);
        combos.add(jurusanPil1Box);
        combos.add(smaPil2Box);
        combos.add(jurusanPil2Box);
        combos.add(gajiBulananAyahBox);
        combos.add(gajiBulananIbuBox);
       
        
        for(int i = 0; i < fields.size(); i++) {
            if(fields.get(i).getText().equals("")) {
                checkClass("fields",i);
                fields.get(i).requestFocus();
                isFilled = false;
                return;
            }
        }
        
        for(int i = 0; i < areas.size(); i++) {
            if(areas.get(i).getText().equals("")) {
                checkClass("areas",i);
                areas.get(i).requestFocus();
                isFilled = false;
                return;
            }
        }
        
        for(int i = 0; i < combos.size(); i++) {
            if(combos.get(i).getSelectedIndex() == 0) {
                checkClass("combos",i);
                combos.get(i).requestFocus();
                isFilled = false;
                return;
            }
        }
        
        if(!lakilakiBtn.isSelected() && !perempuanBtn.isSelected()) {
            checkClass("areas", 0);
            lakilakiBtn.requestFocus();
            isFilled = false;
            return;
        }
       
        
        isFilled = true;
    }
    
    private void gotoPanel(String ctgr) {
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();

        if(ctgr.equals("datapribadi")) {
            ContentPanel.add(DataPribadiPanel);
        } else if(ctgr.equals("datanilai")) {
            ContentPanel.add(DataNilaiPanel);
        } else if(ctgr.equals("dataorangtua")) {
            ContentPanel.add(DataOrangTuaPanel);
        }
 
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }
    
    private void checkClass(String classCat, int i) {
        if(classCat.equals("fields")) {
            if(i < 6) {
                gotoPanel("datapribadi");
                JOptionPane.showMessageDialog(this, "Harap Mengisi Semua kolom di Data Pribadi");
            } else if(i < 10) {
                gotoPanel("datanilai");
                JOptionPane.showMessageDialog(this, "Harap Mengisi Semua kolom di Data Nilai");
            } else if(i < 16) {
                gotoPanel("dataorangtua");
                JOptionPane.showMessageDialog(this, "Harap Mengisi Semua kolom di Data Orang tua");
            }
        } else if(classCat.equals("areas")) {
            if(i < 1) {
                gotoPanel("datapribadi");
                JOptionPane.showMessageDialog(this, "Harap Mengisi Semua kolom di Data Pribadi");
            }
        } else if(classCat.equals("combos")) {
            if(i < 4) {
                gotoPanel("datanilai");
                JOptionPane.showMessageDialog(this, "Harap Mengisi Semua kolom di Data Nilai");
            } else if(i < 6) {
                gotoPanel("dataorangtua");
                JOptionPane.showMessageDialog(this, "Harap Mengisi Semua kolom di Data Orang tua");
            }
        }
        
    }
    
    private void loading() {
         isLoading = true;
         Thread tr = new Thread(new Runnable() {
             @Override
             public void run() {
                 int index = 0;
                 while(isLoading) {
                     if(index == 0) {
                         loadLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formpendaftaran/img/spin3.gif"))); // NOI18N
                     }
                     index++;
                 }
                 loadLbl.setIcon(null); // NOI18N
             }
         });
         tr.start();
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        SideBarPanel = new javax.swing.JPanel();
        dataPribadiBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dataOrangTuaBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dataNilaiBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        finalisasiBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();
        DataPribadiPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ttlTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        namaPendaftarTF = new javax.swing.JTextField();
        nisnTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTA = new javax.swing.JTextArea();
        asalSekolahTF = new javax.swing.JTextField();
        nomorHpPendaftarTF = new javax.swing.JTextField();
        agamaTF = new javax.swing.JTextField();
        lakilakiBtn = new javax.swing.JRadioButton();
        perempuanBtn = new javax.swing.JRadioButton();
        DataNilaiPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        bindoTF = new javax.swing.JTextField();
        bingTF = new javax.swing.JTextField();
        ipaTF = new javax.swing.JTextField();
        mtkTF = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jurusanPil1Box = new javax.swing.JComboBox<>();
        jurusanPil2Box = new javax.swing.JComboBox<>();
        smaPil2Box = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        smaPil1Box = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        DataOrangTuaPanel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        namaAyahTF = new javax.swing.JTextField();
        gajiBulananAyahBox = new javax.swing.JComboBox<>();
        gajiBulananIbuBox = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        pekerjaanAyahTF = new javax.swing.JTextField();
        nmrHpAyahTF = new javax.swing.JTextField();
        namaIbuTF = new javax.swing.JTextField();
        pekerjaanIbuTF = new javax.swing.JTextField();
        nmrHpIbuTF = new javax.swing.JTextField();
        FinalisasiPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        setujuCheckBox = new javax.swing.JCheckBox();
        simpanBtn = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        loadLbl = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Form Pendaftaran Siswa\\i baru Tingkat SMA");
        setPreferredSize(new java.awt.Dimension(938, 585));

        MainPanel.setLayout(new java.awt.BorderLayout());

        SideBarPanel.setBackground(new java.awt.Color(0, 150, 255));

        dataPribadiBtn.setBackground(new java.awt.Color(0, 160, 255));
        dataPribadiBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dataPribadiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataPribadiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataPribadiBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataPribadiBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataPribadiBtnMouseExited(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Pribadi");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout dataPribadiBtnLayout = new javax.swing.GroupLayout(dataPribadiBtn);
        dataPribadiBtn.setLayout(dataPribadiBtnLayout);
        dataPribadiBtnLayout.setHorizontalGroup(
            dataPribadiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataPribadiBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29))
        );
        dataPribadiBtnLayout.setVerticalGroup(
            dataPribadiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPribadiBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        dataOrangTuaBtn.setBackground(new java.awt.Color(0, 160, 255));
        dataOrangTuaBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dataOrangTuaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataOrangTuaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataOrangTuaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataOrangTuaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataOrangTuaBtnMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data Orang Tua");

        javax.swing.GroupLayout dataOrangTuaBtnLayout = new javax.swing.GroupLayout(dataOrangTuaBtn);
        dataOrangTuaBtn.setLayout(dataOrangTuaBtnLayout);
        dataOrangTuaBtnLayout.setHorizontalGroup(
            dataOrangTuaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataOrangTuaBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        dataOrangTuaBtnLayout.setVerticalGroup(
            dataOrangTuaBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataOrangTuaBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        dataNilaiBtn.setBackground(new java.awt.Color(0, 160, 255));
        dataNilaiBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dataNilaiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dataNilaiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataNilaiBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dataNilaiBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dataNilaiBtnMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nilai & Pilihan");

        javax.swing.GroupLayout dataNilaiBtnLayout = new javax.swing.GroupLayout(dataNilaiBtn);
        dataNilaiBtn.setLayout(dataNilaiBtnLayout);
        dataNilaiBtnLayout.setHorizontalGroup(
            dataNilaiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataNilaiBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );
        dataNilaiBtnLayout.setVerticalGroup(
            dataNilaiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataNilaiBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        finalisasiBtn.setBackground(new java.awt.Color(0, 160, 255));
        finalisasiBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        finalisasiBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finalisasiBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalisasiBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finalisasiBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finalisasiBtnMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Finalisasi");

        javax.swing.GroupLayout finalisasiBtnLayout = new javax.swing.GroupLayout(finalisasiBtn);
        finalisasiBtn.setLayout(finalisasiBtnLayout);
        finalisasiBtnLayout.setHorizontalGroup(
            finalisasiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalisasiBtnLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        finalisasiBtnLayout.setVerticalGroup(
            finalisasiBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalisasiBtnLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        closeBtn.setBackground(new java.awt.Color(204, 204, 204));
        closeBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        closeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeBtn.setPreferredSize(new java.awt.Dimension(130, 45));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Close");

        javax.swing.GroupLayout closeBtnLayout = new javax.swing.GroupLayout(closeBtn);
        closeBtn.setLayout(closeBtnLayout);
        closeBtnLayout.setHorizontalGroup(
            closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeBtnLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel64)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        closeBtnLayout.setVerticalGroup(
            closeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel64)
        );

        clearBtn.setBackground(new java.awt.Color(204, 204, 204));
        clearBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBtn.setPreferredSize(new java.awt.Dimension(130, 45));
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearBtnMouseExited(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Clear");

        javax.swing.GroupLayout clearBtnLayout = new javax.swing.GroupLayout(clearBtn);
        clearBtn.setLayout(clearBtnLayout);
        clearBtnLayout.setHorizontalGroup(
            clearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clearBtnLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addGap(24, 24, 24))
        );
        clearBtnLayout.setVerticalGroup(
            clearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel65)
        );

        javax.swing.GroupLayout SideBarPanelLayout = new javax.swing.GroupLayout(SideBarPanel);
        SideBarPanel.setLayout(SideBarPanelLayout);
        SideBarPanelLayout.setHorizontalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideBarPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(finalisasiBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataOrangTuaBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataNilaiBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dataPribadiBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SideBarPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideBarPanelLayout.setVerticalGroup(
            SideBarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(dataPribadiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(dataNilaiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(dataOrangTuaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(finalisasiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        MainPanel.add(SideBarPanel, java.awt.BorderLayout.LINE_START);

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.CardLayout());

        DataPribadiPanel.setBackground(new java.awt.Color(255, 255, 255));
        DataPribadiPanel.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Nama Pendaftar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("TTL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Alamat Calon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Jenis Kelamin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Agama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Asal Sekolah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Nomor Hp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("NISN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 40;
        DataPribadiPanel.add(jLabel12, gridBagConstraints);

        ttlTF.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        DataPribadiPanel.add(ttlTF, gridBagConstraints);

        jLabel13.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 12);
        DataPribadiPanel.add(jLabel13, gridBagConstraints);

        jLabel14.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        DataPribadiPanel.add(jLabel14, gridBagConstraints);

        jLabel15.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        DataPribadiPanel.add(jLabel15, gridBagConstraints);

        jLabel17.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        DataPribadiPanel.add(jLabel17, gridBagConstraints);

        jLabel19.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        DataPribadiPanel.add(jLabel19, gridBagConstraints);

        jLabel16.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        DataPribadiPanel.add(jLabel16, gridBagConstraints);

        jLabel18.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        DataPribadiPanel.add(jLabel18, gridBagConstraints);

        jLabel20.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        DataPribadiPanel.add(jLabel20, gridBagConstraints);

        namaPendaftarTF.setPreferredSize(new java.awt.Dimension(250, 35));
        DataPribadiPanel.add(namaPendaftarTF, new java.awt.GridBagConstraints());

        nisnTF.setPreferredSize(new java.awt.Dimension(215, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        DataPribadiPanel.add(nisnTF, gridBagConstraints);

        alamatTA.setColumns(20);
        alamatTA.setLineWrap(true);
        alamatTA.setRows(5);
        alamatTA.setPreferredSize(new java.awt.Dimension(250, 80));
        jScrollPane1.setViewportView(alamatTA);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        DataPribadiPanel.add(jScrollPane1, gridBagConstraints);

        asalSekolahTF.setPreferredSize(new java.awt.Dimension(215, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        DataPribadiPanel.add(asalSekolahTF, gridBagConstraints);

        nomorHpPendaftarTF.setPreferredSize(new java.awt.Dimension(215, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        DataPribadiPanel.add(nomorHpPendaftarTF, gridBagConstraints);

        agamaTF.setPreferredSize(new java.awt.Dimension(215, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        DataPribadiPanel.add(agamaTF, gridBagConstraints);

        buttonGroup1.add(lakilakiBtn);
        lakilakiBtn.setText("Laki-Laki");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        DataPribadiPanel.add(lakilakiBtn, gridBagConstraints);

        buttonGroup1.add(perempuanBtn);
        perempuanBtn.setText("Perempuan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        DataPribadiPanel.add(perempuanBtn, gridBagConstraints);

        ContentPanel.add(DataPribadiPanel, "card2");

        DataNilaiPanel.setBackground(new java.awt.Color(255, 255, 255));
        DataNilaiPanel.setLayout(new java.awt.GridBagLayout());

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("Nilai Ujian Nasional");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        DataNilaiPanel.add(jLabel21, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel22.setText("Bahasa Indonesia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        DataNilaiPanel.add(jLabel22, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("Bahasa Inggris");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        DataNilaiPanel.add(jLabel23, gridBagConstraints);

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("IPA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        DataNilaiPanel.add(jLabel24, gridBagConstraints);

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setText("Matematika");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        DataNilaiPanel.add(jLabel25, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 19;
        DataNilaiPanel.add(jLabel26, gridBagConstraints);

        jLabel28.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 2);
        DataNilaiPanel.add(jLabel28, gridBagConstraints);

        jLabel29.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        DataNilaiPanel.add(jLabel29, gridBagConstraints);

        jLabel30.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        DataNilaiPanel.add(jLabel30, gridBagConstraints);

        jLabel31.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        DataNilaiPanel.add(jLabel31, gridBagConstraints);

        bindoTF.setPreferredSize(new java.awt.Dimension(80, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        DataNilaiPanel.add(bindoTF, gridBagConstraints);

        bingTF.setPreferredSize(new java.awt.Dimension(80, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        DataNilaiPanel.add(bingTF, gridBagConstraints);

        ipaTF.setPreferredSize(new java.awt.Dimension(80, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        DataNilaiPanel.add(ipaTF, gridBagConstraints);

        mtkTF.setPreferredSize(new java.awt.Dimension(80, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        DataNilaiPanel.add(mtkTF, gridBagConstraints);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setText("Pilihan Sekolah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        DataNilaiPanel.add(jLabel32, gridBagConstraints);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel33.setText("Pilihan 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 5, 8);
        DataNilaiPanel.add(jLabel33, gridBagConstraints);

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel34.setText("SMA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataNilaiPanel.add(jLabel34, gridBagConstraints);

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Pilihan Jurusan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataNilaiPanel.add(jLabel35, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipady = 20;
        DataNilaiPanel.add(jLabel27, gridBagConstraints);

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel36.setText("Pilihan 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 5, 8);
        DataNilaiPanel.add(jLabel36, gridBagConstraints);

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("SMA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataNilaiPanel.add(jLabel37, gridBagConstraints);

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("Pilihan Jurusan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataNilaiPanel.add(jLabel38, gridBagConstraints);

        jurusanPil1Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "IPA", "IPS", "BAHASA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        DataNilaiPanel.add(jurusanPil1Box, gridBagConstraints);

        jurusanPil2Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "IPA", "IPS", "BAHASA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        DataNilaiPanel.add(jurusanPil2Box, gridBagConstraints);

        smaPil2Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SMAN 01 Kendari", "SMAN 02 Kendari", "SMAN 03 Kendari", "SMAN 04 Kendari", "SMAN 05 Kendari", "SMAN 06 Kendari", "SMAN 07 Kendari", "SMAN 08 Kendari", "SMAN 09 Kendari", "SMAN 10 Kendari", "MAN 01 Kendari" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        DataNilaiPanel.add(smaPil2Box, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 61, 0, 61);
        DataNilaiPanel.add(jLabel40, gridBagConstraints);

        smaPil1Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "SMAN 01 Kendari", "SMAN 02 Kendari", "SMAN 03 Kendari", "SMAN 04 Kendari", "SMAN 05 Kendari", "SMAN 06 Kendari", "SMAN 07 Kendari", "SMAN 08 Kendari", "SMAN 09 Kendari", "SMAN 10 Kendari", "MAN 01 Kendari" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        DataNilaiPanel.add(smaPil1Box, gridBagConstraints);

        jLabel39.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        DataNilaiPanel.add(jLabel39, gridBagConstraints);

        jLabel41.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        DataNilaiPanel.add(jLabel41, gridBagConstraints);

        jLabel42.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        DataNilaiPanel.add(jLabel42, gridBagConstraints);

        jLabel43.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        DataNilaiPanel.add(jLabel43, gridBagConstraints);

        ContentPanel.add(DataNilaiPanel, "card3");

        DataOrangTuaPanel.setBackground(new java.awt.Color(255, 255, 255));
        DataOrangTuaPanel.setLayout(new java.awt.GridBagLayout());

        jLabel44.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel44.setText("Nama Ayah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel44, gridBagConstraints);

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel45.setText("Pekerjaan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel45, gridBagConstraints);

        jLabel46.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel46.setText("Nomor Hp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel46, gridBagConstraints);

        jLabel47.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel47.setText("Gaji Bulanan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel47, gridBagConstraints);

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel48.setText("Nama Ibu");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel48, gridBagConstraints);

        jLabel49.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel49.setText("Pekerjaan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel49, gridBagConstraints);

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel50.setText("Nomor Hp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel50, gridBagConstraints);

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel51.setText("Gaji Bulanan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 8, 0);
        DataOrangTuaPanel.add(jLabel51, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        DataOrangTuaPanel.add(jLabel52, gridBagConstraints);

        namaAyahTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namaAyahTF.setPreferredSize(new java.awt.Dimension(255, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        DataOrangTuaPanel.add(namaAyahTF, gridBagConstraints);

        gajiBulananAyahBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "< 1 Juta", "1-3 Juta", "3 - 5 Juta", "5 - 10 Juta", "> 10 Juta" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        DataOrangTuaPanel.add(gajiBulananAyahBox, gridBagConstraints);

        gajiBulananIbuBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "< 1 Juta", "1-3 Juta", "3 - 5 Juta", "5 - 10 Juta", "> 10 Juta" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        DataOrangTuaPanel.add(gajiBulananIbuBox, gridBagConstraints);

        jLabel53.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        DataOrangTuaPanel.add(jLabel53, gridBagConstraints);

        jLabel54.setText(":");
        DataOrangTuaPanel.add(jLabel54, new java.awt.GridBagConstraints());

        jLabel55.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        DataOrangTuaPanel.add(jLabel55, gridBagConstraints);

        jLabel56.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        DataOrangTuaPanel.add(jLabel56, gridBagConstraints);

        jLabel57.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        DataOrangTuaPanel.add(jLabel57, gridBagConstraints);

        jLabel58.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        DataOrangTuaPanel.add(jLabel58, gridBagConstraints);

        jLabel59.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        DataOrangTuaPanel.add(jLabel59, gridBagConstraints);

        jLabel60.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        DataOrangTuaPanel.add(jLabel60, gridBagConstraints);

        jLabel61.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        DataOrangTuaPanel.add(jLabel61, gridBagConstraints);

        pekerjaanAyahTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pekerjaanAyahTF.setPreferredSize(new java.awt.Dimension(255, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        DataOrangTuaPanel.add(pekerjaanAyahTF, gridBagConstraints);

        nmrHpAyahTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nmrHpAyahTF.setPreferredSize(new java.awt.Dimension(255, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        DataOrangTuaPanel.add(nmrHpAyahTF, gridBagConstraints);

        namaIbuTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namaIbuTF.setPreferredSize(new java.awt.Dimension(255, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        DataOrangTuaPanel.add(namaIbuTF, gridBagConstraints);

        pekerjaanIbuTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pekerjaanIbuTF.setPreferredSize(new java.awt.Dimension(255, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        DataOrangTuaPanel.add(pekerjaanIbuTF, gridBagConstraints);

        nmrHpIbuTF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nmrHpIbuTF.setPreferredSize(new java.awt.Dimension(255, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        DataOrangTuaPanel.add(nmrHpIbuTF, gridBagConstraints);

        ContentPanel.add(DataOrangTuaPanel, "card4");

        FinalisasiPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setText("SAYA MENYATAKAN DENGAN SESUNGGUHNYA BAHWA DATA DALAM FORMULIR INI DISI DENGAN BENAR. APABILA TERNYATA DATA TERSEBUT TIDAK BENAR, MAKA SAYA BERSEDIA MENERIMA SANKSI BERUPA PEMBATALAN SEBAGAI CALON PESERTA DIDIK");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setMargin(new java.awt.Insets(2, 4, 2, 2));
        jScrollPane2.setViewportView(jTextArea1);

        setujuCheckBox.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        setujuCheckBox.setText("Setuju");

        simpanBtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        simpanBtn.setText("Simpan");
        simpanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanBtnActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel62.setText("*Perinatan : Mohon Periksa Kembali Data Yang Telah Anda Masukkan, Apabila Terdapat Kesalahan Maka Kami");

        jLabel63.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabel63.setText("Selaku Panitia Tidak Akan Bertanggung Jawab");

        javax.swing.GroupLayout FinalisasiPanelLayout = new javax.swing.GroupLayout(FinalisasiPanel);
        FinalisasiPanel.setLayout(FinalisasiPanelLayout);
        FinalisasiPanelLayout.setHorizontalGroup(
            FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FinalisasiPanelLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(setujuCheckBox, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel63))
                .addGap(55, 55, 55))
            .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                .addGroup(FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(simpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(loadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FinalisasiPanelLayout.setVerticalGroup(
            FinalisasiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FinalisasiPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel62)
                .addGap(2, 2, 2)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setujuCheckBox)
                .addGap(45, 45, 45)
                .addComponent(simpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(loadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        ContentPanel.add(FinalisasiPanel, "card5");

        MainPanel.add(ContentPanel, java.awt.BorderLayout.CENTER);

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

    private void dataPribadiBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataPribadiBtnMouseClicked
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(DataPribadiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_dataPribadiBtnMouseClicked

    private void dataPribadiBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataPribadiBtnMouseEntered
        dataPribadiBtn.setBackground(new Color(0,120,255));
    }//GEN-LAST:event_dataPribadiBtnMouseEntered

    private void dataPribadiBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataPribadiBtnMouseExited
        dataPribadiBtn.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_dataPribadiBtnMouseExited

    private void dataNilaiBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataNilaiBtnMouseClicked
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(DataNilaiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_dataNilaiBtnMouseClicked

    private void dataNilaiBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataNilaiBtnMouseEntered
        dataNilaiBtn.setBackground(new Color(0,120,255));
    }//GEN-LAST:event_dataNilaiBtnMouseEntered

    private void dataNilaiBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataNilaiBtnMouseExited
       dataNilaiBtn.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_dataNilaiBtnMouseExited

    private void dataOrangTuaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataOrangTuaBtnMouseClicked
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(DataOrangTuaPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_dataOrangTuaBtnMouseClicked

    private void dataOrangTuaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataOrangTuaBtnMouseEntered
        dataOrangTuaBtn.setBackground(new Color(0,120,255));
    }//GEN-LAST:event_dataOrangTuaBtnMouseEntered

    private void dataOrangTuaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataOrangTuaBtnMouseExited
        dataOrangTuaBtn.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_dataOrangTuaBtnMouseExited

    private void finalisasiBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalisasiBtnMouseClicked
        ContentPanel.removeAll();
        ContentPanel.repaint();
        ContentPanel.revalidate();
        
        ContentPanel.add(FinalisasiPanel);
        ContentPanel.repaint();
        ContentPanel.revalidate();
    }//GEN-LAST:event_finalisasiBtnMouseClicked

    private void finalisasiBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalisasiBtnMouseEntered
        finalisasiBtn.setBackground(new Color(0,120,255));
    }//GEN-LAST:event_finalisasiBtnMouseEntered

    private void finalisasiBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalisasiBtnMouseExited
        finalisasiBtn.setBackground(new Color(0,160,255));
    }//GEN-LAST:event_finalisasiBtnMouseExited

    private void simpanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanBtnActionPerformed
        checkData();
        if(isFilled) {
            if(setujuCheckBox.isSelected()) {
                loading();
                Thread tr = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {                            
                            getAllData();

                            boolean isComplete = DataHelper.masukkanData(namacalon, jenisKelamin, nisn, String.valueOf(rata2UN), asalSekolah, sma1.concat("(" + jurusan1 + ")"), sma2.concat("(" + jurusan2 + ")"));  
                            if(isComplete) {
                                DataHelper.masukkanAllData(namacalon, ttl, alamat, jenisKelamin, agama, asalSekolah, noHpCalon, nisn, String.valueOf(rata2UN), sma1.concat("(" + jurusan1 + ")"), sma2.concat("(" + jurusan2 + ")"), namaAyah, pekerjaanAyah, noHpAyah, penghasilanBulananAyah, namaIbu, pekerjannIbu, noHpIbu, penghasilanBulananIbu);
                                refreshComponent();

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
                            }
                        } catch (IOException e) {}
                    }
                });
                tr.start();
                
            } else {
                JOptionPane.showMessageDialog(this, "Mohon Centang setuju Di persyaratan !");
            }
        }
    }//GEN-LAST:event_simpanBtnActionPerformed

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        try {
            setClosed(true);
        } catch (PropertyVetoException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_closeBtnMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
       closeBtn.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        closeBtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_closeBtnMouseExited

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        refreshComponent();
    }//GEN-LAST:event_clearBtnMouseClicked

    private void clearBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseEntered
        clearBtn.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_clearBtnMouseEntered

    private void clearBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseExited
        clearBtn.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_clearBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel DataNilaiPanel;
    private javax.swing.JPanel DataOrangTuaPanel;
    private javax.swing.JPanel DataPribadiPanel;
    private javax.swing.JPanel FinalisasiPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SideBarPanel;
    private javax.swing.JTextField agamaTF;
    private javax.swing.JTextArea alamatTA;
    private javax.swing.JTextField asalSekolahTF;
    private javax.swing.JTextField bindoTF;
    private javax.swing.JTextField bingTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel clearBtn;
    private javax.swing.JPanel closeBtn;
    private javax.swing.JPanel dataNilaiBtn;
    private javax.swing.JPanel dataOrangTuaBtn;
    private javax.swing.JPanel dataPribadiBtn;
    private javax.swing.JPanel finalisasiBtn;
    private javax.swing.JComboBox<String> gajiBulananAyahBox;
    private javax.swing.JComboBox<String> gajiBulananIbuBox;
    private javax.swing.JTextField ipaTF;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jurusanPil1Box;
    private javax.swing.JComboBox<String> jurusanPil2Box;
    private javax.swing.JRadioButton lakilakiBtn;
    private javax.swing.JLabel loadLbl;
    private javax.swing.JTextField mtkTF;
    private javax.swing.JTextField namaAyahTF;
    private javax.swing.JTextField namaIbuTF;
    private javax.swing.JTextField namaPendaftarTF;
    private javax.swing.JTextField nisnTF;
    private javax.swing.JTextField nmrHpAyahTF;
    private javax.swing.JTextField nmrHpIbuTF;
    private javax.swing.JTextField nomorHpPendaftarTF;
    private javax.swing.JTextField pekerjaanAyahTF;
    private javax.swing.JTextField pekerjaanIbuTF;
    private javax.swing.JRadioButton perempuanBtn;
    private javax.swing.JCheckBox setujuCheckBox;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JComboBox<String> smaPil1Box;
    private javax.swing.JComboBox<String> smaPil2Box;
    private javax.swing.JTextField ttlTF;
    // End of variables declaration//GEN-END:variables
}

