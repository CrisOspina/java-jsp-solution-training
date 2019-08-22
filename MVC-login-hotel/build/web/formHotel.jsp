<%-- 
    Document   : hotelCo
    Created on : 21/08/2019, 07:50:13 PM
    Author     : Cristian Ospina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
    <title>Formulario hotel</title>
  </head>
  <body>    
    <div class="container">
      <div class="row mt-2">
        <div class="col-12 text-center">
          <h2>Hotel CO</h2><hr>
        </div>
      </div>      
      
      <% //Formulario %>
      <div class="row mt-2">
        <div class="col-4"></div>
        <div class="col-4 text-center border p-4">    
          <form action = "indexHotel.jsp" method = "GET">
            <div class="form-group">
              <label for="d"> Días </label>
              <input type="number" class="form-control" name="dias" id="d" placeholder="Días a hospedarse">  
            </div>
            <div class="form-group">   
              <label for="p">Personas </label>
              <input type="number" class="form-control" name="personas" id="p" placeholder="Cantidad de huespedes">
            </div>
            <button type="submit" class="btn btn-primary">Consultar precio</button>
          </form>
        </div>        
      </div>
    </div>
  </body>
</html>
