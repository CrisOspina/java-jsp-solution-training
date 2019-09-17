package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Vehiculo;

public class VehiculoDAO {
  // Create = Insertar
  public static boolean insertarVehiculo(Vehiculo vehiculo){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLInsertVehiculo = "INSERT INTO vehiculo (placa-vehiculo, marca, referencia-vehiculo, modelo, id-tipo-vehiculo) VALUES (?,?,?,?,?)";
      
      PreparedStatement ps = con.prepareStatement(SQLInsertVehiculo);
      
      ps.setString(1, vehiculo.getPlacaVehiculo());
      ps.setString(2, vehiculo.getMarca());
      ps.setString(3, vehiculo.getReferenciaVehiculo());
      ps.setInt(4, vehiculo.getModelo());
      ps.setInt(5, vehiculo.getIdTipoVehiculo());
     
      return ps.executeUpdate() > 0;
      
    } catch (SQLException e) {
      return false;
    }
  }
  
  // Read = Listar
  public static ArrayList<Vehiculo> listarRutas(){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLReadVehiculo = "SELECT placa-vehiculo, marca, referencia-vehiculo, modelo, id-tipo-vehiculo FROM ruta";
      PreparedStatement ps = con.prepareStatement(SQLReadVehiculo);
      
      ResultSet resultado = ps.executeQuery();
      ArrayList<Vehiculo> lista = new ArrayList<>();
      
      Vehiculo vehiculo;
      
      while (resultado.next()) {        
        vehiculo = new Vehiculo();
        vehiculo.setPlacaVehiculo(resultado.getString("placa-vehiculo"));
        vehiculo.setMarca(resultado.getString("marca"));
        vehiculo.setReferenciaVehiculo(resultado.getString("referencia-vehiculo"));
        vehiculo.setModelo(resultado.getInt("modelo"));
        vehiculo.setIdTipoVehiculo(resultado.getInt("id-tipo-vehiculo"));
        
        lista.add(vehiculo);
      }
      
      return lista;
      
    } catch (SQLException e) {
      return null;
    }
  }
}
