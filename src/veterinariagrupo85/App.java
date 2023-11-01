/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package veterinariagrupo85;
import Vistas.Panel1;
import Vistas.Panel2;
import Vistas.PanelHome;
import Vistas.PanelOpciones;
import Vistas.PanelVisitas;
import Vistas.panelTratamiento;
import com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatMonokaiProIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.*;
/**
 *
 * @author Owner
 */
public class App extends javax.swing.JFrame {
    static String ruta="src/config/c.txt";
    private final String [] identificadores={
        "panelClientes","panelMascotas",
        "PanelTratamiento","PanelHome",
        "PanelVisitas","PanelOpciones"
  
    };
    Panel1 panel1;
    Panel2 panel2;
    PanelHome home;
    panelTratamiento panel3;
    PanelVisitas panelVisitas;
    CardLayout cardLayout;
    PanelOpciones panelOpciones;
    
    /**
     * Creates new form App
     */
    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Resources/pet.png")).getImage());
        //cardLayout=(CardLayout)panel1.getLayout();
        cardLayout=new CardLayout();
        panelCentral.setLayout(cardLayout);
        home=new PanelHome();
        panel2=new Panel2();
        panel1=new Panel1();
        panel3=new panelTratamiento();
        panelVisitas=new PanelVisitas();
        panelOpciones=new PanelOpciones();
        panelCentral.add(home,identificadores[3]); //home
        panelCentral.add(panel2,identificadores[1]); // mascotas
        panelCentral.add(panel1,identificadores[0]); // clientes
        panelCentral.add(panel3,identificadores[2]); // tratamientos
        panelCentral.add(panelVisitas,identificadores[4]); // visitas
        panelCentral.add(panelOpciones,identificadores[5]); // opciones
        setResizable(false);
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelIzquierdo =  new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon imageIcon = new ImageIcon("src\\Resources\\huesos7.jpg");
                Image image = imageIcon.getImage();

