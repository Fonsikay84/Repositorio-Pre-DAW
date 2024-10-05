/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 97: Reto - Sistema de Calificaciones
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Crear un programa para convertir una calificación númerica (entre 0 y 10) a una letra (entre la F y la A).
|  
|   - Si es mayor o igual a 9 y menor o igual a 10, es una A.
|   - Si es mayor o igual a 8 y menor a 9, es una B.
|   - Si es mayor o igual a 7 y menor a 8, es una C.
|   - Si es mayor o igual a 6 y menor a 7, es una D.
|   - Si es mayor o igual a 5 y menor a 6, es una E.
|   - Si es mayor o igual a 0 y menor a 5, es una F.
|   - En otro caso, imprimir "Valor Desconocido".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion07_SentenciasDeDecision;

import java.util.Scanner;

public class RE06_SistemaCalificaciones 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    double nota;
    String notaLetra;
    Scanner datosConsola = new Scanner(System.in);
    
    // Se solicita al usuario la información por consola.
    System.out.println("*** SISTEMA DE CALIFICACIONES ***");
    System.out.print("Introduzca la nota obtenida: ");
    nota = Double.parseDouble(datosConsola.nextLine());
    
    // Se realiza las comprobaciones para obtener la nota.
    if (nota >= 9 && nota <= 10) 
    {
      notaLetra = "A";
    }
    else if (nota >= 8 && nota < 9) 
    {
      notaLetra = "B";
    }
    else if (nota >= 7 && nota < 8) 
    {
      notaLetra = "C";
    }
    else if (nota >= 6 && nota < 7) 
    {
      notaLetra = "D";
    }
    else if (nota >= 5 && nota < 6) 
    {
      notaLetra = "E";
    }
    else if (nota >= 0 && nota < 5) 
    {
      notaLetra = "F";
    }
    else
    {
      notaLetra = "Nota inválida";
    }
    
    // Se imprime por consola el resultado de la nota.
    System.out.printf("La calificación %.2f corresponde a la nota: %s%n", nota, notaLetra);
  }
}
