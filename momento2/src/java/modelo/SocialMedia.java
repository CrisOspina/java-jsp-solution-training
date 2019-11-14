package modelo;

import java.io.Serializable;

public class SocialMedia implements Serializable {
  private int id_social_media;
  private String name, icon;

  public SocialMedia(int id_social_media, String name, String icon) {
    this.id_social_media = id_social_media;
    this.name = name;
    this.icon = icon;
  }

  public SocialMedia() {
    this.id_social_media = 0;
    this.name = "";
    this.icon = "";
  }
  
  public int getId_social_media() {
    return id_social_media;
  }

  public void setId_social_media(int id_social_media) {
    this.id_social_media = id_social_media;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  } 
}
