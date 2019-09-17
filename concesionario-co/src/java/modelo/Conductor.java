package modelo;

public class Conductor {
  private int idConductor, idVehiculoC, idTipoConductor;
  private String nombreConductor, tipoLicenciaC;

  public Conductor() {
    this.idConductor = 0;
    this.idVehiculoC = 0;
    this.idTipoConductor = 0;
    this.nombreConductor = "";
    this.tipoLicenciaC = "";
  }

  public Conductor(int idConductor, int idVehiculoC, int idTipoConductor, String nombreConductor, String tipoLicenciaC) {
    this.idConductor = idConductor;
    this.idVehiculoC = idVehiculoC;
    this.idTipoConductor = idTipoConductor;
    this.nombreConductor = nombreConductor;
    this.tipoLicenciaC = tipoLicenciaC;
  }

  public int getIdConductor() {
    return idConductor;
  }

  public void setIdConductor(int idConductor) {
    this.idConductor = idConductor;
  }

  public int getIdVehiculoC() {
    return idVehiculoC;
  }

  public void setIdVehiculoC(int idVehiculoC) {
    this.idVehiculoC = idVehiculoC;
  }

  public int getIdTipoConductor() {
    return idTipoConductor;
  }

  public void setIdTipoConductor(int idTipoConductor) {
    this.idTipoConductor = idTipoConductor;
  }

  public String getNombreConductor() {
    return nombreConductor;
  }

  public void setNombreConductor(String nombreConductor) {
    this.nombreConductor = nombreConductor;
  }

  public String getTipoLicenciaC() {
    return tipoLicenciaC;
  }

  public void setTipoLicenciaC(String tipoLicenciaC) {
    this.tipoLicenciaC = tipoLicenciaC;
  }
}
