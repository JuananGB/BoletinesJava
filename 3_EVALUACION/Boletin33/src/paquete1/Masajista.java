/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Masajista extends SeleccionFutbol {
    public String titulacion;
    public int aniosExperiencia;

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("O masajista da un masaje");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masajista{");
        sb.append("titulacion=").append(titulacion);
        sb.append(", aniosExperiencia=").append(aniosExperiencia);
        sb.append(" ,").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    

    
  
   
}
