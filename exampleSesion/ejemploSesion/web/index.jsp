<%-- 
    Document   : index
    Created on : 14/08/2019, 08:25:54 PM
    Author     : CristianOspina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">

  </head>
  <body>
    <h1>Loguearse</h1>
    
    <form action="registrado.jsp" method="post" class="container">
      <table>
        <tr>
          <td>Usuario</td>
          <td> <input type="text" name="txtUsuario" /> </td>
        </tr>
        <tr>
          <td>Rol</td>
          <td> <input type="text" name="txtRol" /> </td>
        </tr>
        <tr>
          <td>Nombre</td>
          <td> <input type="text" name="txtNombre" /> </td>
        </tr>
        <tr>
          <td>Jefe</td>
          <td> <input type="text" name="txtJefe" /> </td>
        </tr>
        <tr>
          <td>Clave</td>
          <td> <input type="password" name="txtClave" /> </td>
        </tr>
      </table>
      <input class="btn btn-primary" type="submit" value="Ingresar" />
    </form>
  </body>
</html>
