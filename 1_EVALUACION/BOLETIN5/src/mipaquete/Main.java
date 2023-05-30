/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mipaquete;

/**
 *
 * @author juang
 */
public class Main {
    
    public static void main(String[] args) {
        // a) Crea un objeto de tipo Consumo, utilizando el constructor sin parámetros
        Consumo c1 = new Consumo();

        // b) Dale a litros el valor 50 y a prezo da gasolina 1.57
        c1.setLitros(50);
        c1.setPGas(1.57);

        // c) Crea un objeto de tipo Consumo, utilizando el constructor con todos los parámetros
        Consumo c2 = new Consumo(100, 10, 80, 1.5);

        // d) Visualiza, a través del segundo objeto, el consumo medio
        System.out.println("Consumo medio: " + c2.consumoMedio() + " litros/100km");

        // e) Varia el valor de los litros consumidos del segundo objeto
        c2.setLitros(15);

        // f) Visualiza la velocidad media del segundo objeto
        System.out.println("Velocidad media: " + c2.getTempo()+ " km/h");
    }
}

