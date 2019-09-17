package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Ruta;

public class RutaDAO {
  // Create = Insertar
  public static boolean insertarRuta(Ruta ruta){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLInsertRuta = "INSERT INTO ruta (id, estacion, id-tipo-vehiculo) VALUES (?,?,?)";
      
      PreparedStatement ps = con.prepareStatement(SQLInsertRuta);
      
      ps.setInt(1, ruta.getIdRuta());
      ps.setInt(2, ruta.getIdTipoVehiculo());
      ps.setString(3, ruta.getEstacion());
      
      return ps.executeUpdate() > 0;
      
    } catch (SQLException e) {
      return false;
    }
  }
  
  // Read = Listar
  public static ArrayList<Ruta> listarRutas(){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLReadRutas = "SELECT id, estacion, id-tipo-vehiculo FROM ruta";
      PreparedStatement ps = con.prepareStatement(SQLReadRutas);
      
      ResultSet resultado = ps.executeQuery();
      ArrayList<Ruta> lista = new ArrayList<>();
      
      Ruta ruta;
      
      while (resultado.next()) {        
        ruta = new Ruta();
        ruta.setIdRuta(resultado.getInt("id"));
        ruta.setIdTipoVehiculo(resultado.getInt("id-tipo"));
        ruta.setEstacion(resultado.getString("estacion"));
        lista.add(ruta);
      }
      
      return lista;
      
    } catch (SQLException e) {
      return null;
    }
  }
}
