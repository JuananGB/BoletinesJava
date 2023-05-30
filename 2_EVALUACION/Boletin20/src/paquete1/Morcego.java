/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import Interfaces.IPodeVolar;
public class Morcego extends Mamiferos implements IPodeVolar {
    
    @Override
    public void volar(){
        System.out.println("Hola soy un morcego y pode volar");
    }
    
    
}
