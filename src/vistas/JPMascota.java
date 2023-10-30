package vistas;

import entidades.*;
import data.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 * @author Veronica
 */
public class JPMascota extends javax.swing.JPanel {

    private MascotaData md = new MascotaData();
    private ClienteData cd = new ClienteData();
    private Cliente c = new Cliente();

    public JPMascota() {
        initComponents();
        controladorDeBotones(true, false, false, false, false);
        controladorDeCampos(true, false, false, false, false, false, false, false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfIdM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfAlias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfSexo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbEspecie = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtfRaza = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfColores = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jdcFN = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jtfDniDuenio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbBuscarHC = new javax.swing.JButton();
        jlEstado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setName("JPMascota"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_pets_black_36dp.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 70, 60));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_search_black_24dp.png"))); // NOI18N
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 50, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Código de HC");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jtfIdM.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jPanel2.add(jtfIdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 320, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Alias");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jtfAlias.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jPanel2.add(jtfAlias, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 320, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Sexo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jtfSexo.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jPanel2.add(jtfSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 320, 40));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Especie");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jcbEspecie.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jcbEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una especie...", "Canino", "Felino", "Ave", "Roedor" }));
        jPanel2.add(jcbEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 320, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Raza");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jtfRaza.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jPanel2.add(jtfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 320, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Colores");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jtfColores.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jPanel2.add(jtfColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 320, 40));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Nacimiento");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        jPanel2.add(jdcFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 320, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("DNI del dueño");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jtfDniDuenio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jPanel2.add(jtfDniDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 320, 40));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Buscar HC");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 90, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setText("Guardar Nuevo");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_save_black_24dp_1.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, 40));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setText("Modificar");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_restart_alt_black_24dp.png"))); // NOI18N
        jLabel18.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 180, 55));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel19.setText("Baja de Registro");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_delete_black_24dp.png"))); // NOI18N
        jLabel20.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel2.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 180, 55));
        jPanel2.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 180, 55));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setText("Limpiar");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_cleaning_services_black_24dp.png"))); // NOI18N
        jLabel22.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 50, 50));

        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, 55));

        jbBuscarHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarHCActionPerformed(evt);
            }
        });
        jPanel2.add(jbBuscarHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 180, 55));

        jlEstado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jPanel2.add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 180, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel2.setText("Mascota");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarHCActionPerformed

        try {
            int idBuscado = Integer.parseInt(jtfIdM.getText());
            Mascota m = md.buscarMascota(idBuscado);

            if (m != null) {            //se encontró el IdMascota en la BD
                controladorDeCampos(false, true, true, true, true, true, true, false);
                jtfAlias.setText(m.getAlias());
                jtfSexo.setText(m.getSexo());
                jcbEspecie.setSelectedItem(m.getEspecie());
                jtfRaza.setText(m.getRaza());
                jtfColores.setText(m.getColores());
                jdcFN.setDate(Date.valueOf(m.getfN()));
                jtfDniDuenio.setText(m.getCliente().getDni() + "");
                if (m.isActivo()) {
                    jlEstado.setText("Mascota ACTIVA");
                } else {
                    jlEstado.setText("Mascota NO ACTIVA");
                }
                controladorDeBotones(false, false, true, false, true);

            } else {                                            //la BD no devuelve cliente con ese DNI
                JOptionPane.showMessageDialog(this, "Para guardar una nueva MASCOTA complete TODOS los campos.");
                jtfIdM.setText("");
                controladorDeCampos(false, true, true, true, true, true, true, true);
                controladorDeBotones(false, true, false, false, true);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El Código de História Clinica solo debe contener números. " + ex.getMessage());
            jtfIdM.setText("");
        }

    }//GEN-LAST:event_jbBuscarHCActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarFormulario();
        controladorDeCampos(true, false, false, false, false, false, false, false);
        controladorDeBotones(true, false, false, false, false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try {

            String alias = jtfAlias.getText();
            String sexo = jtfSexo.getText();
            String especie = jcbEspecie.getSelectedItem().toString();
            String raza = jtfRaza.getText();
            String color = jtfColores.getText();

            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            String fecha = formatoFecha.format(jdcFN.getDate());
            LocalDate fn = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            int dniCliente = Integer.parseInt(jtfDniDuenio.getText());
            c = cd.buscarClienteActivoPorDni(dniCliente);

            // Validación de campos vacíos
            if (alias.isEmpty() || sexo.isEmpty() || especie.isEmpty() || raza.isEmpty() || color.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ningún campo debe estar vacío.");
            } else {
                boolean activo = true; // Inicializo en true porque le estoy dando de alta
                Mascota m = new Mascota(alias, sexo, especie, raza, color, fn, c, activo);
                int numHC = md.guardarMascota(m);

                JOptionPane.showMessageDialog(this, "Historia Clinica Nº " + numHC + ". Extienda el carnet. ");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Números inválidos. " + ex.getMessage());

        }
        limpiarFormulario();
        controladorDeBotones(true, false, false, false, false);
        controladorDeCampos(true, false, false, false, false, false, false, false);


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        try {
            int idMascota = Integer.parseInt(jtfIdM.getText());
            Mascota mascota = md.buscarMascota(idMascota);

            if (mascota != null) {
                String alias = jtfAlias.getText();
                String sexo = jtfSexo.getText();
                String especie = jcbEspecie.getSelectedItem().toString();
                String raza = jtfRaza.getText();
                String color = jtfColores.getText();

                // Validación de campos no numéricos no vacíos
                if (alias.isEmpty() || sexo.isEmpty() || especie.isEmpty() || raza.isEmpty() || color.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ningún campo debe estar vacío.");
                } else {
                    // Validación de campos numéricos no vacíos
                    if (jtfDniDuenio.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "El DNI del dueño no puede estar vacio.");
                    } else {
                        // Si no hay campos vacíos, procede a actualizar los campos numéricos
                        try {
                            int dniDuenio = Integer.parseInt(jtfDniDuenio.getText());
                            c = cd.buscarClienteActivoPorDni(dniDuenio);

                            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
                            String fecha = formatoFecha.format(jdcFN.getDate());
                            LocalDate fn = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

                            mascota.setAlias(alias);
                            mascota.setSexo(sexo);
                            mascota.setEspecie(especie);
                            mascota.setRaza(raza);
                            mascota.setColores(color);
                            mascota.setfN(fn);
                            mascota.setCliente(c);
                            md.modificarMascota(mascota);

                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(this, "Los campos numéricos solo deben contener números.");
                        }
                    }
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El campo DNI debe contener un valor numérico válido.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscarHC;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcbEspecie;
    private com.toedter.calendar.JDateChooser jdcFN;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JTextField jtfAlias;
    private javax.swing.JTextField jtfColores;
    private javax.swing.JTextField jtfDniDuenio;
    private javax.swing.JTextField jtfIdM;
    private javax.swing.JTextField jtfRaza;
    private javax.swing.JTextField jtfSexo;
    // End of variables declaration//GEN-END:variables

    public void limpiarFormulario() {
        jtfIdM.setText("");
        jtfAlias.setText("");
        jtfSexo.setText("");
        jcbEspecie.setSelectedIndex(0);
        jtfRaza.setText("");
        jtfColores.setText("");
        jtfDniDuenio.setText("");
        jlEstado.setText("");
    }

    public void controladorDeBotones(boolean buId, boolean gua, boolean mod, boolean eli, boolean lim) {

        jbBuscarHC.setEnabled(buId);
        jbGuardar.setEnabled(gua);
        jbModificar.setEnabled(mod);
        jbEliminar.setEnabled(eli);
        jbLimpiar.setEnabled(lim);

    }

    public void controladorDeCampos(boolean idM, boolean al, boolean sex, boolean e, boolean ra, boolean col, boolean fn, boolean dniD) {

        jtfIdM.setEnabled(idM);
        jtfAlias.setEnabled(al);
        jtfSexo.setEnabled(sex);
        jcbEspecie.setEnabled(e);
        jtfRaza.setEnabled(ra);
        jtfColores.setEnabled(col);
        jdcFN.setEnabled(fn);
        jtfDniDuenio.setEnabled(dniD);
    }
}
