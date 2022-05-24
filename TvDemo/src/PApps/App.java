package PApps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


/**
 * Class App
 */
public class App implements ActionListener {
    AppStreaming stream;
    AppMusica music;
    Acciones hacer;
  //
  // Fields
  //


  
  //
  // Constructors
  //
  //
    public App(){
    }
    
    public App(AppStreaming a, Acciones b){
        this.stream = a;
        this.hacer = b;
    }
    
    public App(AppMusica c, Acciones b){
        this.music = c;
        this.hacer = b;
    }
    
    
  
  //
  // Methods
  //
    

  //
  // Accessor methods
  //


  //
  // Other methods
  //
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Esta en la activacion de APPs");
        //System.out.println("El valor de APP en activacion: "+e.getActionCommand());
        if ("Stream".equals(e.getActionCommand())) {
            
            System.out.println("Activo la App Stream");
            stream.abrir();
            
        }else if ("Musica".equals(e.getActionCommand())) {
            music.abrir();
            System.out.println("Activo la App Musica");
	
        }
    }

}
