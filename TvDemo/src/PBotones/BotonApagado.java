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

    @Override
    public void execute() {
        apagarTv();
    }

    private void apagarTv() {
        this.tv.apagar();
    }
 
}
