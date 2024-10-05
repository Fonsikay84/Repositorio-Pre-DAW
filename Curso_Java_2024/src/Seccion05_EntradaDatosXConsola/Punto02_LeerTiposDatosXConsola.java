/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 45, 46: Leer tipo de datos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion05_EntradaDatosXConsola;

import java.util.Scanner;

public class Punto02_LeerTiposDatosXConsola 
{
  public static void main(String[] args) 
  {
    // Leer distintos tipos de datos.
    
    // 1. Tipo entero (int).
    Scanner datosConsola = new Scanner(System.in);
    System.out.print("Introduzca un valor entero: ");
    int numEntero = Integer.parseInt(datosConsola.nextLine());
    System.out.println("Número entero: " + numEntero);
    
    // 2. Tipo flotante (float).
    System.out.print("Ingresa un valor flotante: ");
    float numFlotante = Float.parseFloat(datosConsola.nextLine());
    System.out.println("Número flotante: " + numFlotante);
    
    // 3. Tipo Double.
    System.out.print("Proporciona un valor doble: "); 
    double doble = Double.parseDouble(datosConsola.nextLine()); 
    System.out.println("doble = " + doble);
    
    // 4. Tipo booleano (boolean).
    System.out.print("Proporciona un valor booleano (true/false): "); 
    boolean booleano = Boolean.parseBoolean(datosConsola.nextLine()); 
    System.out.println("booleano = " + booleano);
    
    // 5. Tipo largo (long).
    System.out.print("Proporciona un valor largo: "); 
    long largo = Long.parseLong(datosConsola.nextLine()); 
    System.out.println("largo = " + largo);
    
    // 6. Tipo corto (short).
    System.out.print("Proporciona un valor corto: "); 
    short corto = Short.parseShort(datosConsola.nextLine()); 
    System.out.println("corto = " + corto);
    
    // 7. Tipo byte.
    System.out.print("Proporciona un valor byte: "); 
    byte byteValue = Byte.parseByte(datosConsola.nextLine()); 
    System.out.println("byte = " + byteValue);
    
    // 8. Tipo caracter (char).
    System.out.print("Proporciona un solo carácter: "); 
    char caracter = datosConsola.nextLine().charAt(0); 
    System.out.println("caracter = " + caracter);
    
  }
}
