<%-- 
    Document   : form
    Created on : 6/08/2019, 09:57:00 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Solución 3</title>
  </head>
    <body>
    <%
      /* 
        El hotel CO, está interesado en realizar la automatización de los precios a cobrar por
        habitación dependiendo de la cantidad de huéspedes; a los que se les deberá cobrar una tarifa
        acorde a los días de estadía. 
        Y al final se le debe realizar un descuento. Tener presente: */     
    %>
    
    <div class="container">
      <div class="row mt-2">
        <div class="col-12 text-center">
          <h2>Hotel CO</h2>
          <p>El precio de su estadia en nuestro hotel es:</p>          
        </div>
      </div>      
       <% 
          /*
         TARIFAS:
            INDIVIDUAL $2.500
            DOBLE $4.600
            FAMILIAR $5.200           
          */
        %>
          <% 
            //Tarifas
            int INDIVIDUAL = 2500;
            int DOBLE      = 4600;
            int FAMILIAR   = 5200;
            double IVA     = 0.16;
            
            double precioConIva;            
            int precioHabitacion;
            double descuento;
            double precioFinal;
          %>
          
      <div class="row mt-2">
        <div class="col-4"></div>
        <div class="col-4 text-center border pt-3">    
          <% //cantidad de días y cantidad de huespedes %>
           <%
             String diasForm = request.getParameter("dias"); 
             String personasForm = request.getParameter("personas");                                                        
             int dias = Integer.parseInt(diasForm);	
             int personas = Integer.parseInt(personasForm);
           %>
             
           <%
            /*  En caso de que llegue un solo huésped, el precio de la habitación será la cantidad de días
            que se va a hospedar por la tarifa individual */ 
            
            /*  Para un solo huésped se le aplicara un descuento del 5% sobre el cobro con IVA */
            
            if(personas == 1){
              precioHabitacion = dias * INDIVIDUAL;
              precioConIva = precioHabitacion * IVA;
              precioFinal = precioHabitacion + precioConIva;
              descuento = precioFinal - (5.0 / 100 * precioFinal);
           %>
              <p> Precio persona:
                <b>
                  <% out.println(precioHabitacion); %>
                </b>
              </p>
              <p> IVA 16%:
                <b>
                  <% out.println(Math.round(precioConIva)); %>
                </b>
              </p>
              <p> Precio sin descuento:
                <b>
                  <% out.println(Math.round(precioFinal)); %>
                </b>
              </p>
              <p> Precio con descuento:
                <b>
                  <% out.println(Math.round(descuento)); %>
                </b>
              </p>
         <% } %>
            
            <%
            /*  En caso de que llegue una pareja de huéspedes, el precio de la habitación será la cantidad
            de días que se van a hospedar por la tarifa doble.*/
            
            /*  Para la pareja de huéspedes se les aplicara un descuento del 9% sobre el cobro con IVA */
            
            if(personas == 2){ 
              precioHabitacion = dias * DOBLE;              
              precioConIva = precioHabitacion * IVA;
              precioFinal = precioHabitacion + precioConIva;
              descuento = precioFinal - (9.0 / 100 * precioFinal); 
            %>
              <p> Precio parejas:
                <b>
                  <% out.println(precioHabitacion); %>
                </b>
              </p>
              <p> IVA 16%:
                <b>
                  <% out.println(Math.round(precioConIva)); %>
                </b>
              </p>
              <p> Precio sin descuento:
                <b>
                  <% out.println(Math.round(precioFinal)); %>
                </b>
              </p>
              <p> Precio con descuento:
                <b>
                  <% out.println(Math.round(descuento)); %>
                </b>
              </p>
         <% } %>
            
         <%
            /*  Y en el caso de que lleguen tres huéspedes, el precio de la habitación será la cantidad de
             días que se van a hospedar por la tarifa familiar. */
            
            /*  Y para tres huéspedes se les aplicara un descuento del 15% sobre el cobro con IVA */
            
            if(personas >= 3){
              precioHabitacion = dias * FAMILIAR;
              precioConIva = precioHabitacion * IVA;
              precioFinal = precioHabitacion + precioConIva;
              descuento = precioFinal - (15.0 / 100 * precioFinal); 
          %>
              <p> Precio familia:
                <b>
                  <% out.println(precioHabitacion); %>
                </b>
              </p>
              <p> IVA 16%:
                <b>
                  <% out.println(Math.round(precioConIva)); %>
                </b>
              </p>
              <p> Precio sin descuento:
                <b>
                  <% out.println(Math.round(precioFinal)); %>
                </b>
              </p>
              <p> Precio con descuento:
                <b>
                  <% out.println(Math.round(descuento)); %>
                </b>
              </p>
         <% } %>
        </div>
      </div>
    </div>
  </body>
</html>
