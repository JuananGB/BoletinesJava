/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.logging.Logger;

/**
 *
 * @author juang
 */
public class Disco extends Multimedia{
    private String xenero;

    public Disco(String xenero, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.xenero = xenero;
    }

    public Disco() {
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disco{");
        sb.append("xenero=").append(xenero);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
