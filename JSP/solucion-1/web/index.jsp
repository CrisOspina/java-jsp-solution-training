<%-- 
    Document   : index
    Created on : 6/08/2019, 01:11:39 PM
    Author     : Cristian Ospina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
      <title>Solución 1</title>
  </head>
  <body>
    <div class="container mt-4">
        <h2 class="text-center">Almacen CO - solución ejercicio 1</h2>
        <h5>Articulos y precio de venta</h5>
        <div class="container-fluid">
          <p class="m-0">Zapatos = $350.000, Tenis = $280.000, Camisetas = $175.000, Jeans = $200.000</p>
        </div>
        <div class="row mt-4">
          <div class="col-6 border text-center">            
            
            <% //Mostrar los articulos y precios actuales %>           
            
            <% String[] articulos = { "Zapatos", "Tenis", "Camisetas", "Jeans" };
               int[] precios = { 350000, 280000, 175000, 200000 }; %>
               
               <h4 class="mt-2">Mostrar en pantalla JSP</h4>
            <%
              for(int i = 0; i < articulos.length && i < precios.length; i++){ %>
                <p> <% out.print(articulos[i] + " = " + " $" + precios[i]); %> </p>
            <%}%>
                       
          </div>
            
          <% //Mostrar el costo total de los articulos %>
          
          <div class="col-6 border text-center">
            <h4 class="mt-2">Mostrar el costo total</h4>
            <% int totalPrecios = 0; %>
              <% for(int ite = 0; ite < precios.length; ite++){ %>
                  <p> <% totalPrecios = totalPrecios + precios[ite]; %> </p>
              <% } %>
              <p style="display:flex; flex-direction: column;"> Precio total de los articulos: 
                <b> <% out.print(totalPrecios); %> </b>
              </p>                              
          </div>                    
        </div>
        
        <% //Promedio de venta %>
        
        <div class="row mt-2">
          <div class="col-6 border text-center">
            <h4 class="mt-2">Mostrar el promedio de la venta</h4>
            <p style="display:flex; flex-direction: column;"> Promedio de venta:
              <b> <% out.print(totalPrecios / precios.length); %> </b>
            </p>           
          </div>
            
          <% //Subir el precio de los jeans en un 6.2% %>  
          
          <div class="col-6 border text-center">
            <h4 class="mt-2">Mostrar el nuevo precio de los jeans - 6.2% más</h4>
            <p style="display:flex; flex-direction: column;"> Precio jeans:
              <b> 
                <% int precioJeans = precios[3]; 
                   double nuevoPrecioJeans = (precioJeans * 6.2) / 100 + precioJeans;                   
                   out.println(Math.round(nuevoPrecioJeans));
                %> 
              </b>
            </p>           
          </div>
        </div>               
        
        <% //Disminuir el precio de los zapatos en un 0.8% %>
        
        <div class="row mt-2">
          <div class="col-12 border text-center">
            <h4 class="mt-2">Mostrar la disminución del nuevo precio de los zapatos - 0.8%</h4>
            <p style="display:flex; flex-direction: column;"> Precio zapatos:
              <b> 
                <% int precioZapatos = precios[0];                   
                   double nuevoPrecioZapatos = precioZapatos - (precioZapatos * 0.8 / 100);
                   out.println(Math.round(nuevoPrecioZapatos));
                %> 
              </b>
            </p>           
          </div>
        </div>
    </div>  
  </body>
</html>
