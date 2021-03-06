package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TipoVehiculo;

public class TipoVehiculoDAO {
  // CRUD
  
  // Create = Insertar -------------------------------------------------------------------
  public static boolean insertarTipoVehiculo(TipoVehiculo tv){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLInsertTiposDeVehiculo = "INSERT INTO tipovehiculo (id, nombre) VALUES (?,?)";
      
      PreparedStatement ps = con.prepareStatement(SQLInsertTiposDeVehiculo);
      
      ps.setInt(1, tv.getIdtv());
      ps.setString(2, tv.getNombreTipoVehiculo());
      
      return ps.executeUpdate() > 0;
      
    } catch (SQLException e) {
      return false;
    }
  }
  
  // Read = Listar -------------------------------------------------------------------
  public static ArrayList<TipoVehiculo> listarTipoVehiculos(){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLReadTiposDeVehiculo = "SELECT id, nombre FROM tipovehiculo";
      PreparedStatement ps = con.prepareStatement(SQLReadTiposDeVehiculo);
      
      ResultSet resultado = ps.executeQuery();
      ArrayList<TipoVehiculo> lista = new ArrayList<>();
      
      TipoVehiculo tipoVehiculo;
      
      while (resultado.next()) {        
        tipoVehiculo = new TipoVehiculo();
        tipoVehiculo.setIdtv(resultado.getInt("id"));
        tipoVehiculo.setNombreTipoVehiculo(resultado.getString("nombre"));
        lista.add(tipoVehiculo);
      }
      
      return lista;
      
    } catch (SQLException e) {
      return null;
    }
  }
  
  // Mostrar los tipos de vehiculos  -------------------------------------------------------------------
  public static String getTipoVehiculo(int idTv){
    try {
      String sqlTvForVehi = "select nombre from tipovehiculo where id=?";
      Connection con = LibreriaConexion.conexionDB();
      PreparedStatement ps = con.prepareStatement(sqlTvForVehi);
      
      //Enviar el parametro idtv
      ps.setInt(1, idTv);
      ResultSet resultado = ps.executeQuery();
      
      //verificar si existen los tv y traer su nombre
      if(resultado.next()){
        return resultado.getString("nombre");
      }
      
      return "--";
      
    } catch (SQLException ex) {
      return "--";
    }
  }
    
  
}
