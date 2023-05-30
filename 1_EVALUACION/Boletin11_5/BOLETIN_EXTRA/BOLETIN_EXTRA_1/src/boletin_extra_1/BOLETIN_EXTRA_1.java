/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_extra_1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BOLETIN_EXTRA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
    Scanner entrada = new Scanner(System.in);

    double baseImponible, iva, importeIVA, total;

    System.out.print("Introduzca la base imponible: ");
    baseImponible = entrada.nextDouble();

    System.out.print("Introduzca el porcentaje del IVA a aplicar (sin el símbolo %): ");
    iva = entrada.nextDouble() / 100.0;

    importeIVA = baseImponible * iva;
    total = baseImponible + importeIVA;

    System.out.println("El importe correspondiente al IVA es: " + importeIVA);
    System.out.println("El total a pagar es: " + total);
  }
}

    
    

