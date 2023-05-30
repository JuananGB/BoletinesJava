/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_5;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int milla_marina=1852;
        int valor;
        
        int metros=0;
        
        valor=Integer.parseInt(JOptionPane.showInputDialog("Digite el n* de millas: "));
        
        
        metros=valor*milla_marina;
        
        
        System.out.println("Hay "+metros+" metros");
        
        
    }
    
}
