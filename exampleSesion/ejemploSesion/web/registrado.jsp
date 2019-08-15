<%-- 
    Document   : registrado
    Created on : 14/08/2019, 08:48:14 PM
    Author     : CristianOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sesión</title>
  </head>
  <body>
    <h1>Bienvenido</h1>
    <% 
      String usuarioIn = "", rolIn = "", nombreIn = "", jefeIn = "", claveIn = "";
      
      //validar que POST si traiga datos del formulario y lugo almacenarlos
      if(request.getParameter("txtUsuario") != null){
        usuarioIn = request.getParameter("txtUsuario");
      }
      if(request.getParameter("txtRol") != null){
        rolIn = request.getParameter("txtRol");
      }
      if(request.getParameter("txtNombre") != null){
        nombreIn = request.getParameter("txtNombre");
      }
      if(request.getParameter("txtJefe") != null){
        jefeIn = request.getParameter("txtJefe");
      }
      if(request.getParameter("txtClave") != null){
        claveIn = request.getParameter("txtClave");
      }
    %>
    
    <jsp:useBean id="sesionActual" class="Beans.sesion" scope="session"></jsp:useBean>
    <jsp:setProperty name="sesionActual" property="usuario" value="<%=usuarioIn%>"></jsp:setProperty>
    <jsp:setProperty name="sesionActual" property="rol" value="<%=rolIn%>"></jsp:setProperty>
    <jsp:setProperty name="sesionActual" property="nombre" value="<%=nombreIn%>"></jsp:setProperty>
    <jsp:setProperty name="sesionActual" property="jefe" value="<%=jefeIn%>"></jsp:setProperty>
    <jsp:setProperty name="sesionActual" property="clave" value="<%=claveIn%>"></jsp:setProperty>
    
    <table>
      <tr>
        <td> Usuario </td>
        <td> <jsp:getProperty name="sesionActual" property="usuario"></jsp:getProperty> </td>
      </tr>
      <tr>
        <td> Rol </td>
        <td> <jsp:getProperty name="sesionActual" property="rol"></jsp:getProperty> </td>
      </tr>
      <tr>
        <td> Nombre </td>
        <td> <jsp:getProperty name="sesionActual" property="nombre"></jsp:getProperty> </td>
      </tr>
      <tr>
        <td> Jefe </td>
        <td> <jsp:getProperty name="sesionActual" property="jefe"></jsp:getProperty> </td>
      </tr>
      <tr>
        <td> Clave </td>
        <td> <jsp:getProperty name="sesionActual" property="clave"></jsp:getProperty> </td>
      </tr>
    </table>
  </body>
</html>
