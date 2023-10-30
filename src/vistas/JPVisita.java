/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import data.*;
import entidades.*;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Veronica
 */
public class JPVisita extends javax.swing.JPanel {

    /**
     * Creates new form JPVisita
     */
    public JPVisita() {
        initComponents();
        controladorDeBotones(true, false, false, false, false, false);
        controladorDeCampos(false, true, false, false, false, false, false, false, false);

        // Obtén la fecha actual
        Date fechaActual = new Date();
        // Crea un formato para la fecha (por ejemplo, "dd-MM-yyyy HH:mm:ss")
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        // Convierte la fecha en una cadena formateada
        String fechaFormateada = formato.format(fechaActual);
        // Establece la cadena formateada en el JLabel
        jlFechaVisita.setText(fechaFormateada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfPesoActual = new javax.swing.JTextField();
        jScrollPaneDetalleVisita = new javax.swing.JScrollPane();
        jtaDetalleVisita = new javax.swing.JTextArea();
        jtfIdM = new javax.swing.JTextField();
        jbIrATratamiento = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jlFechaVisita = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbGuardarVisita = new javax.swing.JButton();
        jtfPesoAVG = new javax.swing.JTextField();
        jcbFormaDePago = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jpTratamiento = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jcbTipoTratam = new javax.swing.JComboBox<>();
        jbGuardarTratam = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaTratam = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jtfImporte = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlTratamientoActivo = new javax.swing.JLabel();
        jlFijaIdTratam = new javax.swing.JLabel();
        jlIdTratamiento = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 450));
        setName("JPVisita"); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel1.setText("Visitas");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hospital_black_36dp.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 70, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 50));

        jPanel3.setBackground(new java.awt.Color(234, 234, 234));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setText("Fecha de Visita");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 104, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setText("Código Mascota");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setText("Ingrese el peso actual: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setText("Detalle");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel8.setText("Promedio peso anterior:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jtfPesoActual.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtfPesoActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jtfPesoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 160, 40));

        jtaDetalleVisita.setColumns(20);
        jtaDetalleVisita.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtaDetalleVisita.setRows(5);
        jScrollPaneDetalleVisita.setViewportView(jtaDetalleVisita);

        jPanel3.add(jScrollPaneDetalleVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 310, 70));

        jtfIdM.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtfIdM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jtfIdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 160, 40));

        jbIrATratamiento.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbIrATratamiento.setText("Indicar Tratamiento");
        jbIrATratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIrATratamientoActionPerformed(evt);
            }
        });
        jPanel3.add(jbIrATratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 170, 40));

        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbLimpiar.setText("Limpiar campos");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 40));

        jlFechaVisita.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlFechaVisita.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlFechaVisita.setFocusCycleRoot(true);
        jPanel3.add(jlFechaVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 160, 40));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_search_black_24dp.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 50, 40));

        jbGuardarVisita.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbGuardarVisita.setText("Guardar Visita");
        jbGuardarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarVisitaActionPerformed(evt);
            }
        });
        jPanel3.add(jbGuardarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 360, 40));

        jtfPesoAVG.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jtfPesoAVG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jtfPesoAVG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 40));

        jcbFormaDePago.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jcbFormaDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contado", "Débito", "Crédito", "Transferencia" }));
        jPanel3.add(jcbFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 30));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel12.setText("Forma de pago ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 400));

        jpTratamiento.setBackground(new java.awt.Color(249, 249, 249));
        jpTratamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("Tratamiento ");
        jpTratamiento.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jcbTipoTratam.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jcbTipoTratam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tratamiento...", "Baño", "Castración", "Control", "Corte de pelo", "Curacion", "Enfermedad", "Vacunación", "Varios" }));
        jpTratamiento.add(jcbTipoTratam, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 30));

        jbGuardarTratam.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbGuardarTratam.setText("Guardar Tratamiento");
        jbGuardarTratam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarTratamActionPerformed(evt);
            }
        });
        jpTratamiento.add(jbGuardarTratam, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 170, 50));

        jtaTratam.setColumns(20);
        jtaTratam.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jtaTratam.setRows(5);
        jScrollPane2.setViewportView(jtaTratam);

        jpTratamiento.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 260, 80));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setText("Descripción:");
        jpTratamiento.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jtfImporte.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jpTratamiento.add(jtfImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 110, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setText("Costo del Tratamiento $ ");
        jpTratamiento.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vaccin18.png"))); // NOI18N
        jpTratamiento.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 40, 40));

        jlTratamientoActivo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jpTratamiento.add(jlTratamientoActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, 30));

        jlFijaIdTratam.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jpTratamiento.add(jlFijaIdTratam, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 30));

        jlIdTratamiento.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jpTratamiento.add(jlIdTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 130, 50));

        jPanel1.add(jpTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 310, 400));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarTratamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarTratamActionPerformed
        int idTratamientoGuardado = 0;
        try {
            if (jcbTipoTratam.getSelectedIndex() != 0 && jtaTratam.getText() != null) {

                String tipo = jcbTipoTratam.getSelectedItem().toString();
                String descripcion = jtaTratam.getText();
                double importe = Double.parseDouble(jtfImporte.getText());
                boolean activo = true;
                Tratamiento t = new Tratamiento(tipo, descripcion, importe, activo);
                TratamientoData td = new TratamientoData();
                idTratamientoGuardado = td.guardarTratamiento(t);
                jlFijaIdTratam.setText("Tratamiento Nº: ");
                jlIdTratamiento.setText(idTratamientoGuardado + "");

                controladorDeCampos(false, false, false, false, false, false, false, false, false);
                controladorDeBotones(false, false, false, true, true, false);

            } else {
                JOptionPane.showMessageDialog(this, "Complete los campos. ");
                controladorDeCampos(false, false, false, false, false, true, true, true, true);
                controladorDeBotones(false, false, false, false, false, true);

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Precio inválido. " + ex.getMessage());

        }

    }//GEN-LAST:event_jbGuardarTratamActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        int idBuscado = Integer.parseInt(jtfIdM.getText());
        MascotaData md = new MascotaData();
        Mascota m = md.buscarMascota(idBuscado);
        VisitaData vd = new VisitaData();

        if (m != null) { // Se encontró el IdMascota en la BD
            controladorDeCampos(false, false, true, false, true, false, false, false, false);
            controladorDeBotones(false, true, true, false, false, false);
            Double avg = vd.obtenerPesoAVG(idBuscado);     //calcula el AVG
            String avgString = Double.toString(avg);        //PASO a string
            if (avg.isNaN() == false) {
                jtfPesoAVG.setText(avgString);              //muestro en el textField

            } else {
                jtfPesoActual.getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        jtfPesoAVG.setText(jtfPesoActual.getText());
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        jtfPesoAVG.setText(jtfPesoActual.getText());
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        // Este método se usa en casos de cambios en atributos, no necesitamos hacer nada aquí
                    }
                });
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registro de mascota con ese código. ");
        }


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbIrATratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIrATratamientoActionPerformed

        controladorDeBotones(false, false, false, false, false, true);
        controladorDeCampos(false, false, false, false, false, true, true, true, true);
    }//GEN-LAST:event_jbIrATratamientoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarFormulario();
        controladorDeBotones(true, false, false, false, false, false);
        controladorDeCampos(false, true, false, false, false, false, false, false, false);

        // Obtén la fecha actual
        Date fechaActual = new Date();
        // Crea un formato para la fecha (por ejemplo, "dd-MM-yyyy HH:mm:ss")
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        // Convierte la fecha en una cadena formateada
        String fechaFormateada = formato.format(fechaActual);
        // Establece la cadena formateada en el JLabel
        jlFechaVisita.setText(fechaFormateada);

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarVisitaActionPerformed
        VisitaData vd = new VisitaData();
        MascotaData md = new MascotaData();
        TratamientoData td = new TratamientoData();
        Mascota mascota = md.buscarMascota(Integer.parseInt(jtfIdM.getText()));
        String detalle_sintomas = jtaDetalleVisita.getText();
        double pesoActual = Double.parseDouble(jtfPesoActual.getText());
        double pesoAVG = Double.parseDouble(jtfPesoAVG.getText());
        Tratamiento tratamiento = td.buscarTrataminetoPorId(Integer.parseInt(jlIdTratamiento.getText()));

        String textoFechaHora = jlFechaVisita.getText();

        // Defino un formateador para el formato de fecha y hora
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Analiza el texto como fecha y hora (asumiendo que es válido porque sale de un dchooser now)
        LocalDate fecha_v = LocalDate.parse(textoFechaHora, formatoFechaHora);

        String forma_pago = jcbFormaDePago.getSelectedItem().toString();
        boolean abonada = false;   //inicializo en false porque todavía no se abonó;
        Visita visita = new Visita(mascota, detalle_sintomas, pesoActual, pesoAVG, tratamiento, fecha_v, forma_pago, abonada);
        vd.guardarVisita(visita);

        limpiarFormulario();
        controladorDeBotones(true, false, false, false, false, false);
        controladorDeCampos(false, true, false, false, false, false, false, false, false);

        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formato.format(fechaActual);
        jlFechaVisita.setText(fechaFormateada);

    }//GEN-LAST:event_jbGuardarVisitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneDetalleVisita;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardarTratam;
    private javax.swing.JButton jbGuardarVisita;
    private javax.swing.JButton jbIrATratamiento;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<String> jcbFormaDePago;
    private javax.swing.JComboBox<String> jcbTipoTratam;
    private javax.swing.JLabel jlFechaVisita;
    private javax.swing.JLabel jlFijaIdTratam;
    private javax.swing.JLabel jlIdTratamiento;
    private javax.swing.JLabel jlTratamientoActivo;
    private javax.swing.JPanel jpTratamiento;
    private javax.swing.JTextArea jtaDetalleVisita;
    private javax.swing.JTextArea jtaTratam;
    private javax.swing.JTextField jtfIdM;
    private javax.swing.JTextField jtfImporte;
    private javax.swing.JTextField jtfPesoAVG;
    private javax.swing.JTextField jtfPesoActual;
    // End of variables declaration//GEN-END:variables

    public void limpiarFormulario() {
        jtfIdM.setText("");
        jtfPesoActual.setText("");
        jtfPesoAVG.setText("");
        jtaDetalleVisita.setText("");

        jcbTipoTratam.setSelectedIndex(0);  //ver si está bien
        jtaTratam.setText("");
        jlTratamientoActivo.setText("");
        jtfImporte.setText("");

        jlIdTratamiento.setText("");
        jlFijaIdTratam.setText("");

    }

    public void controladorDeBotones(boolean buId, boolean lim, boolean irATrat, boolean fDePago, boolean cash, boolean guaTratam) {

        jbBuscar.setEnabled(buId);
        jbLimpiar.setEnabled(lim);
        jbIrATratamiento.setEnabled(irATrat);
        jcbFormaDePago.setEnabled(fDePago);
        jbGuardarVisita.setEnabled(cash);
        jbGuardarTratam.setEnabled(guaTratam);

    }

    public void controladorDeCampos(boolean fechV, boolean idM, boolean pa, boolean pAVG, boolean detalleVisita, boolean tipoTratamiento, boolean detalleTratamiento, boolean tratamientoActivo, boolean importe) {

        jlFechaVisita.setEnabled(fechV);
        jtfIdM.setEnabled(idM);
        jtfPesoActual.setEnabled(pa);
        jtfPesoAVG.setEnabled(pAVG);
        jtaDetalleVisita.setEnabled(detalleVisita);

        jcbTipoTratam.setEnabled(tipoTratamiento);
        jtaTratam.setEnabled(detalleTratamiento);
        jlTratamientoActivo.setEnabled(tratamientoActivo);
        jtfImporte.setEnabled(importe);

    }

}
