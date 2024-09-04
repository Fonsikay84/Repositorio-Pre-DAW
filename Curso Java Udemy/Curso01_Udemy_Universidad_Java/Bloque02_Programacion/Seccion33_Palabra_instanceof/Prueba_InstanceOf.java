/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 122, 123: Palabra Instance Of en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion33_Palabra_instanceof;

public class Prueba_InstanceOf 
{

	public static void main(String[] args) 
	{
		
		Empleado empleado1 = new Empleado("Alfonso", 5000);
		//determinarTipo(empleado1);
		
		empleado1 = new Gerente("Isabel", 2000, "Contabilidad");
		determinarTipo(empleado1);
	}
	
	// Declaración del método "determinarTipo" que nos indica a que tipo de objeto está apuntando la variable objeto que se pasa por argumento.
	
	public static void determinarTipo(Empleado empleado)
	{	
		// Se pregunta si la variable "empleado" esta apuntando en memoria a un objeto de tipo Gerente.
		if (empleado instanceof Gerente)
		{
			System.out.println("La variable es de tipo Gerente.");
			
			// Se crea un objeto de tipo gerente y se le asigna la variable "empleado" que en verdad apunta a un objeto de tipo Gerente, por lo que se 
			// convierte la variable "empleado" al tipo "Gerente" y así ya puede acceder al método get() declarado en la clase "Gerente".
			
			// Estas dos líneas se pueden resumir en una sola: ((Gerente) empleado).getDepartamento()
			Gerente gerente1 = (Gerente)empleado;																
			System.out.println("Departamento: " + gerente1.getDepartamento());
			
		}
		else if (empleado instanceof Empleado)
		{
			System.out.println("La variable es de tipo Empleado.");
		}
		else if (empleado instanceof Object)
		{
			System.out.println("La variable es de tipo Object.");
		}
	}
}
