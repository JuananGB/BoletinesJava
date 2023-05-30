/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentacion;
import entidades.Empregado;
import entidades.EContratado;
import entidades.EDespajo;



public class Aplicacion {
    public static void main(String[] args) {
        
        Empregado vector[]=new Empregado[2];
        
        vector[0]=new EContratado(1000,"ABDDFG33","Juan Antonio","Gonzalez",2022);
        vector[1]=new EDespajo(500,"BCFGHY55","Lucia","Martinez",2023);
        
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i].toString());
        }
        
        EDespajo ed=new EDespajo();
        
        ed.salarioPorCliente(3);
        
        EContratado ec=new EContratado();
        ec.setSoldo(1000);
        ec.soldoAumento(10);
    }
    
}
