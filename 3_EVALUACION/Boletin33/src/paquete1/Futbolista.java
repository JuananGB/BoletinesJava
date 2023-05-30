/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author juang
 */
public class Futbolista extends SeleccionFutbol {
    public int dorsal;
    public String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

  
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Futbolista{");
        sb.append("dorsal=").append(dorsal);
        sb.append(", demarcacion=").append(demarcacion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

   
    
        
        
 
        
  
    
}
