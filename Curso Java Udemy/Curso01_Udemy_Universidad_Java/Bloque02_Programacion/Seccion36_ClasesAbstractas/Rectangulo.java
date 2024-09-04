/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 129: Clases Abstractas en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion36_ClasesAbstractas;

public class Rectangulo extends FiguraGeometrica 
{
	
	// Declaración del constructor.
	public Rectangulo(String tipoFigura)
	{
		super(tipoFigura);		
	}
	
	// Declaración del método "dibujar()" que en la clase Padre está como abstracto.
	public void dibujar() 
	{
		System.out.println("Se imprime un " + this.getClass().getSimpleName());		// Obtiene el nombre de la clase en la que se indica éste código.
	}
}
