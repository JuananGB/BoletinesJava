
package boletin26;

import java.util.ArrayList;

public class Boletin26 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Operacions obx = new Operacions();
        int numero;
        ArrayList<Integer> lista= new ArrayList(); 
        do{
            numero = PedirDatos.pedirInt("1 --> Añadir\n2 --> Elemento mínimo\n3 --> Elemento máximo\n4 --> Buscar elemento");
            switch(numero){
                case 1:
                    obx.engadir(PedirDatos.pedirInt("Teclee un numero"), lista);
                    break;
                case 2:
                    obx.elementoMinimo(lista);
                    break;
                case 3:
                    obx.elementoMaximo(lista);
                    break;
                case 4:
                    obx.buscarElemento(lista, PedirDatos.pedirInt("Teclee o numero a buscar"));
                    break;
                default:
                    System.out.println("Saíndo do programa");
                    break;
            }
        }while(numero > 0 && numero < 5);
    }
    
}
