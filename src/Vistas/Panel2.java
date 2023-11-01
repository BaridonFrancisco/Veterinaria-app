/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Data.ClienteData;
import Data.MascotaData;
import Entidades.Cliente;
import Entidades.Mascota;
import java.awt.CardLayout;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class Panel2 extends javax.swing.JPanel {

    /**
     * Creates new form Panel2
     */
    private final String CREAR_CLIENTE = "panelCliente";
    ButtonGroup grupoBotones = new ButtonGroup();
    ClienteData dataCliente = new ClienteData();
    MascotaData dataMascota = new MascotaData();
  

    public Panel2() {
        initComponents();
        jEliminar.setEnabled(false);
        jModificar.setEnabled(false);
        jGuardar.setEnabled(true);

        grupoBotones.add(jActivo);
        grupoBotones.add(jInactivo);
        jActivo.setSelected(true);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcomboMascotas = new javax.swing.JComboBox<>();
        idCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idMascota = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jAlias = new javax.swing.JTextField();
        jSexo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEspecie = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jColor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRaza = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JFecha = new com.toedter.calendar.JDateChooser();
        jPeso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jActivo = new javax.swing.JRadioButton();
        jInactivo = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jBuscar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/huesoFormulario.png"))); // NOI18N
        jLabel13.setText("Formulario Mascotas");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Dni ");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Mascotas");

        jcomboMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboMascotasActionPerformed(evt);
            }
        });

        idCliente.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("ID Cliente");

        idMascota.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("ID Mascota");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Alias");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Especie");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Color");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Fecha Nacimiento");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Raza");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Peso");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Estado");

        jActivo.setText("Activo");

        jInactivo.setText("Inactivo");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 15, 7));

        jBuscar.setBackground(new java.awt.Color(51, 51, 255));
        jBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gatoBuscar.png"))); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscar);

        jEliminar.setBackground(new java.awt.Color(255, 0, 51));
        jEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gatoBorrar.png"))); // NOI18N
        jEliminar.setText("Eliminar");
        jEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jEliminar);

        jGuardar.setBackground(new java.awt.Color(51, 255, 51));
        jGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gatoGuardar.png"))); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jGuardar);

        jModificar.setBackground(new java.awt.Color(204, 0, 255));
        jModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jModificar.setForeground(new java.awt.Color(255, 255, 255));
        jModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gatoEditar.png"))); // NOI18N
        jModificar.setText("Modificar");
        jModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jModificar);

        jLimpiar.setBackground(new java.awt.Color(255, 51, 204));
        jLimpiar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jLimpiar.setText("Limpiar");
        jLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jLimpiar);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcomboMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jActivo)
                                .addGap(18, 18, 18)
                                .addComponent(jInactivo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(21, 21, 21)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                    .addComponent(idMascota))))))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcomboMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(idMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(jPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jActivo)
                    .addComponent(jInactivo)
                    .addComponent(jColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        // TODO add your handling code here:
        try {
            int dni = Integer.parseInt(jDni.getText());
            Cliente cliente = dataCliente.buscarDni(dni);
            Mascota mascota = new Mascota();
            if (cliente != null) {
                if (comprobacionesFinales()) {
                    throw new RuntimeException("ups datos vacios o invalidos");

                }
                LocalDate fecha = JFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                mascota.setAlias(jAlias.getText());
                mascota.setColorPelo(jColor.getText());
                mascota.setEspecie(jEspecie.getText());
                mascota.setRaza(jRaza.getText());
                mascota.setSexo(jSexo.getText());
                mascota.setPesoPromedio(Double.parseDouble(jPeso.getText()));
                mascota.setFechaN(fecha);
                mascota.setActivo(jActivo.isSelected());
                mascota.setCliente(cliente);
                dataMascota.guardarMascota(mascota);

            } else {

                int opc = JOptionPane.showConfirmDialog(null, "el Cliente no existe desea crear uno nuevo? Y/N", "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
                if (opc == 0) {
                        VentanaCliente ventana=new VentanaCliente();
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                } else {
                    limpiarCampos();
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No ha ingresado un un numero" + e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);

        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

        }


    }//GEN-LAST:event_jGuardarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        // TODO add your handling code here:

        try {

            if (jcomboMascotas.getItemCount() > 0) {
                jcomboMascotas.removeAllItems();
            }
            int dni = Integer.parseInt(jDni.getText());
            Cliente cliente = dataCliente.buscarDni(dni);
            if (cliente != null) {
                idCliente.setText("" + cliente.getIdCliente());
                cargarComboBox();
                jGuardar.setEnabled(true);
                jEliminar.setEnabled(true);
                jModificar.setEnabled(true);
            } else {
                int opc = JOptionPane.showConfirmDialog(null, "el Cliente no existe desea crear uno nuevo? Y/N", "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
                if (opc == 0) {
                    VentanaCliente ventana = new VentanaCliente();
                    ventana.setVisible(true);
                    ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                } else {
                    limpiarCampos();
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Advertencia debe ingresar un numero", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_jBuscarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
        dataMascota.eliminar(Integer.parseInt(idMascota.getText()));
        jEliminar.setEnabled(false);


    }//GEN-LAST:event_jEliminarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        jGuardar.setEnabled(true);
        jEliminar.setEnabled(false);
        jModificar.setEnabled(false);
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jcomboMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboMascotasActionPerformed
        // TODO add your handling code here:
        Mascota mascota = (Mascota) jcomboMascotas.getSelectedItem();
        if (mascota != null) {
            idMascota.setText("" + mascota.getIdMascota());
            jSexo.setText(mascota.getSexo());
            jEspecie.setText(mascota.getEspecie());
            jColor.setText(mascota.getColorPelo());
            jRaza.setText(mascota.getRaza());
            jPeso.setText("" + mascota.getPesoPromedio());
            JFecha.setDate(Date.valueOf(mascota.getFechaN()));
            jAlias.setText(mascota.getAlias());
            if (mascota.isActivo()) {
                jActivo.setSelected(true);
            } else {
                jInactivo.setSelected(true);
            }

        }


    }//GEN-LAST:event_jcomboMascotasActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        // TODO add your handling code here:

        try {

            Mascota mascota = new Mascota();
            Cliente cliente = dataCliente.buscarDni(Integer.parseInt(jDni.getText()));
            int idm = Integer.parseInt(idMascota.getText());
            if (cliente != null && idm > 0) {

                boolean val = comprobacionesFinales();
                System.out.println(val);
                if (val) {

                    throw new RuntimeException("");

                }
                mascota.setIdMascota(idm);
                mascota.setAlias(jAlias.getText());
                mascota.setColorPelo(jColor.getText());
                mascota.setEspecie(jEspecie.getText());
                LocalDate fecha = JFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                mascota.setFechaN(fecha);
                mascota.setPesoPromedio(Double.valueOf(jPeso.getText()));
                mascota.setRaza(jRaza.getText());
                mascota.setSexo(jSexo.getText());
                mascota.setCliente(cliente);
                mascota.setActivo(jActivo.isSelected());

                dataMascota.modificar(mascota);

            } else {

                JOptionPane.showMessageDialog(null, "EL cliente no existe o su id busquelo porfavor", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "El dni no debe estar vacio", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        } catch (RuntimeException e) {

            JOptionPane.showMessageDialog(null, "los datos que intenta modificar no son validos", "Mensaje", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_jModificarActionPerformed

    private boolean comprobacionesFinales() {
        int dni = Integer.parseInt(jDni.getText());
        String alias = jAlias.getText();
        String colorPelo = jColor.getText();
        String especies = jEspecie.getText();
        String sexo = jSexo.getText();
        String razaS = jRaza.getText();
        String dniLongitud = jDni.getText();
        LocalDate fecha = JFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // LocalDate fecha2 = jdFechaN.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        double promedios = Double.parseDouble(jPeso.getText());

        boolean condicion = alias.isEmpty() || colorPelo.isEmpty() || especies.isEmpty() || sexo.isEmpty() || razaS.isEmpty()
                || promedios < 0 || !comprobarValores(alias) || !comprobarValores(colorPelo) || !comprobarValores(especies)
                || !comprobarValores(sexo) || !comprobarValores(razaS) || dniLongitud.length() != 8 || fecha == null;

        return condicion;

    }

    private boolean comprobarValores(String nombre) {

        Pattern patronNombre = Pattern.compile("^[a-zA-Z ]+$");
        Matcher matcher = patronNombre.matcher((String) nombre);

        return matcher.matches();

    }

    private void limpiarCampos() {
        jColor.setText("");
        jEspecie.setText("");
        idMascota.setText("");
        jPeso.setText("");
        jRaza.setText("");
        jSexo.setText("");
        idCliente.setText("");
        JFecha.setDate(null);
        jDni.setText("");
        jcomboMascotas.removeAllItems();
        jAlias.setText("");
        jActivo.setSelected(true);

    }

    private void cargarComboBox() {

        Cliente cliente = dataCliente.buscarDni(Integer.parseInt(jDni.getText()));
        int clienteId = cliente.getIdCliente();
        if (cliente != null) {
            ArrayList<Mascota> listmascota = new ArrayList<>(dataMascota.buscarMascotaPIdCliente(clienteId));
            for (Mascota m : listmascota) {
                jcomboMascotas.addItem(m);
            }

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JFecha;
    private javax.swing.JTextField idCliente;
    private javax.swing.JTextField idMascota;
    private javax.swing.JRadioButton jActivo;
    private javax.swing.JTextField jAlias;
    private javax.swing.JButton jBuscar;
    private javax.swing.JTextField jColor;
    private javax.swing.JTextField jDni;
    private javax.swing.JButton jEliminar;
    private javax.swing.JTextField jEspecie;
    private javax.swing.JButton jGuardar;
    private javax.swing.JRadioButton jInactivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jPeso;
    private javax.swing.JTextField jRaza;
    private javax.swing.JTextField jSexo;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox<Mascota> jcomboMascotas;
    // End of variables declaration//GEN-END:variables

}
