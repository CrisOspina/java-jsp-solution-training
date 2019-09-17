package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Contrato;

public class ContratoDAO {
  
  // Create = Insertar
  public static boolean insertarContrato(Contrato contrato){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLInsertContratos = "INSERT INTO contrato (id, id-vehiculo, id-conductor) VALUES (?,?,?)";
      
      PreparedStatement ps = con.prepareStatement(SQLInsertContratos);
      
      ps.setInt(1, contrato.getIdConductor());
      ps.setInt(2, contrato.getIdContrato());
      ps.setInt(3, contrato.getIdVehiculo());
      
      return ps.executeUpdate() > 0;
      
    } catch (SQLException e) {
      return false;
    }
  }
  
  // Read = Listar -------------------------------------------------------------------
  public static ArrayList<Contrato> listarContratos(){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLReadContratos = "SELECT id, id-vehiculo, id-conductor FROM contrato";
      PreparedStatement ps = con.prepareStatement(SQLReadContratos);
      
      ResultSet resultado = ps.executeQuery();
      ArrayList<Contrato> lista = new ArrayList<>();
      
      Contrato contrato;
      
      while (resultado.next()) {        
        contrato = new Contrato();
        contrato.setIdConductor(resultado.getInt("id-conductor"));
        contrato.setIdContrato(resultado.getInt("id"));
        contrato.setIdVehiculo(resultado.getInt("id-vehiculo"));
        lista.add(contrato);
      }
      
      return lista;
      
    } catch (SQLException e) {
      return null;
    }
  }
}
