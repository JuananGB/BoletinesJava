
package boletin24;

import java.util.ArrayList;

public class Boletin24 {

    
    public static void main(String[] args) {
       
        ArrayList<Libro> listaLibros = new ArrayList<>();

        Libreria obx = new Libreria();
        
        int opcion;
        do {
            opcion = PedirDatos.pedirInt("Introduce una de estas opciones\n"
                    + "1--> Crear lista\n2--> Amosar lista\n3--> Buscar libro"
                    + "\n4--> Elminar libro");
            switch (opcion) {
                case 1:
                    obx.engadir(listaLibros);
                    break;
                case 2:
                    obx.amosar(listaLibros);
                    break;
                case 3:
                    obx.buscar(listaLibros);
                    break;
                case 4:
                    obx.vender(listaLibros);
                    break;
                default:
                    System.out.println("numero introducido incorrecto");
                    
            }
        } while (opcion != 0);
        
    }

}
