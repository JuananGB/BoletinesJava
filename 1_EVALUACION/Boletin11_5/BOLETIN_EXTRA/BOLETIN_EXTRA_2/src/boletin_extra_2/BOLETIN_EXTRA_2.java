/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_extra_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class BOLETIN_EXTRA_2 {

    
    // Y = a X2 + bX + c 
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double y=0;
        
        double a=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de a: "));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de b: "));
        double c=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de c: "));
        double x=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));


                

        
       y=(a*Math.pow(x, 2)+(b*x)+c);
       
       JOptionPane.showMessageDialog(null,"El valor de y es: "+y);
        
    }
    
}
