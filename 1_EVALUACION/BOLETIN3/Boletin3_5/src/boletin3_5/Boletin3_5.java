
package boletin3_5;

import javax.swing.JOptionPane;


public class Boletin3_5 {

    public static void main(String[] args) {
        
        //CALCULAR SUELDO TOTAL
        
        double sueldo_fijo=Double.parseDouble(JOptionPane.showInputDialog("Imprime tu salario fijo: "));
        double importe_ventas=Double.parseDouble(JOptionPane.showInputDialog("Imprime el importe total de ventas: "));
        
        double comision=0;
        comision=(5*importe_ventas)/100;
        
        double km=Double.parseDouble(JOptionPane.showInputDialog("Imprime la cantidad de km recorridos: "));
        
        double salario_km_recorrido=0;
        salario_km_recorrido=2*km;
        
        double dias=Double.parseDouble(JOptionPane.showInputDialog("Imprime la cantidad de días por desplazamiento: "));
        
        double salario_dias_recorrido=0;
        
        salario_dias_recorrido=30*dias;
        
        
        
        double salario_total=sueldo_fijo+comision+salario_km_recorrido+salario_dias_recorrido;
        
        //SUELDO BRUTO
        
        double sueldo_bruto=salario_total;
        
        
        //SUELDO LÍQUIDO
        
        double sueldo_liquido=sueldo_bruto-(0.18*sueldo_bruto)-36;
        
        //IMPRIMIR EL SB Y SL
        
        JOptionPane.showMessageDialog(null, "El sueldo bruto es: "+sueldo_bruto);
       
        JOptionPane.showMessageDialog(null, "El sueldo líquido es: "+sueldo_liquido);
        
        
        
        
        
       
        
        
        
      
        
        
    }
    
}
