package Beans;

import java.io.Serializable;


public class sesion implements Serializable {
  //Atributos
  String usuario;
  String rol;
  String nombre;
  String jefe;
  String clave;

  //constructor
  public sesion() {
  }
  
  //Getter and Setter
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getJefe() {
    return jefe;
  }

  public void setJefe(String jefe) {
    this.jefe = jefe;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  } 
}
