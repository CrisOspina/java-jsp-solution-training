package modelo;

public class Ruta {
  private int idRuta, idTipoVehiculo;
  private String estacion;
  
  public Ruta(){
    this.idRuta = 0;
    this.estacion = "";
    this.idTipoVehiculo = 0;
  }

  public Ruta(int idRuta, int idTipoVehiculo, String estacion) {
    this.idRuta = idRuta;
    this.idTipoVehiculo = idTipoVehiculo;
    this.estacion = estacion;
  }

  public int getIdRuta() {
    return idRuta;
  }

  public void setIdRuta(int idRuta) {
    this.idRuta = idRuta;
  }

  public int getIdTipoVehiculo() {
    return idTipoVehiculo;
  }

  public void setIdTipoVehiculo(int idTipoVehiculo) {
    this.idTipoVehiculo = idTipoVehiculo;
  }

  public String getEstacion() {
    return estacion;
  }

  public void setEstacion(String estacion) {
    this.estacion = estacion;
  }
}
