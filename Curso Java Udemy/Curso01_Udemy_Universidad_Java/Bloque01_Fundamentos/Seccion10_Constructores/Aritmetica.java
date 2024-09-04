/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 54, 55: Constructores en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion10_Constructores;

// 1. Declaración de la clase "Aritémtica".
public class Aritmetica 
{
	
	// 2. Declaración de atributos de la clase.
	int a_num1, a_num2;
	
	
	// 3.1. Declaración del constructor vacío.
	public Aritmetica() 
	{
		
		// Se inicializa los valores de los atributos, aunque no es necesario realizar esta acción.
		this.a_num1 = 0;
		this.a_num2 = 0;
		System.out.println("Ejecutando contructor vacío.");
	}
	
	// 3.2. Declaración del constructor con parámetros.
	public Aritmetica(int p_num1, int p_num2) 
	{
		
		// Se inicializa los valores de los atributos
		this.a_num1 = p_num1;
		this.a_num2 = p_num2;
		System.out.println("Ejecutando contructor con parámetros.");
	}
	
	// 4. Declaración de métodos.
	
	// 4.1. Método sumar.
	public void sumar() 
	{
		
		int resultado = this.a_num1 + this.a_num2;
		System.out.printf("- El resultado de sumar " + this.a_num1 + " y " + this.a_num2 + " es: " + resultado);
		
	}
	
	// 4.2. Método sumar que devuelve el valor.
	public int sumarConRetorno() 
	{
	
		int resultado = this.a_num1 + this.a_num2;
		return resultado;
		
	}
	
	// 4.3. Método sumar con argumentos que devuelve el valor.
	public int sumarConArgumentos(int p_num1, int p_num2) 
	{
		// this.nombreAtributo = nombreArgumento;
		this.a_num1 = p_num1;
		this.a_num2 = p_num2;
		
		// Se llama al método ya que realiza la misma suma con los dos valores.
		int resultado = this.sumarConRetorno();
		return resultado;
		
	}
}
