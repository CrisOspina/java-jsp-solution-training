package modelo;

import java.io.Serializable;

public class TipoVehiculo implements Serializable {
  private int idtv;
  private String nombreTipoVehiculo;

  public TipoVehiculo() {
    this.idtv = 0;
    this.nombreTipoVehiculo = "";
  }

  public TipoVehiculo(int idtv, String nombreTipoVehiculo) {
    this.idtv = idtv;
    this.nombreTipoVehiculo = nombreTipoVehiculo;
  }
  
  public int getIdtv() {
    return idtv;
  }

  public void setIdtv(int idtv) {
    this.idtv = idtv;
  }

  public String getNombreTipoVehiculo() {
    return nombreTipoVehiculo;
  }

  public void setNombreTipoVehiculo(String nombreTipoVehiculo) {
    this.nombreTipoVehiculo = nombreTipoVehiculo;
  }
}
