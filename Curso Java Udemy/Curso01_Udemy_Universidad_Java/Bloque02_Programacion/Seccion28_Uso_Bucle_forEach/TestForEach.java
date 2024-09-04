/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 111, 112: Uso del bucle forEach en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion28_Uso_Bucle_forEach;

public class TestForEach 
{

	public static void main(String[] args) 
	{
		
		// Declaración de un Arreglo de edades (Video 111).
		int a_edades[] = {5, 6, 8};
		
		// Declaración del bucle forEach para datos primitivos.
		for (int w_edad : a_edades) 
		{
			System.out.println("Edad: " + w_edad);
		}
		
		// Declaración de un Arreglo de objetos tipo Persona (Video 112).
		Persona a_personas[] = {new Persona("Alfonso"), new Persona("Isabel"), new Persona("Álex")};

		// Declaración del bucle forEach para datos tipo objeto.		
		for (Persona w_persona : a_personas) 
		{
			System.out.println(w_persona.toString());
		}
	}

}
