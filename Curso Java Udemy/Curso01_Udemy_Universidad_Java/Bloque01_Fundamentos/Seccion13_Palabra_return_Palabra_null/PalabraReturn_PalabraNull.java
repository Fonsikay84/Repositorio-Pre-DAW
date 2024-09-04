/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 61: Palabra return y Null en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion13_Palabra_return_Palabra_null;

import Seccion08_CreacionClases.Persona;

public class PalabraReturn_PalabraNull 
{

	public static void main(String[] args) 
	{

		Persona persona1 = new Persona();
		
		persona1.nombre = "Álex";
		System.out.println("Nombre Persona 1: " + persona1.nombre);
		
		Persona persona2 = new Persona();
		
		persona2 = cambiarValor(persona1);
		
		System.out.println("Nombre Persona 1: " + persona1.nombre);
		System.out.println("Nombre Persona 2: " + persona2.nombre);

	}
	
	public static Persona cambiarValor(Persona persona) 
	{
		
		// Si el objeto no tiene valores, se retorna null.
		if (persona == null) 
		{
			System.out.println("Valor de la persona invalido: null");
			return persona;
		}
		
		// Si tiene valores, se modifica el valor del nombre y se retorna.
		persona.nombre = "Isabel";
		return persona;
	}
}
