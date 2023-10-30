package vistas;

import java.awt.BorderLayout;

/**
 * @author Veronica
 */
public class JEscritorio extends javax.swing.JFrame {

    public JEscritorio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBGAbsolut = new javax.swing.JPanel();
        jPanelVertical = new javax.swing.JPanel();
        jpMascota = new javax.swing.JPanel();
        jliconMascota = new javax.swing.JLabel();
        jlMascota = new javax.swing.JLabel();
        jpVisita = new javax.swing.JPanel();
        jliconVisita = new javax.swing.JLabel();
        jlVisita = new javax.swing.JLabel();
        jpClient = new javax.swing.JPanel();
        jliconClient = new javax.swing.JLabel();
        jlCliente = new javax.swing.JLabel();
        jpHClinica = new javax.swing.JPanel();
        jliconTratamiento = new javax.swing.JLabel();
        jlTratamiento = new javax.swing.JLabel();
        jpAltas = new javax.swing.JPanel();
        jliconTratamiento1 = new javax.swing.JLabel();
        jlTratamiento1 = new javax.swing.JLabel();
        jPanelHorizontal = new javax.swing.JPanel();
        jbSalir = new javax.swing.JButton();
        jlFootPrint = new javax.swing.JLabel();
        jpContenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBGAbsolut.setBackground(new java.awt.Color(255, 255, 255));
        jpBGAbsolut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelVertical.setBackground(new java.awt.Color(249, 198, 151));
        jPanelVertical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMascota.setBackground(new java.awt.Color(196, 119, 75));

        jliconMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pet24.png"))); // NOI18N
        jpMascota.add(jliconMascota);

