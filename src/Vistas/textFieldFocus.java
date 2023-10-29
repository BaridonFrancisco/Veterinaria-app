/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author Owner
 */
public class textFieldFocus implements FocusListener{
    
   
    
    
    

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("foucs ganado");
        //Panel1.cadena=new StringBuilder();
        
    }

    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("focus perdido");
    }
    
}
