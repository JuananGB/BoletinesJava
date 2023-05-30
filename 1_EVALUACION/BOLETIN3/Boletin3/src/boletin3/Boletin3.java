/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3;

import java.util.Scanner;


/**
 *
 * @author dam1
 */
public class Boletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    // TODO code application logic here
    
    Scanner entrada = new Scanner(System.in);

    // Solicitar precio de tarifa y precio pagado
    System.out.print("Introduzca el precio de la tarifa: ");
    double tarifa = entrada.nextDouble();
    System.out.print("Introduzca el precio pagado: ");
    double pagado = entrada.nextDouble();

    // Calcular descuento y porcentaje de descuento
    double descuento = tarifa - pagado;
    double porcentajeDescuento = (descuento / tarifa) * 100;

    // Mostrar por pantalla el porcentaje de descuento
    System.out.println("El porcentaje de descuento es: " + porcentajeDescuento + "%");

    entrada.close();
  }
}

        
        
        
     
    

