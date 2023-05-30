/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author dam1
 */
public class Libro {
    
    //ATRIBUTOS
    
     private String titulo;
     private String autor;
     private int ano;
     private short numPaxinas;
     private float valoracion;
     
     //CONSTRUCTORES
     
     public Libro(){
         
     }

    public Libro(String titulo, String autor, int ano, short numPaxinas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaxinas = numPaxinas;
    }
     
     //METODOS
    
     public void mostrarCaracteristicas(){
         
         System.out.println("El libro se titula: "+titulo);
         System.out.println("El nombre del autor es: "+autor);
         System.out.println("El libro tiene: "+numPaxinas+" paxinas");
         System.out.println("Su valoracion es: "+valoracion);
         
     }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaxinas() {
        return numPaxinas;
    }

    public void setNumPaxinas(short numPaxinas) {
        this.numPaxinas = numPaxinas;
    }
    
    public Libro(int valoracion){
        this.valoracion=valoracion;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }
    
    
     
     
     
    
}
