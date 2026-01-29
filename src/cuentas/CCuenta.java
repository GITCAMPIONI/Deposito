/*
 * Clase que representa una cuenta bancaria.
 * Permite consultar el saldo, realizar ingresos y retiradas.
 * Los atributos están encapsulados y se acceden mediante getters y setters.
 */
package cuentas;

public class CCuenta {

    /** Nombre del titular de la cuenta*/
    private String nombre;
    /**Numero de la cuenta bancaria*/
    private String cuenta;
    /**Saldo actual de la cuenta bancaria*/
    private double saldo;
    /**Tipo de interes de la cuenta*/
    private double tipoInterés;
    
    /**
     * Constructor po defecto.
     */
    public CCuenta()
    {
    }
    /**
     * Constructor con parámetros.
     *
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
    /**
     * Devuelve el nombre del titular de la cuenta
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del titular de la cuenta
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de la cuenta
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el numero de la cuenta
     * @param cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo actual de la cuenta
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés de la cuenta
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Modifica el tipo de interés de la cuenta
     * @param tipoInterés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;}    

    
    /**
     * Devuelve el saldo actual de la cuenta
     * @return getSaldo 
     */
    public double estado()
    {
        return getSaldo();
    }
    /**
     * Ingresa una cantidad en cuenta.
     * @param cantidad cantidad a ingresar (debe ser positiva).
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Retira un cantida de la cuenta.
     * @param cantidad Cantidad a retirar (debe ser positiva y menor o igual al saldo)
     * @throws Exception si la cantidad es negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
