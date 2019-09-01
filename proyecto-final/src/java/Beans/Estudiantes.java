package Beans;

import java.io.Serializable;

public class Estudiantes implements Serializable {
  String identificacion, nombres, apellidos, cursos, jornada;

  public Estudiantes() {
   
  }

  public String getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion(String identificacion) {
    this.identificacion = identificacion;
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

  public String getCursos() {
    return cursos;
  }

  public void setCursos(String cursos) {
    this.cursos = cursos;
  }

  public String getJornada() {
    return jornada;
  }

  public void setJornada(String jornada) {
    this.jornada = jornada;
  }
  
  public boolean inputEmpty(){
    if(!(identificacion.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || cursos.isEmpty())){
      return true;
    } else {
      return false;
    }
  }
}