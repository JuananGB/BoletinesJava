
package paquete1;


public class Circulo {
    
    //ATRIBUTOS
    
    private double radio;
    
    private final double PI=3.14;
    
    
    //CONSTRUCTORES
    
    public Circulo(){
        
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    //GETTERS Y SETTERS

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //MÉTODOS
    
    public void calcularArea(){
        double area;
        
        area=PI*Math.pow(radio, 2);
        
        System.out.println("El area de un circulo es: "+area);     
    }
    
    public void calcularLongitud(){
        
        double longitud;
        
        longitud=2*PI*radio;
        
        System.out.println("La longitud de un circulo es: "+longitud);
        
        
        
    }
   
    
    
    
}
