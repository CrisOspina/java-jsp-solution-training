package modelo;

public class TeacherSocialMedia {
  private int id_teacher_social_media, id_teacher, id_social_media;
  private String nickname;

  public TeacherSocialMedia(int id_teacher_social_media, int id_teacher, int id_social_media, String nickname) {
    this.id_teacher_social_media = id_teacher_social_media;
    this.id_teacher = id_teacher;
    this.id_social_media = id_social_media;
    this.nickname = nickname;
  }

  public TeacherSocialMedia() {
    this.id_teacher_social_media = 0;
    this.id_teacher = 0;
    this.id_social_media = 0;
    this.nickname = "";
  }

  public void setId_teacher_social_media(int id_teacher_social_media) {
    this.id_teacher_social_media = id_teacher_social_media;
  }

  public int getId_teacher() {
    return id_teacher;
  }

  public void setId_teacher(int id_teacher) {
    this.id_teacher = id_teacher;
  }

  public int getId_social_media() {
    return id_social_media;
  }

  public void setId_social_media(int id_social_media) {
    this.id_social_media = id_social_media;
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }
  
  
  
}
