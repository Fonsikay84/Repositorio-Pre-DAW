/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 149, 157: Ejercicio - Clase EJ01_Persona
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear dos objetos de la clase EJ01_Persona con la siguiente información:
|  
| Objeto 1.
|
|   - nombre: Layla
|   - apellido: Acosta
|
| Objeto 2.
|
|   - nombre: Ian
|   - apellido: Gomez
|
| Se debe de utilizar el método "mostrarPersona()" para mostrar por consola los datos de los dos objetos.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion12_ClasesObjetos;

public class EJ01_PruebaPersona 
{
  public static void main(String[] args) 
  {
    
    // Se crea los dos objetos y se cargan los datos de los atributos de la clase EJ01_Persona.
    System.out.println("*** CREACION DE CLASE Y OBJETOS DE TIPO PERSONA ***\n");
    
    EJ01_Persona objeto1 = new EJ01_Persona("Layla", "Acosta");
    EJ01_Persona objeto2 = new EJ01_Persona("Ian", "Gomez");
    
    // Se llama al método "mostrarPersona()" para imprimir por consola los datos de las personas.
    objeto1.mostrarPersona();
    objeto2.mostrarPersona();
  }
}
