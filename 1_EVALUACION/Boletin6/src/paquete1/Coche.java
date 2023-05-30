
package paquete1;



public class Coche {
    
 
    
    //ATRIBUTOS
    
    private int velocidade;
    
    //CONSTRUCTOR
    
    public Coche(){
        
    }
    
    //GETTER Y SETTER

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    //MÉTODOS
    
    public void acelerar(int aumento){   
        velocidade=velocidade+aumento;
        
        System.out.println("Tu coche aumento en: "+velocidade+" Km");
        
    }
    
    public void  frenar(int menos){

        if(velocidade<menos){
            System.out.println("NO PUEDES DISMINUIR MAS DE TU VELOCIDAD ACTUAL");
        }
        else{
            velocidade=velocidade-menos;
            System.out.println("Tu coche disminuyo en: "+velocidade+" Km");
        }
        
    }
    
    
    
    
    
    
    
}
