/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_extra_3;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class BOLETIN_EXTRA_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        double a,b,c;
        double x_1=0f;
        double x_2=0f;
        
        a=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de a: "));
        b=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de b: "));
        c=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de c: "));
        
        
        
        x_1=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        x_2=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        
        JOptionPane.showMessageDialog(null,"x: "+x_1);
        JOptionPane.showMessageDialog(null,"x: "+x_2);
        
        
        
        
        
    }
    
}
