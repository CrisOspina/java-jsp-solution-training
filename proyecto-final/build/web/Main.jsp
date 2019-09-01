<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome human</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
  </head>
  <body >
    <div class="container">
      <h1 class="text-center mt-5 text-success"> Welcome human </h1>
      <header class="row text-center">
        <nav class="col-12">
          <ul class="nav nav-tabs fixed-top navbar-expand-lg bg-light text-center" 
              id="myTab" role="tablist" 
              style="display:flex; justify-content: center; ">
            <li class="nav-item">
              <a class="nav-link" 
                 id="estudiantes-tab" 
                 data-toggle="tab" 
                 href="#estudiantes" role="tab" 
                 aria-controls="estudiantes" 
                 aria-selected="true">Estudiantes</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" 
                 id="profesores-tab" 
                 data-toggle="tab" 
                 href="#profesores" 
                 role="tab" aria-controls="profesores" 
                 aria-selected="false">Profesores</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" 
                 id="reportes-tab" 
                 data-toggle="tab" 
                 href="#reportes" 
                 role="tab" 
                 aria-controls="reportes" 
                 aria-selected="false">Reportes</a>
            </li>
             <li class="nav-item">
              <a class="nav-link" 
                 href="index.jsp" 
                 role="tab" 
                 aria-controls="reportes" 
                 aria-selected="false">Salir</a>
            </li>
          </ul>
          
          <!-- Formulario estudiante -->
          <div class="tab-content mt-4" id="myTabContent">
            <div class="tab-pane fade show" id="estudiantes" role="tabpanel" aria-labelledby="estudiantes-tab">
              <div class="row">
                <div class="col-12 col-md-12 offset-lg-4 col-lg-4">
                  <form action="Estudiantes" method="post" class="container mt-3 p-4">
                    <div class="form-group">
                      <label for="identificacion">Identificación</label>
                      <input type="text" 
                             class="form-control" 
                             name="txtIdentificacion" id="identificacion" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="nombre">Nombres</label>
                      <input type="text" 
                             name="txtNombre" 
                             class="form-control" id="nombre" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="apellidos">Apellidos</label>
                      <input type="text" 
                             name="txtApellidos" 
                             class="form-control" id="apellidos" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="curso">Curso actual</label>
                      <input type="text" 
                             name="txtCurso" 
                             class="form-control" id="curso" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="jornada">Jornada</label>
                      <select class="form-control" id="jornada" name="txtJornada">
                        <option>Mañana</option>
                        <option>Tarde</option>
                        <option>Noche</option>
                      </select>
                    </div>
                    <div class="form-group">
                      <button type="submit" class="btn btn-primary btn-block">Enviar</button>
                    </div>
                  </form>
                  
                  
                </div>
              </div>
            </div>

            <!-- Formulario profesores -->
            <div class="tab-pane fade" id="profesores" role="tabpanel" aria-labelledby="profesores-tab">
              <div class="row">
                <div class="col-12 col-md-12 offset-lg-4 col-lg-4">
                  <form action="Profesores" method="post" class="container mt-3 p-4">
                    <div class="form-group">
                      <label for="cedula">Cédula</label>
                      <input type="text" 
                             class="form-control" 
                             name="txtCedula" id="cedula" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="nombreP">Nombres</label>
                      <input type="text" 
                             name="txtNombreP" 
                             class="form-control" id="nombreP" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="apellidosP">Apellidos</label>
                      <input type="text" 
                             name="txtApellidosP" 
                             class="form-control" id="apellidosP" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="especialidad">Especialidad</label>
                      <input type="text" 
                             name="txtEspecialidad" 
                             class="form-control" id="especialidad" 
                             placeholder="">
                    </div>
                    <div class="form-group">
                      <label for="jornadaP">Jornada</label>
                      <select class="form-control" id="jornadaP" name="txtJornadaP">
                        <option>Mañana</option>
                        <option>Tarde</option>
                        <option>Noche</option>
                      </select>
                    </div>
                    <div class="form-group">
                      <button type="submit" class="btn btn-primary btn-block">Enviar</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>

            <div class="tab-pane fade" id="reportes" role="tabpanel" aria-labelledby="reportes-tab">
               <div class="row">
                <div class="col-12 col-md-12 offset-lg-4 col-lg-4">
                    <div class="container mt-3 p-4">
                      <div style="display: flex; align-items: center;">
                        <a href="ReporteEstudiantes.jsp">Data Estudiantes</a><br><hr>
                        <a href="ReporteProfesores.jsp">Data profesores</a>
                      </div>
                    </div>
                </div>
              </div>
            </div>
          </div>
        </nav>
      </header>
    </div>                 
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" crossorigin="anonymous"></script>
  </body>
</html>
