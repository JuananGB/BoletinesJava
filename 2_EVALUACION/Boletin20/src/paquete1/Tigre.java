/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import Interfaces.IPodeNadar;
public class Tigre extends Mamiferos implements IPodeNadar {
    
    @Override
    public void nadar(){
        System.out.println("Hola soy un tigre y puedo nadar");
    }
    
}
