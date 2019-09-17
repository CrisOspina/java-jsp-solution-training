package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Conductor;

public class ConductorDAO {
  
   // Create = Insertar
  public static boolean insertarConductor(Conductor conductor){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLInsertTiposDeVehiculo = "INSERT INTO conductor (id, nombre, tipo-licencia, id-vehiculo, id-tipo-conductor) VALUES (?,?,?,?,?)";
      
      PreparedStatement ps = con.prepareStatement(SQLInsertTiposDeVehiculo);
      
      ps.setInt(1, conductor.getIdConductor());
      ps.setString(2, conductor.getNombreConductor());
      ps.setString(3, conductor.getTipoLicenciaC());
      ps.setInt(4, conductor.getIdVehiculoC());
      ps.setInt(5, conductor.getIdTipoConductor());
      
      return ps.executeUpdate() > 0;
      
    } catch (SQLException e) {
      return false;
    }
  }
  
   // Read = Listar
  public static ArrayList<Conductor> listarConductor(){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLReadConductor = "SELECT id, nombre, tipo-licencia, id-vehiculo, id-tipo-conductor FROM conductor";
      PreparedStatement ps = con.prepareStatement(SQLReadConductor);
      
      ResultSet resultado = ps.executeQuery();
      ArrayList<Conductor> lista = new ArrayList<>();
      
      Conductor conductor;
      
      while (resultado.next()) {        
        conductor = new Conductor();
        conductor.setIdConductor(resultado.getInt("id"));
        conductor.setNombreConductor(resultado.getString("nombre"));
        conductor.setTipoLicenciaC(resultado.getString("tipo-licencia"));
        conductor.setIdVehiculoC(resultado.getInt("id-vehiculo"));
        conductor.setIdTipoConductor(resultado.getInt("id-tipo-conductor"));
        
        lista.add(conductor);
      }
      
      return lista;
      
    } catch (SQLException e) {
      return null;
    }
  }
}
