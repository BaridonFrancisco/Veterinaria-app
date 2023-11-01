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
//                   int fila=jtabla.getSelectedRow();
//                   int id=(Integer)jtabla.getValueAt(fila, 0);
//                   if(id>0){
//                       aux=obtenerTramiento(true);
//                       
//                       
//                       
//                       
//                       
//                   }
                    
                    
                    
                 

                }
            }

        });
        
        jtabla.getModel().addTableModelListener(new TableModelListener(){
            @Override
            public void tableChanged(TableModelEvent e) {
                
                try{
                
                
                }catch(NumberFormatException x){
                    
                    
                    
                }
                
                
                
               if(e.getType()==TableModelEvent.UPDATE){
//                   int filaSelecionada=jtabla.getSelectedRow();
//                     for (int columnas = 1; columnas < jtabla.getColumnCount(); columnas++) {
//                        Object obj = jtabla.getValueAt(filaSelecionada, columnas);
//                        
//                        
//                        if (obj != null) {
//                            System.out.println("1 "+obj);
//                            switch (columnas) {
//                                case 1:
//                                    System.out.println("caso1 "+obj);
//                                     String cadenas =(String) obj;
//                                    if(cadenas.isEmpty()){
//                                        throw new RuntimeException();
//                                    }
//                                    aux.setTipoTratamiento( (String)obj);
//                                    // System.out.println("columna 1 " + aux.getTipoTratamiento());
//                                    break;
//                                case 2:
//                                    System.out.println("caso2 "+obj);
//                                    String cadena =(String) obj;
//                                    if(cadena.isEmpty()){
//                                        throw new RuntimeException();
//                                    }
//                                    aux.setDescripcion( (String)obj);
//                                    // System.out.println("columna 2 " + aux.getDescripcion());
//                                    break;
//                                case 3:
//                                    //System.out.println("valor de obj columna 3"+obj);
//                                    //Double importeString = (String) obj;
////                                    Double valor=(Double) obj;
////                                    System.out.println(obj);
//                                    // System.out.println(importeString);
//                                    //Double importe = Double.valueOf(importeString);
////                                    System.out.println(valor);
//                                    System.out.println("caso3 "+obj);
//                                    Double valor = new Double (obj.toString());
//                                    if(valor<0){
//                                         throw new RuntimeException();
//                                    }
//                                    System.out.println(obj);
//                                    aux.setImporte(valor);
//                                    System.out.println("columna 3" + aux.getImporte());
//                                    break;
//                                default:
//                                    System.out.println("erro");
//                                    break;
//
//                            }
//
//                        }
//
//                    }
                      aux=obtenerTramiento(true);
                      aux.setActivo(true);
                      boolean validacion = aux.getImporte() > 0 && !aux.getDescripcion().isEmpty() && !aux.getDescripcion().isEmpty() && aux!=null;
                      if(validacion){
                          
                          int respuesta = JOptionPane.showConfirmDialog(null, "Desea modificar este tratamiento?Y?N", "Confirmacion", JOptionPane.YES_NO_OPTION);
                          if(respuesta==0){
                              System.out.println(aux.getIdTratamiento());
                              tradata.modificar(aux);
                              aux=null;
                              aux=new Tratamiento();
                          }
                          
                          
                          
                      }else{
                          
                          JOptionPane.showMessageDialog(null, "datos invalidos verifique","Advertencia",JOptionPane.WARNING_MESSAGE);
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
        jGuardar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtipoTratamiento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jImporte = new javax.swing.JTextField();

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

        jGuardar.setBackground(new java.awt.Color(0, 153, 51));
        jGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gurdarTratamiento.png"))); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jGuardar);

        jButton3.setBackground(new java.awt.Color(51, 255, 102));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons8-actualizar-16.png"))); // NOI18N
        jButton3.setText("Recargar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Administracion de tratamientos");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Tipo de tratamiento");

        jtipoTratamiento.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripcion");

        jDescripcion.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Importe");

        jImporte.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel3))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                        .addComponent(jtipoTratamiento, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtipoTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
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
       jDescripcion.setEditable(true);
       jtipoTratamiento.setEditable(true);
       jImporte.setEditable(true);
    }//GEN-LAST:event_jInsertarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        // TODO add your handling code here:
        try{
            if(comprobarCondiciones()){
                throw new RuntimeException("el importe nu puede ser menor a 0, y no pueden estar vacios los campos");
            }
            
        String tipoTratamiento=jtipoTratamiento.getText();
        String descripcion=jDescripcion.getText();
        Double importe=Double.valueOf(jImporte.getText());
        Tratamiento tratamiento=new Tratamiento();
        tratamiento.setTipoTratamiento(tipoTratamiento);
        tratamiento.setDescripcion(descripcion);
        tratamiento.setImporte(importe);
        tratamiento.setActivo(true);
        tradata.guardarTratamiento(tratamiento);
        limpiarTabla();
        CargarTratamientos();
        jDescripcion.setText("");
        jtipoTratamiento.setText("");
        jImporte.setText("");
        jDescripcion.setEditable(false);
       jtipoTratamiento.setEditable(false);
       jImporte.setEditable(false);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"No es un importe valido","Advertencia",JOptionPane.WARNING_MESSAGE);
            jImporte.setText("");
            
        }catch(RuntimeException e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Advertencia",JOptionPane.WARNING_MESSAGE);
            
        }
    

    }//GEN-LAST:event_jGuardarActionPerformed
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
          
        } else {
            JOptionPane.showMessageDialog(null, "No se puede borrar este elemento", "Ups", JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jBorrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        CargarTratamientos();
    }//GEN-LAST:event_jButton3ActionPerformed
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
    private boolean comprobarCondiciones(){
        String tipoTratamiento=jtipoTratamiento.getText();
        String descripcion=jDescripcion.getText();
        Double importe=Double.valueOf(jImporte.getText());
        if(tipoTratamiento.isEmpty() || descripcion.isEmpty()|| importe<=0){
             return true;
        }
        return false;
       
    }
    
    private <T>boolean comprobar (T t){
        if(t instanceof String){
            String valor=(String)t;
            
        }else if(t instanceof Double){
            
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBorrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jDescripcion;
    private javax.swing.JButton jGuardar;
    private javax.swing.JTextField jImporte;
    private javax.swing.JButton jInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField jtipoTratamiento;
    // End of variables declaration//GEN-END:variables
}
