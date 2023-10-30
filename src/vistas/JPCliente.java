package vistas;

import entidades.*;
import data.*;
import javax.swing.JOptionPane;

/**
 * @author Veronica
 */
public class JPCliente extends javax.swing.JPanel {

    private ClienteData cd = new ClienteData();

    public JPCliente() {
        initComponents();
        controladorDeCampos(true, false, false, false, false, false, false);
        controladorDeBotones(true, false, false, false, false, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jtfTelAlt = new javax.swing.JTextField();
        jtfApellido = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfDireccion = new javax.swing.JTextField();
        jtfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jlEstado = new javax.swing.JLabel();
        jtfNombreAlt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jbReActivaCliente = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("JPCliente"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 26)); // NOI18N
        jLabel1.setText("Cliente");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("DNI");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Nombre");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Dirección");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Telefono");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("(nombre)");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jtfDni.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jtfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 320, 40));

        jtfTelAlt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jtfTelAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 320, 40));

        jtfApellido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jtfApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 320, 40));

        jtfNombre.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 320, 40));

        jtfDireccion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jtfDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 320, 40));

        jtfTelefono.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jtfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 320, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Telefono 2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("Buscar");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 50, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_search_black_24dp.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 50, 40));

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 180, 60));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setText("Dar de Baja");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_delete_black_24dp.png"))); // NOI18N
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 40, 40));

        jbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 180, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_face_black_36dp.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_save_black_24dp_1.png"))); // NOI18N
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 50, 40));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("Guardar Nuevo");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 100, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_published_with_changes_black_24dp.png"))); // NOI18N
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 50, 40));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel16.setText("Modificar");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 70, 20));

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbGuardar.setBorder(null);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 180, 60));

        jlEstado.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 170, 20));

        jtfNombreAlt.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        add(jtfNombreAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 320, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("Contacto 2");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 277, -1, 10));

        jbModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 180, 60));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setText("Limpiar");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 50, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_cleaning_services_black_24dp.png"))); // NOI18N
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 50, 40));

        jbLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 180, 60));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setText("Reactivar");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/outline_restart_alt_black_24dp.png"))); // NOI18N
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 40, 40));

        jbReActivaCliente.setBackground(new java.awt.Color(255, 255, 255));
        jbReActivaCliente.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jbReActivaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReActivaClienteActionPerformed(evt);
            }
        });
        add(jbReActivaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 180, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            int dniBuscado = Integer.parseInt(jtfDni.getText());
            Cliente cliente = cd.buscarTodoClientePorDni(dniBuscado);

            if (cliente != null) {            //se encontró el cliente en la BD
                controladorDeCampos(false, true, true, true, true, true, true);
                jtfApellido.setText(cliente.getApellido());
                jtfNombre.setText(cliente.getNombre());
                jtfDireccion.setText(cliente.getDireccion());
                jtfTelefono.setText(cliente.getTelefono() + "");
                jtfNombreAlt.setText(cliente.getNombreAlt());
                jtfTelAlt.setText(cliente.getContAlt() + "");

                if (cliente.isActivo()) {
                    jlEstado.setText("Cliente   Activo");
                    controladorDeBotones(false, false, true, true, true, false);
                } else {
                    jlEstado.setText("Cliente   Inactivo");
                    controladorDeCampos(false, false, false, false, false, false, false);
                    controladorDeBotones(false, false, false, false, true, true);
                }

            } else {       //la BD no devuelve cliente con ese DNI
                JOptionPane.showMessageDialog(this, " Si desea guardar el nuevo Cliente complete TODOS los campos.");
                controladorDeCampos(false, true, true, true, true, true, true);
                controladorDeBotones(false, true, false, false, true, false);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El DNI solo debe contener números. " + ex.getMessage());
            jtfDni.setText("");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int dni = Integer.parseInt(jtfDni.getText());

        try {

            String apellido = jtfApellido.getText();
            String nombre = jtfNombre.getText();
            String direccion = jtfDireccion.getText();
            int telefono = Integer.parseInt(jtfTelefono.getText());
            String nombreAlt = jtfNombreAlt.getText();
            int contAlt = Integer.parseInt(jtfTelAlt.getText());

            // Validación de campos vacíos
            if (apellido.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || nombreAlt.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ningún campo debe estar vacío.");
            } else {
                Boolean activo = true; // Inicializo en true porque le estoy dando de alta
                Cliente clienteNuevo = new Cliente(dni, apellido, nombre, direccion, telefono, nombreAlt, contAlt, activo);
                cd.guardarCliente(clienteNuevo);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los telefonos solo deben contener números. " + ex.getMessage());
            jtfTelefono.setText("");
            jtfTelAlt.setText("");
        }
        limpiarFormulario();

        controladorDeCampos(true, false, false, false, false, false, false);
        controladorDeBotones(true, false, false, false, true, false);
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        try {
            int dni = Integer.parseInt(jtfDni.getText());
            Cliente cb = cd.buscarClienteActivoPorDni(dni); // cb = clienteBuscado

            if (cb != null) {
                String apellido = jtfApellido.getText();
                String nombre = jtfNombre.getText();
                String direccion = jtfDireccion.getText();
                String nombreAlt = jtfNombreAlt.getText();

                // Validación de campos no numéricos no vacíos
                if (apellido.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || nombreAlt.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Ningún campo debe estar vacío.");
                } else {
                    // Validación de campos numéricos no vacíos
                    if (jtfTelefono.getText().isEmpty() || jtfTelAlt.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Los campos no deben estar vacíos.");
                    } else {
                        // Si no hay campos vacíos, procede a actualizar los campos numéricos
                        try {
                            int telefono = Integer.parseInt(jtfTelefono.getText());
                            int contAlt = Integer.parseInt(jtfTelAlt.getText());
                            cb.setApellido(apellido);
                            cb.setNombre(nombre);
                            cb.setDireccion(direccion);
                            cb.setTelefono(telefono);
                            cb.setNombreAlt(nombreAlt);
                            cb.setContAlt(contAlt);
                            cd.modificar(cb);
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

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarFormulario();
        controladorDeCampos(true, false, false, false, false, false, false);
        controladorDeBotones(true, false, false, false, true, false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int dniAEliminar = Integer.parseInt(jtfDni.getText());
        Cliente clienteAEliminar = cd.buscarClienteActivoPorDni(dniAEliminar);  //este método trae solo alumnos activos 

        if (clienteAEliminar != null) {
            cd.eliminarCliente(clienteAEliminar.getIdCliente());
        }
        limpiarFormulario();
        controladorDeCampos(true, false, false, false, false, false, false);
        controladorDeBotones(true, false, false, false, true, false);
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbReActivaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReActivaClienteActionPerformed
        int dniAReactivar = Integer.parseInt(jtfDni.getText());
        cd.activarCliente(dniAReactivar);
        limpiarFormulario();
        controladorDeCampos(true, false, false, false, false, false, false);
        controladorDeBotones(true, false, false, false, true, false);
    }//GEN-LAST:event_jbReActivaClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbReActivaCliente;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfDireccion;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNombreAlt;
    private javax.swing.JTextField jtfTelAlt;
    private javax.swing.JTextField jtfTelefono;
    // End of variables declaration//GEN-END:variables

    public void limpiarFormulario() {

        jtfDni.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        jtfDireccion.setText("");
        jtfTelefono.setText("");
        jtfNombreAlt.setText("");
        jtfTelAlt.setText("");
        jlEstado.setText("");
    }

    public void controladorDeBotones(boolean buscar, boolean gua, boolean mod, boolean eli, boolean lim, boolean act) {

        jbBuscar.setEnabled(buscar);
        jbGuardar.setEnabled(gua);
        jbModificar.setEnabled(mod);
        jbEliminar.setEnabled(eli);
        jbLimpiar.setEnabled(lim);
        jbReActivaCliente.setEnabled(act);
    }

    public void controladorDeCampos(boolean d, boolean a, boolean n, boolean dire, boolean tel, boolean nalt, boolean talt) {
        jtfDni.setEnabled(d);
        jtfApellido.setEnabled(a);
        jtfNombre.setEnabled(n);
        jtfDireccion.setEnabled(dire);
        jtfTelefono.setEnabled(tel);
        jtfNombreAlt.setEnabled(nalt);
        jtfTelAlt.setEnabled(talt);
    }
}
