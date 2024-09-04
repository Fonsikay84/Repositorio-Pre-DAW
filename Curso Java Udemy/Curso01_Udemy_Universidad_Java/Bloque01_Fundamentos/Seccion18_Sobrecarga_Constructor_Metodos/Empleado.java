/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 76: Sobrecarga de constructores en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion18_Sobrecarga_Constructor_Metodos;

// Creación de la clase Empleado que es hija de la clase Persona.
public class Empleado extends Persona
{
	
	// Declaración de atributos de la clase.
	
	private int idEmpleado;
	private double sueldo;
	
	// Declaración de la variable para el contador de empleados.
	private static int contadorEmpleado;
	
	// Declaración del constructor vacío.
	
	public Empleado() 
	{
		
		// Se realiza la operación de contador de los empleados.
		
		// Se incrementa la variable para el contador de empleados.
		Empleado.contadorEmpleado++;
		
		// Se asigna el valor del contador al atributo de clase "idEmpleado".
		this.idEmpleado = Empleado.contadorEmpleado;	
	}
	
	// Declaración del constructor para los atributos de clase.
	
	public Empleado(double sueldo)
	{
		
		// Se llama al constructor vacío de Empleado para que realice la carga del atributo de clase "idEmpleado".
		this();
		
		this.sueldo = sueldo;
	}
	
	// Declaración del constructor que carga el atributo "nombre" de la clase padre "Persona" y los atributos "idEmpleado" y "sueldo" de la clase "Empleado".
	
	public Empleado(String nombre, double sueldo)
	{
		
		// Se llama al constructor vacío de Empleado para que realice la carga del atributo de clase "idEmpleado".
		this();
		
		// Se carga el atributo de clase "nombre" de la clase "Persona".
		this.nombre = nombre;
		
		this.sueldo = sueldo;
	}
	
	// Declaración de los métodos get para los atributos.
	
	public int getIdEmpleado()
	{
		return this.idEmpleado;
	}
	
	public double getSueldo()
	{
		return this.sueldo;
	}
	
	// Declaración de los métodos set para los atributos.
	
	public void setSueldo(int sueldo)
	{
		this.sueldo = sueldo;
	}
	
	// Declaración del método "toString()" para la clase Empleado.
	
	public String toString() 
	{
		return "- Clase Empleado: [ID Empleado: " + this.idEmpleado + ", Nombre: " + this.nombre + ", Sueldo: " + this.sueldo + "]\n" + super.toString();
	}
	
}
