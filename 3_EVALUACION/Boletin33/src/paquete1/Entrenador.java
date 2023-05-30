/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Entrenador extends SeleccionFutbol {
    public int idFederacion;

    public Entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void planificarEntrenamiento(){
        System.out.println("O entrenador planifica el entrenamiento");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Entrenador{");
        sb.append("idFederacion=").append(idFederacion);
        sb.append(" ,").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
     

  
    
    
    
    

    
    
    
}
