
package boletin27.escrituraLectura;

import boletin27.libreria.Libro;

import java.io.*;
import java.util.*;

public class Lectura {
    CreadoraLibros creadoraLibros=new CreadoraLibros();
    
    ObjectInputStream lec=null;
    Scanner sc;
    public void leer(File fichero){
        try {
            lec=new ObjectInputStream(new FileInputStream(fichero));
            Libro libroLeido=(Libro)lec.readObject();
            while(libroLeido!=null){
                System.out.println(libroLeido);
                libroLeido=(Libro)lec.readObject();
            }
        } catch(IOException ex) {
            System.out.println("erro 1 lectura:");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.out.println("erro 2 lectura:");
            ex.printStackTrace();
        } finally {
            try {
                lec.close();
            } catch (IOException ex) {
                //Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
                
                System.out.println(ex.getClass().getName());
            }
        }
        
    }
    
    public void lectura_inten2(ArrayList lista){
        while(sc.hasNext()){
            String libroLeido=sc.nextLine();
            System.out.println(libroLeido);
        }
    }
}
