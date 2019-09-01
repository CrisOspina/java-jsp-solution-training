package Servlet;

import Beans.Login;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controladorLogin extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
     
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    //request the params
    String user = request.getParameter("txtUser");
    String pass = request.getParameter("txtPass");
    
    //create an object type "Beans (login)" for take place the params
    Login login = new Login();
    login.setUser(user);
    login.setPass(pass);
    
    //call auth method
    boolean auth = login.auth();
    
    //dispatch response to validation auth
    RequestDispatcher dispatch = null;
    
    if(auth){
      dispatch = request.getRequestDispatcher("Main.jsp");
      request.setAttribute("user", user);
    } else {
      dispatch = request.getRequestDispatcher("Error.jsp");
    }
    
    //dispatch of response (rutes the response)
    dispatch.forward(request, response); 
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
