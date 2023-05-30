
package boletin21_2;

import java.util.Scanner;






 
/*
Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .
•	 Visualiza o numero de aprobados e o de suspensos  .
•	 Calcula e visualiza a nota media da clase
•	Visualiza a nota mais alta .
*/
public class Boletin21_2 {
    public static void main(String []args){
        Scanner entrada=new Scanner(System.in);
        
        int notas[]=new int[5];
        
        int suma_aprobados=0;
        int suma_suspensos=0;
        int numero_notas=0;
        int nota_media;
        int suma_notas=0;
        int nota_maxima=0;
        
        for(int i=0;i<notas.length;i++){
            System.out.print((i+1)+" Digite una nota: ");
            notas[i]=entrada.nextInt();
            
            if(notas[i]>=5){
                suma_aprobados++;
            }
            else{
               suma_suspensos++; 
            }
            numero_notas++;
            suma_notas=suma_notas+notas[i];
            
      
            
        }
        
        
        for(int i=0;i<notas.length;i++){
            if(notas[i]>nota_maxima){
                nota_maxima=notas[i];
                
            }
        }
        
        
        
        
        
        
        
        
        nota_media=suma_notas/numero_notas;
        
        System.out.println("\nNumero de abrobados: "+suma_aprobados);
        System.out.println("Numero de suspensos: "+suma_suspensos);
        System.out.println("La nota media es: "+nota_media);
        System.out.println("La nota más alta es: "+nota_maxima);
        
        
        
       
        
    }
} 


    
 