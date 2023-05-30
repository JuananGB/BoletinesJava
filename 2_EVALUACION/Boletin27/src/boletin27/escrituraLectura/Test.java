
package boletin27.escrituraLectura;

import boletin27.libreria.Libro;
import java.io.File;


public class Test {
    public static void main(String[] args) {
        String ruta = "C:/Users/juang/OneDrive/Escritorio/boletin27/dataLibros.txt";
        File archivo=new File(ruta);
        Escritura escritura=new Escritura();
        Lectura lectura=new Lectura();
        CreadoraLibros cl=new CreadoraLibros();
        //Libro libro1 = new Libro("nombre vient", "patrick", 10.99, 1);
        //Libro libro2 = new Libro("it", "stephen king", 15.99, 10);
        
        escritura.escribir(ruta, new Libro("patric", "roth", 9.3, 3));
        //lectura.leer(archivo);
        //escritura.escribir(ruta,libro2);
        //lectura.leer(archivo);
    }
}
