/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class CuentaCorriente extends Conta{
    
    //ATRIBUTOS PROPIOS
    private double interes;

    public CuentaCorriente(double interes, long num_conta, String nombre, String apellido, String DNI) {
        super(num_conta, nombre, apellido, DNI);
        this.interes = interes;
    }

    public CuentaCorriente() {
    
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public void mostrarResultados(){
        System.out.println("Interes: "+interes+"\nNumero de conta: "+num_conta+"\nNombre: "+nombre+"\nApellido: "+apellido+"\nDNI: "+DNI+"\n");
        
        
    }
   

        
   
    
    
    
    
}
