<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <meta name="description" content="@crisospina523" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
    <title>Sowil Company</title>

    <!-- Styles Main -->
    <%@include file="styles/styles-template.jsp" %>
  </head>

  <body class="no-skin">

    <!-- Header -->
    <%@include file="components/header.jsp" %>

    <div class="main-container ace-save-state" id="main-container">

      <!-- Sidebar -->
      <div id="sidebar" class="sidebar responsive ace-save-state">

        <!-- Iconos navbar lateral -->
        <%@include file="components/iconos-navbar-lateral.jsp" %>

        <!-- Navbar lateral -->
        <%@include file="components/navbar-lateral.jsp" %>

      </div>

      <!-- Contenido principal -->
      <div class="main-content">

        <!-- Navbar search -->
        <%@include file="components/navbar-search.jsp" %>

        <!-- Page Content -->
        <div class="page-content">

          <!-- Setting Container -->
          <%@include file="components/setting-container.jsp"%>

          <div class="page-header">
            <h1>
              Listar vehiculos
            </h1>
          </div><!-- /.page-header -->


          <!-- Tabla principal - Mostrar resultados -->
          <% //@include file="components/table-main.jsp" %>

        </div><!-- /.row -->
      </div><!-- /.page-content -->
    </div>

    <!-- Footer -->
    <%@include file="components/footer.jsp" %>

    <!-- Scripts JS -->
    <%@include file="js/js.jsp"%>
  </body>
</html>
