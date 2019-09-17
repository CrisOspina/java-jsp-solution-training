package modelo;

public class TipoConductor {
  private int idTC;
  private String nombreTipoConductor;
  
  public TipoConductor() {
    this.idTC = 0;
    this.nombreTipoConductor = "";
  }

  public TipoConductor(int idTC, String nombreTipoConductor) {
    this.idTC = idTC;
    this.nombreTipoConductor = nombreTipoConductor;
  }

  public int getIdTC() {
    return idTC;
  }

  public void setIdTC(int idTC) {
    this.idTC = idTC;
  }

  public String getNombreTipoConductor() {
    return nombreTipoConductor;
  }

  public void setNombreTipoConductor(String nombreTipoConductor) {
    this.nombreTipoConductor = nombreTipoConductor;
  }
}
