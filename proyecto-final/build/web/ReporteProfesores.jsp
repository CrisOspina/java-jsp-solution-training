<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
    <title>Reporte</title>
  </head>
  <body>
    <div class="container mt-5">
      <h3><a href="Main.jsp"><span class="badge badge-secondary">Volver</span></a></h3>
      <h1 class="display-4 text-center">Profesores Registrados</h1>
      <table class="table table-striped mt-3">
        <thead>
          <tr>
            <th scope="col">Cédula</th>
            <th scope="col">Nombres</th>
            <th scope="col">Apellidos</th>
            <th scope="col">Especialidad</th>
            <th scope="col">Jornada</th>
          </tr>
        </thead>
        <tbody id="bodyTable">
         <!-- Data students from localstorage -->
         
        </tbody>
      </table>
    </div>
    
    
    <script type="text/javascript">
      const data = JSON.parse(localStorage.getItem("profesores"));
      
      let bodyTable = document.querySelector('#bodyTable');
      bodyTable.innerHTML = '';
      data.reverse();
      for(let item of data){
          bodyTable.innerHTML += 
           "<tr>" + "<td>" + item.cedula + "</td>" +
                    "<td>" + item.nombres + "</td>" +
                    "<td>" + item.apellidos + "</td>" +
                    "<td>" + item.especialidad + "</td>" +
                    "<td>" + item.jornada + "</td>" 
            "<tr>";
      }
    </script>
  </body>
</html>
