/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Coche {
    
    //ATRIBUTOS
    private String modelo;
    private String color;
    private boolean pintura_metalizada;
    private int matricula;
    private String seguro;
   
    
    //CONSTRUCTORES
    
    public Coche(){
        
    }

    public Coche(String modelo, String color, boolean pintura_metalizada, int matricula, String seguro) {
        this.modelo = modelo;
        this.color = color;
        this.pintura_metalizada = pintura_metalizada;
        this.matricula = matricula;
        this.seguro=seguro;
   
    }
    
    //GETTERS YS SETTERS

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPintura_metalizada() {
        if(pintura_metalizada==true){
            System.out.println("El coche tiene pintura metalizada");
        }
        else{
            System.out.println("No tiene ointura metalizada");
        }
        return pintura_metalizada;
    }

    public void setPintura_metalizada(boolean pintura_metalizada) {
        this.pintura_metalizada = pintura_metalizada;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
   public String getSeguro(){
       
       return seguro;
   }
   
   public void setSeguro(String seguro){
       this.seguro=seguro;
   }
 
    
       
}
