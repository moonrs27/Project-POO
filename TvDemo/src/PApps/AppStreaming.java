package PApps;


import PApps.App;



/**
 * Class StreamingApp
 */
public class AppStreaming extends Thread {

  //
  // Fields
  //

  
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

}
