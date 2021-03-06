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
              Gestionar los Vehículos
              <small>
                <i class="ace-icon fa fa-angle-double-right"></i>
                Registro de Vehículos
              </small>
            </h1>
          </div><!-- /.page-header -->


          <!-- Tabla principal - Mostrar resultados -->
          <% //@include file="components/table-main.jsp" %>

          <!-- Form Registro -->
          <div class="row">
            <div class="col-xs-12">
              <div class="table-header mb-4">
                Registro tipos de vehiculos
                <!-- Mensaje de validación de inserción de nuevo registro -->
                <div class="text-center">
                  <%= (request.getAttribute("mensaje") != null ? request.getAttribute("mensaje") : "")%>
                </div>
              </div>

              <div class="container" style="display: flex; justify-content: center;">
                <form action="TipoVehiculo" method="post" class="form-horizontal">
                  <div class="form-group">
                    <label class="control-label no-padding-right">
                      ID - tipo vehiculo
                    </label>
                    <div class="form-group">
                      <input type="text" name="idTv" value="" placeholder="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="control-label no-padding-right">
                      Nombre - tipo vehiculo
                    </label>
                    <div class="form-group">
                      <input class="" type="text" name="nombreTv" value="" placeholder="">
                    </div>
                    <button class="btn btn-primary btn-block" type="submit">
                      <i class="fa fa-save"> Registrar</i>
                    </button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div><!-- /.row -->
      </div><!-- /.page-content -->
    </div>

    <!-- Footer -->
    <%@include file="components/footer.jsp" %>

    <!-- Scripts JS -->
    <%@include file="js/js.jsp"%>
  </body>
</html>
