/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Boletin7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1,n2,n3;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n1: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n2: "));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n3: "));
        
        
        if((n1>n2)&&(n1>n3)){
            JOptionPane.showMessageDialog(null,"O maior é n1");
        }
        else if((n2>n1)&&(n2>n3)){
            JOptionPane.showMessageDialog(null,"O maior é n2");
        }
        else{
            JOptionPane.showMessageDialog(null,"O maior é n3");
        }
        
                
    }
    
}
