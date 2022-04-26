package PResoluciones;



/**
 * Class Resolucion
 */
public class Resolucion {

  //
  // Fields
  //

  private double largo;
  private double ancho;
  
  //
  // Constructors
  //
  //Herrera improvement public Resolucion () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Fija el valor de largo
   * @param newVar el nuevo valor de largo
   */
  public void setLargo ( double newVar ) {
    largo = newVar;
  }

  /**
   * Devuelve el valor de largo
   * @return el valor de largo
   */
  public double getLargo ( ) {
    return largo;
  }

  /**
   * Fija el valor de ancho
   * @param newVar el nuevo valor de ancho
   */
  public void setAncho ( double newVar ) {
    ancho = newVar;
  }

  /**
   * Devuelve el valor de ancho
   * @return el valor de ancho
   */
  public double getAncho ( ) {
    return ancho;
  }

  //
  // Other methods
  //

}
