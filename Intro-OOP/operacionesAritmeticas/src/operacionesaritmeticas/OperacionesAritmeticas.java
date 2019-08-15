package operacionesaritmeticas;

import java.util.Scanner;

public class OperacionesAritmeticas {
  public static void main(String[] args) {
    
    Scanner dato = new Scanner(System.in);
    
    System.out.println("Digita los números para las operaciones ");
    System.out.println("Número uno: ");
    short nUno = dato.nextShort();
    
    System.out.println("Número dos: ");
    short nDos = dato.nextShort();
    
    //programación orientada a objetos
    //instanciando objeto
    OperacionesBasicas operacionSuma = new OperacionesBasicas();
    
    //una forma de usar los atributos
    operacionSuma.num1 = nUno;
    operacionSuma.num2 = nDos;
    
    //invocar metodos
    operacionSuma.sumar(operacionSuma.num1, operacionSuma.num2);
    operacionSuma.restar(operacionSuma.num1, operacionSuma.num2);
    operacionSuma.multiplicacion(operacionSuma.num1, operacionSuma.num2);
    operacionSuma.division(operacionSuma.num1, operacionSuma.num2);
  }
}
