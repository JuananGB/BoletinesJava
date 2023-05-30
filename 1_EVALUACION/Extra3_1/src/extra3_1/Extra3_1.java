/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extra3_1;

import javax.swing.JOptionPane;

/**
 *
 * @author juang
 */
public class Extra3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        
        int cuota=800;
        
        int p; //PORCENTAJE
        
        boolean padres;
        
       
        
        edad=Integer.parseInt(JOptionPane.showInputDialog("Digite la edad de la persona"));
        padres=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tienes padres asociados?,solo es necesario para menores de 21 años"));
        
        
        
        if(edad>65){
           
            p=(cuota*40)/100;
            
            JOptionPane.showMessageDialog(null, "La cuenta que debes pagar en buestro club de padel es de: "+p);
            
        }
        
        if(edad<21 && padres==false){
            p=(cuota*25)/100;
            
             JOptionPane.showMessageDialog(null, "El proecio sin padres asociados es de: "+p);
        }
        
        else if(edad<21 && padres==true){
            
            p=(cuota*45)/100;
            JOptionPane.showMessageDialog(null, "El proecio con padres asociados es de: "+p);
        }
            
        
        
        
        
}
    
}

    

