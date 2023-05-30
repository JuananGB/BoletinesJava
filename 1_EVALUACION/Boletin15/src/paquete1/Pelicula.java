/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Pelicula extends Multimedia{
    private String actor;
    private String actriz;

    public Pelicula(String actor, String actriz, String titulo, String autor, String formato, int duracion) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }

    public Pelicula() {
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("actor=").append(actor);
        sb.append(", actriz=").append(actriz);
        sb.append('}');
        return sb.toString();
    }

  
    
    
    
}
