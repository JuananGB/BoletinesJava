/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Boletin17 {
    public static void main(String []args){
        
        float nota_practica=Float.parseFloat(JOptionPane.showInputDialog("Digite tu nota del examen práctico: "));
        float nota_escrita_1=Float.parseFloat(JOptionPane.showInputDialog("Digite tu nota del primer examen escrito: "));
        float nota_escrita_2=Float.parseFloat(JOptionPane.showInputDialog("Digite tu nota del segundo examen escrito: "));
        float nota_escrita=0;
        float boletin=Float.parseFloat(JOptionPane.showInputDialog("Digite tu nota de los boletines: "));
        float boletin_puntuacion=0;
        float nota_final;
        
        nota_escrita=(nota_escrita_1+nota_escrita_2)/2;
       
        nota_escrita=nota_escrita*0.40f;
        
        nota_practica=nota_practica*0.40f;
        
        if(boletin>9){
            boletin_puntuacion=2f;
        }
        else if(boletin>=7 && boletin<=9){
            boletin_puntuacion=1f;
                
        }
        else if(boletin<7){
            boletin_puntuacion=0f;
        }
        
        nota_final=boletin_puntuacion+nota_escrita+nota_practica;
        
        
        
        
        JOptionPane.showMessageDialog(null, "La nota final del examen practico es: "+nota_practica);
        JOptionPane.showMessageDialog(null, "La nota final del examen escrito es: "+nota_escrita);
        JOptionPane.showMessageDialog(null, "La nota de los boletines es: "+boletin_puntuacion);
        JOptionPane.showMessageDialog(null, "\nLa nota final es: "+nota_final);
        
        
        
        
        
        
    } 
    
}
