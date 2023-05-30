/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int euros;
        
        euros=Integer.parseInt(JOptionPane.showInputDialog("Digite ña cantidad total de euros: "));
        
     //CANTIDAD DE BILLETES E MOEDAS  DE CADA DÍGITO
       
       int calculo_billete_tres;
       int calculo_billete_dos;
       int calculo_billete_un;
       int calculo_moeda;
      
       
       calculo_billete_tres=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de billetes de 100€: "));
       calculo_billete_dos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de billetes de 20€: "));
       calculo_billete_un=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de billetes de 5€: "));
       calculo_moeda=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de moedad de 1€: "));
       
       
       
     
        
       
       //BILLETES POR DEFECTO
        
       int billete_tres_digitos=100;
       int billete_dos_digitos=20;
       int billete_un_digito=5;
       int moeda=1;
       
     
       
       
      
       
        System.out.println(calculo_billete_tres+"*"+billete_tres_digitos+","+calculo_billete_dos+"*"+billete_dos_digitos+","+calculo_billete_un+"*"+billete_un_digito+","+calculo_moeda+"*"+moeda+"="+euros);
        
      
        
    }
    
}
