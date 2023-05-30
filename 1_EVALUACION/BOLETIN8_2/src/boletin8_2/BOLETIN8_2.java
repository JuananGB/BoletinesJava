/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin8_2;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class BOLETIN8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int option;
        
        JOptionPane.showMessageDialog(null, " 1: Área de un Cuadrado");
        JOptionPane.showMessageDialog(null, " 2: Área de un Triángulo");
        JOptionPane.showMessageDialog(null, " 3: Área de un Círculo");

        
        option=Integer.parseInt(JOptionPane.showInputDialog("Digite una opción del (1-3): "));
        
        switch(option){
            
            case 1:
                int l;
                int area_cuadrado;
                l=Integer.parseInt(JOptionPane.showInputDialog("Digite el lado de un Cuadrado: "));
                area_cuadrado=l*l;
                JOptionPane.showMessageDialog(null, "El área de un cuadrado es: "+area_cuadrado);
            break;
            
            case 2:
                int base,altura;
                int area_triangulo;
                base=Integer.parseInt(JOptionPane.showInputDialog("Digite la base de un triángulo: "));
                altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura de un triángulo: "));
                area_triangulo=(base*altura)/2;
                JOptionPane.showMessageDialog(null, "El área de un triángulo es: "+area_triangulo);
            break;
            
            case 3:
                final double PI=3.14;
                double radio;
                double area_circulo;
                radio=Double.parseDouble(JOptionPane.showInputDialog("Digite el radio de un círculo: "));
                area_circulo=PI*Math.pow(radio, 2);
                JOptionPane.showMessageDialog(null, "El área de un círculo es: "+area_circulo);
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
                         
                
        }
    }
    
}
