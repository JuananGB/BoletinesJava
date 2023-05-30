/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_5;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Boletin11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double sueldo=Double.parseDouble(JOptionPane.showInputDialog("Digite un sueldo: "));
        int n_trabajadores=0;
        int n_trabajadores_menos_sueldo=0;
        
        while(sueldo>0){
            sueldo=Double.parseDouble(JOptionPane.showInputDialog("Digite otro sueldo: "));
            if((sueldo>=1000)&&(sueldo<=1750)){
                n_trabajadores++;   
            }
            else if(sueldo<1000){
                n_trabajadores_menos_sueldo++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El número de trabajadores con sueldos entre 1000 y 1750 son de: "+n_trabajadores);
        JOptionPane.showMessageDialog(null, "El número de trabajadores con un sueldo inferior a 1000€ son: "+n_trabajadores_menos_sueldo);
        
    }
    
}
