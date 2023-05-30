/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_4;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Boletin11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int contador=0;
        int resultado=0;
     
      
        while(numero>0){
          
            contador++;  
            resultado=numero*contador;
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        
        System.out.println(resultado);
        
        
        
        
    }
    
}
