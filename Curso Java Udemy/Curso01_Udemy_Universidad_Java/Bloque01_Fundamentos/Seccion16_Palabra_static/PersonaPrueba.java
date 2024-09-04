/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 68, 69: Contexto estático en Java (Uso de la palabra "static").
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion16_Palabra_static;

public class PersonaPrueba 
{

	public static void main(String[] args) 
	{

			Persona persona1 = new Persona("Alfonso");
			System.out.println("Persona1: " + persona1.toString());
			
			Persona persona2 = new Persona("Isabel");
			System.out.println("Persona1: " + persona2.toString());
			
			// Se llama al método imprimir para cada uno de los objetos creados.
			imprimir(persona1);
			imprimir(persona2);
	}
	
	// Todos los métodos creados dentro del método "main" deben de ser estaticos, ya que el "main" es estático y no puede tener métodos que no sean estáticos (Video 69).
	public static void imprimir(Persona persona) 
	{
		System.out.println("Datos Persona: " + persona);
	}
}
