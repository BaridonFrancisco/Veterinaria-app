/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Owner
 */
public class PanelFondo extends JPanel{
    private ImageIcon imagenFondo;
    
    public PanelFondo(String ruta){
        this.imagenFondo=new ImageIcon(ruta);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paint(g);
        Image imagen=this.imagenFondo.getImage();
         g.drawImage(imagen, 0, 0, this.getWidth(), this.getHeight(), this);
        
    }
}
