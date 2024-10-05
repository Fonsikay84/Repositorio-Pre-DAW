/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 71: Reto - Cálculo del Área y el Perímetro de un Rectángulo
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa para calcular el área y perímetro de un Rectángulo aplicando las siguientes fórmulas:
| 
| Área: base * altura
| Perímetro: 2 * (base + altura)
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion06_Operadores;

import java.util.Scanner;

public class RE02_AreaRectangulo 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int baseRectangulo;
    int alturaRectangulo;
    int areaRectangulo;
    int perimetroRectangulo;
    Scanner datosConsulta = new Scanner(System.in);
    
    // Se solicita los datos al usuario por consola.
    System.out.println("*** ÁREA Y PERÍMETRO DEL RECTÁNGULO ***\n");
    System.out.print("- Introduzca la base: ");
    baseRectangulo = Integer.parseInt(datosConsulta.nextLine());
    System.out.print("- Introduzca la altura: ");
    alturaRectangulo = Integer.parseInt(datosConsulta.nextLine());
    
    // Se calcula el área y el perímetro del rectángulo.
    areaRectangulo = baseRectangulo * alturaRectangulo;
    perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
    
    // Se muestran los datos por consola.
    System.out.printf("%nEl área del Rectángulo (%d*%d) es: %d", baseRectangulo, alturaRectangulo, areaRectangulo);
    System.out.printf("%nEl perímetro del Rectángulo (%d*%d) es: %d%n%n", baseRectangulo, alturaRectangulo, perimetroRectangulo);
  }
}
