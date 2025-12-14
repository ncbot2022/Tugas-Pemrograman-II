/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_sem3;

// LIBRARY YANG SAYA BUTUHKAN
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author x260
 */
public class UTS_SEM3_DASBOARD_PANEL extends javax.swing.JFrame {

    /**
     * Creates new form UTS_SEM3_DASBOARD_PANEL
     */
    
    // DEKLARASI VARIABEL ############################################################################################
    private String kodeInput;
    private String NamaInput;
    private long HargaInput;
    private long StokInput;

    // VARIABEL TAMPUNG PRODUK KELUAR
    private String Outnama;
    private long Outstok;
    private int statusChekOut;

    // VARIABEL TAMPUNG PRODUK EDIT dan TAMBAH
    private String KeyCode;
    private String EditNama;
    private int statusChekEdit;
   
    Interface_System jalankan = new Implemensy_System();
    
    // KONSTRUKTOR AWAL  ############################################################################################
    public UTS_SEM3_DASBOARD_PANEL() {
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(this);
        // PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
        Stokin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume(); // PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });
        Hargain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();// PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });
        OutProdukJumlahA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();// PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });
        OutProdukJumlahB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();// PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });

        NewHargaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();// PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });
        NewHargaB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();// PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });
        NewStokA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();// PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });
        NewStokB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();// PERINTAH UNTUK TEXT FIELD AGAR HURUF TIDAK MASUK
                }
            }
        });

        Canva.removeAll();
        Canva.repaint();
        Canva.revalidate();
        Canva.add(GudangA);
        Canva.repaint();
        Canva.revalidate();

        // AKSI LOGOUT SISTTEM
        SettingLogout.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(
                    this,
                    "Apakah Anda yakin ingin logout?",
                    "Konfirmasi Logout",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE
            );

            if (confirm == JOptionPane.YES_OPTION) {
                UTS_SEM3_LOGIN_PANEL dasb = new UTS_SEM3_LOGIN_PANEL();
                dasb.setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(this, "Logout berhasil!");
            }

        });

        SettingExit.addActionListener(e -> {
            System.exit(0);
        });

        // AKSI LOGOUT SISTTEM
        Git.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Fitur Belum Tersedia");
        });
        
        ChangeAkun.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Fitur Belum Tersedia");
        });
    }

    //BEGIN UPDATE DATA PADA TABEL ####################################################################################
    private void UpdatetampilkanGudang() {
        DefaultTableModel model = (DefaultTableModel) OutUpdateTabel.getModel();
        model.setRowCount(0); // hapus semua baris
        for (produk p : jalankan.getListGudangA()) {
            model.addRow(new Object[]{
                p.getCode(),
                p.getNamaBarang(),
                p.getStokBarang(),
                p.getLokasi()
            });
        }
        for (produk p : jalankan.getListGudangB()) {
            model.addRow(new Object[]{
                p.getCode(),
                p.getNamaBarang(),
                p.getStokBarang(),
                p.getLokasi()
            });
        }
    }

    private void UpdatetampilkanUpdate() {
        DefaultTableModel model = (DefaultTableModel) UpdatetableUpdate.getModel();
        model.setRowCount(0); // hapus semua baris
        for (produk p : jalankan.getListGudangA()) {
            model.addRow(new Object[]{
                p.getCode(),
                p.getNamaBarang(),
                p.getStokBarang(),
                p.getLokasi()
            });
        }
        for (produk p : jalankan.getListGudangB()) {
            model.addRow(new Object[]{
                p.getCode(),
                p.getNamaBarang(),
                p.getStokBarang(),
                p.getLokasi()
            });
        }
    }

    private void tampilkanGudangA() {
        DefaultTableModel model = (DefaultTableModel) GudangATable.getModel();
        model.setRowCount(0); // hapus semua baris
        for (produk p : jalankan.getListGudangA()) {
            model.addRow(new Object[]{
                p.getCode(),
                p.getNamaBarang(),
                p.getHarga(),
                p.getStokBarang()
            });
        }
    }

    private void tampilkanGudangB() {
        DefaultTableModel model = (DefaultTableModel) GudangTableB.getModel();
        model.setRowCount(0); // hapus semua baris
        for (produk p : jalankan.getListGudangB()) {
            model.addRow(new Object[]{
                p.getCode(),
                p.getNamaBarang(),
                p.getHarga(),
                p.getStokBarang()
            });
        }
    }

    //END  UPDATE DATA PADA TABEL ####################################################################################
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Canva = new javax.swing.JPanel();
        UpdateStok = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jToolBar3 = new javax.swing.JToolBar();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        SearchKeyProdukA = new javax.swing.JTextField();
        NewNamaA = new javax.swing.JTextField();
        NewHargaA = new javax.swing.JTextField();
        NewStokA = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        UpdateNewA = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jPanel5 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        SearchKeyProdukB = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        NewNamaB = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        NewHargaB = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        NewStokB = new javax.swing.JTextField();
        UpdateNewB = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        UpdatetableUpdate = new javax.swing.JTable();
        GudangA = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GudangATable = new javax.swing.JTable();
        GudangB = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        GudangTableB = new javax.swing.JTable();
        InputProduk = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Hargain = new javax.swing.JTextField();
        Kodein = new javax.swing.JTextField();
        namaIn = new javax.swing.JTextField();
        Stokin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Pilih_Gudang_a = new javax.swing.JRadioButton();
        pilih_gudang_b = new javax.swing.JRadioButton();
        Simpandatabase = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        ProdukKeluar = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TombolOutGudangA = new javax.swing.JButton();
        OutProdukJumlahA = new javax.swing.JTextField();
        OutProdukNamaA = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        OutProdukNamaB = new javax.swing.JTextField();
        OutProdukJumlahB = new javax.swing.JTextField();
        TombolOutGudangB = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Tabel = new javax.swing.JScrollPane();
        OutUpdateTabel = new javax.swing.JTable();
        CanvaMenu = new javax.swing.JPanel();
        ProdukA = new javax.swing.JButton();
        ProdukB = new javax.swing.JButton();
        inputdata = new javax.swing.JButton();
        labelMenu = new javax.swing.JLabel();
        outputdata = new javax.swing.JButton();
        Updatedata = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        report = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        SettingMenu = new javax.swing.JMenu();
        SettingLogout = new javax.swing.JMenuItem();
        SettingExit = new javax.swing.JMenuItem();
        ChangeAkun = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Git = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 86, 127));

        jPanel1.setBackground(new java.awt.Color(45, 86, 127));

        Canva.setBackground(new java.awt.Color(255, 255, 255));
        Canva.setPreferredSize(new java.awt.Dimension(770, 541));

        UpdateStok.setBackground(new java.awt.Color(255, 255, 255));
        UpdateStok.setPreferredSize(new java.awt.Dimension(770, 541));

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jToolBar3.setRollover(true);
        jToolBar3.setPreferredSize(new java.awt.Dimension(765, 5));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("KODE");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("NAMA BARU");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("HARGA BARU");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("TAMBAH STOK");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText(":");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText(":");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText(":");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText(":");

        UpdateNewA.setBackground(new java.awt.Color(44, 87, 130));
        UpdateNewA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateNewA.setForeground(new java.awt.Color(252, 252, 253));
        UpdateNewA.setText("UPDATE");
        UpdateNewA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateNewAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateNewA, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(SearchKeyProdukA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewNamaA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewHargaA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewStokA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchKeyProdukA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewNamaA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewHargaA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewStokA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31))
                .addGap(18, 18, 18)
                .addComponent(UpdateNewA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar3.add(jPanel4);

        jTabbedPane2.addTab("Update Produk Gudang A", jToolBar3);

        jToolBar4.setRollover(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("KODE");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText(":");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("NAMA BARU");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText(":");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("HARGA BARU");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setText(":");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel42.setText("TAMBAH STOK");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText(":");

        UpdateNewB.setBackground(new java.awt.Color(44, 87, 130));
        UpdateNewB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        UpdateNewB.setForeground(new java.awt.Color(252, 252, 253));
        UpdateNewB.setText("UPDATE");
        UpdateNewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateNewBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel38)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateNewB, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addComponent(SearchKeyProdukB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewNamaB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewHargaB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewStokB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchKeyProdukB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewNamaB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewHargaB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewStokB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addComponent(UpdateNewB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar4.add(jPanel5);

        jTabbedPane2.addTab("Update Produk Gudang B", jToolBar4);

        UpdatetableUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Produk", "Nama Produk", "Jumlah Stok", "Lokasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(UpdatetableUpdate);

        javax.swing.GroupLayout UpdateStokLayout = new javax.swing.GroupLayout(UpdateStok);
        UpdateStok.setLayout(UpdateStokLayout);
        UpdateStokLayout.setHorizontalGroup(
            UpdateStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
            .addGroup(UpdateStokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        UpdateStokLayout.setVerticalGroup(
            UpdateStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStokLayout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        GudangA.setBackground(new java.awt.Color(255, 255, 255));
        GudangA.setPreferredSize(new java.awt.Dimension(770, 541));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("LIST PRODUK GUDANG A");

        GudangATable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Produk", "Nama Produk", "Harga", "Jumlah Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(GudangATable);

        javax.swing.GroupLayout GudangALayout = new javax.swing.GroupLayout(GudangA);
        GudangA.setLayout(GudangALayout);
        GudangALayout.setHorizontalGroup(
            GudangALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GudangALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GudangALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(GudangALayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 478, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GudangALayout.setVerticalGroup(
            GudangALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GudangALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        GudangB.setBackground(new java.awt.Color(255, 255, 255));
        GudangB.setPreferredSize(new java.awt.Dimension(770, 541));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("LIST PRODUK GUDANG B");

        GudangTableB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Produk", "Nama Produk", "Harga", "Jumlah Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(GudangTableB);

        javax.swing.GroupLayout GudangBLayout = new javax.swing.GroupLayout(GudangB);
        GudangB.setLayout(GudangBLayout);
        GudangBLayout.setHorizontalGroup(
            GudangBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GudangBLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GudangBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(GudangBLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(524, Short.MAX_VALUE))))
        );
        GudangBLayout.setVerticalGroup(
            GudangBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GudangBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        InputProduk.setBackground(new java.awt.Color(255, 255, 255));
        InputProduk.setPreferredSize(new java.awt.Dimension(770, 541));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("MASUKAN PRODUK BARU");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("KODE PRODUK");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("NAMA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("HARGA PRODUK");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("JUMLAH PRODUK");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("PILIH GUDANG");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText(":");

        Pilih_Gudang_a.setText("Gudang A");

        pilih_gudang_b.setText("Gudang B");

        Simpandatabase.setBackground(new java.awt.Color(44, 87, 130));
        Simpandatabase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Simpandatabase.setForeground(new java.awt.Color(252, 252, 253));
        Simpandatabase.setText("SIMPAN");
        Simpandatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpandatabaseActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Motif.png"))); // NOI18N
        jLabel32.setText("jLabel32");

        javax.swing.GroupLayout InputProdukLayout = new javax.swing.GroupLayout(InputProduk);
        InputProduk.setLayout(InputProdukLayout);
        InputProdukLayout.setHorizontalGroup(
            InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputProdukLayout.createSequentialGroup()
                .addContainerGap(268, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
            .addGroup(InputProdukLayout.createSequentialGroup()
                .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputProdukLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(InputProdukLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(20, 20, 20)
                        .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(InputProdukLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Pilih_Gudang_a)
                                .addGap(18, 18, 18)
                                .addComponent(pilih_gudang_b))
                            .addComponent(Simpandatabase, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                            .addComponent(Stokin)
                            .addComponent(Kodein)
                            .addComponent(namaIn)
                            .addComponent(Hargain))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InputProdukLayout.setVerticalGroup(
            InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputProdukLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kodein, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaIn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hargain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stokin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(InputProdukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(Pilih_Gudang_a)
                    .addComponent(pilih_gudang_b))
                .addGap(27, 27, 27)
                .addComponent(Simpandatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        ProdukKeluar.setBackground(new java.awt.Color(255, 255, 255));
        ProdukKeluar.setPreferredSize(new java.awt.Dimension(770, 541));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDoubleBuffered(true);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jToolBar2.setBorder(null);
        jToolBar2.setRollover(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Dashboard Data Produk Keluar dari Gudang A");

        jLabel17.setText("<html> Melalui dashboard ini, Anda dapat mengeluar produk dari gudang anda agar stok produk dapat ter monitoring secara real-time</html>");

        TombolOutGudangA.setBackground(new java.awt.Color(44, 87, 130));
        TombolOutGudangA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TombolOutGudangA.setForeground(new java.awt.Color(255, 255, 255));
        TombolOutGudangA.setText("KELUARKAN PRODUK");
        TombolOutGudangA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolOutGudangAActionPerformed(evt);
            }
        });

        jLabel1.setText("<html>Masukan <Strong>KODE</Strong> atau <Strong>NAMA</Strong> Produk</html>");

        jLabel19.setText("<html>Masukan <Strong>JUMLAH</Strong> Produk</html>");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gudanga.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(OutProdukJumlahA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TombolOutGudangA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OutProdukNamaA, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(OutProdukNamaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OutProdukJumlahA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TombolOutGudangA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar2.add(jPanel3);

        jTabbedPane1.addTab("Gudang A", jToolBar2);

        jToolBar1.setBorder(null);
        jToolBar1.setRollover(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Dashboard Data Produk Keluar dari Gudang B");

        jLabel18.setText("<html> Melalui dashboard ini, Anda dapat mengeluar produk dari gudang anda agar stok produk dapat ter monitoring secara real-time</html>");

        TombolOutGudangB.setBackground(new java.awt.Color(44, 87, 130));
        TombolOutGudangB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TombolOutGudangB.setForeground(new java.awt.Color(255, 255, 255));
        TombolOutGudangB.setText("KELUARKAN PRODUK");
        TombolOutGudangB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolOutGudangBActionPerformed(evt);
            }
        });

        jLabel20.setText("<html>Masukan <Strong>KODE</Strong> atau <Strong>NAMA</Strong> Produk</html>");

        jLabel21.setText("<html>Masukan <Strong>JUMLAH</Strong> Produk</html>");

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/gudangb.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TombolOutGudangB, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(OutProdukJumlahB, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(OutProdukNamaB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(OutProdukNamaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OutProdukJumlahB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TombolOutGudangB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar1.add(jPanel2);

        jTabbedPane1.addTab("Gudang B", jToolBar1);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("UPDATE JUMLAH STOK");

        OutUpdateTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Produk", "Nama Produk", "Jumlah Stok", "Lokasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel.setViewportView(OutUpdateTabel);

        javax.swing.GroupLayout ProdukKeluarLayout = new javax.swing.GroupLayout(ProdukKeluar);
        ProdukKeluar.setLayout(ProdukKeluarLayout);
        ProdukKeluarLayout.setHorizontalGroup(
            ProdukKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProdukKeluarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProdukKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProdukKeluarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Tabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ProdukKeluarLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ProdukKeluarLayout.setVerticalGroup(
            ProdukKeluarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProdukKeluarLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabel, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CanvaLayout = new javax.swing.GroupLayout(Canva);
        Canva.setLayout(CanvaLayout);
        CanvaLayout.setHorizontalGroup(
            CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanvaLayout.createSequentialGroup()
                .addComponent(GudangA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CanvaLayout.createSequentialGroup()
                    .addComponent(GudangB, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CanvaLayout.createSequentialGroup()
                    .addComponent(InputProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CanvaLayout.createSequentialGroup()
                    .addComponent(ProdukKeluar, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CanvaLayout.createSequentialGroup()
                    .addComponent(UpdateStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CanvaLayout.setVerticalGroup(
            CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GudangA, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(GudangB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InputProduk, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ProdukKeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
            .addGroup(CanvaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(UpdateStok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
        );

        CanvaMenu.setBackground(new java.awt.Color(45, 86, 127));

        ProdukA.setText("Gudang A");
        ProdukA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukAActionPerformed(evt);
            }
        });

        ProdukB.setText("Gudang B");
        ProdukB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdukBActionPerformed(evt);
            }
        });

        inputdata.setText("Input Produk Baru");
        inputdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputdataActionPerformed(evt);
            }
        });

        labelMenu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelMenu.setForeground(new java.awt.Color(255, 255, 255));
        labelMenu.setText("MAIN MENU");

        outputdata.setText("Produk keluar");
        outputdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputdataActionPerformed(evt);
            }
        });

        Updatedata.setText("Update Produk");
        Updatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatedataActionPerformed(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Profil.png"))); // NOI18N
        jLabel22.setText("jLabel22");

        report.setBackground(new java.awt.Color(102, 255, 102));
        report.setText("Report Total");
        report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CanvaMenuLayout = new javax.swing.GroupLayout(CanvaMenu);
        CanvaMenu.setLayout(CanvaMenuLayout);
        CanvaMenuLayout.setHorizontalGroup(
            CanvaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanvaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CanvaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProdukB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProdukA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputdata, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(outputdata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Updatedata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CanvaMenuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(CanvaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMenu))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CanvaMenuLayout.setVerticalGroup(
            CanvaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanvaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProdukA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProdukB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Updatedata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(outputdata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(report)
                .addContainerGap())
        );

        ProdukA.getAccessibleContext().setAccessibleName("ProdukA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(CanvaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Canva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CanvaMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Canva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)))
        );

        SettingMenu.setText("Setting");

        SettingLogout.setText("Logout");
        SettingMenu.add(SettingLogout);

        SettingExit.setText("Exit");
        SettingMenu.add(SettingExit);

        ChangeAkun.setText("Change Akun");
        SettingMenu.add(ChangeAkun);

        jMenuBar1.add(SettingMenu);

        jMenu2.setText("Help");

        Git.setText("Dokumentasi");
        jMenu2.add(Git);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProdukAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukAActionPerformed
        // TODO add your handling code here:
        tampilkanGudangA(); // jika ingin tampil otomatis

        Canva.removeAll();
        Canva.repaint();
        Canva.revalidate();

        Canva.add(GudangA);
        Canva.repaint();
        Canva.revalidate();

    }//GEN-LAST:event_ProdukAActionPerformed

    private void ProdukBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdukBActionPerformed
        // TODO add your handling code here:
        tampilkanGudangB();

        Canva.removeAll();
        Canva.repaint();
        Canva.revalidate();

        Canva.add(GudangB);
        Canva.repaint();
        Canva.revalidate();
    }//GEN-LAST:event_ProdukBActionPerformed

    private void inputdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputdataActionPerformed
        // TODO add your handling code here:
        Canva.removeAll();
        Canva.repaint();
        Canva.revalidate();

        Canva.add(InputProduk);
        Canva.repaint();
        Canva.revalidate();

        Kodein.setText("");
        namaIn.setText("");
        Hargain.setText("");
        Stokin.setText("");
        Pilih_Gudang_a.setSelected(false);
        pilih_gudang_b.setSelected(false);

    }//GEN-LAST:event_inputdataActionPerformed

    private void outputdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputdataActionPerformed
        // TODO add your handling code here:
        UpdatetampilkanGudang();
        Canva.removeAll();
        Canva.repaint();
        Canva.revalidate();

        Canva.add(ProdukKeluar);
        Canva.repaint();
        Canva.revalidate();
    }//GEN-LAST:event_outputdataActionPerformed

    private void SimpandatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpandatabaseActionPerformed
        // TODO add your handling code here:
        if (Kodein.getText().length() >= 1) {
            kodeInput = Kodein.getText();
        } else {
            JOptionPane.showMessageDialog(this, "KODE BARANG WAJIB di isi dengan BENAR !!");
            return;
        }
        if (namaIn.getText().length() >= 1) {
            NamaInput = namaIn.getText();
        } else {
            JOptionPane.showMessageDialog(this, "NAMA BARANG WAJIB di isi dengan BENAR !!");
            return;
        }
        if (Hargain.getText().length() >= 1) {
            HargaInput = Long.parseLong(Hargain.getText());
        } else {
            JOptionPane.showMessageDialog(this, "HARGA BARANG WAJIB di isi dengan BENAR !!");
            return;
        }
        if (Stokin.getText().length() >= 1) {
            StokInput = Long.parseLong(Stokin.getText());
        } else {
            JOptionPane.showMessageDialog(this, "STOK BARANG WAJIB di isi dengan BENAR !!");
            return;
        }

        System.out.println("Kode   : " + kodeInput);
        System.out.println("Nama   : " + NamaInput);
        System.out.println("Harga  : " + HargaInput);
        System.out.println("Stok   : " + StokInput);

        if (Pilih_Gudang_a.isSelected() && pilih_gudang_b.isSelected()) {
            jalankan.tambah_gudang_A(kodeInput, NamaInput, HargaInput, StokInput);
            jalankan.tambah_gudang_B(kodeInput, NamaInput, HargaInput, StokInput);
            tampilkanGudangA();
            tampilkanGudangB();
            Canva.removeAll();
            Canva.repaint();
            Canva.revalidate();

            Canva.add(GudangA);
            Canva.repaint();
            Canva.revalidate();
        } else if (Pilih_Gudang_a.isSelected()) {
            jalankan.tambah_gudang_A(kodeInput, NamaInput, HargaInput, StokInput);
            tampilkanGudangA();
            Canva.removeAll();
            Canva.repaint();
            Canva.revalidate();

            Canva.add(GudangA);
            Canva.repaint();
            Canva.revalidate();
        } else if (pilih_gudang_b.isSelected()) {
            jalankan.tambah_gudang_B(kodeInput, NamaInput, HargaInput, StokInput);
            tampilkanGudangB();
            Canva.removeAll();
            Canva.repaint();
            Canva.revalidate();

            Canva.add(GudangB);
            Canva.repaint();
            Canva.revalidate();
        } else {
            JOptionPane.showMessageDialog(this, "PILIH GUDANG dengan BENAR !!");
            return;
        }

    }//GEN-LAST:event_SimpandatabaseActionPerformed

    private void TombolOutGudangBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolOutGudangBActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here
        if (OutProdukNamaB.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Masukan Nama Priduk Atau Kode Produk !!");
            return;
        }
        if (OutProdukJumlahB.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Masukan Produk Produk !!");
            return;
        }

        Outstok = Long.parseLong(OutProdukJumlahB.getText());
        Outnama = OutProdukNamaB.getText();
        System.out.println(Outnama);
        System.out.println(Outstok);
        statusChekOut = jalankan.kurangiStokGudangB(Outnama, Outstok);

        if (statusChekOut == 1) {
            JOptionPane.showMessageDialog(this, "Produk Berhasil Dikeluarkan");
        } else if (statusChekOut == 2) {
            JOptionPane.showMessageDialog(this, "Produk Tidak Dapat Dikeluarkan. Periksa Stok Gudan!");
        } else if (statusChekOut == 3) {
            JOptionPane.showMessageDialog(this, "Produk Tidak Ada !");
        }

        UpdatetampilkanGudang();
    }//GEN-LAST:event_TombolOutGudangBActionPerformed

    private void TombolOutGudangAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolOutGudangAActionPerformed
        // TODO add your handling code here
        if (OutProdukNamaA.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Masukan Nama Priduk Atau Kode Produk !!");
            return;
        }
        if (OutProdukJumlahA.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Masukan Produk Produk !!");
            return;
        }

        Outstok = Long.parseLong(OutProdukJumlahA.getText());
        Outnama = OutProdukNamaA.getText();
        System.out.println(Outnama);
        System.out.println(Outstok);
        statusChekOut = jalankan.kurangiStokGudangA(Outnama, Outstok);

        if (statusChekOut == 1) {
            JOptionPane.showMessageDialog(this, "Produk Berhasil Dikeluarkan");
        } else if (statusChekOut == 2) {
            JOptionPane.showMessageDialog(this, "Produk Tidak Dapat Dikeluarkan. Periksa Stok Gudan!");
        } else if (statusChekOut == 3) {
            JOptionPane.showMessageDialog(this, "Produk Tidak Ada !");
        }

        UpdatetampilkanGudang();
    }//GEN-LAST:event_TombolOutGudangAActionPerformed

    private void UpdatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatedataActionPerformed
        // TODO add your handling code here:
        UpdatetampilkanUpdate();
        Canva.removeAll();
        Canva.repaint();
        Canva.revalidate();

        Canva.add(UpdateStok);
        Canva.repaint();
        Canva.revalidate();
    }//GEN-LAST:event_UpdatedataActionPerformed

    private void UpdateNewAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateNewAActionPerformed
        // TODO add your handling code here:

        KeyCode = SearchKeyProdukA.getText();
        EditNama = NewNamaA.getText().trim();
        Long editHarga = null;
        Long tambahStok = null;

        if (!NewHargaA.getText().trim().isEmpty()) {
            try {
                editHarga = Long.parseLong(NewHargaA.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
                return;
            }
        }
        if (!NewStokA.getText().trim().isEmpty()) {
            try {
                tambahStok = Long.parseLong(NewStokA.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Stok harus berupa angka!");
                return;
            }
        }
        System.out.println("Code Key" + KeyCode);
        statusChekEdit = jalankan.editProdukGudangA(
                KeyCode,
                EditNama,
                editHarga,
                tambahStok
        );
        if (statusChekEdit == 1) {
            JOptionPane.showMessageDialog(this, "Produk berhasil diupdate");
        } else if (statusChekEdit == 3) {
            JOptionPane.showMessageDialog(this, "Kode produk tidak ditemukan");
        }
        UpdatetampilkanUpdate();
    }//GEN-LAST:event_UpdateNewAActionPerformed

    private void UpdateNewBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateNewBActionPerformed
        // TODO add your handling code here:
        KeyCode = SearchKeyProdukB.getText();
        EditNama = NewNamaB.getText().trim();
        Long editHarga = null;
        Long tambahStok = null;

        if (!NewHargaB.getText().trim().isEmpty()) {
            try {
                editHarga = Long.parseLong(NewHargaB.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Harga harus berupa angka!");
                return;
            }
        }
        if (!NewStokB.getText().trim().isEmpty()) {
            try {
                tambahStok = Long.parseLong(NewStokB.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Stok harus berupa angka!");
                return;
            }
        }
        System.out.println("Code Key" + KeyCode);
        statusChekEdit = jalankan.editProdukGudangB(
                KeyCode,
                EditNama,
                editHarga,
                tambahStok
        );
        if (statusChekEdit == 1) {
            JOptionPane.showMessageDialog(this, "Produk berhasil diupdate");
        } else if (statusChekEdit == 3) {
            JOptionPane.showMessageDialog(this, "Kode produk tidak ditemukan");
        }
        UpdatetampilkanUpdate();
    }//GEN-LAST:event_UpdateNewBActionPerformed

    private void reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportActionPerformed
        // TODO add your handling code here:
        Interface_System sistem = this.jalankan;
        UTS_SEM3_Total_Report report = new UTS_SEM3_Total_Report(sistem);
        report.setVisible(true);
    }//GEN-LAST:event_reportActionPerformed

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
            java.util.logging.Logger.getLogger(UTS_SEM3_DASBOARD_PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UTS_SEM3_DASBOARD_PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UTS_SEM3_DASBOARD_PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UTS_SEM3_DASBOARD_PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UTS_SEM3_DASBOARD_PANEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Canva;
    private javax.swing.JPanel CanvaMenu;
    private javax.swing.JMenuItem ChangeAkun;
    private javax.swing.JMenuItem Git;
    private javax.swing.JPanel GudangA;
    private javax.swing.JTable GudangATable;
    private javax.swing.JPanel GudangB;
    private javax.swing.JTable GudangTableB;
    private javax.swing.JTextField Hargain;
    private javax.swing.JPanel InputProduk;
    private javax.swing.JTextField Kodein;
    private javax.swing.JTextField NewHargaA;
    private javax.swing.JTextField NewHargaB;
    private javax.swing.JTextField NewNamaA;
    private javax.swing.JTextField NewNamaB;
    private javax.swing.JTextField NewStokA;
    private javax.swing.JTextField NewStokB;
    private javax.swing.JTextField OutProdukJumlahA;
    private javax.swing.JTextField OutProdukJumlahB;
    private javax.swing.JTextField OutProdukNamaA;
    private javax.swing.JTextField OutProdukNamaB;
    private javax.swing.JTable OutUpdateTabel;
    private javax.swing.JRadioButton Pilih_Gudang_a;
    private javax.swing.JButton ProdukA;
    private javax.swing.JButton ProdukB;
    private javax.swing.JPanel ProdukKeluar;
    private javax.swing.JTextField SearchKeyProdukA;
    private javax.swing.JTextField SearchKeyProdukB;
    private javax.swing.JMenuItem SettingExit;
    private javax.swing.JMenuItem SettingLogout;
    private javax.swing.JMenu SettingMenu;
    private javax.swing.JButton Simpandatabase;
    private javax.swing.JTextField Stokin;
    private javax.swing.JScrollPane Tabel;
    private javax.swing.JButton TombolOutGudangA;
    private javax.swing.JButton TombolOutGudangB;
    private javax.swing.JButton UpdateNewA;
    private javax.swing.JButton UpdateNewB;
    private javax.swing.JPanel UpdateStok;
    private javax.swing.JButton Updatedata;
    private javax.swing.JTable UpdatetableUpdate;
    private javax.swing.JButton inputdata;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JTextField namaIn;
    private javax.swing.JButton outputdata;
    private javax.swing.JRadioButton pilih_gudang_b;
    private javax.swing.JButton report;
    // End of variables declaration//GEN-END:variables
}
