/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import Data.TratamientoData;
import Entidades.Tratamiento;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Owner
 */
public class panelTratamiento extends javax.swing.JPanel {

    /**
     * Creates new form panelTratamiento
     */
    boolean insertar = false;
    boolean modoModificacion = true;
    boolean finInsercion = false;
    Tratamiento aux = new Tratamiento();
    boolean bloquearSeleccion = false;
    TratamientoData tradata = new TratamientoData();
    DefaultTableModel modelo = new DefaultTableModel(new Object[]{
        "ID", "Tipo Tratamiento",
        "Descripcion", "Importe"
    }, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            if (bloquearSeleccion) {
                int ultimaFila = jtabla.getRowCount() - 1;
                int idColumna = 0;
                return column > idColumna && ultimaFila == row;
            }
            return column > 0;
        }

    };

    public panelTratamiento() {
        initComponents();
        jtabla.setModel(modelo);
        jtabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        CargarTratamientos();

        //evento de seleccion bloquea la seleccion cuando se inserte una fila
         jtabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {

                    try {
                        if (bloquearSeleccion) {
                            jtabla.getSelectionModel().setSelectionInterval(jtabla.getRowCount() - 1, jtabla.getRowCount() - 1);
                        }

                    } catch (NullPointerException ex) {

                        JOptionPane.showMessageDialog(null, "Ha ocurrido puntero vacio", "NullPointerException", JOptionPane.ERROR_MESSAGE);

                    } catch (RuntimeException ex) {

                        JOptionPane.showMessageDialog(null, "Debe completar los campos", "form", JOptionPane.WARNING_MESSAGE);
                    }

                }
            }

        });
        
        //->
        jtabla.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    System.out.println("evento de actualizacion");
                    int fila = e.getLastRow();
                    for (int columnas = 1; columnas < jtabla.getColumnCount(); columnas++) {
                        Object obj = jtabla.getValueAt(fila, columnas);
                        if (obj != null) {
                            System.out.println("1 "+obj);
                            switch (columnas) {
                                case 1:
                                    System.out.println("caso1 "+obj);
                                    aux.setTipoTratamiento( (String)obj);
                                    // System.out.println("columna 1 " + aux.getTipoTratamiento());
                                    break;
                                case 2:
                                    System.out.println("caso2 "+obj);
                                    aux.setDescripcion( (String)obj);
                                    // System.out.println("columna 2 " + aux.getDescripcion());
                                    break;
                                case 3:
                                    //System.out.println("valor de obj columna 3"+obj);
                                    //Double importeString = (String) obj;
//                                    Double valor=(Double) obj;
//                                    System.out.println(obj);
                                    // System.out.println(importeString);
                                    //Double importe = Double.valueOf(importeString);
//                                    System.out.println(valor);
                                    System.out.println("caso3 "+obj);
                                    Double valor = new Double (obj.toString());
                                    System.out.println(obj);
                                    aux.setImporte(valor);
                                    System.out.println("columna 3" + aux.getImporte());
                                    break;
                                default:
                                    System.out.println("erro");
                                    break;

                            }

                        }

                    }
