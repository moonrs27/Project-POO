package PBotones;

import PMain.Tv;



/**
 * Class BotonApagado
 */
public class BotonApagado extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonApagado (Tv tv) { 
        super(tv);
    };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

/**
* Cruz Moreno Carlos Ivan 
* Implementacion del patron comando 
* desacoplamineto del metodo execute hacia el metodo apagarTv 
*/

    @Override
    public void execute() {
        apagarTv();
    }

/**
* Cruz Moreno Carlos Ivan 
* Implementacion de apagarTv
* Llamando apagar de la referencia Tv a la que pertenece el BotonApagado
* BotonApagado mantiene una referencia local a Tv 
* Tv se compone de un BotonApagado
* new Clase(){
*		//En este bloque se puede ver todos los atributos y metodos de BotonApagado
*	}
*/
    private void apagarTv() {
        this.tv.apagar();
    }
 
}
