/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import javax.swing.JOptionPane;


/**
 *
 * @author juang
 */
public abstract class Conta extends Persona {
    //ATRIBUTOS
    protected long num_conta;
    protected double saldo;
    //CONSTRUCTORES
    public Conta(long num_conta, String nombre, String apellido, String DNI) {
        super(nombre, apellido, DNI);
        this.num_conta = num_conta;
    }

    public Conta() {
    }
   //GETTERS Y SETTERS

    public long getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(long num_conta) {
        this.num_conta = num_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //MÉTODOS
    
   public void ingresarDinero(double ingreso){
       double ingreso_saldo;
       
       JOptionPane.showMessageDialog(null, "Has ingresado: "+ingreso+"€");
       ingreso_saldo=ingreso+saldo;
       JOptionPane.showMessageDialog(null, "\nTu saldo actual es: "+ingreso_saldo+"€");
   }
   
   public void retirarSaldo(double retiro){
       double retiro_saldo;
       if(retiro>saldo){
           JOptionPane.showMessageDialog(null, "IMPOSIBLE RETIRAR DICHA CANTIDAD");
       }
       else{
          retiro_saldo=saldo-retiro;
          JOptionPane.showMessageDialog(null, "Tu saldo actual es de: "+retiro_saldo+"€");
         
      }
   }

   
    public abstract void mostrarResultados();
   
   
   
   
    
    
    
    
   
    
    
}
