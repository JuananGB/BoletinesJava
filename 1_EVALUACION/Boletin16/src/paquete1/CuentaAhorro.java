/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class CuentaAhorro extends Conta {
    private double interes;

    public CuentaAhorro(double interes, long num_conta, String nombre, String apellido, String DNI) {
        super(num_conta, nombre, apellido, DNI);
        this.interes = interes;
    }

    public CuentaAhorro() {
    }
    

    @Override
    public void mostrarResultados(){
        System.out.println("Interes: "+interes+"\nNumero de conta: "+num_conta+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nDNI: "+DNI);
        
        
    }
    
    
    
    
    
    
}
