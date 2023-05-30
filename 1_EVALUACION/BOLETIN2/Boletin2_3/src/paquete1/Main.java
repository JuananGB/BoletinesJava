/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Main {
    
    public static void main(String[]args){
       
        
        float euro;
        float dolares=0;
        float conversion;
        
        
        euro=Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de euros: "));
        
        
       dolares=euro*0.10f;
       
        System.out.println(dolares);
        
        
        
    }
    
}
