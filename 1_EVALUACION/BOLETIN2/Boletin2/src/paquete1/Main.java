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
        
        // Área dun Triángulo= (base*altura)/2
        
      int base,altura;
      int resultado=0;
      
      base=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de base: "));
      altura=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de altura: "));
      
      resultado=(base*altura)/2;
      
      
        System.out.println("El área dun triángulo es: "+resultado);
      
      
        
    }
    
}
