/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class BOLETIN7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      //NOMBRE
        
       String n1="Laura";
       String n2="Lucia";
       
      //PESO
       
       float peso1;  //PESO DE LAURA
       float peso2; // PESO DE LUCÍA
       float dif_peso=0f;
       
       peso1=Float.parseFloat(JOptionPane.showInputDialog("Digite el peso de Laura: "));
       peso2=Float.parseFloat(JOptionPane.showInputDialog("Digite el peso de Lucía: "));
       
       if(peso1>peso2){
           JOptionPane.showMessageDialog(null, "Pesa más Laura");
           dif_peso=peso1-peso2; 
           JOptionPane.showMessageDialog(null, "\nLa diferencia entre los dos pesos es de: "+dif_peso+" Kilos"); 
       }
       else if(peso2>peso1){
           JOptionPane.showMessageDialog(null, "Pesa más Lucía");
           dif_peso=peso2-peso1;
           JOptionPane.showMessageDialog(null, "\nLa diferencia entre los dos pesos es de: "+dif_peso+" Kilos");
           
       }
       
    }
    
}
