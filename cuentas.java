package Ccuenta;


/**
 *
 * @author Domingo Jorge Morin Quintana
 */
public class cuentas {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta1
     */
    public String getCuenta1() {
        return cuenta1;
    }

    /**
     * @param cuenta1 the cuenta1 to set
     */
    public void setCuenta1(String cuenta1) {
        this.cuenta1 = cuenta1;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }


    // Propiedades de la Clase Cuenta
  /**
   * 
   */
  private String nombre;
    private String cuenta1;
    private double saldo;
    private double tipoInterés;

    /** Constructor sin argumentos 
     */
    public cuentas ()
    {
    }
    /** Constructor con parámetro para iniciar todas las propiedades de la clase
     * 
     * @param nom Nombre del cliente de la cuenta
     * @param cue Número de la cuenta del cliente
     * @param sal Saldo actual en la cuenta
     * @param tipo Tipo de interés a aplicar a la cuenta
     */
    public cuentas (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta1=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
   /** Método para asignar el nombre del titular de la cuenta
     * 
     * @param nom Nombre del titular
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /** Método que me devuelve el nombre del titular
     * 
     * @return <code>nombre</code> Nombre del titular
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /** Método que me devuelve el saldo disponible en cada momento
     * 
     * @return <code>saldo</code> Saldo disponible en la cuenta
     */
     public double estado ()
    {
        return getSaldo();
    }

    /** Método para ingresar cantidades en la cuenta. Modifica el saldo.
      * 
      * @param cantidad Dinero a ingresar en cuenta
      * @throws Exception  Controlamos que no se introduzcan cantidades negativas
      */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(getSaldo() + cantidad);
    }



    /** Método para retirar cantidades en la cuenta. Modifica el saldo.
     * 
     * @param cantidad Dinero a sacar de la cuenta
     * @throws Exception  Controlamos que no se retiren cantidades negativas ni superiores al saldo
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(getSaldo() - cantidad);
    }
    /**
     * Devuelve el número de cuenta 
     * @return <code>cuenta</code> Cadena con el número de cuenta
     */
    public String obtenerCuenta ()
    {
        return getCuenta1();
    }

  /**
   * Asignamos el número de la cuenta
     * @param cuenta Numero de la cuenta del cliente
     */
  public void setCuenta(String cuenta) {
      this.setCuenta1(cuenta);
  }

  /**
   * Asignamos el valor al saldo
   * @param saldo Introduce el saldo actual
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Nos devuelve el tipo de interés
   * @return <code>tipoInterés</code> Porcentaje a aplicar
   */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Asignamos el valor del tipo de interés
   * @param tipoInterés Porcentaje a aplicar
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
