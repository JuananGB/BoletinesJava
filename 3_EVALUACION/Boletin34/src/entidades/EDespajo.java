/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author juang
 */
public class EDespajo extends Empregado{
    private int soldo;
    
    public  EDespajo(){
        
    }

    public EDespajo(int soldo, String DNI, String nombre, String apellidos, int data_Ingreso) {
        super(DNI, nombre, apellidos, data_Ingreso);
        this.soldo = soldo;
    }
    
    public void salarioPorCliente(int cliente){
     int complemento=25; // 25€ por cliente conseguido
     complemento=cliente*25;
     soldo=soldo+complemento;
     System.out.println("Tu soldo por trabajar en nuestra empresa mas un aniadido é: "+soldo+"€");
    }
    
    
}
