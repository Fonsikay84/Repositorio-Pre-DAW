/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 133: Interfaces en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion37_Interfaces;

public class PruebaInteface
{

	public static void main(String[] args) 
	{	
		
		// Declaración de una variable de tipo Interface, pero como no puede crear objetos por si sóla, pues se crea un objeto de una de las clases 
		// que se han implementado con la interface "IAccesoDatos", en este caso, la clase "ImplementacionMySQL".
		IAccesoDatos datos = new ImplementacionMySQL();
		
		// Llamada al método consultar, pero en este caso, al estar apuntando la variable "datos" a la clase "ImplementaciónMySQL" esta utilizando
		// el método de dicha clase.
		datos.consultar();
		
		// Se llama al método "imprimir" que recibe una variable de tipo Interface y lanza el método "consultar" de MySQL.
		imprimir(datos);
		
		// Se convierte la variable de tipo MySQL a Oracle.
		datos = new ImplementacionOracle();
		
		// Ahora utiliza el método consultar de la clase Oracle.
		datos.consultar();
		
		// Se llama al método "imprimir" que recibe una variable de tipo Interface y lanza el método "consultar" de Oracle.
		imprimir(datos);		
	}
	
	// Declaración del método imprimir que llama al método consulta del tipo de objeto interface que se le pase por argumento
	public static void imprimir(IAccesoDatos datos)
	{
		datos.consultar();
	}
}	
