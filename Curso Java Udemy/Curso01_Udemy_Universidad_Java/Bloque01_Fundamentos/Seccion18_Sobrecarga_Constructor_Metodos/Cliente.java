/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 73, 74: Herencia en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion18_Sobrecarga_Constructor_Metodos;

import java.util.Date;

//Creación de la clase Cliente que es hija de la clase Persona.
public class Cliente extends Persona
{
	
	// Declaración de atributos de la clase.
	
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	
	// Declaración de la variable para el contador de empleados.
	private static int contadorCliente;
	
	// Declaración del constructor vacío.
	
	public Cliente() {}
	
	// Declaración del constructor para los atributos de clase.
	
	public Cliente(Date fechaRegistro, boolean vip)
	{
		
		// Se incrementa la variable para el contador de clientes y se asigna al atributo de clase.
		Cliente.contadorCliente++;
		this.idCliente = Cliente.contadorCliente;
		
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}
	
	// Declaración del constructor para los atributos de la clase Persona y de la clase Cliente.
	
	public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip)
	{
		
		// Se llama al constructor de la clase padre "Persona" que contiene todos sus atributos de clase.
		super(nombre, genero, edad, direccion);
		
		// Se incrementa la variable para el contador de clientes y se asigna al atributo de clase.
		Cliente.contadorCliente++;
		this.idCliente = Cliente.contadorCliente;
			
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}
	
	
	// Declaración de los métodos get para los atributos.
	
	public int getIdCliente()
	{
		return this.idCliente;
	}
	
	public Date getFechaRegistro()
	{
		return fechaRegistro;
	}
	
	public boolean isVip()
	{
		return this.vip;
	}
	
	// Declaración de los métodos set para los atributos.
	
	public void setFechaRegistro(Date fechaRegistro)
	{
		this.fechaRegistro = fechaRegistro;
	}
	
	public void setVip(boolean vip)
	{
		this.vip = vip;
	}
	
	// Declaración del método "toString()" para la clase Cliente.
	
	public String toString() 
	{
		return super.toString() + "\n- Clase Cliente: [ID Cliente: " + this.idCliente + ", Fecha de Registro: " + this.fechaRegistro + ", VIP: " + this.vip + "].";
	}
	
}
