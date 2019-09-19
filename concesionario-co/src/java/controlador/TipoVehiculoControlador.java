package controlador;

import dao.TipoVehiculoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.TipoVehiculo;

public class TipoVehiculoControlador extends HttpServlet {

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
  
  // Reglas de negocio ---------------------------------------------------------
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    //processRequest(request, response);
    
    // Recibir los datos
    int idTv = Integer.parseInt(request.getParameter("idTv"));
    String nombreTv = request.getParameter("nombreTv");
    
    // Instanciar obj del modelo TipoVehiculo
    TipoVehiculo tipoVehiculo = new TipoVehiculo();
    
    // Asignamos valor que se captura en el input
    tipoVehiculo.setIdtv(idTv);
    tipoVehiculo.setNombreTipoVehiculo(nombreTv);
    
    // LLamamos la clase DAO con su método estático y validamos
    if(TipoVehiculoDAO.insertarTipoVehiculo(tipoVehiculo)){
      request.setAttribute("mensaje", "👉 Tipo vehiculo registrado ✔");
    } else {
      request.setAttribute("mensaje", "👉 Tipo vehiculo NO registrado ❌");
    }
    
    request.getRequestDispatcher("registrar-tipo-vehiculos.jsp").forward(request, response);
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
