/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mengnonton;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.ButtonModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author dblenk
 */
public class VBayar extends javax.swing.JFrame {
    DefaultTableModel tabMakanan, tabMinuman, tabTiket;
    ResultSet RsProduk=null, RsMinuman=null, RsTiket=null;
    /**
     * Creates new form VMakanan
     */
    public VBayar() {
        initComponents();
        this.setExtendedState(VBayar.MAXIMIZED_BOTH);
        tabelMakanan.getTableHeader().setFont(new Font("Lato", Font.BOLD, 17));
        
        tampilMakanan();
        tampilMinuman();
        tampilTiket();
        totalbayar();
    }

    
    private void tampilMakanan(){
        try{
            Object[] judul_kolom = {"No", "ID Makanan", "Jumlah", "Total", "Tanggal"};
            tabMakanan = new DefaultTableModel(null,judul_kolom);
            tabelMakanan.setModel(tabMakanan);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabMakanan.getDataVector().removeAllElements();
            
            RsProduk=stt.executeQuery("SELECT * from pemesanan WHERE TIPE_PEMESANAN = 1 AND STATUS = 0");  
            int no = 0;
            while(RsProduk.next()){
                no++;
                Object[] data={
                    no,
                    RsProduk.getString("ID_BARANG"),
                    RsProduk.getString("JUMLAH_PEMESANAN"),
                    RsProduk.getString("TOTAL_TAGIHAN"),
                    RsProduk.getString("TANGGAL_PEMESANAN")        
                };
               tabMakanan.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
    
    private void tampilTiket(){
        try{
            Object[] judul_kolom = {"No", "ID Tiket", "Total", "Tanggal"};
            tabTiket = new DefaultTableModel(null,judul_kolom);
            tabelTiket.setModel(tabTiket);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabTiket.getDataVector().removeAllElements();
            
            RsTiket=stt.executeQuery("SELECT * from pemesanan WHERE TIPE_PEMESANAN = 3 AND STATUS = 0");  
            int no = 0;
            while(RsTiket.next()){
                no++;
                Object[] data={
                    no,
                    RsTiket.getString("ID_BARANG"),
                    RsTiket.getString("JUMLAH_PEMESANAN"),
                    RsTiket.getString("TOTAL_TAGIHAN"),
                    RsTiket.getString("TANGGAL_PEMESANAN")        
                };
               tabTiket.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
    
    private void tampilMinuman(){
        try{
            Object[] judul_kolom = {"No", "ID Minuman", "Jumlah", "Total", "Tanggal"};
            tabMinuman = new DefaultTableModel(null,judul_kolom);
            tabelMinuman.setModel(tabMinuman);
            
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            tabMinuman.getDataVector().removeAllElements();
            
            RsMinuman=stt.executeQuery("SELECT * from pemesanan WHERE TIPE_PEMESANAN = 2 AND STATUS = 0");  
            int no = 0;
            while(RsMinuman.next()){
                no++;
                Object[] data={
                    no,
                    RsMinuman.getString("ID_BARANG"),
                    RsMinuman.getString("JUMLAH_PEMESANAN"),
                    RsMinuman.getString("TOTAL_TAGIHAN"),
                    RsMinuman.getString("TANGGAL_PEMESANAN")        
                };
               tabMinuman.addRow(data);
            }                
        } catch (Exception ex) {
        System.err.println(ex.getMessage());
        }
    }
    
    public void totalbayar(){
        try{
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            ResultSet total = stt.executeQuery("SELECT SUM(TOTAL_TAGIHAN) as bayar from pemesanan WHERE STATUS = 0"); 
            total.next();
            jLabel4.setText(total.getString("bayar"));
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
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
        MPembayaran = new javax.swing.JButton();
        MLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LMakanan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtAddMakanan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMakanan = new javax.swing.JTable();
        BtAddMinuman = new javax.swing.JButton();
        BtAddTiket = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTiket = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelMinuman = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        MPembayaran.setBackground(new java.awt.Color(0, 8, 66));
        MPembayaran.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MPembayaran.setForeground(new java.awt.Color(255, 255, 255));
        MPembayaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bayar.png"))); // NOI18N
        MPembayaran.setText("Pembayaran");
        MPembayaran.setBorder(null);
        MPembayaran.setBorderPainted(false);
        MPembayaran.setContentAreaFilled(false);
        MPembayaran.setHideActionText(true);
        MPembayaran.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MPembayaran.setIconTextGap(10);
        MPembayaran.setPreferredSize(new java.awt.Dimension(97, 32));
        MPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPembayaranActionPerformed(evt);
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

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(MJudul)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(MPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(12, 33, 193));
        jPanel2.setPreferredSize(new java.awt.Dimension(675, 102));

        LMakanan.setBackground(new java.awt.Color(255, 255, 255));
        LMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        LMakanan.setForeground(new java.awt.Color(255, 255, 255));
        LMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bayar.png"))); // NOI18N
        LMakanan.setText("Pembayaran");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Menu Data Pembayaran");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LMakanan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMakanan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        BtAddMakanan.setBackground(new java.awt.Color(12, 33, 193));
        BtAddMakanan.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        BtAddMakanan.setForeground(new java.awt.Color(255, 255, 255));
        BtAddMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah.png"))); // NOI18N
        BtAddMakanan.setText("Makanan");
        BtAddMakanan.setPreferredSize(new java.awt.Dimension(141, 43));
        BtAddMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddMakananActionPerformed(evt);
            }
        });

        tabelMakanan.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        tabelMakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "ID Makanan", "Total", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelMakanan.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(tabelMakanan);
        if (tabelMakanan.getColumnModel().getColumnCount() > 0) {
            tabelMakanan.getColumnModel().getColumn(0).setMinWidth(25);
            tabelMakanan.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelMakanan.getColumnModel().getColumn(0).setMaxWidth(25);
            tabelMakanan.getColumnModel().getColumn(1).setResizable(false);
        }

        BtAddMinuman.setBackground(new java.awt.Color(12, 33, 193));
        BtAddMinuman.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        BtAddMinuman.setForeground(new java.awt.Color(255, 255, 255));
        BtAddMinuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah.png"))); // NOI18N
        BtAddMinuman.setText("Minuman");
        BtAddMinuman.setPreferredSize(new java.awt.Dimension(141, 43));
        BtAddMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddMinumanActionPerformed(evt);
            }
        });

        BtAddTiket.setBackground(new java.awt.Color(12, 33, 193));
        BtAddTiket.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        BtAddTiket.setForeground(new java.awt.Color(255, 255, 255));
        BtAddTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah.png"))); // NOI18N
        BtAddTiket.setText("Tiket");
        BtAddTiket.setPreferredSize(new java.awt.Dimension(141, 43));
        BtAddTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAddTiketActionPerformed(evt);
            }
        });

        tabelTiket.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        tabelTiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Pizza", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "ID Tiket", "Total", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelTiket.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(tabelTiket);
        if (tabelTiket.getColumnModel().getColumnCount() > 0) {
            tabelTiket.getColumnModel().getColumn(0).setMinWidth(25);
            tabelTiket.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelTiket.getColumnModel().getColumn(0).setMaxWidth(25);
            tabelTiket.getColumnModel().getColumn(1).setResizable(false);
        }

        tabelMinuman.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        tabelMinuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "ID Minuman", "Total", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelMinuman.setGridColor(new java.awt.Color(153, 153, 153));
        jScrollPane3.setViewportView(tabelMinuman);
        if (tabelMinuman.getColumnModel().getColumnCount() > 0) {
            tabelMinuman.getColumnModel().getColumn(0).setMinWidth(25);
            tabelMinuman.getColumnModel().getColumn(0).setPreferredWidth(25);
            tabelMinuman.getColumnModel().getColumn(0).setMaxWidth(25);
            tabelMinuman.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(12, 33, 193));
        jButton1.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bayar.png"))); // NOI18N
        jButton1.setText("BAYAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Total Harus Dibayar : Rp.");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(BtAddMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BtAddMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BtAddTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(60, 60, 60))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtAddMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtAddMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtAddTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPembayaranActionPerformed
        // TODO add your handling code here:
        new VBayar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MPembayaranActionPerformed

    private void MLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLogoutActionPerformed
        // TODO add your handling code here:
        new VLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLogoutActionPerformed

    private void BtAddMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddMakananActionPerformed
        // TODO add your handling code here:
        new VBayarMakanan().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtAddMakananActionPerformed

    private void BtAddMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddMinumanActionPerformed
        // TODO add your handling code here:
        new VBayarMinuman().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtAddMinumanActionPerformed

    private void BtAddTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAddTiketActionPerformed
        // TODO add your handling code here:
        new VBayarCariTiket().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtAddTiketActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String title    = "Struk Pembayaran";
        String total = "Total : "+jLabel4.getText().toString();
        
        PdfGenerator pdfGenerate = new PdfGenerator();
        pdfGenerate.printStruk(title, total);
        
        try{
            Connection conn=(Connection)koneksi.koneksiDB();
            Statement stt=conn.createStatement();
            stt.executeUpdate("insert into pembayaran(TOTAL_PEMBAYARAN) VALUES('"+jLabel4.getText()+"')");
            stt.executeUpdate("UPDATE pemesanan SET STATUS = 1");
            stt.executeUpdate("UPDATE kursi SET STATUS_KURSI = 2 WHERE STATUS_KURSI = 1");
            conn.close();
            JOptionPane.showMessageDialog(null, "Berhasil Membayar");
            new VBayar().setVisible(true);
            setVisible(false);
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VBayar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VBayar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAddMakanan;
    private javax.swing.JButton BtAddMinuman;
    private javax.swing.JButton BtAddTiket;
    private javax.swing.JLabel LMakanan;
    private javax.swing.JLabel MJudul;
    private javax.swing.JButton MLogout;
    private javax.swing.JButton MPembayaran;
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tabelMakanan;
    private javax.swing.JTable tabelMinuman;
    private javax.swing.JTable tabelTiket;
    // End of variables declaration//GEN-END:variables
}
