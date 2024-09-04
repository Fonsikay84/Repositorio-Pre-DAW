/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 49, 50, 51, 52, 53: Métodos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion09_Metodos;

//Clase para ejecutar las operaciones de uso de la clase Aritmética.
public class PruebaAritmetica 
{

	public static void main(String[] args) 
	{

		// Creación del objeto Aritmetica.
		Aritmetica aritmetica1 = new Aritmetica();
		
		// Se modifica los valores de los atributos.
		aritmetica1.a_num1 = 3;
		aritmetica1.a_num2 = 2;
		
		// Se llama al método de sumar.
		aritmetica1.sumar();
		
		// Se llama al método de sumar con retorno que nos devuelve el valor del resultado de la suma.
		int resultado = aritmetica1.sumarConRetorno();
		System.out.println("\n- Resultado retornado: " + resultado);
		
		// Se llama al método de sumar indicando los valores de los argumentos.
		int resultado2 = aritmetica1.sumarConArgumentos(5, 8);
		System.out.println("- Resultado con argumento: " + resultado2); 
	}

}
