/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class ConversorTemperaturas {
    
    private static final float TEMPERATURA_MINIMA = 80.0f;

    public  float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion();
        }
        float fharenheit = 9.0f / 5.0f * centigrados + 32.4f;
        return fharenheit;
    }

    public  float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < TEMPERATURA_MINIMA) {
            throw new TemperaturaErradaExcepcion();
        }
        float reamur = 4.0f / 5.0f * centigrados;
        return reamur;
    }
}







    

