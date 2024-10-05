/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 51, 52: Formateo de Cadenas en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion05_EntradaDatosXConsola;

public class Punto04_FormateoCadenas 
{
  public static void main(String[] args) 
  {
    
    System.out.println("*** Formateo de Cadenas ***");
    
    // Declaración de variables.
    String nombre = "Matias";
    int numEmpleado = 12;
    int edad = 35;
    double salario = 21000.50;
    
    // Utilizamos para dar formato el método "format" de la clase "String".
    String mensaje = String.format("Nombre: %s, Edad: %05d, Salario: %.2f euros", nombre, edad, salario);
    System.out.println(mensaje);
    
    // Utilizamos para dar formato el método "printf".
    System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f %n", nombre, edad, salario);
    
    // Formateo a un bloque de texto o Text Blocks con "formatted".
    mensaje = """
              %nDetalle Persona:\s
              -----------------
              Nombre: %s
              Num Empleado: %04d
              Edad: %d años
              Salario: %.2f euros
              """.formatted(nombre, numEmpleado, edad, salario);
    System.out.println("Mensaje: " + mensaje);
    
    // Formateo a un bloque de texto o Text Blocks con "printf".
    System.out.printf("""
                      %nDetalle Persona:\s
                      -----------------
                      Nombre: %s
                      Num Empleado: %04d
                      Edad: %d años
                      Salario: %.2f euros
                      """, nombre, numEmpleado, edad, salario);
  }
}
