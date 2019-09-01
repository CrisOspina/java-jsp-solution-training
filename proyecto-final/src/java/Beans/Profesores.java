package Beans;

import java.io.Serializable;

public class Profesores implements Serializable {
  String cedula, nombres, apellidos, especialidad, jornada;

  public Profesores() {
  }

  public String getcedula() {
    return cedula;
  }

  public void setcedula(String cedula) {
    this.cedula = cedula;
  }

  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public String getJornada() {
    return jornada;
  }

  public void setJornada(String jornada) {
    this.jornada = jornada;
  }
  
  public boolean inputEmpty(){
    if(!(cedula.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || especialidad.isEmpty())){
      return true;
    } else {
      return false;
    }
  }
}
