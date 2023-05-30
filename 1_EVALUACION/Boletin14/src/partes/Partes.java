/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author juang
 */
public class Partes {
    
    public String monitor;
    public String teclado;
    public double procesador;
    public float precio;

    public Partes(String monitor, String teclado, double procesador, float precio) {
        this.monitor = monitor;
        this.teclado = teclado;
        this.procesador = procesador;
        this.precio = precio;
    }

    public Partes() {
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public double getProcesador() {
        return procesador;
    }

    public void setProcesador(double procesador) {
        this.procesador = procesador;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
