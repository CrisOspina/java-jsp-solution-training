package modelo;

import java.io.Serializable;

public class Teacher implements Serializable {
  private String name, avatar;
  private int id_teacher;

  public Teacher(String name, String avatar, int id_teacher) {
    this.name = name;
    this.avatar = avatar;
    this.id_teacher = id_teacher;
  }

  public Teacher() {
    this.id_teacher = 0;
    this.name = "";
    this.avatar = "";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public int getId_teacher() {
    return id_teacher;
  }

  public void setId_teacher(int id_teacher) {
    this.id_teacher = id_teacher;
  }
  
  
}
