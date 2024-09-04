/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 71, 72: Herencia en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion17_Herencia;

// Creación de la clase Empleado que es hija de la clase Persona.
public class Empleado extends Persona
{
	
	// Declaración de atributos de la clase.
	
	private int idEmpleado;
	private double sueldo;
	
	// Declaración de la variable para el contador de empleados.
	private static int contadorEmpleado;
	
	// Declaración del constructor vacío.
	
	public Empleado() {}
	
	// Declaración del constructor para los atributos de clase.
	
	public Empleado(double sueldo)
	{
		
		// Se incrementa la variable para el contador de empleados.
		Empleado.contadorEmpleado++;
		
		// Se asigna el valor del contador al atributo de clase "idEmpleado".
		this.idEmpleado = Empleado.contadorEmpleado;
		this.sueldo = sueldo;
	}
	
	// Declaración del constructor que carga el atributo "nombre" de la clase padre "Persona" y los atributos "idEmpleado" y "sueldo" de la clase "Empleado".
	
	public Empleado(String nombre, double sueldo)
	{
		
		// Inicializa el atributo "nombre" de la clase padre "Persona" con el valor que se pase en el argumento "nombre".
		super(nombre);
		
		Empleado.contadorEmpleado++;
		
		// Se incrementa la variable para el contador de empleados y se asigna su valor al atributo "idEmpleado".
		this.idEmpleado = Empleado.contadorEmpleado;
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
