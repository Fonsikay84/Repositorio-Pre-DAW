/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 113: Ejercicio - Suma Acumulativa
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un programa que imprima por pantalla la suma de los primeros 5 números utilizando un bucle while.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion08_Ciclos;

public class EJ07_SumaAcumulativa 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    int contador = 1;
    int suma = 0;
    
    // Se realiza el bucle while realizando la suma de los números.
    while (contador <= 5) 
    {      
      suma = suma + contador;
      contador++;
    }
    
    // Se imprime por consola la suma total.
    System.out.println("La suma de los 5 primeros números es: " + suma);
  }
}
