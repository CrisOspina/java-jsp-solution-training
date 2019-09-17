package modelo;

public class Vehiculo {
  private String placaVehiculo, marca, referenciaVehiculo;
  private int modelo, idTipoVehiculo;
  
  public Vehiculo(){
    this.placaVehiculo = "";
    this.marca = "";
    this.referenciaVehiculo = "";
    this.modelo = 0;
    this.idTipoVehiculo = 0;
  }

  public Vehiculo(String placaVehiculo, String marca, String referenciaVehiculo, int modelo, int idTipoVehiculo) {
    this.placaVehiculo = placaVehiculo;
    this.marca = marca;
    this.referenciaVehiculo = referenciaVehiculo;
    this.modelo = modelo;
    this.idTipoVehiculo = idTipoVehiculo;
  }

  public String getPlacaVehiculo() {
    return placaVehiculo;
  }

  public void setPlacaVehiculo(String placaVehiculo) {
    this.placaVehiculo = placaVehiculo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getReferenciaVehiculo() {
    return referenciaVehiculo;
  }

  public void setReferenciaVehiculo(String referenciaVehiculo) {
    this.referenciaVehiculo = referenciaVehiculo;
  }

  public int getModelo() {
    return modelo;
  }

  public void setModelo(int modelo) {
    this.modelo = modelo;
  }

  public int getIdTipoVehiculo() {
    return idTipoVehiculo;
  }

  public void setIdTipoVehiculo(int idTipoVehiculo) {
    this.idTipoVehiculo = idTipoVehiculo;
  }
}
