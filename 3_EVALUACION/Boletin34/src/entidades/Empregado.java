/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author juang
 */
public  class Empregado {
    
    protected String DNI;
    protected String nombre;
    protected String apellidos;
    protected int data_Ingreso;

    public Empregado(String DNI, String nombre, String apellidos, int data_Ingreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.data_Ingreso = data_Ingreso;
    }

    public Empregado() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empregado{");
        sb.append("DNI=").append(DNI);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", data_Ingreso=").append(data_Ingreso);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
