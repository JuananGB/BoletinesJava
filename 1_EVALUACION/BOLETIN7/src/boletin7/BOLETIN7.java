/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class BOLETIN7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        if(n1>0){
            JOptionPane.showMessageDialog(null, "O número é positivo");
        
     
        }
        else{
            JOptionPane.showMessageDialog(null, "O número é negativo");
        }
    
    
    
    
    
    }
    
}
