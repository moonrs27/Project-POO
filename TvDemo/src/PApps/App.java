/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_tvdemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLayeredPane;
/*
MONTSERRAT ROJAS SANTILLAN
los metodos swing y awt nos ayudan a crear botones en las intefaces (o clases abstractas) ya sean de texto, imagen, iconos
etc; estos nos ayudaran a crear nuevas pestañas para mostrar las operaciones de la television.
para que el kit de herramientas awt tenga mas opciones, se pueden utilizar los eventos para facilitar los cambios 
que se hagan dentro de las clases abstractas
*/
/**
 *
 * @author alanm
 */

//implements ActionListener
public class App extends JFrame implements ActionListener{
    private JButton Stream;
    private JButton Music;
    private ImageIcon todo1;
    private ImageIcon todo2;
    private JLayeredPane capa2;
    public App(){
        specsBoton();
        colocarBase();
        accionStream();
    }
/*	
MONTSERRAT ROJAS SANTILLAN

*/

    private void specsBoton(){
        Stream = new JButton();
        
        
        this.Stream.setVisible(true);
        todo1 = new ImageIcon("video-stream.png");
        Stream.setOpaque(true);
        Stream.setBackground(Color.DARK_GRAY);
        Stream.setBounds(110,195,110,210);
        
        Stream.setIcon(new ImageIcon(todo1.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH) ) );
       // Stream.setVisible(true);
//Stream.setActionCommand("Video");
        
        Music = new JButton();
        todo2 = new ImageIcon("music.png");
        Music.setOpaque(true);
        Music.setBackground(Color.DARK_GRAY);
        Music.setBounds(220,195,110,210);
        this.Music.setVisible(true);
        Music.setIcon(new ImageIcon(todo2.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH) ) );
        //Music.setActionCommand("Sonido");
        
    }
    
/*

*/
	
     private void colocarBase(){
        capa2 = new JLayeredPane();
        capa2.setOpaque(true);
        capa2.setBackground(Color.GREEN);
        
        capa2.add(Stream,Integer.valueOf(3));
        capa2.add(Music,Integer.valueOf(3));
        this.add(capa2);
    }
    
    
    public void Abrir(){
        
        
        
        /*System.out.println("Llego a las APPs");
        SubInterfaz Primventana;
        Primventana = new SubInterfaz("Video","Musica");*/
        /*AppStreaming Stream = new AppStreaming();
        AppMusica Music = new AppMusica();
        
        if(this.Estado == false && this.nombreApp == "Stream"){
         Stream.start();
       }else{
         Music.start();
         
        
        } */  
        
    }

    
    /*public void clicEnBoton(ActionEvent e) {
        System.out.println("Activo una App");
    }*/
    
    private void accionStream(){
        Music.addActionListener(this);
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        if ("Video".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Stream");
            
        }else if ("Sonido".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Musica");
	
        }
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Entro a ejecucion");
    }
    
    
}
