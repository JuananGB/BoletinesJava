/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Conta {
    
    //ATRIBUTOS
    
    private String nombre;
    private String num_conta;
    private double tipo_interese;
    private double saldo;
    
    
    //CONSTRUCTOR
    
    public Conta(){
        
    }
    
    public Conta(String nombre,String num_cuenta,double tipo_interese){
        this.nombre=nombre;
        this.num_conta=num_conta;
        this.tipo_interese=tipo_interese;
        
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(String num_conta) {
        this.num_conta = num_conta;
    }

    public double getTipo_interese() {
        return tipo_interese;
    }

    public void setTipo_interese(double tipo_interese) {
        this.tipo_interese = tipo_interese;
    }


    
    
    //MÉTODOS
    
  public double aumentarSaldo(double saldo){
     
      float aumento_saldo;
      float saldo_final;
      
      aumento_saldo=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero a aumentar: "));
      
      saldo_final=aumento_saldo+(float)saldo;
      
      System.out.println("\nTu saldo es: "+saldo_final);
           
      return saldo;
  }
  
  public double disminuirSaldo(double saldo){
      
      float disminuir_saldo;
      float saldo_final;
      
      disminuir_saldo=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero a disminuir: "));
      
      saldo_final=(float)saldo-disminuir_saldo;
      
      if(disminuir_saldo>saldo){
          System.out.println("NO SE PODRA EJECUTAR TU REGISTRO");
      }
      
      else{
          System.out.println("\nTu saldo es: "+saldo_final);
          
          
      }   
      
      return saldo;

  
  }
  
  
  
  
  
  
  
  

  
    
    
    
    
}
