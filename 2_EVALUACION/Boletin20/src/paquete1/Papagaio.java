/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;


import Interfaces.IPodeNadar;
import Interfaces.IPodeVolar;
public class Papagaio extends Aves  implements IPodeNadar,IPodeVolar {
    
    @Override
    public void camiñar(){
        System.out.println("Hola soy un papagaio y puedo camiñar");   
    }
    @Override
    public void nadar(){
        System.out.println("Hola soy un papagaio pero no puedo nadar");
        
    }
    
    @Override
    public void volar(){
        System.out.println("Hola soy un papagaio y puedo volar");
    }
    
}
