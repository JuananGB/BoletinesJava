/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int temperatura;
        
        float Kelvin=0F;
        float Fahrenheit=0f;
        
        temperatura=Integer.parseInt(JOptionPane.showInputDialog("Digite una cantidad de temperatura en grados C*: "));
        
        
        
        Kelvin=temperatura+273;
        
        System.out.println("La cantidad en Kelvin es: "+Kelvin+" K");
        
        Fahrenheit=(temperatura*1.8f)+32f;
        
        
        System.out.println("La cantidad en fahrenheit es: "+Fahrenheit+" F");
        
        
    }
    
}
