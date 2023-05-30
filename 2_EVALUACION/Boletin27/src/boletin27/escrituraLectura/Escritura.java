
package boletin27.escrituraLectura;

import boletin27.libreria.Libro;
import java.io.*;



public class Escritura{
    String ruta = "C:/Users/juang/OneDrive/Escritorio/boletin27/dataLibros.txt";
    CreadoraLibros creadoraLibros=new CreadoraLibros();
    
    ObjectOutputStream escr;
    public void escribir(String ruta, Libro libro) {
        try {
            escr=new ObjectOutputStream(new FileOutputStream(ruta));
            escr.writeObject(libro);

        } catch(FileNotFoundException ex){
            System.out.println("erro 1: ");
            ex.printStackTrace();
            
        } catch(IOException ex) {
            System.out.println("erro 1: ");
            ex.printStackTrace();
        } finally {
            try {
                escr.close();
            } catch (IOException ex) {
                System.out.println("error 3:");
                ex.printStackTrace();
            }
        }
    }
}
