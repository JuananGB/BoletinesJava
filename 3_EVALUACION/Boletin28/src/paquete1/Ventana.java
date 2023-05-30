/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;

/**
 *
 * @author juang
 */
public class Ventana extends JFrame{
    
    JPanel panel;
    JButton boton1;
    JButton boton2;
    JTextArea areaTexto;
    JLabel etiqueta1;
    JLabel etiqueta2;
    JTextField texto1;
    JTextField texto2;
    JTextArea AreaTexto;
    
    
    
    public Ventana(){
        this.setSize(500, 500);
        this.setTitle("Boletin28");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        iniciarComponentes();
        
    }
    public void iniciarComponentes(){
        cPanel();
        cBotones();
        cEtiquetas();
        cTexto();
        cAreaTexto();
        
    }
    private void cPanel(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        this.add(panel);
    }
    private void cBotones(){
        //BOTON 1
        boton1=new JButton();
        boton1.setText("premer");
        boton1.setMnemonic('a');
        boton1.setBounds(50, 350, 100, 50);
        panel.add(boton1);
        //BOTON2
        boton2=new JButton();
        boton2.setText("limpar");
        boton2.setMnemonic('b');
        boton2.setBounds(330, 350, 100, 50);
        panel.add(boton2);
       
        
    }
    private void cEtiquetas(){
        //ETIQUETA1
        etiqueta1=new JLabel();
        etiqueta1.setText("Nome: ");
        etiqueta1.setBounds(50, 50, 100, 50);
        panel.add(etiqueta1);
        //ETIQUETA2
        etiqueta2=new JLabel();
        etiqueta2.setText("PASSWORD: ");
        etiqueta2.setBounds(50, 130, 100, 50);
        panel.add(etiqueta2);
    }
    private void cTexto(){
     //TEXTO1
     texto1=new JTextField(); 
     texto1.setBounds(200, 50, 200, 50);
     texto1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
     panel.add(texto1);
     //TEXTO2
     texto2=new JTextField(); 
     texto2.setBounds(200, 130, 200, 50);
     texto2.setBorder(BorderFactory.createLineBorder(Color.black, 1));
     panel.add(texto2);
    }
    private void cAreaTexto(){
        AreaTexto=new JTextArea("Area de texto");
        AreaTexto.setBounds(70, 230, 350, 100);
        AreaTexto.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel.add(AreaTexto);
        
    }
    
    
    

    
    
}
