/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra_condicionales_2;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class EXTRA_CONDICIONALES_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //EL PRECIO ESYÁ EN CÉNTIMOS  ; 1 euro-->100 céntimos , 2 euros -->200 céntimos , etc...
        
        int precio_inicial;
        int tamaño=0;
        char option;
        
        precio_inicial=Integer.parseInt(JOptionPane.showInputDialog("Digite el precio inicial en céntimos del kilo de uvas"));
        option=JOptionPane.showInputDialog("Eliga una opcion ente A o B ").charAt(0);
        
        switch(option){
            
            case 'A':
                
                tamaño=Integer.parseInt(JOptionPane.showInputDialog("El tamaño de la venta de uvas es: "));
                
                if(tamaño==1){
                    precio_inicial=precio_inicial+20;
                    JOptionPane.showMessageDialog(null, "El precio inicial subió a: "+precio_inicial+" céntimos");
                }
                else if(tamaño==2){
                    precio_inicial=precio_inicial+30;
                    JOptionPane.showMessageDialog(null, "El precio inicial subió a: "+precio_inicial+" céntimos");
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Tamaño inexistente");     
                }
            break;
            
            case 'B':
                 tamaño=Integer.parseInt(JOptionPane.showInputDialog("El tamaño de la venta de uvas es: "));
                
                if(tamaño==1){
                    precio_inicial=precio_inicial-30;
                    JOptionPane.showMessageDialog(null, "El precio inicial subió a: "+precio_inicial+" céntimos");
                }
                else if(tamaño==2){
                    precio_inicial=precio_inicial-50;
                    JOptionPane.showMessageDialog(null, "El precio inicial subió a: "+precio_inicial+" céntimos");
                }
                
                else{
                    JOptionPane.showMessageDialog(null, "Tamaño inexistente ");     
                }
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "SOLO EXISTEN DOS TIPOS DE TAMAÑO");
            
            
        }
        
        
    }
    
}
