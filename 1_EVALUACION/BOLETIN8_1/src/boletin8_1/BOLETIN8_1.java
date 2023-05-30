/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin8_1;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class BOLETIN8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int productos;
        productos=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de productos vendidios en todo el año: "));
        
        if(productos<=100){
            JOptionPane.showMessageDialog(null, "O artigo de consumo é baixo");
            
        }
        if((productos>100)&&(productos<=500)){
            JOptionPane.showMessageDialog(null, "O artigo de consumo é medio"); 
        }
        if((productos>500)&&(productos<=1000)){
            JOptionPane.showMessageDialog(null, "O artigo de consumo é alto"); 
        }
        if(productos>1000){
            JOptionPane.showMessageDialog(null, "O artigo de consumo é primeira necesidade");
            
        }
        
    }
    
}
