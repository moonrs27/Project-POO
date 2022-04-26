package PBotones;

import PMain.Tv;



/**
 * Class BotonBajarVolumen
 */
public class BotonBajarVolumen extends Boton {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonBajarVolumen () {
        super();
    };
    public BotonBajarVolumen (Tv tv) { 
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
        bajarVolumen();
    }

    private void bajarVolumen() {
        this.tv.bajarVolumen();
    }

}
