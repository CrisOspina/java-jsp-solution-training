package controlador;

import dao.VehiculoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Vehiculo;

public class VehiculoControlador extends HttpServlet {
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
     
    }
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    //processRequest(request, response);
  }
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    //processRequest(request, response);
    
    String placa = request.getParameter("txtPlacaVehi");
    String marca = request.getParameter("txtMarca");
    String referencia = request.getParameter("txtReferencia");
    int modelo = Integer.parseInt(request.getParameter("txtModel"));
    int idTv = Integer.parseInt(request.getParameter("txtIdTv"));
    
    // Tomar el parametro que va a tener la accion (registrar, actualizar y eliminar)
    String accion = request.getParameter("accion").toLowerCase();
    
    // Instanciación de objeto del modelo Vehiculo
    Vehiculo vehiculo = new Vehiculo();
    
    // Asignar al objeto los valores que vienen del formulario
    vehiculo.setPlacaVehiculo(placa);
    vehiculo.setMarca(marca);
    vehiculo.setReferenciaVehiculo(referencia);
    vehiculo.setModelo(modelo);
    vehiculo.setIdTipoVehiculo(idTv);
    
    // Validar acción que se ejecutara
    switch(accion){
      case "registrar":
        if(VehiculoDAO.insertarVehiculo(vehiculo)){
          request.setAttribute("mensaje", " 👉 Vehiculo registrado ✔ ");
        } else {
          request.setAttribute("mensaje", " 👉 Vehiculo NO registrado ❌ ");
        }
        break;
      case "actualizar":
        break;
    }
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>
}
