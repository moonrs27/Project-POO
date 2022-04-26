package PBotones;

import PMain.Tv;



/**
 * Class BotonEncendido
 */
public class BotonEncendido extends Boton {
    
    public BotonEncendido(Tv tv) {
        super(tv);
    }

  //
  // Fields
  //

  
  //
  // Constructors
  //
  //Herrera improvement 
    public BotonEncendido () { 
        super();
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
        encenderTv();
    }

    private void encenderTv() {
        this.tv.encender();
    }

}
