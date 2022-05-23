/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_tvdemo; //paquete de prueba

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLayeredPane;
/*
MONTSERRAT ROJAS SANTILLAN
los paquetes swing y awt ayudan a las interfaces (clases abstractas) a crear botones con textos
imagenes y cuadros graficos para mostrar su funcionamiento en la pantalla
- para tener eventos especificos en las clases abstractas utilizamos los eventos de java (event), porque de esta manera
se podra utilizar el uso del raton o de una pestaña extra en dado caso que se desee utilizar.
- por otra parte, el metodo JLayeredPane es un contenedor java que admite otros componentes; su funcionamiento se basa en
que situa los componentes de una clase, metodo y/u objeto en capas, de forma que se superponen unos sobre otros sin eliminar
los demás
/**
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
esta clase nos permite crear los botones de manera privada ya que no se accionaran hasta que se haga alguna accion
permitida, ya sea por medio de la tecla de un boton, un clic del raton etc; los botones se refieren a la transmision de la
imagen o video, el reproductor de audio o musica, las imagenes/emoticones para el menu, el volumen, los canales y la configuracion.
por ultimo se avanza a la capa 2 en donde se colocara el boton, la base y el poder realizar la transmision
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
