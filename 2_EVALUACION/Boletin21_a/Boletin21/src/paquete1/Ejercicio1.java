/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/*
1- Realiza un programa que cree un array chamado “numeros” 
con 6 numeros aleatorios dun rango de 1 a 50 .
Seguidamente visualiza o array o revés ( 0 primeiro elemento visualizaráse 
o último e asi sucesivamente )
*/
public class Ejercicio1 {
    public static void main(String[]args){
        
        int num_aleatorio;
        
        int numeros[]=new int[6];
        
        for(int i=0;i<6;i++){
            num_aleatorio=(int)Math.round(Math.random()*50);
            numeros[i]=num_aleatorio;
            System.out.println(num_aleatorio);
        }
    }
}
