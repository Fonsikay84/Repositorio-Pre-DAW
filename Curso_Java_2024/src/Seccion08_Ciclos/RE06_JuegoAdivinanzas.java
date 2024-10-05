/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 121: Reto - Juego de Adivinanzas
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un juego donde el jugador debe de adivinar un número secreto.
|
| - Puedes usar un ciclo while hasta que el jugador adivine el número correctamente.
| - El número secreto se puede crear usando la clase "Random" para generar un valor aleatorio entre 1 y 50.
| - Por cada intento fallido, se debe de incrementar una variable que lleve el contador de intentos.
| - El programa debe de orientar al jugador indicandole si el valor que proporcionó fue mayor o menor que el número secreto.
| - Finalmente, si adivina el número secreto, debe felicitar al usuario e indicar cuántos intentos realizó.
| - Opcionalmente, se puede limitar el juego a un número de intentos máximo (por ejemplo: 10), de lo contrario terminó el juego.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

import java.util.Random;
import java.util.Scanner;

public class RE06_JuegoAdivinanzas 
{
  public static void main(String[] args) 
  {
    
    // Declaración de constante.
    final int MAX_INTENTOS = 5;
    
    // Declaración de variables.
    int contador = 1;
    boolean haAcertado = false;
    Random aleatorio = new Random();
    int numSecreto;
    int numUsuario;
    Scanner datosConsola = new Scanner (System.in);
    
    System.out.println("*** JUEGO DE ADIVINAR NUMERO ALEATORIO ***");
    
    // Se crea un número aleatorio entre el 1 y el 50.
    numSecreto = aleatorio.nextInt(50) + 1;
    System.out.println(numSecreto);
    // Mientras que no se acierte, se repite el ciclo while.
    while (!haAcertado && contador <= MAX_INTENTOS)
    {
      
      // Se pide el número al usuario por consola.
      System.out.print("\nIntroduzca un numero: ");
      numUsuario = Integer.parseInt(datosConsola.nextLine());
      
      // Si ha acertado el número, se indica al usuario por consola y sino pues se indica si es mayor o menor el número.
      if (numSecreto == numUsuario) 
      {
        haAcertado = true;
        System.out.printf("Felicidades! Has acertado el numero secreto que era el %d en %d intentos.%n%n", numSecreto, contador);
        // Se sale del ciclo while por haber acertado el número.
        break;
      }
      else
      {
        System.out.println("ERROR: El numero introducido no es el numero secreto.");
        if (numSecreto > numUsuario) 
        {
          System.out.println("El numero secreto es mayor al numero introducido.");
        }
        else if (numSecreto < numUsuario) 
        {
          System.out.println("El numero secreto es menor al numero introducido.");
        }
      }
      // Se comprueba si ya ha gastado el número de intentos posibles.
      if (contador == MAX_INTENTOS) 
      {
        System.out.printf("\nGAME OVER: Ha llegado a los %d intentos sin acertar el numero secreto que era el %d.%n%n", contador, numSecreto);
        // Se sale del ciclo while al terminar la partida.
        break;
      }
      // Se aumenta el contador de intentos.
      contador++;
    }
  }
}