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
        
        Multimedia vector[]=new Multimedia[2];
        
        vector[0]=new Pelicula("Aaron Paul","Kyrsten Ritter","El Camino","Vince Gilligan","mkv",3);
        vector[1]=new Disco("Rock","Piano Man","Billy Joel","mp4",3);
        
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i].toString());
            System.out.println("");
        }
    }
    
}
