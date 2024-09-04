/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 132: Interfaces en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion37_Interfaces;

public class ImplementacionMySQL implements IAccesoDatos
{
	
	// Se declaran los métodos abstractos que se han declarado en la interface.
	
	@Override
	public void consultar() 
	{
		System.out.println("Consultar desde MySql.");
	}

	@Override
	public void insertar() 
	{
		System.out.println("Insertar desde MySql.");
	}

	@Override
	public void actualizar() 
	{
		System.out.println("Actualizar desde MySql.");
	}

	@Override
	public void eliminar() 
	{
		System.out.println("Eliminar desde MySql.");
	}
	
}
