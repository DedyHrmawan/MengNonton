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
public class VTambahTiket extends javax.swing.JFrame {

    /**
     * Creates new form VMakanan
     */
    public VTambahTiket() {
        initComponents();
        this.setExtendedState(VTambahTiket.MAXIMIZED_BOTH);
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
        MTiket = new javax.swing.JButton();
        MPembayaran = new javax.swing.JButton();
        MLogout = new javax.swing.JButton();
        headpanel = new javax.swing.JPanel();
        LMakanan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FormIDTiket = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        FormIDJadwal = new javax.swing.JComboBox<>();
        FormHarga = new javax.swing.JTextField();

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

        MTiket.setBackground(new java.awt.Color(0, 8, 66));
        MTiket.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        MTiket.setForeground(new java.awt.Color(255, 255, 255));
        MTiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tiket.png"))); // NOI18N
        MTiket.setText("Tiket");
        MTiket.setBorder(null);
        MTiket.setBorderPainted(false);
        MTiket.setContentAreaFilled(false);
        MTiket.setHideActionText(true);
        MTiket.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MTiket.setIconTextGap(10);
        MTiket.setPreferredSize(new java.awt.Dimension(97, 32));
        MTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTiketActionPerformed(evt);
            }
        });

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
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MTiket, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(MPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(MJudul))
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
                .addComponent(MTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MPembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
        );

        headpanel.setBackground(new java.awt.Color(12, 33, 193));
        headpanel.setPreferredSize(new java.awt.Dimension(675, 102));

        LMakanan.setBackground(new java.awt.Color(255, 255, 255));
        LMakanan.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        LMakanan.setForeground(new java.awt.Color(255, 255, 255));
        LMakanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tiket.png"))); // NOI18N
        LMakanan.setText("Tiket");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Tambah Data Tiket");

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
        jLabel3.setText("ID Tiket");

        FormIDTiket.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormIDTiket.setForeground(new java.awt.Color(0, 8, 66));
        FormIDTiket.setText("Masukan ID Tiket");
        FormIDTiket.setToolTipText("");
        FormIDTiket.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormIDTiket.setCaretColor(new java.awt.Color(0, 8, 66));
        FormIDTiket.setDisabledTextColor(new java.awt.Color(0, 6, 66));
        FormIDTiket.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormIDTiketFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormIDTiketFocusLost(evt);
            }
        });
        FormIDTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormIDTiketActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("ID Jadwal");

        jLabel6.setFont(new java.awt.Font("Lato", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Harga Tiket");

        jButton1.setBackground(new java.awt.Color(12, 33, 193));
        jButton1.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/simpan.png"))); // NOI18N
        jButton1.setText("SIMPAN");

        FormIDJadwal.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        FormIDJadwal.setForeground(new java.awt.Color(0, 6, 66));
        FormIDJadwal.setMaximumRowCount(5);
        FormIDJadwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MF001", "MF002" }));

        FormHarga.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        FormHarga.setForeground(new java.awt.Color(0, 8, 66));
        FormHarga.setText("Masukan Harga");
        FormHarga.setToolTipText("");
        FormHarga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        FormHarga.setCaretColor(new java.awt.Color(0, 8, 66));
        FormHarga.setDisabledTextColor(new java.awt.Color(0, 6, 66));
        FormHarga.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FormHargaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FormHargaFocusLost(evt);
            }
        });
        FormHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormHargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FormIDTiket, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                            .addComponent(FormIDJadwal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 209, Short.MAX_VALUE))
                            .addComponent(FormHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                        .addGap(65, 65, 65))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(headpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormIDTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormIDJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FormHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        getContentPane().add(bg);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormIDTiketFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormIDTiketFocusGained
        // TODO add your handling code here:
        if (FormIDTiket.getText().equals("Masukan ID Tiket")) {
            FormIDTiket.setText("");
        }
    }//GEN-LAST:event_FormIDTiketFocusGained

    private void FormIDTiketFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormIDTiketFocusLost
        // TODO add your handling code here:
        if (FormIDTiket.getText().equals("")) {
            FormIDTiket.setText("Masukan ID Tiket");
        }
    }//GEN-LAST:event_FormIDTiketFocusLost

    private void MPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPembayaranActionPerformed
        // TODO add your handling code here:
        new VPembayaran().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MPembayaranActionPerformed

    private void MLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MLogoutActionPerformed
        // TODO add your handling code here:
        new VLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MLogoutActionPerformed

    private void FormIDTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormIDTiketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormIDTiketActionPerformed

    private void FormHargaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormHargaFocusGained
        // TODO add your handling code here:
        if (FormHarga.getText().equals("Masukan Harga")) {
            FormHarga.setText("");
        }
    }//GEN-LAST:event_FormHargaFocusGained

    private void FormHargaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FormHargaFocusLost
        // TODO add your handling code here:
          if (FormHarga.getText().equals("")) {
            FormHarga.setText("Masukan Harga");
        }
    }//GEN-LAST:event_FormHargaFocusLost

    private void FormHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormHargaActionPerformed

    private void MTiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTiketActionPerformed
        // TODO add your handling code here:
        new VTiket().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MTiketActionPerformed

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
            java.util.logging.Logger.getLogger(VTambahTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VTambahTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VTambahTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VTambahTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VTambahTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FormHarga;
    private javax.swing.JComboBox<String> FormIDJadwal;
    private javax.swing.JTextField FormIDTiket;
    private javax.swing.JLabel LMakanan;
    private javax.swing.JLabel MJudul;
    private javax.swing.JButton MLogout;
    private javax.swing.JButton MPembayaran;
    private javax.swing.JButton MTiket;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel headpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
