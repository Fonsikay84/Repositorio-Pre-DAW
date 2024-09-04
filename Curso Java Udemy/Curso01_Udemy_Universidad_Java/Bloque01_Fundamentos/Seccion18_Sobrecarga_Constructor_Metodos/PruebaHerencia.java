/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 76: Sobrecarga de constructores en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion18_Sobrecarga_Constructor_Metodos;

import java.util.Date;

public class PruebaHerencia 
{

	public static void main(String[] args) 
	{	
		
		// Creación de un objeto de tipo Empleado.
		Empleado empleado1 = new Empleado("Alfonso", 1450.00);
		System.out.println("DATOS:\n\n" + empleado1.toString());
		
		// Creación de un objeto de tipo Fecha.
		Date fechaHoy = new Date();
		
		// Creación de un objeto de tipo Cliente.
		Cliente cliente1 = new Cliente("Alfonso López", 'M', 39, "Calle De Sucre 2 Bloque 5 1A", fechaHoy, true);
		System.out.println("DATOS:\n\n" + cliente1.toString());
		
	}

}
