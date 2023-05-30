/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author dam1
 */
public class Main {
    public static void main(String[]args){
        

        Libro l2=new Libro();
        
        l2.setTitulo("El primer Pasajero");
        l2.setAutor("Juan Antonio");
        l2.setAno(2001);
        l2.setNumPaxinas((short)100);
        l2.setValoracion(9.45f);
        l2.mostrarCaracteristicas();
        
        
        
        Libro l1=new Libro("El segundo Pasajero","Carlos",2001,(short)33);
        l1.setValoracion(5.67f);
        
        l1.mostrarCaracteristicas();
        System.out.println("\n");
        l2.mostrarCaracteristicas();
        
        
      
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
