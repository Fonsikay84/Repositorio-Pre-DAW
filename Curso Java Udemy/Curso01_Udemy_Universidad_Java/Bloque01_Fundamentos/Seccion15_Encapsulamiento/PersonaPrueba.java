/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 65, 66: Encapsulamiento en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion15_Encapsulamiento;

public class PersonaPrueba 
{

	public static void main(String[] args) 
	{
		
		// Creación del objeto Persona1 de tipo Persona.
		Persona persona1 = new Persona("Alfonso López", 1500.00, false);

		// Uso del método "toString" para mostrar la información de los atributos de la clase Persona (Video 66).
		System.out.println("Datos Persona1 con toString: " + persona1.toString());
		
		// Mostramos el nuevo valor del atributo "nombre".
		System.out.println("Nombre sin cambios: " + persona1.getNombre());
		
		// Modificamos el valor del atributo "nombre".
		persona1.setNombre("Álex López");
		
		// Mostramos el nuevo valor del atributo "nombre" junto a los atributos "sueldo" y "eliminado".
		System.out.println("Nombre con cambios: " + persona1.getNombre());
		System.out.println("Sueldo: " + persona1.getSueldo());
		System.out.println("Eliminado: " + persona1.isEliminado());
		
		// Uso del método "toString" para mostrar la información de los atributos de la clase Persona (Video 66).
		System.out.println("Datos Persona1 con toString: " + persona1.toString());
		
	}

}
