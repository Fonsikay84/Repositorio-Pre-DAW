/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 59: Paso por valor en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion12_PasoValor_PasoReferencia;

public class PasoPorValor 
{

	public static void main(String[] args) 
	{
		
		int x = 10;
		System.out.println("Variable x: " + x);
		
		// Se pasa el valor de la variable x al método cambiarValor por valor.
		cambiarValor(x);
		
		System.out.println("Variable x despues del método cambiarValor: " + x);
		
	}
	
	public static void cambiarValor(int arg1) 
	{
		System.out.println("Variable arg1: " + arg1);
		
		// Aunque se modifique aquí el valor del argumento1 no influye en la variable x, ya que se pasa una copia del valor.
		arg1 = 15;
	}
	
}
