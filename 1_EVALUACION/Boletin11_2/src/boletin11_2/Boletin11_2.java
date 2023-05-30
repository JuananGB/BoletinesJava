/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_2;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Boletin11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int suma=0;
        int mult=1;
        
        while(numero>=10 && numero<=90){
           numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
           suma=suma+numero;
           mult=mult*numero;
             
        }
        
        JOptionPane.showMessageDialog(null, "La suma de todo los números entre 10-90 es: "+suma);
        JOptionPane.showMessageDialog(null, "La multiplicación de todos los números entre 10-90 es: "+mult);
   
       if(numero<10){
           JOptionPane.showMessageDialog(null, "Valor fuera del rango.");
       }
    
    
    
    
    }
    
}
