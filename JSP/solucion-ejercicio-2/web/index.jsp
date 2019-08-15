<%-- 
    Document   : index
    Created on : 6/08/2019, 05:52:54 PM
    Author     : Cristian Ospina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Solución 2</title>    
  </head>
  <body>   
    <%
      /*
        La empresa CO cuenta con 4 empleados. 
        Un empleado labora 8 horas diarias en la modalidad por proyectos. 
              
        si es tipo B el valor de la hora día es de $10.000, 
        si es tipo A, el valor de la hora día es de $20.000 y
        Si el tipo de proyecto es diferente de A y B el valor de la hora día es de $5.000, 
      
        Mostrar por consola el valor de la hora día. 
      
        Calcular el sueldo mensual, este cálculo se obtiene de multiplicar el valor de la hora día por las horas }
          laborales diarias (tener en cuenta que son 8 horas diarias y 30 días del mes). 
      
        Luego, Si el sueldo mensual es mayor a $1.500.000 mostrar por consola "Salario es mayor a tope máximo", 
      
        si el sueldo mensual no supera el $1.500.00 entonces pagarle al empleado por concepto de hora extra 
          el valor de la hora día incrementada en un 6% (tener en cuenta que se le pagaran 3 horas extras).                  
      */
    %>
    
    <div class="container">
      <div class="row mt-2">
        <div class="col-12 text-center">
          <h2>Empresa CO cuenta con 4 empleados</h2>
          <p>Los empleados laboran 8 horas diarias en la modalidad por proyectos</p>  
          <p>Si el sueldo mensual excede el 1.500.000 el salario es mayor al tope máximo</p>
          <p>Si el sueldo mensual no supera el 1.500.000 entonces hay pagarle al empleado por concepto de hora extra 
          el valor de la hora día incrementada en un 6%</p>
        </div>        
      </div>           
      <%                          
        String[] proyectos = {"A", "B"};             
        int valorHoraA = 20000;   
        int sueldoMensualA;

        int valorHoraB = 10000;
        int sueldoMensualB;

        int valorHora = 5000;                                                              
        int sueldoMensualX;        
        double valorHoraExtra;
      %>
      
      <div class="row mt-2">
        <div class="col-4 border text-center">
          <p> Valor hora para el proyecto A: <b><% out.print(valorHoraA); %></b></p>
          <p> Sueldo mensual para el proyecto A:            
             <%
               if(proyectos[0] == "A"){ 
                sueldoMensualA = (valorHoraA * 8) * 30; 
                if(sueldoMensualA > 1500000){ 
             %>
                <b> 
                  <% out.println(sueldoMensualA + "\n"); %>
                  <br>
                  <% out.println("Salario es mayor a tope máximo"); %>                  
                </b>
              <%}
              }%>                                                                
          </p>
        </div>
        <div class="col-4 border text-center">
          <p> Valor hora para el proyecto B: <b><% out.print(valorHoraB); %></b></p>
          <p> Sueldo mensual para el proyecto B:
            <b>
              <%
                if(proyectos[1] == "B"){
                  sueldoMensualB = (valorHoraB * 8) * 30;
                  out.print(sueldoMensualB); 
                }                
              %>
            </b>
          </p>
        </div>
        <div class="col-4 border text-center">
          <p> Valor hora para el proyecto diferente: <b><% out.print(valorHora); %></b></p>
          <p> Sueldo mensual por defecto:            
             <% sueldoMensualX = (valorHora * 8) * 30; %>
             <b> <% out.print(sueldoMensualX); %> </b> 
          </p>
          
          <p>
            <% 
              if(sueldoMensualX < 1500000){              
                valorHoraExtra = (valorHora * 6.0 / 100) + valorHora; %>              
                <% out.println("Valor hora extra: "); %>
                <b> <% out.print(Math.round(valorHoraExtra)); %> </b>
                <br>
          </p>
          <p>
            <% out.print("Nuevo sueldo mensual más 3 horas extras: "); %>
             <b> 
                <% 
                  double sueldoFinal = sueldoMensualX + (valorHoraExtra * 3);
                  out.print(Math.round(sueldoFinal)); 
                %> 
                </b>            
           <% } %>         
          </p>
        </div>
      </div>
    </div>
  </body>
</html>
