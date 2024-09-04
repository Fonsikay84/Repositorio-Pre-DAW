/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 107: Enumeraciones en Java.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion26_Enumeraciones_Enum;

public enum Continentes 
{
	// Se indica el valor del atributo de clase que va a tener cada uno de los elementos de la clase enum "Continentes".
	AFRICA(53),
	EUROPA(46),
	ASIA(44),
	AMERICA(34),
	OCEANIA(14);
	
	// Declaración de un atributo de clase que tiene cada uno de los valores de la clase enum.
	private final int numPaises;
	
	// Definición del constructor que carga el valor que se le pasa por parámetro a cada valor de la clase enum "Continentes".	
	Continentes(int numPaises)
	{
		this.numPaises = numPaises;
	}
	
	// Definición del método get() del atributo de clase.
	public int getNumPaises()
	{
		return this.numPaises;
	}
}
