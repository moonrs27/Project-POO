package PBotones;

import PMain.Tv;



/**
 * Class BotonSubirVolumen
 */
public class BotonSubirVolumen extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonSubirVolumen () {
        super();
    };
    public BotonSubirVolumen (Tv tv) {
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
        subirVolumen();
    }

    private void subirVolumen() {
        this.tv.subirVolumen();
    }

}
