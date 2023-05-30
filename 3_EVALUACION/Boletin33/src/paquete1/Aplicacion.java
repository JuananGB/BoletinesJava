/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.ArrayList;
public class Aplicacion {
    public static void main(String[] args) {
        
    ArrayList<SeleccionFutbol>lista=new ArrayList<SeleccionFutbol>();
    
    lista.add(new Futbolista(10,"Delantero",01,"Marcos","Avendaño",22));
     
    lista.add(new Entrenador(33,69,"Juan","González",22));
    
    lista.add(new Masajista("terminado",10,33,"Carlos","Martinez",22));
        
    for(SeleccionFutbol elemento:lista){
        System.out.println("\n"+elemento);
    }
    
    }
    
}