                g.drawImage(image, 0, 0,this);
            }
        };
        jClientes = new javax.swing.JButton();
        jMascotas = new javax.swing.JButton();
        jTratamientos = new javax.swing.JButton();
        jVisitas = new javax.swing.JButton();
        jHome = new javax.swing.JButton();
        jOpciones = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                ImageIcon imageIcon = new ImageIcon("src\\Resources\\huesos7.jpg");
                Image image = imageIcon.getImage();

                g.drawImage(image, 0, 0,this);
            }
        };
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria Patitas Felices");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JpanelIzquierdo.setBackground(new java.awt.Color(255, 255, 255));
        JpanelIzquierdo.setVerifyInputWhenFocusTarget(false);
        JpanelIzquierdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JpanelIzquierdoMouseEntered(evt);
            }
        });

        jClientes.setBackground(new java.awt.Color(255, 255, 255));
        jClientes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jClientes.setForeground(new java.awt.Color(0, 0, 0));
        jClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/customer.png"))); // NOI18N
        jClientes.setText("Clientes");
        jClientes.setBorder(null);
        jClientes.setBorderPainted(false);
        jClientes.setContentAreaFilled(false);
        jClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClientesActionPerformed(evt);
            }
        });

        jMascotas.setBackground(new java.awt.Color(255, 255, 255));
        jMascotas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMascotas.setForeground(new java.awt.Color(0, 0, 0));
        jMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pet_icon_244628.png"))); // NOI18N
        jMascotas.setText("Mascotas");
        jMascotas.setBorder(null);
        jMascotas.setBorderPainted(false);
        jMascotas.setContentAreaFilled(false);
        jMascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMascotasActionPerformed(evt);
            }
        });

        jTratamientos.setBackground(new java.awt.Color(255, 255, 255));
        jTratamientos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTratamientos.setForeground(new java.awt.Color(0, 0, 0));
        jTratamientos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/-local-hospital_90099.png"))); // NOI18N
        jTratamientos.setText("Tratamientos");
        jTratamientos.setBorder(null);
        jTratamientos.setBorderPainted(false);
        jTratamientos.setContentAreaFilled(false);
        jTratamientos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTratamientos.setFocusPainted(false);
        jTratamientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTratamientosActionPerformed(evt);
            }
        });

        jVisitas.setBackground(new java.awt.Color(255, 255, 255));
        jVisitas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jVisitas.setForeground(new java.awt.Color(0, 0, 0));
        jVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/phonendoscope_2786238.png"))); // NOI18N
        jVisitas.setText("Visitas");
        jVisitas.setBorder(null);
        jVisitas.setBorderPainted(false);
        jVisitas.setContentAreaFilled(false);
        jVisitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jVisitas.setFocusPainted(false);
        jVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisitasActionPerformed(evt);
            }
        });

        jHome.setBackground(new java.awt.Color(255, 255, 255));
        jHome.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jHome.setForeground(new java.awt.Color(0, 0, 0));
        jHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/home_icon-icons.com_73532.png"))); // NOI18N
        jHome.setText("Home");
        jHome.setBorder(null);
        jHome.setBorderPainted(false);
        jHome.setContentAreaFilled(false);
        jHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jHome.setFocusPainted(false);
        jHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeActionPerformed(evt);
            }
        });

        jOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jOpciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jOpciones.setForeground(new java.awt.Color(0, 0, 0));
        jOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/settings-cogwheel-button_icon-icons.com_72559.png"))); // NOI18N
        jOpciones.setText("Opciones");
        jOpciones.setBorder(null);
        jOpciones.setBorderPainted(false);
        jOpciones.setContentAreaFilled(false);
        jOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jOpciones.setFocusPainted(false);
        jOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpcionesActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Grupo  85");

        javax.swing.GroupLayout JpanelIzquierdoLayout = new javax.swing.GroupLayout(JpanelIzquierdo);
        JpanelIzquierdo.setLayout(JpanelIzquierdoLayout);
        JpanelIzquierdoLayout.setHorizontalGroup(
            JpanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelIzquierdoLayout.createSequentialGroup()
                        .addComponent(jTratamientos)
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(JpanelIzquierdoLayout.createSequentialGroup()
                        .addGroup(JpanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jVisitas)
                            .addComponent(jOpciones)
                            .addComponent(jHome, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JpanelIzquierdoLayout.setVerticalGroup(
            JpanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelIzquierdoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jClientes)
                .addGap(18, 18, 18)
                .addComponent(jMascotas)
                .addGap(18, 18, 18)
                .addComponent(jTratamientos)
                .addGap(18, 18, 18)
                .addComponent(jVisitas)
                .addGap(18, 18, 18)
                .addComponent(jOpciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        getContentPane().add(JpanelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 140, 420));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jSalir.setBackground(new java.awt.Color(255, 0, 51));
        jSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exit_icon-icons.com_70975.png"))); // NOI18N
        jSalir.setText("Salir");
        jSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 140, 60));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 590, 40));

        panelCentral.setLayout(new java.awt.CardLayout());
        getContentPane().add(panelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//clientes
    private void jClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClientesActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelCentral,identificadores[0]);

 
    }//GEN-LAST:event_jClientesActionPerformed

    private void JpanelIzquierdoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JpanelIzquierdoMouseEntered
        // TODO add your handling code here:
        System.out.println("boton");
        
          if (evt.getSource()==jHome) {
              JButton boton = (JButton) evt.getSource();
              boton.setBackground(new Color(51,51,51));
              System.out.println("hi");
                 
          }
    }//GEN-LAST:event_JpanelIzquierdoMouseEntered

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
        int re=JOptionPane.showConfirmDialog(this,"Desea realmente salir?","Salir",JOptionPane.YES_NO_OPTION);
        if(re==0){
            this.dispose();
            
        }
        
    }//GEN-LAST:event_jSalirActionPerformed
    //home
    private void jHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeActionPerformed
        // TODO add your handling code here:
            cardLayout.show(panelCentral,identificadores[3]);
        
    }//GEN-LAST:event_jHomeActionPerformed
    // mascotas
    private void jMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMascotasActionPerformed
        // TODO add your handling code here:
         cardLayout.show(panelCentral,identificadores[1]);
       
    }//GEN-LAST:event_jMascotasActionPerformed

    private void jTratamientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTratamientosActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelCentral,identificadores[2]);
       
        
    }//GEN-LAST:event_jTratamientosActionPerformed

    private void jVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisitasActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelCentral,identificadores[4]);
    }//GEN-LAST:event_jVisitasActionPerformed

    private void jOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpcionesActionPerformed
        // TODO add your handling code here:
        cardLayout.show(panelCentral,identificadores[5]);
    }//GEN-LAST:event_jOpcionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        // lookandFeel por defecto 
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
  try {
        // Establece el "look and feel" a FlatLaf
        String theme=leerArchivo(ruta);
        System.out.println(theme);
        
        switch (theme) {
          case "MonoKai":
              FlatMonokaiProIJTheme.setup();
              break;
            case "oneDarkPro":
                FlatOneDarkIJTheme.setup();
                break;
    
          default:
               UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
      }
        
        
        
       
         
    } catch (UnsupportedLookAndFeelException e) {
        e.printStackTrace();
    }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
      private static String leerArchivo(String path){
         StringBuilder cadena = new StringBuilder();
        try {
            List<String> resutado= Files.readAllLines(Paths.get(path));
            for(String l:resutado){
                cadena.append(l);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cadena.toString();
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelIzquierdo;
    private javax.swing.JButton jClientes;
    private javax.swing.JButton jHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jMascotas;
    private javax.swing.JButton jOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jSalir;
    private javax.swing.JButton jTratamientos;
    private javax.swing.JButton jVisitas;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
