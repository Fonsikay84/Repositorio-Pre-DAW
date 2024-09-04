/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 106, 108: Enumeraciones en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion26_Enumeraciones_Enum;

public class TestEnumeraciones 
{

	public static void main(String[] args) 
	{

		// Se obtiene que día es el que se le pasa como parámetro (Video 106).
		indicarDiaSemana(DiasSemana.MARTES);
		
		// Se obtiene el valor del continente pero también se obtiene el valor del atributo de clase declarado en el valor "America" de la clase de 
		// tipo enum "Continentes". (Video 108).
		System.out.println("El 4º continente de la lista es " + Continentes.AMERICA + " y tiene " + Continentes.AMERICA.getNumPaises() + " paises.");
	}
	
	// Declaración del método "indicarDiaSemana(DiasSemana dia)" que informa de que día es el que se ha indicado en la llamada (Video 106).
	public static void indicarDiaSemana(DiasSemana dia)
	{
		
		// Según sea el valor de la variable "día" del tipo clase enum "DiasSemana", se informa por consola del día que es.
		switch (dia) 
		{
			case LUNES:
				
				System.out.println("Lunes: Primer día de la semana.");
				break;
				
			case MARTES:
				
				System.out.println("Martes: Segundo día de la semana.");
				break;
			
			case MIERCOLES:
				
				System.out.println("Miércoles: Tercer día de la semana.");
				break;
				
			case JUEVES:
				
				System.out.println("Jueves: Cuarto día de la semana.");
				break;

			case VIERNES:
				
				System.out.println("Viernes: Quinto día de la semana.");
				break;
			
			case SABADO:
				
				System.out.println("Sábado: Sexto día de la semana.");
				break;
				
			case DOMINGO:
				
				System.out.println("Domingo: Séptimo día de la semana.");
				break;
				
			default:
				
				System.out.println("ERROR: El valor introducido es erróneo.");
				break;
		}
	}
}
