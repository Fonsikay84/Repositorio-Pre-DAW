/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 129: Clases Abstractas en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion36_ClasesAbstractas;

public class PruebaClasesAbstractas 
{

	public static void main(String[] args) 
	{
		
		// Uso de Upcasting, ya que se crea una variable de tipo padre "FiguraGeometrica" pero apunta a un objeto de tipo hijo "Rectangulo".
		FiguraGeometrica figura = new Rectangulo("Rectángulo");																																	 
		
		// Uso de Polimorfismo, ya que utiliza el método de la clase hija "Rectangulo".
		figura.dibujar();																					
	}

}
