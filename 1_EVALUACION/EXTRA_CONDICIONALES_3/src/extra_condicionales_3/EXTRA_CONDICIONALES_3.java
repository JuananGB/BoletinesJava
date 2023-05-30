/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra_condicionales_3;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class EXTRA_CONDICIONALES_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int alumnos;
        int custo_entrada=0;
        
        alumnos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de alumnos"));
        
        if(alumnos>=100){
            custo_entrada=alumnos*65;
            
            JOptionPane.showMessageDialog(null, "O custo do viaxe escolar é de: "+custo_entrada+"€");
             
        }
        
        else if((alumnos>=50)&&(alumnos<=99)){
              custo_entrada=alumnos*70;
              
               JOptionPane.showMessageDialog(null, "O custo do viaxe escolar é de: "+custo_entrada+"€");
        }
        
        else if((alumnos>=30)&&(alumnos<=49)){
              custo_entrada=alumnos*95;
              
               JOptionPane.showMessageDialog(null, "O custo do viaxe escolar é de: "+custo_entrada+"€");
        }
        
        else if(alumnos<30){
              custo_entrada=4000;
               JOptionPane.showMessageDialog(null, "O custo do viaxe escolar é de: "+custo_entrada+"€");
        }
        
        
    }
    
}
