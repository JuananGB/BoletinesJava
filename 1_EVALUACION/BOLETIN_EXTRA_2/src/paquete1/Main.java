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
    
    Conta c1=new Conta();
    
    c1.setNombre("Juan");
    c1.setNum_conta("A1");
    c1.setTipo_interese(25);
    
    
    
    System.out.println("El nombre de tu cuenta es: "+c1.getNombre());
    System.out.println("El numero de tu cuenta es: "+c1.getNum_conta());
    System.out.println("El porcentaje de interese es de un: "+c1.getTipo_interese()+" %");
    
    
    //AUMENTAR O DISMINUIR SALDO
    
         c1.disminuirSaldo(1000);
         
         c1.aumentarSaldo(1000);
    
    
    
   
    

            
            
            
            
    }
   
}
