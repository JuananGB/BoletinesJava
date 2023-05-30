/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public abstract class SeleccionFutbol implements IIntegranteSeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public void concentrarse(){
        System.out.println("Se concentra");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja");
    }
    @Override
    public void entrenar(){
        System.out.println("entrena");
    }
    
    @Override
    public void jugarPartido(){
        System.out.println("Juega partido");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SeleccionFutbol{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

   
    
    

  
    
   
    

    
}
