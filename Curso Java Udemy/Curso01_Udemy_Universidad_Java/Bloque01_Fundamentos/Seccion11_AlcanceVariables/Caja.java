/*
---------------------------------------------------------------------------------------------------------------------------------------------------
Video 58: Proyecto Caja.

Se solicita crear una clase llamada Cajacon las siguientes características:

- Debe tener 3 atributos de tipo entero (ancho, alto y profundo).
- Debe tener 2 constructores, uno vacío y uno con 3 argumentos, uno por cada atributo de la clase.
- Debe tener el método "calcularVolumen" que calcule el volumen de la caja según la formula de la lámina anterior: Fórmula volumen: vol = ancho x alto x profundo.
- Crear una clase de prueba "PruebaCaja" para: 
	
	* Crear un objeto de tipo caja que utilice el contructor vacío y que mande a imprimir el volumen de la caja según los valores proporcionados anteriormente.
	* Crear un objeto de tipo caja que utilice el contructor que tenga como valores: ancho = 3, alto = 2, profundo = 6 y que mande a imprimir el volumen de la 
		caja según los valores proporcionados anteriormente.
	
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion11_AlcanceVariables;

public class Caja 
{
	
	// Definición de los atributos de clase.
	int ancho, alto, profundo;
	
	// Definición del constructor vacío.
	public Caja()
	{
		System.out.println("Ejecutando constructor vacío.\n");
	}
	
	// Definición del constructor con 3 parámetros.
	public Caja(int p_ancho, int p_alto, int p_profundo) 
	{
		this.ancho = 3;
		this.alto = 2;
		this.profundo = 6;
		System.out.println("\nEjecutando constructor con parámetros.\n");
	}
	
	// Declaración del método calcularVolumen.
	public int calcularVolumen() 
	{
		int volumen = this.ancho * this.alto * this.profundo;
		return volumen;		
	}
}
