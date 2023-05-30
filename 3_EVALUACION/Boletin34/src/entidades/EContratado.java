/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author juang
 */
public class EContratado extends Empregado{
    
    private int soldo;

    public EContratado(int soldo, String DNI, String nombre, String apellidos, int data_Ingreso) {
        super(DNI, nombre, apellidos, data_Ingreso);
        this.soldo = soldo;
    }

    public EContratado() {
    }

    public int getSoldo() {
        return soldo;
    }

    public void setSoldo(int soldo) {
        this.soldo = soldo;
    }
    
    
    
    public void soldoAumento(int tempo){
        
        int aumento;
        if(tempo>=0 && tempo<=3){
          aumento=(5*soldo)/100;
          soldo=soldo+aumento;
            System.out.println("Tu soldo por los años que trbajastes es nuestra empresa é: "+soldo); 
        }
        if(tempo>=4 && tempo<=7){
            aumento=(10*soldo)/100;
            soldo=soldo+aumento;
            System.out.println("Tu soldo por los años que trbajastes es nuestra empresa é: "+soldo);
        }
        if(tempo>=8 && tempo<=15){
            aumento=(15*soldo)/100;
            soldo=soldo+aumento;
            System.out.println("Tu soldo por los años que trbajastes es nuestra empresa é: "+soldo);
        }
        
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EContratado{");
        sb.append("soldo=").append(soldo);
        sb.append(" ,").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
