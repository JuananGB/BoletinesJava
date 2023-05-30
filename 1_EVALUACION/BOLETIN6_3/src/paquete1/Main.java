/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Main {
    
    public static void main(String[]args){
        
        Circulo c1=new Circulo();
        
        c1.setRadio(3.33);
        
        System.out.println("El radio es "+c1.getRadio());
        
        c1.calcularArea();
        c1.calcularLongitud();
        
    }
    
}
