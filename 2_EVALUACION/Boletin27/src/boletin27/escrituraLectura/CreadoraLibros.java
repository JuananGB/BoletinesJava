

package boletin27.escrituraLectura;

import boletin27.libreria.Libro;
import java.util.ArrayList;


public class CreadoraLibros {
    
    ArrayList<Libro> listaLibros;
    static final int NUM_LIBROS_MAX=5;
    static int numeroLibros;
    
    public CreadoraLibros(){
        
    }
    
    public ArrayList<Libro> crearLibros(String nombre, String autor, double precio, int unidades){
        if(numeroLibros<NUM_LIBROS_MAX){
            listaLibros.add(new Libro(nombre, autor, precio, unidades));
            numeroLibros++;
        }else{
            System.out.println("No se permiten mas libros");
        }
        return listaLibros;
    }
    
}