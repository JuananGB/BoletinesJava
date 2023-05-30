/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Academica {
    
    //ATRIBUTOS
    
    private static int num_referencia;
    private String nombre;
    private int nota;
    private int persoal_alum;
    
    
    //METODOS
    
    //CONSTRUCTORES
    
    public Academica(){
    }

    public Academica(String nombre, int nota, int persoal_alum) {
        this.nombre = nombre;
        this.nota = nota;
        this.persoal_alum = persoal_alum;
    }
    
    //GETTERS Y SETTERS

    public static int getNum_referencia() {
        return num_referencia;
    }

    public static void setNum_referencia(int num_referencia) {
        Academica.num_referencia = num_referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        
        if(nota>=1 &&  nota<=10){
        this.nota = nota;
        }
        else{
            System.out.println("La nota no existe");
        }
    }

    public int getPersoal_alum() {
        return persoal_alum;
    }

    public void setPersoal_alum(int persoal_alum) {
        this.persoal_alum = persoal_alum;
    }

    @Override
    public String toString() {
        return "Academica{" + "nombre=" + nombre + ", nota=" + nota + ", persoal_alum=" + persoal_alum + '}';
    }
    
    
    
    
   
    
}
