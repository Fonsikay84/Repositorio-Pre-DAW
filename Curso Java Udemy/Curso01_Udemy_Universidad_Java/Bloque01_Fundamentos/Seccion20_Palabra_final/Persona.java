/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 79, 80: Uso de la palabra final en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion20_Palabra_final;

// Se crea una clase utilizando la palabra final.
public final class Persona 
{
	
	public final static int MI_CONSTANTE = 1;
	
	private String nombre;
	
	public Persona() {}
	
	public Persona(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public String getNombre() 
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public final void imprimir()
	{
		System.out.println("Método imprimir desde Persona.");
	}
}
