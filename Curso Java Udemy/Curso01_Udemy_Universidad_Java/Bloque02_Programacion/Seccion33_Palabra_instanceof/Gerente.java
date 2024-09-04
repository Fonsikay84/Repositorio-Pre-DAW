/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 122, 123: Palabra Instance Of en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion33_Palabra_instanceof;

public class Gerente extends Empleado
{
	
	// Declaración de atributo de clase.
	
	private String departamento;
	
	// Declaración del constructor llamando al constructor padre e inicializando el atributo de la clase hija.
	
	public Gerente(String nombre, double sueldo, String departamento)
	{
		super(nombre, sueldo);
		this.departamento = departamento;		
	}
	
	// Declaración de los métodos get() y set().
	
	public String getDepartamento() 
	{
		return this.departamento;
	}

	public void setDepartamento(String departamento) 
	{
		this.departamento = departamento;
	}
	
	// Declaración del método "obtenerDetalles()" sobreescrito.
	
	@Override
	public String obtenerDetalles()
	{
		
		// Se llama al método "obtenerDetalles()" de la clase padre y se concatena el valor del atributo de la clase hija.
		return super.obtenerDetalles() + ", Departamento: " + this.departamento;
	}
}
