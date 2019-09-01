
package Servlet;

import Beans.Profesores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.json.JSONObject;

public class controladorProfesores extends HttpServlet {

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
    
    String cedula = request.getParameter("txtCedula");
    String nombres = request.getParameter("txtNombreP");
    String apellidos = request.getParameter("txtApellidosP");
    String especialidad = request.getParameter("txtEspecialidad");
    String jornada = request.getParameter("txtJornadaP");
    
    Profesores profesores = new Profesores();
    
    //validate inputs obligatory
    profesores.setcedula(cedula);
    profesores.setNombres(nombres);
    profesores.setApellidos(apellidos);
    profesores.setEspecialidad(especialidad);
    profesores.setJornada(jornada);
    
    boolean inputNotEmpty = profesores.inputEmpty();
    
    // Creation object for the students
    JSONObject dataTeachers = new JSONObject();
    try {
      dataTeachers.put("cedula", cedula);
      dataTeachers.put("nombres", nombres);
      dataTeachers.put("apellidos", apellidos);
      dataTeachers.put("especialidad", especialidad);
      dataTeachers.put("jornada", jornada);
    } catch (JSONException ex) {
      System.out.print(ex);
    }
    
    RequestDispatcher dispatch = null;
    
    if(inputNotEmpty){
      dispatch = request.getRequestDispatcher("Success.jsp");
      request.setAttribute("dataTeachers", dataTeachers);
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
