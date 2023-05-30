/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n1: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n1: "));
        
        
        int suma=n1+n2;
        
        int resta=n1-n2;
        
        int mult=n1*n2;
        
        int div=n1/n2;
        
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La mult es: "+mult);
        System.out.println("La division es: "+div);
    }
    
}
