/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boletin14;

/**
 *
 * @author juang
 */
public class Main {
    public static void main(String[]args){
        Ordenador o1=new Ordenador();
  
        
        o1.setMonitor("MSIG24");
        o1.setProcesador(3.7);
        o1.setTeclado("razer");
        o1.setPrecio(600.69F);
        
        System.out.println("Monitor: "+o1.getMonitor());
        System.out.println("Frecuencia procesador: "+o1.getProcesador());
        System.out.println("Teclado: "+o1.getTeclado());
        System.out.println("Precio: "+o1.getPrecio());
        
        
    }
}
