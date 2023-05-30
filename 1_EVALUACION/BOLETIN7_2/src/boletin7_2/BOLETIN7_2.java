
/*
2- Implementa un programa no que se tecleen dous números de tipo short .
Se o primeiro é maior ou igual que o segundo,visualizaremos a resta . 
En calquera caso visualizaremos a suma .
*/
package boletin7_2;

import javax.swing.JOptionPane;

public class BOLETIN7_2 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        short n1,n2,resta,suma;
        
        n1=Short.parseShort(JOptionPane.showInputDialog("Digite un número: "));
        n2=Short.parseShort(JOptionPane.showInputDialog("Digite un número: "));
        
        if(n1>=n2){
            resta=(short) (n1-n2);
            JOptionPane.showMessageDialog(null, resta);
        }
        else{
           suma=(short) (n1+n2);
           JOptionPane.showMessageDialog(null, suma); 
        }
        
        
        
    }
    
}
