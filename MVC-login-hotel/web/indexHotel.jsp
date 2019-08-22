<%-- 
    Document   : indexHotel
    Created on : 21/08/2019, 08:06:13 PM
    Author     : Cristian Ospina
--%>

<%@page import="beans.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hotel co</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
  </head> 
    <body>
    <%
      /* 
        El hotel CO, está interesado en realizar la automatización de los precios a cobrar por
        habitación dependiendo de la cantidad de huéspedes; a los que se les deberá cobrar una tarifa
        acorde a los días de estadía. Y al final se le debe realizar un descuento. Tener presente: 
       En caso de que llegue un solo huésped, el precio de la habitación será la cantidad de díasque se 
        va a hospedar por la tarifa individual.
       Para un solo huésped se le aplicara un descuento del 5% sobre el cobro con IVA
       En caso de que llegue una pareja de huéspedes, el precio de la habitación será la cantidad
        de días que se van a hospedar por la tarifa doble.
       Para la pareja de huéspedes se les aplicara un descuento del 9% sobre el cobro con IVA
       Y en el caso de que lleguen tres huéspedes, el precio de la habitación será la cantidad de
        días que se van a hospedar por la tarifa familiar.
       Y para tres huéspedes se les aplicara un descuento del 15% sobre el cobro con IVA */
    %>
    
    <div class="container">
      <div class="row mt-2">
        <div class="col-12 text-center">
          <h2>Hotel CO</h2>
          <p>El precio de su estadia en nuestro hotel es:</p>          
        </div>
      </div>      
          
      <div class="row mt-2">
        <div class="col-4"></div>
        <div class="col-4 text-center border pt-3">    
          <% //cantidad de días y cantidad de huespedes %>
           <%
            String diasForm = request.getParameter("dias"); 
            String personasForm = request.getParameter("personas");                                                        
            int dias = Integer.parseInt(diasForm);	
            int personas = Integer.parseInt(personasForm);
             
            Hotel dataHotel = new Hotel();
            dataHotel.setDias(dias);
            dataHotel.setPersonas(personas);
             
            int INDIVIDUAL = 2500;
            int DOBLE = 4600;
            int FAMILIAR = 5200;
            double IVA = 0.16;
            int totalHabitacion;
            double totalPrecioConIva = 0;
            double totalPrecioFinal = 0;
            double totalDescuento = 0;
            
            dataHotel.setTarifaIndividual(INDIVIDUAL);
            dataHotel.setTarifaDoble(DOBLE);
            dataHotel.setTarifaFamiliar(FAMILIAR);
            dataHotel.setIva(IVA);
            
            if(personas == 1){
              totalHabitacion = dataHotel.precioHabitacion(dias, INDIVIDUAL);
              totalPrecioConIva = dataHotel.precioConIva(totalHabitacion, IVA);
              totalPrecioFinal = dataHotel.precioFinal(totalHabitacion, totalPrecioConIva);
              totalDescuento = dataHotel.descuento(totalPrecioFinal, 5.0, 100);
            } 
            
            else if(personas == 2){ 
              totalHabitacion = dataHotel.precioHabitacion(dias, DOBLE);
              totalPrecioConIva = dataHotel.precioConIva(totalHabitacion, IVA);
              totalPrecioFinal = dataHotel.precioFinal(totalHabitacion, totalPrecioConIva);
              totalDescuento = dataHotel.descuento(totalPrecioFinal, 9.0, 100);
            }
            
            else {
              totalHabitacion = dataHotel.precioHabitacion(dias, DOBLE);
              totalPrecioConIva = dataHotel.precioConIva(totalHabitacion, IVA);
              totalPrecioFinal = dataHotel.precioFinal(totalHabitacion, totalPrecioConIva);
              totalDescuento = dataHotel.descuento(totalPrecioFinal, 15.0, 100);
            } 
          %>
         
         <p> Precio:
            <b>
              <% out.println(totalHabitacion); %>
            </b>
          </p>
          <p> IVA 16%:
            <b>
              <% out.println(Math.round(totalPrecioConIva)); %>
            </b>
          </p>
          <p> Precio sin descuento:
            <b>
              <% out.println(Math.round(totalPrecioFinal)); %>
            </b>
          </p>
          <p> Precio con descuento:
            <b>
              <% out.println(Math.round(totalDescuento)); %>
            </b>
          </p>
        </div>
      </div>
    </div>
  </body>
</html>
