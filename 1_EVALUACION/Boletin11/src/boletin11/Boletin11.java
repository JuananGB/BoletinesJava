/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int conteo_p=0;
        int conteo_n=0;
        
        while(numero!=0){
           numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
            if(numero>0){
                conteo_p++;        
            }
            else if(numero<0){
                conteo_n++;   
            }
        }
        
          JOptionPane.showMessageDialog(null, "La cantidad de números positivos es: "+conteo_p);
          JOptionPane.showMessageDialog(null, "La cantidad de numeros negativos es: "+conteo_n);
       
        
        
       
        
         
        
    }
    
}
