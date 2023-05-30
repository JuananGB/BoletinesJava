/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import Interfaces.IPodeCantar;

public class Gallo implements IPodeCantar{
    
    @Override
    public void cantar(){
        System.out.println("Hola soy un gallo y canto asi: kikiriki");
    }
    
}
