package PBotones;

import PMain.Tv;

/**
 * Class Boton
 */
public abstract class Boton {

    protected Tv tv;

    //
    // Fields
    //
    //
    // Constructors
    //
    //Herrera improvement 
    public Boton() {
    }

    ;
    
    public Boton(Tv tv) {
        this.tv = tv;
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
    public abstract void execute();
}
