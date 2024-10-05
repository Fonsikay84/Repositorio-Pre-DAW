/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 23: Reto - Detalle de un Producto de una Tienda Online.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear varias variables para almacenar el detalle de un producto de una tienda online.
|
| El detalle a almacenar del producto es el siguiente:
| 
|   - Nombre del producto.
|   - Precio.
|   - Cantidad disponible.
|   - Indicar si está disponible para la venta.
| 
| Deben asignar valores de prueba a cada variable, escoger el nombre de cada variable aplicando las buenas prácticas,
| y mandar a imprimir el valor de cada variable.
|
| Finalmente deben de modificar el valor de cada variable con nuevos datos y mandar a imprimir de nuevo el valor de 
| cada variable y asi comprobar que se modifican correctamente los valores.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion03_Variables;

public class RE02_Detalle_Producto_Tienda_Online 
{
  public static void main(String[] args) 
  {
    
    // Declaración de variables.
    String nombreProducto = "Coca Cola";
    double precioProducto = 1.99D;
    int cantidadDisponible = 20;
    boolean estaDisponible = true;
    
    // Imprimir los datos por consola.
    System.out.println("*** Tienda Online ***");
    System.out.println("Nombre Producto: " + nombreProducto);
    System.out.println("Precio Producto: " + precioProducto);
    System.out.println("Cantidad disponible: " + cantidadDisponible);
    System.out.println("¿Está disponible?: " + estaDisponible);
    
    // Se modifica el valor de cada uno de las variables.
    nombreProducto = "Fanta Naranja";
    precioProducto = 1.80D;
    cantidadDisponible = 0;
    estaDisponible = false;
    
    // Imprimir de nuevo los datos por consola.
    System.out.println("\n*** Tienda Online ***");
    System.out.println("Nombre Producto: " + nombreProducto);
    System.out.println("Precio Producto: " + precioProducto);
    System.out.println("Cantidad disponible: " + cantidadDisponible);
    System.out.println("¿Está disponible?: " + estaDisponible);
        
  }
}
