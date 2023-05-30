/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin21_4;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Boletin21_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        int dni = entrada.nextInt();
        
        String[] letrasNIF = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        
        int resto = dni % 23;
        String letraNIF = letrasNIF[resto];
        
        System.out.println("La letra del NIF es: " + letraNIF);
    }

    
}
