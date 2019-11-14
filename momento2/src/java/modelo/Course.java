package modelo;

import java.io.Serializable;

public class Course implements Serializable {
  private int id_course, id_teacher;
  private String name, themes, project;

  public Course(int id_course, int id_teacher, String name, String themes, String project) {
    this.id_course = id_course;
    this.id_teacher = id_teacher;
    this.name = name;
    this.themes = themes;
    this.project = project;
  }
  
  public Course() {
    this.id_course = 0;
    this.id_teacher = 0;
    this.name = "";
    this.themes = "";
    this.project = "";
  }

  public int getId_course() {
    return id_course;
  }

  public void setId_course(int id_course) {
    this.id_course = id_course;
  }

  public int getId_teacher() {
    return id_teacher;
  }

  public void setId_teacher(int id_teacher) {
    this.id_teacher = id_teacher;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getThemes() {
    return themes;
  }

  public void setThemes(String themes) {
    this.themes = themes;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }
}
