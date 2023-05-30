

package boletin22;

import java.util.Arrays;
import metodos.Metodos;



public class Boletin22 {

  
    
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos obx = new Metodos();
        int golesMarcados[ ][ ] = obx.creaArray();
        obx.mostrarArray(); 
        
        /**
         * Ejercicio 2
         */
        System.out.println("");
        obx.equiposGoles();
            
        //obx.verGolesEquipos();
        //obx.ordenarMatriz(obx.golesEquipo);
        
        System.out.println(Arrays.toString(obx.golesEquipo));   
        
        System.out.println("\n***********");
        obx.ordenarMatriz_v2(obx.golesEquipo);
        obx.mostrarArray();
        
    }
    
}