        jlMascota.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlMascota.setForeground(new java.awt.Color(255, 255, 255));
        jlMascota.setText("Mascota");
        jlMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jlMascotaMouseReleased(evt);
            }
        });
        jpMascota.add(jlMascota);

        jPanelVertical.add(jpMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, -1));

        jpVisita.setBackground(new java.awt.Color(196, 119, 75));
        jpVisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpVisitaMouseReleased(evt);
            }
        });

        jliconVisita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_local_hospital_white_24dp.png"))); // NOI18N
        jpVisita.add(jliconVisita);

        jlVisita.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlVisita.setForeground(new java.awt.Color(255, 255, 255));
        jlVisita.setText("Visita");
        jpVisita.add(jlVisita);

        jPanelVertical.add(jpVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, -1));

        jpClient.setBackground(new java.awt.Color(196, 119, 75));
        jpClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpClientMouseReleased(evt);
            }
        });

        jliconClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/client.png"))); // NOI18N
        jpClient.add(jliconClient);

        jlCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlCliente.setForeground(new java.awt.Color(255, 255, 255));
        jlCliente.setText("Cliente");
        jpClient.add(jlCliente);

        jPanelVertical.add(jpClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, -1));

        jpHClinica.setBackground(new java.awt.Color(196, 119, 75));
        jpHClinica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpHClinicaMouseReleased(evt);
            }
        });

        jliconTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hc.png"))); // NOI18N
        jpHClinica.add(jliconTratamiento);

        jlTratamiento.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlTratamiento.setForeground(new java.awt.Color(255, 255, 255));
        jlTratamiento.setText("H. Clinica");
        jpHClinica.add(jlTratamiento);

        jPanelVertical.add(jpHClinica, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, -1));

        jpAltas.setBackground(new java.awt.Color(196, 119, 75));
        jpAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpAltasMouseReleased(evt);
            }
        });

        jliconTratamiento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tratamiento.png"))); // NOI18N
        jpAltas.add(jliconTratamiento1);

        jlTratamiento1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlTratamiento1.setForeground(new java.awt.Color(255, 255, 255));
        jlTratamiento1.setText("Altas");
        jpAltas.add(jlTratamiento1);

        jPanelVertical.add(jpAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, -1));

        jpBGAbsolut.add(jPanelVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 550));

        jPanelHorizontal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbSalir.setBackground(new java.awt.Color(218, 141, 84));
        jbSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanelHorizontal.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        jlFootPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jph.png"))); // NOI18N
        jPanelHorizontal.add(jlFootPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpBGAbsolut.add(jPanelHorizontal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 700, 100));

        jpContenedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jpContenedorLayout.setVerticalGroup(
            jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        jpBGAbsolut.add(jpContenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 700, 450));

        getContentPane().add(jpBGAbsolut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jpClientMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpClientMouseReleased
        JPCliente jpcliente = new JPCliente();
        jpcliente.setSize(700, 450);           //forzar la fijacion de las medidas del panel para asegurarme que no sea diferente
        jpcliente.setLocation(0, 0);
        jpContenedor.removeAll();
        jpContenedor.add(jpcliente, BorderLayout.CENTER);
        jpContenedor.revalidate();
        jpContenedor.repaint();
    }//GEN-LAST:event_jpClientMouseReleased

    private void jlMascotaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMascotaMouseReleased
        JPMascota jpm = new JPMascota();
        jpm.setSize(700, 450);           //forzar la fijacion de las medidas del panel para asegurarme que no sea diferente
        jpm.setLocation(0, 0);
        jpContenedor.removeAll();
        jpContenedor.add(jpm, BorderLayout.CENTER);
        jpContenedor.revalidate();
        jpContenedor.repaint();
    }//GEN-LAST:event_jlMascotaMouseReleased

    private void jpVisitaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpVisitaMouseReleased
        JPVisita jpv = new JPVisita();
        jpv.setSize(700, 450);           //forzar la fijacion de las medidas del panel para asegurarme que no sea diferente
        jpv.setLocation(0, 0);
        jpContenedor.removeAll();
        jpContenedor.add(jpv, BorderLayout.CENTER);
        jpContenedor.revalidate();
        jpContenedor.repaint();
    }//GEN-LAST:event_jpVisitaMouseReleased

    private void jpHClinicaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpHClinicaMouseReleased
        JPHClinica hc = new JPHClinica();
        hc.setSize(700, 450);           //forzar la fijacion de las medidas del panel para asegurarme que no sea diferente
        hc.setLocation(0, 0);
        jpContenedor.removeAll();
        jpContenedor.add(hc, BorderLayout.CENTER);
        jpContenedor.revalidate();
        jpContenedor.repaint();
    }//GEN-LAST:event_jpHClinicaMouseReleased

    private void jpAltasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpAltasMouseReleased
        JPAltasYBajas ayb = new JPAltasYBajas();
        ayb.setSize(700, 450);           //forzar la fijacion de las medidas del panel para asegurarme que no sea diferente
        ayb.setLocation(0, 0);
        jpContenedor.removeAll();
        jpContenedor.add(ayb, BorderLayout.CENTER);
        jpContenedor.revalidate();
        jpContenedor.repaint();
    }//GEN-LAST:event_jpAltasMouseReleased

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
            java.util.logging.Logger.getLogger(JEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelHorizontal;
    private javax.swing.JPanel jPanelVertical;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlFootPrint;
    private javax.swing.JLabel jlMascota;
    private javax.swing.JLabel jlTratamiento;
    private javax.swing.JLabel jlTratamiento1;
    private javax.swing.JLabel jlVisita;
    private javax.swing.JLabel jliconClient;
    private javax.swing.JLabel jliconMascota;
    private javax.swing.JLabel jliconTratamiento;
    private javax.swing.JLabel jliconTratamiento1;
    private javax.swing.JLabel jliconVisita;
    private javax.swing.JPanel jpAltas;
    private javax.swing.JPanel jpBGAbsolut;
    private javax.swing.JPanel jpClient;
    private javax.swing.JPanel jpContenedor;
    private javax.swing.JPanel jpHClinica;
    private javax.swing.JPanel jpMascota;
    private javax.swing.JPanel jpVisita;
    // End of variables declaration//GEN-END:variables
}
