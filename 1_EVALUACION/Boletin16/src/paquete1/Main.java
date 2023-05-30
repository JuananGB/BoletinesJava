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
        
      CuentaCorriente cc = new CuentaCorriente(18,333,"Juan","Gonzalez","356089G");

      CuentaAhorro ca = new CuentaAhorro(25,5555,"Marcos","Martinez","3333333FA");
          
        System.out.println("CUENTA CORRIENTE");
      
        cc.mostrarResultados();
      
        System.out.println("CUENTA AHORRO");
        
        ca.mostrarResultados();
        
        
        
        
        
        
        
        
        
        
    }
   
    
}
