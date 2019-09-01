package Beans;

import java.io.Serializable;

public class Login implements Serializable {
  String user, pass;

  public Login() {
  }
  
  public String getEmail() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }
  
  //method - data of the auth(password)
  public boolean auth(){
    return (pass.equals("123")) ? true : false;
  }
}
