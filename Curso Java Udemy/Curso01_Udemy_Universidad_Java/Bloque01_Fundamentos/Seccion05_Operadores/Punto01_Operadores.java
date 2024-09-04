/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 24, 25, 26, 27, 28, 29, 30, 31: Operadores en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
 */

package Seccion05_Operadores;

public class Punto01_Operadores {

	public static void main(String[] args) 
	{
		// 1. Operadores aritméticos (Video 24).
		
		int a = 3, b = 2;
		var resultado = 0;
		
		// 1.1. Suma.
		resultado = a + b;			
		System.out.println("Suma: " + resultado);
		
		// 1.2. Resta.
		resultado = a - b;
		System.out.println("Resta: " + resultado);
		
		// 1.3. Multiplicación.
		resultado = a * b;
		System.out.println("Multiplicación: " + resultado);
		
		// 1.4. División entera.
		resultado = a / b;
		System.out.println("División: " + resultado);
		
		// 1.5. División decimal.
		float resultadoDivision;
		float aDivision = 3.0F;
		resultadoDivision = aDivision / b;
		System.out.println("División: " + resultadoDivision);
		
		// 1.6. Resto de la división entera.
		resultado = a % b;
		System.out.println("Resto División: " + resultado);
		
		// 2. Operadores de asignación (Video 25).
		
		// 2.1. Operador de asignación simple.
		int c = 3, d = 2;
		int e = c + 5 - d;
		System.out.println("Valor variable e: " + e);
		
		// 2.2 Operadores de asignación combinados.
		
		// 2.2.1. Suma.
		System.out.println("Valor variable c antes de la suma: " + c);
		c += 1; // Es igual a "c = c + 1".
		System.out.println("Valor variable c después de sumar 1: " + c);
		c += 3; // Es igual a "c = c + 3".
		System.out.println("Valor variable c después de sumar 3: " + c);
		
		// 2.2.2. Resta.
		System.out.println("Valor variable c antes de la resta: " + c);
		c -= 2; // Es igual a "c = c - 2".
		System.out.println("Valor variable c después de restar 2: " + c);
		
		// 2.2.3. Multiplicación.
		System.out.println("Valor variable c antes de la multiplicación: " + c);
		c *= 3; // Es igual a "c = c * 3".
		System.out.println("Valor variable c después de multiplicar por 3: " + c);
		
		// 2.2.4 División.
		System.out.println("Valor variable c antes de la división: " + c);
		c /= 5; // Es igual a "c = c / 5".
		System.out.println("Valor variable c después de dividir por 5: " + c);
		
		// 2.2.5. Resto de la división entera.
		System.out.println("Valor variable c antes de obtener el resto de la división entera: " + c);
		c %= 2; // Es igual a "c = c % 2".
		System.out.println("Valor variable c después de de obtener el resto de la división entera entre 2: " + c);
		
		// 3. Operador unario de cambio de signo (Video 26).
		var f = 3;
		var g = -f;
		System.out.println("Valor de la variable f: " + f + "\nValor de la variable g: " + g);
		
		// 4. Operador de negación para boolean (Video 26).
		var h = true;
		var i = !h;
		System.out.println("Valor de la variable h: " + h + "\nValor de la variable i: " + i);
		
		// 5. Operadores incrementales (Video 26).
		
		// 5.1. Operador de Preincremento (Símbolo antes de la variable).
		var j = 3;
		System.out.println("Valor de la variable j antes del incremento: " + j);
		var k = ++j; // Primero se incrementa en 1 la variable j y después se asigna su valor a la variable k.
		System.out.println("Valor de la variable j: " + j + "\nValor de la variable k: " + k);
		
		// 5.2. Operador de Postincremento (Símbolo después de la variable).
		var l = 5;
		System.out.println("Valor de la variable l antes del incremento: " + l);
		var m = l++; // Primero se asigna su valor a la variable m y después se incrementa en 1 la variable l.
		System.out.println("Valor de la variable l: " + l + "\nValor de la variable m: " + m);
		
		// 5.3. Operador de Predecremento (Símbolo antes de la variable).
		var n = 4;
		System.out.println("Valor de la variable n antes del decremento: " + n);
		var o = --n; // Primero se decrementa en 1 la variable n y después se asigna su valor a la variable o.
		System.out.println("Valor de la variable n: " + n + "\nValor de la variable o: " + o);
		
		// 5.4. Operador de Postdecremento (Símbolo después de la variable).
		var p = 5;
		System.out.println("Valor de la variable p antes del decremento: " + p);
		var q = p--; // Primero se asigna su valor a la variable q y después se decrementa en 1 la variable p.
		System.out.println("Valor de la variable p: " + p + "\nValor de la variable q: " + q);
		
		// 6. Operadores de igualdad. (Video 27).	
		
		// 6.1. Operador de igualdad simple (igual que).
		var r = 3;
		var s = 2;
		var t = (r == s);
		System.out.println("El valor de la variable t es: " + t);
		
		// 6.2. Operador de diferencia (distinto que).
		t = (r != s);
		System.out.println("El valor de la variable t es: " + t);
		
		// 6.3. Operador de igualdad del contenido entre cadenas (igual que).
		var cadena1 = "Hola";
		var cadena2 = "Adios";
		var u = cadena1.equals(cadena2);
		System.out.println("El valor de la variable u es: " + u);
		
		// 7. Operadores relacionales (Video 28).	
		
		// 7.1. Operador Mayor que.
		var w = a > b;
		System.out.println("El valor de la variable w es: " + w);
		
		// 7.2. Operador Mayor o igual que.
		w = a >= b;
		System.out.println("El valor de la variable w es: " + w);
		
		// 7.3. Operador Menor que.
		w = a < b;
		System.out.println("El valor de la variable w es: " + w);
		
		// 7.3. Operador Menor o igual que.
		w = a <= b;
		System.out.println("El valor de la variable w es: " + w);
		
		// 8. Operadores lógicos o booleanos (Video 29).
		
		//8.1 - Producto lógico (AND)
		var num1 = 8;
		var valorMinimo = 0;
		var valorMaximo = 10;
		var valorResultado = num1 >= valorMinimo && num1 <= valorMaximo;
		System.out.println("Resultado: " + valorResultado);
		if (valorResultado) 
		{
			System.out.println("El valor está en el rango.");
		} 
		else 
		{
			System.out.println("El valor está fuera del rango.");
		}
		
		//8.2 - Suma lógica (OR).
		var vacaciones = true;
		var diasDescanso = false;
		if (vacaciones || diasDescanso) 
		{
			System.out.println("El padre puede asistir al juego");
		} 
		else 
		{
			System.out.println("El padre esta ocupado");
		}
		
		// 9. Operador ternario (Video 30).
		var resultado2 = (a > b) ? "verdadero" : "falso";
		System.out.println("El resultado es: " + resultado2);
		
		var numero = 8;
		var resultadoParImpar = (numero % 2 == 0) ? "El numero " + numero + " es par" : "El numero  " + numero + " es impar";
		System.out.println("Resultado: " + resultadoParImpar);
		
		// 10. Precedencia o orden de aplicación de los operadores (Video 31).
		var numero1 = 5;
		var numero2 = 10;
		var numero3 = ++numero1 + numero2--; // 6 + 10 = 16
		System.out.println("Numero1: " + numero1);
		System.out.println("Numero2: " + numero2);
		System.out.println("Numero3: " + numero3);
		
		var resultado3 = 4 + 5 * 6 / 3;  // 4 + (5*6)/3 -> 4 + (30/3) -> 4 + 10 = 14
		System.out.println("Resultado: " + resultado3);
		
		resultado3 = (4 + 5) * 6 / 3; // (9*6)/3 -> 54/3 -> 18 
		System.out.println("Resultado: " + resultado3);		
	}

}
