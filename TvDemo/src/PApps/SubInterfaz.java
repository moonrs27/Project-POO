package PApps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Class App
 */
public class SubInterfaz extends JFrame implements ActionListener {

  //
  // Fields
  //
    private JButton Stream;
    private JButton Music;
    private ImageIcon todo; 
    private ImageIcon todo1;
    private ImageIcon todo2;
    private JLayeredPane capa1;
    private AppStreaming menu;
  
  //
  // Constructors
  //
    public SubInterfaz(){
            specsVentana();
            specsBoton();
            colocarBase();
            accion();        
    }
  
  //
  // Methods
  //
    public void specsVentana(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Aplicaciones");
    }
    
    private void specsBoton(){
        Stream = new JButton();
        Music = new JButton();
        
        this.Stream.setVisible(true);
        todo1 = new ImageIcon("video-stream.png");
        Stream.setOpaque(true);
        Stream.setBackground(Color.DARK_GRAY);
        Stream.setBounds(0,195,110,210);
        
        Stream.setIcon(new ImageIcon(todo1.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH) ) );
       // Stream.setVisible(true);
        Stream.setActionCommand("Video");
        
        todo2 = new ImageIcon("music.png");
        Music.setOpaque(true);
        Music.setBackground(Color.DARK_GRAY);
        Music.setBounds(110,195,110,210);
        this.Music.setVisible(true);
        Music.setIcon(new ImageIcon(todo2.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH) ) );
        Music.setActionCommand("Sonido");
        
    }
    
    private void colocarBase(){       
        capa1 = new JLayeredPane();
        capa1.setOpaque(true);
        //capa1.setBackground(Color.CYAN);
        
        capa1.setBounds(0,640,400,400);
        capa1.add(Stream,Integer.valueOf(1));
        capa1.add(Music,Integer.valueOf(2));
        
        this.add(capa1);
    }

    private void accion(){
        Stream.addActionListener(this);
        Music.addActionListener(this);
    }
  //
  // Accessor methods
  //

  //
  // Other methods
  //
    @Override
    public void actionPerformed(ActionEvent e){
        menu = new AppStreaming();
        if ("Video".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Stream");
            
            
        }else if ("Sonido".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Musica");
	
        }
        //System.out.println(" las APPs");
        //APPs.setVisible(false);
        //menu.Abrir();
    }

}