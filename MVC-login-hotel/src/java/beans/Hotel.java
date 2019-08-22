package beans;

import java.io.Serializable;

public class Hotel implements Serializable {
  private int tarifaIndividual;
  private int tarifaDoble;
  private int tarifaFamiliar;
  private double iva;
  private int dias, personas;

  public Hotel() {
    
  }

  public int getTarifaIndividual() {
    return tarifaIndividual;
  }

  public void setTarifaIndividual(int tarifaIndividual) {
    this.tarifaIndividual = tarifaIndividual;
  }

  public int getTarifaDoble() {
    return tarifaDoble;
  }

  public void setTarifaDoble(int tarifaDoble) {
    this.tarifaDoble = tarifaDoble;
  }

  public int getTarifaFamiliar() {
    return tarifaFamiliar;
  }

  public void setTarifaFamiliar(int tarifaFamiliar) {
    this.tarifaFamiliar = tarifaFamiliar;
  }

  public double getIva() {
    return iva;
  }

  public void setIva(double iva) {
    this.iva = iva;
  }

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

  public int getPersonas() {
    return personas;
  }

  public void setPersonas(int personas) {
    this.personas = personas;
  }
  
  //methods
  public int precioHabitacion(int dias, int tarifa){
    return dias * tarifa;
  }
  
  public double precioConIva(double precioHabitacion, double iva){
    return precioHabitacion * iva;
  }
  
  public double precioFinal(int precioHabitacion, double precioConIva){
    return precioHabitacion + precioConIva;
  }
  
  public double descuento(double precioFinal, double valor1, double valor2){
    return precioFinal - (valor1 / valor2 * precioFinal);
  }
}