//                    System.out.println(aux.getIdTratamiento());
//                    System.out.println(aux.getTipoTratamiento());
//                    System.out.println(aux.getDescripcion());
//                    System.out.println(aux.getImporte());

                    boolean validacion = aux.getImporte() > 0 && !aux.getDescripcion().isEmpty() && !aux.getDescripcion().isEmpty();
                    if (validacion && insertar) {
                        System.out.println("insercion Interna");
                        int opc = JOptionPane.showConfirmDialog(null, "Desea insertar estos datos?Y/N", "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (opc == 0) {
                            aux.setActivo(true);
                            tradata.guardarTratamiento(aux);
                            limpiarTabla();
                            CargarTratamientos();
                            finInsercion = true;
                            bloquearSeleccion = false;
                            aux = null;
                            aux = new Tratamiento();
                            jtabla.clearSelection();

                        }
                    } else if (modoModificacion) {
                        Tratamiento tratamiento = obtenerTramiento(true);
                        int respuesta = JOptionPane.showConfirmDialog(null, "Desea modificar este tratamiento?Y?N", "Confirmacion", JOptionPane.YES_NO_OPTION);

                        if (validacion && tratamiento.getIdTratamiento() > 0 && respuesta == 0) {
                            tradata.modificar(tratamiento);
                        } else {
                            JOptionPane.showMessageDialog(null, "Operacion abortada", "Mensaje", JOptionPane.WARNING_MESSAGE);
                        }

                    }

                } else if (e.getType() == TableModelEvent.INSERT) {
                    if (aux == null) {
                        aux = new Tratamiento();
                    }
                    finInsercion = false;
                    insertar = true;
                    modoModificacion = false;
                    System.out.println("evento de insercion");
                    if (!finInsercion) {
                        bloquearSeleccion = true;
                    }

                }
            }

        });
        
         
 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBorrar = new javax.swing.JButton();
        jInsertar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtabla);

        jPanel2.setLayout(new java.awt.GridLayout(1, 5, 2, 0));

        jBorrar.setBackground(new java.awt.Color(255, 0, 51));
        jBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/borraTabla.png"))); // NOI18N
        jBorrar.setText("Borrar");
        jBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(jBorrar);

        jInsertar.setBackground(new java.awt.Color(0, 255, 0));
        jInsertar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jInsertar.setForeground(new java.awt.Color(255, 255, 255));
        jInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/InsertarTabla.png"))); // NOI18N
        jInsertar.setText("Insertar");
        jInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertarActionPerformed(evt);
            }
        });
        jPanel2.add(jInsertar);

        jButton3.setBackground(new java.awt.Color(51, 255, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-actualizar-16.png"))); // NOI18N
        jButton3.setText("Recargar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton3);

        jCancelar.setBackground(new java.awt.Color(153, 153, 153));
        jCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-cancelar-16.png"))); // NOI18N
        jCancelar.setText("Cancerlar");
        jCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jCancelar);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Administracion de tratamientos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //Inserta una nueva fila a la tabla
    private void jInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertarActionPerformed
        // TODO add your handling code here:
        modelo.addRow(new Object[]{});
        jtabla.setRowSelectionInterval(jtabla.getRowCount()-1, jtabla.getRowCount()-1);
        jtabla.setColumnSelectionInterval(1,jtabla.getColumnCount()-1);
    }//GEN-LAST:event_jInsertarActionPerformed

    private void jCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelarActionPerformed
        // TODO add your handling code here:
         int fila = jtabla.getSelectedRow();
        if (fila != -1) {
            modelo.removeRow(fila);
            bloquearSeleccion = false;
            modoModificacion = true;
            insertar = false;
            jtabla.clearSelection();
        }

    }//GEN-LAST:event_jCancelarActionPerformed
    //boton borrar
    private void jBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBorrarActionPerformed
        // TODO add your handling code here:
             Tratamiento auxiliar = obtenerTramiento(true);
        if (auxiliar != null) {
            tradata.eliminar(auxiliar.getIdTratamiento());
            limpiarTabla();
            CargarTratamientos();
            jtabla.clearSelection();
            bloquearSeleccion = false;
            //_>
            modoModificacion = true;
            insertar = false;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede borrar este elemento", "Ups", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jBorrarActionPerformed
    //Carga todos los tratamientos activos
    private void CargarTratamientos() {
        ArrayList<Tratamiento> listaTratamientos = tradata.ListaTrata();
        for (Tratamiento t : listaTratamientos) {
            modelo.addRow(new Object[]{
                t.getIdTratamiento(),
                t.getTipoTratamiento(),
                t.getDescripcion(),
                t.getImporte()
            });

        }

    }

    private Tratamiento obtenerTramiento(boolean id) {
        Tratamiento auxiliar = new Tratamiento();
        try {
            int val = id ? 0 : 1;
            int fila = jtabla.getSelectedRow();
            int columna = jtabla.getSelectedColumn();
            if (fila != -1 && columna != -1) {

                for (int columnas = val; columnas < jtabla.getColumnCount(); columnas++) {
                    Object obj = jtabla.getValueAt(fila, columnas);
//                    if (obj == null) {
//                        throw new RuntimeException("El objeto es nulo");
//                    }
                    switch (columnas) {
                        case 0:
                            auxiliar.setIdTratamiento((Integer) obj);
                            break;
                        case 1:
                            auxiliar.setTipoTratamiento((String) obj);
                            break;
                        case 2:
                            auxiliar.setDescripcion((String) obj);
                            break;
                        default:
                            auxiliar.setImporte((Double) obj);
                            break;
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ningun elemento", "error", JOptionPane.WARNING_MESSAGE);

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + ex.getMessage(), "Info", JOptionPane.WARNING_MESSAGE);
        }
        return auxiliar;
    }

    private void limpiarTabla() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBorrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jCancelar;
    private javax.swing.JButton jInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    // End of variables declaration//GEN-END:variables
}
