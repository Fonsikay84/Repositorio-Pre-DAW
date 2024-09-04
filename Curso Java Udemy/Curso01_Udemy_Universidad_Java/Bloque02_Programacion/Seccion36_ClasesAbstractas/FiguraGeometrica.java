/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 128: Clases Abstractas en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion36_ClasesAbstractas;

// Declaración de la clase abstracta "FiguraGeometrica".
public abstract class FiguraGeometrica 
{
	
	// Declaración de atributo de clase.
	protected String tipoFigura;
	
	// Declaración del constructor.
	protected FiguraGeometrica(String tipoFigura)
	{
		this.tipoFigura = tipoFigura;
	}
	
	// Declaración del método "dibujar()" de tipo abstracto.
	public abstract void dibujar();
	
	// Declaración de los métodos get() y set() para el atributo de clase "tipoFigura".
	public String getTipoFigura()
	{
		return this.tipoFigura;
	}
	
	public void setTipoFigura(String tipoFigura)
	{
		this.tipoFigura = tipoFigura;
	}
	
	// Declaración del método "toString()".
	
	@Override
	public String toString()
	{
		return "Figura Geométrica: [Tipo Figura: " + this.tipoFigura + "]";
	}
}
