
package boletin26;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class PedirDatos {
    
    public static String pedirString (String Mensaje){ 
        return JOptionPane.showInputDialog(Mensaje);
    }
    
     
   public static int pedirInt (String Mensaje){ 
       return Integer.parseInt(JOptionPane.showInputDialog(Mensaje));
       
   }
   
   
   
   public static float pedirFloat (String Mensaje){
   return Float.parseFloat(JOptionPane.showInputDialog(Mensaje));
   
    
    
   }   
}
