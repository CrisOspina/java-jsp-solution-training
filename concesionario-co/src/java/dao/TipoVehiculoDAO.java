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
      String SQLInsertTiposDeVehiculo = "INSERT INTO tipovehiculo (idTv, nombreTv) VALUES (?,?)";
      
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
      String SQLReadTiposDeVehiculo = "SELECT idTv, nombreTv FROM tipovehiculo";
      PreparedStatement ps = con.prepareStatement(SQLReadTiposDeVehiculo);
      
      ResultSet resultado = ps.executeQuery();
      ArrayList<TipoVehiculo> lista = new ArrayList<>();
      
      TipoVehiculo tipoVehiculo;
      
      while (resultado.next()) {        
        tipoVehiculo = new TipoVehiculo();
        tipoVehiculo.setIdtv(resultado.getInt("idTv"));
        tipoVehiculo.setNombreTipoVehiculo(resultado.getString("nombreTv"));
        lista.add(tipoVehiculo);
      }
      
      return lista;
      
    } catch (SQLException e) {
      return null;
    }
  }
}
