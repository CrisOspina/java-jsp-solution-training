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
      String SQLInsertVehiculo = "INSERT INTO vehiculo VALUES (?,?,?,?,?)";
      
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
  
  // Actualizar
  public static boolean actualizarVehiculo(Vehiculo v){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLUpdate = "update vehiculo set " +
                    "    marca=?," +
                    "    referencia-vehiculo=?," +
                    "    modelo=?," +
                    "     id-tipo-vehiculo=?" +
                    "    where placa-vehiculo=?";
      
      PreparedStatement ps = con.prepareStatement(SQLUpdate);
      
      ps.setString(1, v.getMarca());
      ps.setString(2, v.getReferenciaVehiculo());
      ps.setInt(3, v.getModelo());
      ps.setInt(4, v.getIdTipoVehiculo());
      ps.setString(5, v.getPlacaVehiculo());
      
      if(ps.executeUpdate() > 0){
        return true;
      } else {
        return false;
      }
      
    } catch (SQLException e) {
      return false;
    }
  }
  
  // Eliminar - formulario de registro desde la placa
  public static boolean eliminarVehiculo(Vehiculo v){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLDelete = "delete from vehiculo where placa-vehiculo=?";
      
      PreparedStatement ps = con.prepareStatement(SQLDelete);
      
      ps.setString(1, v.getPlacaVehiculo());
      
      if(ps.executeUpdate() > 0){
        return true;
      } else {
        return false;
      }
      
    } catch (SQLException e) {
       return false;
    }
  }
  
  // Eliminar vehiculo desde listar
  public static boolean eliminarVehiculoListar(String placaVehiculo){
    String SQL = "delete from vehiculo where placa-vehiculo =" + placaVehiculo;
    
    try {
      Connection con = LibreriaConexion.conexionDB();
      PreparedStatement ps = con.prepareStatement(SQL);
      
      if(ps.executeUpdate() > 0){
        return true;
      } else {
        return false;
      }
      
    } catch (SQLException e) {
      return false;
    }
  }
}
