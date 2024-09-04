/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 131, 132: Interfaces en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion37_Interfaces;

// Declaración de una interface.
public interface IAccesoDatos 
{
	
	// Declaración de un atributo de tipo constante.
	public static final int MAX_REGISTRO = 10;
	
	// Declaración de métodos caracteristicos del trabajo con BBDD.
	public abstract void consultar();
	public abstract void insertar();
	public abstract void actualizar();
	public abstract void eliminar();
	
}
