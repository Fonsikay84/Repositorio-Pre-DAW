/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 16: Ejemplo - Detalle de un Libro
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion03_Variables;

public class EJ02_DetalleLibro 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    String tituloLibro = "El Señor de los anillos";
    int anioPublicacion = 1954;
    boolean libroDisponible = true;
    double precio = 500.50;
    
    // Impresión de los datos por pantalla.
    System.out.println("Titulo del libro: " + tituloLibro);
    System.out.println("Año de publicación: " + anioPublicacion);
    System.out.println("Libro disponible: " + libroDisponible);
    System.out.println("Precio: " + precio);
    
    // Se modifica el valor de las variables.
    tituloLibro = "el señor de los anillos";
    System.out.println("Nuevo Título del libro: " + tituloLibro);
  }
}
