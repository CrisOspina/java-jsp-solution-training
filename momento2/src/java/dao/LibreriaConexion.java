package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Libreria para conectarnos a la base de datos.

public class LibreriaConexion {
  public static Connection conexionDB(){
    try {
      // data conexión
      String dbDriver = "com.mysql.jdbc.Driver";
      String dbURL = "jdbc:mysql://localhost:3306/";
      
      // data DB
      String dbName = "catalogo-docentes";
      String dbUser = "root";
      String password = "";
      
      // Configurar la conexión
      Class.forName(dbDriver);
      Connection conex = DriverManager.getConnection(dbURL + dbName, dbUser, password);
      
      return conex;
      
    } catch(ClassNotFoundException | SQLException ex){
      return null;
    }
  }
  
    /*
   // Comprobar conexión
    Connection con = null;
    public LibreriaConexion(){
      try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogo-docentes", "root", "");
        
        boolean ok = con.isValid(5000);
        System.out.println(ok ? "Conexión realizada con exito" : "Conexión fallida" );
        
      } catch (SQLException ex) {
        System.out.println("Error: " + ex.getMessage());
      } catch (ClassNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
      }
    }
    
    public Connection getConnection(){
      return con;
    }*/
}
