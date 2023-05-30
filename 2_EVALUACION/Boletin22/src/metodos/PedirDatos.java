
package metodos;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;


public class PedirDatos {
    
    public static float pedirFloat (String Mensaje){ 
        return Float.parseFloat(JOptionPane.showInputDialog(Mensaje));
    }
    
    public static int getNumeroRandom(int min, int max){
       return ThreadLocalRandom.current().nextInt(min, max);
   }
    
}
