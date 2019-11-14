<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <meta name="description" content="@crisospina523" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
    <title>Catalogo de docentes</title>

    <!-- Styles Main -->
    <%@include file="styles/styles-template.jsp" %>
  </head>

  <body class="no-skin">
    <!-- Redireccionamiento a listar vehiculos -->
    <header>
      <jsp:forward page="listar-vehiculos.jsp"></jsp:forward>
    </header>
  </body>
</html>
