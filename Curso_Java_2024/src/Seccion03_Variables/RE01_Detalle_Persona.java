/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 17: Reto - Detalle de una persona.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear una nueva clase llamada "DetallePersona.java" que realice lo siguiente:
|
| Debe declarar las siguientes variables y deberás asignar los valores que correspondan, además de seleccionar el tipo 
| de dato adecuado para cada variable:
|
|   - Nombre completo de la persona.
|   - Edad.
|   - Altura (en metros).
|   - País de origen.
|   - Indicar si es casado o soltero con solo carácter, ejemplo: 'C' -> Casado, 'S' -> Soltero.
| 
| Cada una de estas variables se debe de imprimir por consola.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion03_Variables;

public class RE01_Detalle_Persona 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    String nombre = "Alfonso López Jiménez";
    int edad = 39;
    double altura = 1.89;
    String pais = "España";
    char esCasado = 'C';
    
    // Se muestran los datos por pantalla.
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
    System.out.println("Altura: " + altura);
    System.out.println("Pais: " + pais);
    System.out.println("Casado: " + esCasado);
    
  }
}
