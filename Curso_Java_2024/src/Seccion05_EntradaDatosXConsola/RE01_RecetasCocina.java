/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 48: Reto - Recetas de cocina.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa solicitar los valores más importantes de una receta de cocina.
|
| Los valores que debe de introducir el usuario son:
|
|   - Nombre de la Receta.
|   - Ingredientes principales.
|   - Tiempo de preparación.
|   - Dificultad (Fácil, Media, Alta).
| 
| Al finalizar se debe de mandar a imprimir la receta.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion05_EntradaDatosXConsola;

import java.util.Scanner;

public class RE01_RecetasCocina 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    Scanner datosConsola = new Scanner (System.in);
    String nombreReceta;
    String ingredientesReceta;
    int tiempoPreparacionReceta;
    String dificultadReceta;
    
    // Petición de los datos por consola.
    System.out.println("*** Recetas de cocina ***");
    System.out.print("Ingresa el nombre: ");
    nombreReceta = datosConsola.nextLine();
    System.out.print("Ingresa los ingredientes: ");
    ingredientesReceta = datosConsola.nextLine();
    System.out.print("Ingresa el tiempo de preparación (min): ");
    tiempoPreparacionReceta = Integer.parseInt(datosConsola.nextLine());
    System.out.print("Ingresa la dificultad: ");
    dificultadReceta = datosConsola.nextLine();
    
    // Imprimir los resultados por consola.
    System.out.println("\n*** Receta de Cocina ***");
    System.out.println("Nombre receta: " + nombreReceta);
    System.out.println("Ingredientes: " + ingredientesReceta);
    System.out.println("Tiempo de preparación: " + tiempoPreparacionReceta + " minutos.");
    System.out.println("Dificultad: " + dificultadReceta);
    
    // Se cierra la petición de datos.
    datosConsola.close();
  } 
}
