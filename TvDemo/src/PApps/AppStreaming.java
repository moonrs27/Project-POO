package PApps;
/*
MONTSERRAT ROJAS SANTILLAN
paquete de la aplicacion de transmision y musica
*/

import PApps.App;

/*
MONTSERRAT ROJAS SANTILLAN
importacion del paquete apps en el codigo App
*/

/**
 * Class StreamingApp
 */
public class AppStreaming extends Thread {

  //
  // Fields
  //

  /*
MONTSERRAT ROJAS SANTILLAN
se crea una clase para la aplicacion de la transmision mediante los hilos de la herencia, los metodos y las clases abstractas
*/
	
  //
  // Constructors
  //
  //Herrera improvement public StreamingApp () { };
  
  //
  // Methods
  //
  @Override
     public void run() {
         System.out.println("Iniciando la intefaz de la APP");
         
         
     }

/*
MONTSERRAT ROJAS SANTILLAN
el metodo run ejecutara el mensaje una vez que se inicie la app
*/

  //
  // Accessor methods
  //

  //
  // Other methods
  //
    private void esperarXsegundos(int segundos) {
	try {
            Thread.sleep(segundos * 1000);
	} catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
	}
    } 
	
	/*
MONTSERRAT ROJAS SANTILLAN
metodo privado que se encargara de intentar realizar un conteo de tiempo de ejecucion e intentar detenerlo en un lapso de valor
de manera que se pueda atrapar una interrupcion de tiempo en caso de que las pestañas fallen o no se ejecuten correctamente
*/

}
