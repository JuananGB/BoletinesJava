/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Main {
    
    public static void main(String[]args){
        
        //MINI
        
        Mini m=new Mini();
        
        System.out.println("\tMINI");
        m.setModelo("Copper");
        m.setColor("rojo");
        m.setMatricula(33546782);
        m.setPintura_metalizada(true);
        m.setSeguro("a todo riesgo");
        
        
        System.out.println("El modelo es: "+m.getModelo());
        System.out.println("El color es: "+m.getColor());
        System.out.println("Su matricula es: "+m.getMatricula());
        System.out.println(m.isPintura_metalizada());
        System.out.println("Su seguro es a: "+m.getSeguro());
        
        //UTILITARIO
        
        Utilitario u=new Utilitario();
        
        
        System.out.println("\n");
        System.out.println("\tUTILITARIO");
        u.setModelo("Korando");
        u.setColor("gris");
        u.setMatricula(3345678);
        u.setPintura_metalizada(false);
        u.setSeguro("a todo riesgo");
        
        System.out.println("El modelo es: "+u.getModelo());
        System.out.println("El color es: "+u.getColor());
        System.out.println("Su matricula es: "+u.getMatricula());
        System.out.println(u.isPintura_metalizada());
        System.out.println("Su segures es a: "+u.getSeguro());
        
        //DEPORTIVO
        
        Deportivo d=new Deportivo();
        
        System.out.println("\n");
        System.out.println("\tDEPORTIVO");
        d.setModelo("nissan GTR34");
        d.setColor("azul");
        d.setMatricula(333333333);
        d.setPintura_metalizada(true);
        d.setSeguro("a todo riesgo");
        
        
        System.out.println("El modelo es el: "+d.getModelo());
        System.out.println("El color es: "+d.getColor());
        System.out.println("Su numero de matrícula es: "+d.getMatricula());
        System.out.println(d.isPintura_metalizada());
        System.out.println("Su seguro es: "+d.getSeguro());
        
         
    }
    
}
