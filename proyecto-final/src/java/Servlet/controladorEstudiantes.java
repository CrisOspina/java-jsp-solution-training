
package Servlet;

import Beans.Estudiantes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
import org.json.JSONObject;

public class controladorEstudiantes extends HttpServlet {

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
    
    String identificacion = request.getParameter("txtIdentificacion");
    String nombres = request.getParameter("txtNombre");
    String apellidos = request.getParameter("txtApellidos");
    String cursos = request.getParameter("txtCurso");
    String jornada = request.getParameter("txtJornada");
    
    Estudiantes estudiante = new Estudiantes();
    
    //validate inputs obligatory
    estudiante.setIdentificacion(identificacion);
    estudiante.setNombres(nombres);
    estudiante.setApellidos(apellidos);
    estudiante.setCursos(cursos);
    estudiante.setJornada(jornada);
    
    boolean inputsNotEmpty = estudiante.inputEmpty();
    
    // Creation object for the students
    JSONObject dataStudent = new JSONObject();
    try {
      dataStudent.put("identificacion", identificacion);
      dataStudent.put("nombres", nombres);
      dataStudent.put("apellidos", apellidos);
      dataStudent.put("curso", cursos);
      dataStudent.put("jornada", jornada);
    } catch (JSONException ex) {
      System.out.print(ex);
    }
      
    //dispatch response to method
    RequestDispatcher dispatch = null;
    
    if(inputsNotEmpty){
        dispatch = request.getRequestDispatcher("Success.jsp");
        request.setAttribute("dataStudent", dataStudent);
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
