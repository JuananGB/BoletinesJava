/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete2.Persoal;

/**
 *
 * @author juang
 */
public class Aplicacion {
    public static void main(String []args){
        
     Academica a1=new Academica();
     
     a1.setNombre("Juan");
     a1.setNota(8);
     a1.setPersoal_alum(69);
     Academica.setNum_referencia(2019);
     
     Persoal p1=new Persoal();
     
     p1.setTelefono(660456789);
     p1.setCorreo("FAlonso33@gmail.com");
     
     
        System.out.println("Nombre: "+a1.getNombre());
        System.out.println("Nota: "+a1.getNota());
        System.out.println("persoal_alum: "+a1.getPersoal_alum());
        System.out.println("Num_referencia: "+Academica.getNum_referencia());
        System.out.println("Telefono: "+p1.getTelefono());
        System.out.println("Correo: "+p1.getCorreo());
     
        
        
        
        
                
        
        
   
    
    }

    

}

    
    

