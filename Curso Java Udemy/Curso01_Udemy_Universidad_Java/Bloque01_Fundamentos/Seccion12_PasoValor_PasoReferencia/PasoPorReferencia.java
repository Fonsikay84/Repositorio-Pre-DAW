/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 60: Paso por referencia en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion12_PasoValor_PasoReferencia;

import Seccion08_CreacionClases.Persona;

public class PasoPorReferencia 
{

	public static void main(String[] args) 
	{

		Persona persona1 = new Persona();
		
		persona1.nombre = "Álex";
		System.out.println("Nombre: " + persona1.nombre);
		cambiarValor(persona1);
		System.out.println("Nombre: " + persona1.nombre);

	}
	
	public static void cambiarValor(Persona persona) 
	{
		persona.nombre = "Isabel";
	}
}
