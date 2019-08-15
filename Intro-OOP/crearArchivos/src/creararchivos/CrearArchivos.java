package creararchivos;

import java.io.FileWriter;

 //@author CristianOspina

public class CrearArchivos {
  public static void main(String[] args) {
    String carta = "prueba java opp";
    String nombreArchivo = "archivo1.txt";
    String rutaDelArchivoGuardar = "/D:/Aplicaciones/data-mega/Cursos/cesde-4-semestre/";
    
    try {
      FileWriter archivo = new FileWriter(rutaDelArchivoGuardar + nombreArchivo);
      //genera el archivo
      archivo.write(carta); 
      archivo.close();
    } catch(Exception e){
      
    } 
  }
}
