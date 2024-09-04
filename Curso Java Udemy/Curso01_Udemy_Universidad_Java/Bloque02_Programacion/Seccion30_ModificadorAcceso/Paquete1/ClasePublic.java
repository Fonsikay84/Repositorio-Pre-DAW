/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 114: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete1;

// Clase public.
public class ClasePublic 
{

	// Atributo de clase public.
	public String atributoPublic = "Atributo público.";
	
	// Constructor public.
	public ClasePublic()
	{
		System.out.println("- Constructor: Constructor público.");
	}
	
	// Métodos public.
	public void metodoPublic()
	{
		System.out.println("- Método: Método público.");
	}
	
	public String toString()
	{
		return "Clase pública.";
	}
}
