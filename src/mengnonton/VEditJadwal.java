/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengnonton;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import javax.swing.UIManager;

/**
 *
 * @author dblenk
 */
public class VEditJadwal extends javax.swing.JFrame {

    /**
     * Creates new form VMakanan
     */
    public VEditJadwal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(VEditJadwal.MAXIMIZED_BOTH);
        bg.setFocusable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        MJudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Mfilm = new javax.swing.JButton();
        MStudio = new javax.swing.JButton();
        MJadwal = new javax.swing.JButton();
        MMakanan = new javax.swing.JButton();
        MMinuman = new javax.swing.JButton();
        MLogout = new javax.swing.JButton();
        MLaporanPembayaran = new javax.swing.JButton();
        MLaporanTiket = new javax.swing.JButton();
        MLaporanMakanan = new javax.swing.JButton();
        MLaporanMinuman = new javax.swing.JButton();
        headpanel = new javax.swing.JPanel();
        LMakanan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FormIDJadwal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        FormIDFilm = new javax.swing.JComboBox<>();
        FormIDStudio = new javax.swing.JComboBox<>();
        FormTanggal = new com.toedter.calendar.JDateChooser();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(1000, 700));

        sidepanel.setBackground(new java.awt.Color(0, 8, 66));
        sidepanel.setForeground(new java.awt.Color(255, 255, 255));
        sidepanel.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        sidepanel.setPreferredSize(new java.awt.Dimension(325, 700));

        MJudul.setBackground(new java.awt.Color(255, 255, 255));
        MJudul.setFont(new java.awt.Font("Lato", 1, 30)); // NOI18N
        MJudul.setForeground(new java.awt.Color(255, 255, 255));
        MJudul.setText("MengNonton");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("______________________________");

        Mfilm.setBackground(new java.awt.Color(0, 8, 66));
        Mfilm.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        Mfilm.setForeground(new java.awt.Color(255, 255, 255));
        Mfilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/film.png"))); // NOI18N
        Mfilm.setText("Film");
        Mfilm.setBorder(null);
        Mfilm.setBorderPainted(false);
        Mfilm.setContentAreaFilled(false);
        Mfilm.setHideActionText(true);
        Mfilm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Mfilm.setIconTextGap(10);
        Mfilm.setPreferredSize(new java.awt.Dimension(97, 32));
        Mfilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MfilmActionPerformed(evt);
            }
        });

        MStudio.setBackground(new java.awt.Color(0, 8, 66));
        MStudio.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MStudio.setForeground(new java.awt.Color(255, 255, 255));
        MStudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/studio.png"))); // NOI18N
        MStudio.setText("Studio");
        MStudio.setBorder(null);
        MStudio.setBorderPainted(false);
        MStudio.setContentAreaFilled(false);
        MStudio.setHideActionText(true);
        MStudio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MStudio.setIconTextGap(10);
        MStudio.setPreferredSize(new java.awt.Dimension(97, 32));
        MStudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MStudioActionPerformed(evt);
            }
        });

        MJadwal.setBackground(new java.awt.Color(0, 8, 66));
        MJadwal.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MJadwal.setForeground(new java.awt.Color(255, 255, 255));
        MJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jadwal.png"))); // NOI18N
        MJadwal.setText("Jadwal");
        MJadwal.setBorder(null);
        MJadwal.setBorderPainted(false);
        MJadwal.setContentAreaFilled(false);
        MJadwal.setHideActionText(true);
        MJadwal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MJadwal.setIconTextGap(10);
        MJadwal.setPreferredSize(new java.awt.Dimension(97, 32));
        MJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MJadwalActionPerformed(evt);
            }
        });

        MMakanan.setBackground(new java.awt.Color(0, 8, 66));
        MMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MMakanan.setForeground(new java.awt.Color(255, 255, 255));
        MMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/makanan.png"))); // NOI18N
        MMakanan.setText("Makanan");
        MMakanan.setBorder(null);
        MMakanan.setBorderPainted(false);
        MMakanan.setContentAreaFilled(false);
        MMakanan.setHideActionText(true);
        MMakanan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MMakanan.setIconTextGap(10);
        MMakanan.setPreferredSize(new java.awt.Dimension(97, 32));
        MMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMakananActionPerformed(evt);
            }
        });

        MMinuman.setBackground(new java.awt.Color(0, 8, 66));
        MMinuman.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MMinuman.setForeground(new java.awt.Color(255, 255, 255));
        MMinuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minuman.png"))); // NOI18N
        MMinuman.setText("Minuman");
        MMinuman.setBorder(null);
        MMinuman.setBorderPainted(false);
        MMinuman.setContentAreaFilled(false);
        MMinuman.setHideActionText(true);
        MMinuman.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MMinuman.setIconTextGap(10);
        MMinuman.setPreferredSize(new java.awt.Dimension(97, 32));
        MMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMinumanActionPerformed(evt);
            }
        });

        MLogout.setBackground(new java.awt.Color(0, 8, 66));
        MLogout.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MLogout.setForeground(new java.awt.Color(255, 255, 255));
        MLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        MLogout.setText("Logout");
        MLogout.setBorder(null);
        MLogout.setBorderPainted(false);
        MLogout.setContentAreaFilled(false);
        MLogout.setHideActionText(true);
        MLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MLogout.setIconTextGap(10);
        MLogout.setPreferredSize(new java.awt.Dimension(97, 32));
        MLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLogoutActionPerformed(evt);
            }
        });

        MLaporanPembayaran.setBackground(new java.awt.Color(0, 8, 66));
        MLaporanPembayaran.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MLaporanPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        MLaporanPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pay-report.png"))); // NOI18N
        MLaporanPembayaran.setText("Laporan Pembayaran");
        MLaporanPembayaran.setBorder(null);
        MLaporanPembayaran.setBorderPainted(false);
        MLaporanPembayaran.setContentAreaFilled(false);
        MLaporanPembayaran.setHideActionText(true);
        MLaporanPembayaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MLaporanPembayaran.setIconTextGap(10);
        MLaporanPembayaran.setPreferredSize(new java.awt.Dimension(97, 32));
        MLaporanPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLaporanPembayaranActionPerformed(evt);
            }
        });

        MLaporanTiket.setBackground(new java.awt.Color(0, 8, 66));
        MLaporanTiket.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MLaporanTiket.setForeground(new java.awt.Color(255, 255, 255));
        MLaporanTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tiket-report.png"))); // NOI18N
        MLaporanTiket.setText("Laporan Film");
        MLaporanTiket.setBorder(null);
        MLaporanTiket.setBorderPainted(false);
        MLaporanTiket.setContentAreaFilled(false);
        MLaporanTiket.setHideActionText(true);
        MLaporanTiket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MLaporanTiket.setIconTextGap(10);
        MLaporanTiket.setPreferredSize(new java.awt.Dimension(97, 32));
        MLaporanTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLaporanTiketActionPerformed(evt);
            }
        });

        MLaporanMakanan.setBackground(new java.awt.Color(0, 8, 66));
        MLaporanMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MLaporanMakanan.setForeground(new java.awt.Color(255, 255, 255));
        MLaporanMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/food-report.png"))); // NOI18N
        MLaporanMakanan.setText("Laporan Makanan");
        MLaporanMakanan.setBorder(null);
        MLaporanMakanan.setBorderPainted(false);
        MLaporanMakanan.setContentAreaFilled(false);
        MLaporanMakanan.setHideActionText(true);
        MLaporanMakanan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MLaporanMakanan.setIconTextGap(10);
        MLaporanMakanan.setPreferredSize(new java.awt.Dimension(97, 32));
        MLaporanMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLaporanMakananActionPerformed(evt);
            }
        });

        MLaporanMinuman.setBackground(new java.awt.Color(0, 8, 66));
        MLaporanMinuman.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MLaporanMinuman.setForeground(new java.awt.Color(255, 255, 255));
        MLaporanMinuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/drink.png"))); // NOI18N
        MLaporanMinuman.setText("Laporan Minuman");
        MLaporanMinuman.setBorder(null);
        MLaporanMinuman.setBorderPainted(false);
        MLaporanMinuman.setContentAreaFilled(false);
        MLaporanMinuman.setHideActionText(true);
        MLaporanMinuman.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MLaporanMinuman.setIconTextGap(10);
        MLaporanMinuman.setPreferredSize(new java.awt.Dimension(97, 32));
        MLaporanMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MLaporanMinumanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MLaporanMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MLaporanMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MLaporanPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                        .addComponent(MLaporanTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Mfilm, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(MStudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MMakanan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MMinuman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(MJudul))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(MJudul)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(Mfilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MStudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLaporanPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLaporanTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLaporanMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLaporanMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        headpanel.setBackground(new java.awt.Color(12, 33, 193));
        headpanel.setPreferredSize(new java.awt.Dimension(675, 102));

        LMakanan.setBackground(new java.awt.Color(255, 255, 255));
        LMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        LMakanan.setForeground(new java.awt.Color(255, 255, 255));
        LMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/jadwal.png"))); // NOI18N
        LMakanan.setText("Jadwal");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Edit Data Jadwal");

        javax.swing.GroupLayout headpanelLayout = new javax.swing.GroupLayout(headpanel);
        headpanel.setLayout(headpanelLayout);
        headpanelLayout.setHorizontalGroup(
            headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headpanelLayout.createSequentialGroup()
                .addGroup(headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headpanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LMakanan))
                    .addGroup(headpanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headpanelLayout.setVerticalGroup(
            headpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMakanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("ID Jadwal");

        FormIDJadwal.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormIDJadwal.setForeground(new java.awt.Color(0, 8, 66));
        FormIDJadwal.setToolTipText("");
        FormIDJadwal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormIDJadwal.setCaretColor(new java.awt.Color(0, 8, 66));
        FormIDJadwal.setDisabledTextColor(new java.awt.Color(0, 6, 66));

        jLabel5.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("ID Film");

        jLabel6.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("ID Studio");

        jLabel7.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Tanggal Tayang");

        jButton1.setBackground(new java.awt.Color(12, 33, 193));
        jButton1.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/simpan.png"))); // NOI18N
        jButton1.setText("SIMPAN");

        FormIDFilm.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        FormIDFilm.setForeground(new java.awt.Color(0, 6, 66));
        FormIDFilm.setMaximumRowCount(5);
        FormIDFilm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MF001", "MF002" }));

        FormIDStudio.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        FormIDStudio.setForeground(new java.awt.Color(0, 6, 66));
        FormIDStudio.setMaximumRowCount(5);
        FormIDStudio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MS001", "MS002" }));

        FormTanggal.setBackground(new java.awt.Color(255, 255, 255));
        FormTanggal.setForeground(new java.awt.Color(0, 8, 66));
        FormTanggal.setDateFormatString("d MMM , yyyy");
        FormTanggal.setFocusable(false);
        FormTanggal.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        FormTanggal.setPreferredSize(new java.awt.Dimension(135, 27));

        back.setBackground(new java.awt.Color(238, 210, 2));
        back.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FormIDJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                            .addComponent(FormIDFilm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FormIDStudio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(FormTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(65, 65, 65))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(headpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormIDJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormIDFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormIDStudio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MfilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfilmActionPerformed
        // TODO add your handling code here:
        new VFilm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MfilmActionPerformed

    private void MJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MJadwalActionPerformed
        // TODO add your handling code here:
        new VJadwal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MJadwalActionPerformed

    private void MMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMakananActionPerformed
        // TODO add your handling code here:
        new VMakanan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MMakananActionPerformed

    private void MMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMinumanActionPerformed
        // TODO add your handling code here:
         new VMinuman().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MMinumanActionPerformed

    private void MLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLogoutActionPerformed
        // TODO add your handling code here:
        new VLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLogoutActionPerformed

    private void MStudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MStudioActionPerformed
        // TODO add your handling code here:
        new VStudio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MStudioActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
         new VJadwal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void MLaporanPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLaporanPembayaranActionPerformed
        // TODO add your handling code here:
        new VLaporanPembayaran().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLaporanPembayaranActionPerformed

    private void MLaporanTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLaporanTiketActionPerformed
        // TODO add your handling code here:
        new VLaporanFilm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLaporanTiketActionPerformed

    private void MLaporanMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLaporanMakananActionPerformed
        // TODO add your handling code here:
        new VLaporanMakan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLaporanMakananActionPerformed

    private void MLaporanMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLaporanMinumanActionPerformed
        // TODO add your handling code here:
        new VLaporanMinum().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLaporanMinumanActionPerformed

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
            java.util.logging.Logger.getLogger(VEditJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VEditJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VEditJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VEditJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new AluminiumLookAndFeel());
                    
                } catch (Exception e) {
                }
                new VEditJadwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FormIDFilm;
    private javax.swing.JTextField FormIDJadwal;
    private javax.swing.JComboBox<String> FormIDStudio;
    private com.toedter.calendar.JDateChooser FormTanggal;
    private javax.swing.JLabel LMakanan;
    private javax.swing.JButton MJadwal;
    private javax.swing.JLabel MJudul;
    private javax.swing.JButton MLaporanMakanan;
    private javax.swing.JButton MLaporanMinuman;
    private javax.swing.JButton MLaporanPembayaran;
    private javax.swing.JButton MLaporanTiket;
    private javax.swing.JButton MLogout;
    private javax.swing.JButton MMakanan;
    private javax.swing.JButton MMinuman;
    private javax.swing.JButton MStudio;
    private javax.swing.JButton Mfilm;
    private javax.swing.JButton back;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel headpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
