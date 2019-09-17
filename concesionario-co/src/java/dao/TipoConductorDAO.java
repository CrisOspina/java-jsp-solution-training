package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.TipoConductor;

public class TipoConductorDAO {
  
  // Create = Insertar
  public static boolean insertarTipoConductor(TipoConductor tc){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLInsertTiposDeConductor = "INSERT INTO tipoconductor (id, nombre) VALUES (?, ?)";
      PreparedStatement ps = con.prepareStatement(SQLInsertTiposDeConductor);
      
      ps.setInt(1, tc.getIdTC());
      ps.setString(2, tc.getNombreTipoConductor());
      
      return ps.executeUpdate() > 0;
    } catch (SQLException e) {
      return false;
    }
  }
  
  // Read = Listar
  public static ArrayList<TipoConductor> listarTipoConductor(){
    try {
      Connection con = LibreriaConexion.conexionDB();
      String SQLReadTipoDeConductor = "SELECT id, nombre FROM tipoconductor";
      PreparedStatement ps = con.prepareStatement(SQLReadTipoDeConductor);
      
      ResultSet resultado = ps.executeQuery();
      ArrayList<TipoConductor> lista = new ArrayList<>();
      
      TipoConductor tipoVehiculo;
      
      while(resultado.next()){
        tipoVehiculo = new TipoConductor();
        tipoVehiculo.setIdTC(resultado.getInt("id"));
        tipoVehiculo.setNombreTipoConductor(resultado.getString("nombre"));
        lista.add(tipoVehiculo);
      }
     
      return lista;
      
    } catch (SQLException e) {
      return null;
    }
  }
}
