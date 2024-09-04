/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 62, 63: Palabra this en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion14_Palabra_this;

public class PalabraThis 
{

	public static void main(String[] args) 
	{
		
		// Creación de un objeto tipo Persona.
		Persona persona1 = new Persona("Alfonso", "López Jiménez");
		
		System.out.println("Objeto persona: " + persona1);
		System.out.println("Nombre persona: " + persona1.nombre);
		System.out.println("Apellidos persona: " + persona1.apellido);
	}
}

// Creación de la clase Persona.
class Persona
{
	
	// Atributos de la clase.
	String nombre;
	String apellido;
	
	// Constructor vacío. Se puede omitir.
	public Persona() 
	{
		
	}
	
	// Constructor con dos argumentos.
	Persona(String nombre, String apellido)
	{
		
		this.nombre = nombre;
		this.apellido = apellido;
		
		// Imprime el objeto.
		System.out.println("Imprime el Objeto persona en el constructor con this al estar en la clase Persona: " + this);
		
		// Se crea un objeto Imprimir llamando al método imprimirDatos pasandole el objeto Persona por parámetro.
		new Imprimir().imprimirDatos(this);
	}
}

//Creación de la clase Imprimir.
class Imprimir
{
	
	// Constructor vacío. Se puede omitir.
	public Imprimir()
	{
		
	}
	
	// Método imprimirDatos con el argumento del objeto Persona.
	public void imprimirDatos(Persona persona) 
	{
		
		// Imprime el Objeto Persona.
		System.out.println("Persona desde método imprimir: " + persona);	
		// Imprime el	Objeto Imprimir al estar en la clase Imprimir.
		System.out.println("Objeto actual (this): " + this);  						
	}
}