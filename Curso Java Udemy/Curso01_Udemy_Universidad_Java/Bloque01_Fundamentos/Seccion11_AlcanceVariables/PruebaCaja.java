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

public class PruebaCaja 
{

	public static void main(String[] args) 
	{
		
		// Objeto Caja1.
		Caja caja1 = new Caja();
		caja1.ancho = 10;
		caja1.alto = 20;
		caja1.profundo = 15;
		
		System.out.println("DATOS DE LA CAJA 1.");
		System.out.println("-------------------------------");
		System.out.println("- Ancho: " + caja1.ancho + " cm.");
		System.out.println("- Alto: " + caja1.alto + " cm.");
		System.out.println("- Profundo: " + caja1.profundo + " cm.");
		System.out.println("- Volumén: " + caja1.calcularVolumen()  + " cm3.");
		
		// Objeto Caja2.
		Caja caja2 = new Caja(3, 2, 6);
		
		System.out.println("\nDATOS DE LA CAJA 2.");
		System.out.println("-------------------------------");
		System.out.println("- Ancho: " + caja2.ancho + " cm.");
		System.out.println("- Alto: " + caja2.alto + " cm.");
		System.out.println("- Profundo: " + caja2.profundo + " cm.");
		System.out.println("- Volumén: " + caja2.calcularVolumen() + " cm3.");

	}

}
