/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 42: Reto - Generador de emails.
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se solicita crear un programa para generar un email a partir de los siguientes datos:
|
|   - Nombre:  Ubaldo Acosta Soto 
|   - Empresa:    Global Mentoring
|   - Dominio: .com.mx
| 
| Resultado final: email: ubaldo.acosta.soto@globalmentoring.com.mx
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion04_ManejoCadenas;

public class RE01_GeneradorEmail 
{
  public static void main(String[] args) 
  {
    // Declaración de variables.
    String nombreCompleto = " Ubaldo Acosta Soto ";
    String empresaEmail = "   Global Mentoring";
    String dominio = ".com.mx";
    
    // Nombre: Se elimina los espacios en blanco del inicio y final, se pone en minúsculas y se reemplaza los espacios en blanco por puntos.
    String nombreNormalizado = nombreCompleto.trim().toLowerCase().replace(" ", ".");
    // Empresa: Se elimina los espacios en blanco del inicio y final, se pone en minúsculas y se reemplaza los espacios en blanco por nada. 
    String empresaNormalizado = empresaEmail.trim().toLowerCase().replace(" ", "");
    // Se concatena el valor de la empresa con el signo de "@" y el dominio.
    empresaNormalizado = "@".concat(empresaNormalizado).concat(dominio);
    
    // Se concatena el nombre con la empresa para formar la cuenta de email completa.
    String email = nombreNormalizado.concat(empresaNormalizado);
    
    // Se imprimen los datos por consola.
    System.out.println("*** Generador de Email ***");
    System.out.println("Nombre Usuario: " + nombreCompleto);
    System.out.println("Nombre usuario normalizado: " + nombreNormalizado);
    System.out.println("\n\nNombre empresa: " + empresaEmail);
    System.out.println("Extensión del dominio: " + dominio);
    System.out.println("Dominio de email normalizado: " + empresaNormalizado);
    System.out.println("\nEmail final generado: " + email);
  }
}
