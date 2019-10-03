<%@page import="modelo.TipoVehiculo"%>
<%@page import="dao.TipoVehiculoDAO"%>
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
              <br><br>
              <div class="container-flex" style="display: flex; justify-content: center;">
                <form action="Vehiculo" method="post" class="form-horizontal">
                  <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">
                      Placa del vehiculo
                    </label>
                    <div class="col-sm-9">
                      <input type="text" name="txtPlacaVehi" value="" placeholder="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">
                      Marca del vehiculo
                    </label>
                    <div class="col-sm-9">
                      <input type="text" name="txtMarca" value="" placeholder="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">
                      Referencia del vehiculo
                    </label>
                    <div class="col-sm-9">
                      <input type="text" name="txtReferencia" value="" placeholder="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">
                      Modelo del vehiculo
                    </label>
                    <div class="col-sm-9">
                      <input type="text" name="txtModel" value="" placeholder="">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">
                      Tipo de vehiculo
                    </label>
                    <div class="col-sm-9">
                      <select name="txtIdTv">
                        <option value="0">
                          Seleccione un tipo de vehiculo
                        </option>

                        <% for (TipoVehiculo tv : TipoVehiculoDAO.listarTipoVehiculos()) {%>
                        <option value="<%= tv.getIdtv()%>"> <%= tv.getNombreTipoVehiculo()%> </option>
                        <% }%>

                      </select>
                    </div>
                  </div>

                  <button
                    value="Registrar"
                    name="accion"
                    class="btn btn-primary"
                    type="submit">
                    <i class="fa fa-save"> Registrar</i>
                  </button>

                  <button
                    value="Actualizar"
                    name="accion"
                    class="btn btn-warning"
                    type="submit">
                    <i class="fa fa-edit"> Actualizar</i>
                  </button>

                  <button
                    value="Eliminar"
                    name="accion"
                    class="btn btn-danger"
                    type="submit">
                    <i class="fa fa-clock-o"> Eliminar</i>
                  </button>
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
