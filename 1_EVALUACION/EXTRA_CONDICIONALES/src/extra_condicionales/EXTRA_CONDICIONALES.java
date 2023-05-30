/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class EXTRA_CONDICIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        
        if((numero>=1)&&(numero<=9)){
            JOptionPane.showMessageDialog(null, "1 cifra");   
        }
        if((numero>=10)&&(numero<=99)){
             JOptionPane.showMessageDialog(null, "2 cifras");  
        }
        if((numero>=100)&&(numero<=999)){
            JOptionPane.showMessageDialog(null, "3 cifras");
        }
        if((numero>=1000)&&(numero<=9999)){
            JOptionPane.showMessageDialog(null, "4 cifras");
        }
        if((numero>=10000)&&(numero<=99999)){
            JOptionPane.showMessageDialog(null, "5 cifras");
        }
           
    }
    
}
