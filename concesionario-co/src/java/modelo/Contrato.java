package modelo;

public class Contrato {
  private int idContrato, idVehiculo, idConductor;
  
  public Contrato(){
    this.idContrato = 0;
    this.idConductor = 0;
    this.idVehiculo = 0;
  }

  public Contrato(int idContrato, int idVehiculo, int idConductor) {
    this.idContrato = idContrato;
    this.idVehiculo = idVehiculo;
    this.idConductor = idConductor;
  }

  public int getIdContrato() {
    return idContrato;
  }

  public void setIdContrato(int idContrato) {
    this.idContrato = idContrato;
  }

  public int getIdVehiculo() {
    return idVehiculo;
  }

  public void setIdVehiculo(int idVehiculo) {
    this.idVehiculo = idVehiculo;
  }

  public int getIdConductor() {
    return idConductor;
  }

  public void setIdConductor(int idConductor) {
    this.idConductor = idConductor;
  } 
}
