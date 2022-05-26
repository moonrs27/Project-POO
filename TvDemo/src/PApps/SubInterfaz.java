package PApps;

/*
MONTSERRAT ROJAS SANTILLAN
paquete de la aplicacion de transmision y musica
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
MONTSERRAT ROJAS SANTILLAN
los paquetes swing y awt nos ayudan a traves de eventos/metodos a crear interfaces en las clases ya sean botones de texto
pestañas con imagenes, mensajes en formato de imagenes etc
*/

/*
 * Class App
 */
public class SubInterfaz extends JFrame implements ActionListener {

/*
MONTSERRAT ROJAS SANTILLAN
la clase subinterfaz extiende el uso de ventanas para que el usuario pueda interactuar con las acciones del programa con la implementacion
de metodos y poder "escuchar" los eventos del programa y lo que la ventana pueda hacer
*/
	
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

/*
MONTSERRAT ROJAS SANTILLAN
se otorga privacidad a los botones ya que de esta manera solo los metodos de la clase podran ejecutar las acciones para realizar
la transmision, la reproduccion de musica etc. ademas de asignar iconos en los metodos y acceder a las capas.
por ultimo se crea un menu para la aplicacion de transmision y de esta manera interactuar con la pestaña.
*/
	
  //
  // Constructors
  //
    public SubInterfaz(){
            specsVentana();
            specsBoton();
            colocarBase();
            accion();        
    }
	
/*
MONTSERRAT ROJAS SANTILLAN
se crea un constructor que especifique las acciones de los botones, las especificaciones de las ventanas que se utilicen,
y el color que se vaya a hacer. se invoca el metodo "accion"
*/
  
  //
  // Methods
  //
    public void specsVentana(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Aplicaciones");
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	se hace referencia al menu para mostrar las aplicaciones que se encontrararan en la ventana, ademas de tener 
	las especificaciones sobre como llevar la aplicacion para acceder a ella y para cerrarse. para ello se colocan adecuadamente los componentes
	de la ventana para poder acceder a las acciones de la aplicacion una vez que se elige una de ellas.
	se titula "aplicaciones"
	*/
    }
    
    private void specsBoton(){
        Stream = new JButton();
        Music = new JButton();
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	metodo de especificaciones privado para los botones asignandolos como nuevos botones
	*/
        
        this.Stream.setVisible(true);
        todo1 = new ImageIcon("video-stream.png");
        Stream.setOpaque(true);
        Stream.setBackground(Color.DARK_GRAY);
        Stream.setBounds(0,195,110,210);
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	se hace referencia a la interfaz de la aplicacion de transmision, todo1 crea un nuevo icono de la aplicacion.
	la API (conjunto de procedimientos y funciones creados para permitir el acceso al backend de aplicaciones de 
	terceros con el fin de reutilizar servicios ya creado) necesita conocer el valor que se le dara a la pestaña una
	vez ejecute la aplicacion, se le asignaran valores de color y de parametros.
	*/
        
        Stream.setIcon(new ImageIcon(todo1.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH) ) );
       // Stream.setVisible(true);
        Stream.setActionCommand("Video");
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	en este metodo se asigna el icon adecuado para la parte de video en el apartado de la aplicacion de transmision, junto con
	sus especificaciones y su escala
	*/
        
        todo2 = new ImageIcon("music.png");
        Music.setOpaque(true);
        Music.setBackground(Color.DARK_GRAY);
        Music.setBounds(110,195,110,210);
        this.Music.setVisible(true);
        Music.setIcon(new ImageIcon(todo2.getImage().getScaledInstance(120,100,Image.SCALE_SMOOTH) ) );
        Music.setActionCommand("Sonido");
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	se hace referencia a la interfaz de la aplicacion de musica, todo2 crea un nuevo icono de la aplicacion.
	la API necesita conocer el valor que se le dara a la pestaña una vez ejecute la aplicacion, 
	se le asignaran valores de color y de parametros a la aplicacion y al icono.
	*/
        
    }
    
    private void colocarBase(){       
        capa1 = new JLayeredPane();
        capa1.setOpaque(true);
        //capa1.setBackground(Color.CYAN);
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	se colocara una base en las capas para asi poder tener una separacion de las aplicaciones y sus metodos
	*/
        
        capa1.setBounds(0,640,400,400);
        capa1.add(Stream,Integer.valueOf(1));
        capa1.add(Music,Integer.valueOf(2));
        
        this.add(capa1);
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	la capa 1 se encargara de tener los valores y datos para los datos que necesiten las ventanas ademas de integrar 
	sus valores y sentencias
	*/
    }

    private void accion(){
        Stream.addActionListener(this);
        Music.addActionListener(this);
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	las aplicaciones son seguidas para detectar los eventos y acciones que van a ejecutar dentro de su clase
	*/
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
	    
	/*
	MONTSERRAT ROJAS SANTILLAN
	se hara la implementacion de eventos en el programa durante el menu de aplicaciones por medio de metodos que la aplicacion
	ejecutaran. si "video" analiza los objetos que tiene "imagen" se encargara de no poseer algunos errores y asi activar la 
	aplicacion, si no se procesara la aplicacion de musica
	*/
    }

}
