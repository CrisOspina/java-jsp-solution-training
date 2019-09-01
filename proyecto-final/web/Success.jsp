<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
    <title>Success</title>
  </head>
  <body style="background-color: #343A40" >
    <div class="container mt-5" style="height: 60vh; display: flex; align-items: center; justify-content: center;">
      <div class="card text-center" style="width: 18rem;">
        <div class="card-body">
          <h5 class="card-title">✔</h5>
          <p class="card-text"><b>Registro guardado exitosamente</b></p>
          <a href="Main.jsp" class="btn btn-primary btn-block">👉 Volver</a>
        </div>
    </div>   
  </div>

    <!-- *** Insert data to localstorage for students -->
    
    <script type="text/javascript">    
      // Insert data to localstorage for students
      const data =<%=request.getAttribute("dataStudent") %>;
      const miStorage = window.localStorage;
      
      const getData = JSON.parse(miStorage.getItem('estudiantes')) || [];
      getData.push(data);
      
      // Delete objects null
      for(let i = 0; i <= getData.length; i++){
        if(getData[i] === null){
         getData.pop(data);  
        }
      }
      
      miStorage.setItem('estudiantes', JSON.stringify(getData));
      
    </script>
    
    
    <!-- *** Insert data to localstorage for teachers     -->
    
    <script type="text/javascript">
      const dataTeachers =<%=request.getAttribute("dataTeachers") %>;
      const getDataTeachers = JSON.parse(localStorage.getItem('profesores')) || [];
      
      getDataTeachers.push(dataTeachers);      
      
      // Delete objects null
      for(let i = 0; i <= getDataTeachers.length; i++){
        if(getDataTeachers[i] === null){
         getDataTeachers.pop(dataTeachers);  
        }
      }
      
      localStorage.setItem('profesores', JSON.stringify(getDataTeachers));
    </script>
  </body>
</html>
