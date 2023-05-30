
package boletin27.libreria;

import java.io.Serializable;


public class Libro implements Serializable{

    private String nombre;
    private String autor;
    private double precio;
    private int unidades;
    
    public Libro(){
        
    }

    // CONSTRUCTOR
    public Libro(String nombre, String autor, double precio, int unidades) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro [nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades + "]";
    }
 
}
