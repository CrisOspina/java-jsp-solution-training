package operacionesaritmeticas;

public class OperacionesBasicas {
  public short num1, num2;
  
  public void sumar(short numeroUno, short numeroDos){
    short resultSum = 0;
    resultSum = (short)(numeroUno + numeroDos);
    System.out.println("La suma es: " + resultSum);
  }
  
  public void restar(short numeroUno, short numeroDos){
    short resultResta = 0;
    resultResta = (short)(numeroUno - numeroDos);
    System.out.println("La resta es: " + resultResta);
  }
  
  public void multiplicacion(short numeroUno, short numeroDos){
    short resultMultiplicacion = 0;
    resultMultiplicacion = (short)(numeroUno * numeroDos);
    System.out.println("La multiplicación es: " + resultMultiplicacion);
  }
  
  public void division(short numeroUno, short numeroDos){
    short resultDivision = 0;
    resultDivision = (short)(numeroUno / numeroDos);
    System.out.println("La división es: " + resultDivision);
  }
}
