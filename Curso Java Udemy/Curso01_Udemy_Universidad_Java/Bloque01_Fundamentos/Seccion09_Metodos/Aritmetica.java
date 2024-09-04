/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 49, 50, 51, 52, 53: Métodos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion09_Metodos;

// 1. Declaración de la clase "Aritémtica".
public class Aritmetica 
{
	
	// 2. Declaración de atributos de la clase.
	int a_num1, a_num2;
	
	// 3. Declaración de métodos.
	
	// 3.1. Método sumar.
	public void sumar() 
	{
		
		int resultado = this.a_num1 + this.a_num2;
		System.out.printf("- El resultado de sumar " + this.a_num1 + " y " + this.a_num2 + " es: " + resultado);
		
	}
	
	// 3.2. Método sumar que devuelve el valor.
	public int sumarConRetorno() 
	{
	
		int resultado = this.a_num1 + this.a_num2;
		return resultado;
		
	}
	
	// 3.3. Método sumar con argumentos que devuelve el valor.
	public int sumarConArgumentos(int num1, int num2) 
	{
		// this.nombreAtributo = nombreArgumento;
		this.a_num1 = num1;
		this.a_num2 = num2;
		
		// Se llama al método ya que realiza la misma suma con los dos valores.
		int resultado = this.sumarConRetorno();
		return resultado;
		
	}
}
