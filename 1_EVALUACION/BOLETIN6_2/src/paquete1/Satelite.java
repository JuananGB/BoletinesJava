/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

//EL PROBLEMA DEL EJERCICIO ES QUE LE FALTABAN LOS GETTER Y SETTERS
//PARA DAR O IMPRIMIR LOS VALOTRES DE CADA ATRIBUTO


public class Satelite {
    
    //ATRIBUTOS
     
    private double meridiano,paralelo,distanciaTerra;
    
    //CONSTRUCTOR
    
    public Satelite(){
             
    }

    public Satelite(double meridiano, double paralelo, double distanciaTerra) {
        this.meridiano = meridiano;
        this.paralelo = paralelo;
        this.distanciaTerra = distanciaTerra;
    }
    
    //GETTERS Y SETTERS

    public double getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public double getParalelo() {
        return paralelo;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public double getDistanciaTerra() {
        return distanciaTerra;
    }

    public void setDistanciaTerra(double distanciaTerra) {
        this.distanciaTerra = distanciaTerra;
    }
    
    //MÉTODO
    
    public void verPosicion(){
        System.out.println("O satelite atopase no paralelo "+paralelo+" meridiano "+meridiano+" a unha distancia da terra en "+distanciaTerra);     
    }
    
    
    

    
}
