/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 148, 157: Ejercicio - Clase EJ01_Persona
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear una clase llamada EJ01_Persona que tenga los siguientes atributos y métodos:
|  
| Atributos.
|
|   - String nombre.
|   - String apellido.
|
| Constructor.
|  
|   + Constructor vacío.
|   + Constructor con dos argumentos de atributos de clase.
|
| Métodos get().
|
|   + Método getNombre().
|   + Método getApellido().
|
| Métodos set().
|
|   + Método setNombre().
|   + Método setApellido().
|
| Métodos.
|
|   + mostrarPersona()
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion12_ClasesObjetos;

public class EJ01_Persona 
{
  
  // Declaración de los atributos de la clase "EJ01_Persona".
  private String nombre;
  private String apellido;
  
  // Declaración del constructor vacío
  public EJ01_Persona()
  {    
  }
  
  // Declaración del constructor con dos atributos de clase.
  public EJ01_Persona (String nombre, String apellido)
  {
    this.nombre = nombre;
    this.apellido = apellido;
  }
  
  // Declaración de los métodos get() y set() de los atributos de clase.
  public String getNombre()
  {
    return this.nombre;
  }
  
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
  
  public String getApellido()
  {
    return this.apellido;
  }
  
  public void setApellido(String apellido)
  {
    this.apellido = apellido;
  }
  
  // Declaración del método "mostrarPersona()".
  public void mostrarPersona()
  {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellido: " + this.apellido + "\n");
  } 
}
