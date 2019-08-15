package leerarchivo;

//@author Cristian Ospina

import java.io.FileReader;

public class LeerArchivo {
  public static void main(String[] args) {
    try {
      FileReader leerArchivo = new FileReader("/D:/Aplicaciones/data-mega/Cursos/cesde-4-semestre/archivo1.txt");
      int valor = leerArchivo.read();
      
      while(valor != -1){
        System.out.print((char)valor);
        valor = leerArchivo.read();
      }
      
      leerArchivo.close();
      
    } catch(Exception e){
      System.out.println("Error E/S " + e);
    }
  }
}
