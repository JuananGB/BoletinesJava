/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_3;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Boletin11_3 {
/*
  Implementa un programa que calcule o área dun 
  rectángulo cuxa base e altura pides por teclado .
  Asegurate que estos valores sexan positivos ,
  para eso valida os datos .     
*/    
    public static void main(String[] args) {
       
        int base=Integer.parseInt(JOptionPane.showInputDialog("Digite la base: "));
        int altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura: "));
        int area=0;
        
        if((base>0)&&(altura>0)){
            area=base*altura;
            JOptionPane.showMessageDialog(null, "El área de un rectángulo es: "+area);
        }
        else{
            JOptionPane.showMessageDialog(null, "El o los valores son negativos");
        }   
    }
    
}
