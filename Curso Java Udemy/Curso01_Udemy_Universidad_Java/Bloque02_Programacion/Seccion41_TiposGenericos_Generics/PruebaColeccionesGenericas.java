/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 148, 149: Tipos genéricos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion41_TiposGenericos_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PruebaColeccionesGenericas 
{

	public static void main(String[] args) 
	{
		
	// 1. Interface Listas (Video 143 y Video 148).
		
		// Declaración de una lista indicando el tipo de dato genérico que va a tener dicha lista.
		List<String> listaDiasSemana = new ArrayList<String>();
		
		// Añadimos en la lista de forma dinámica todos los días de la semana.
		listaDiasSemana.add("Lunes");
		listaDiasSemana.add("Martes");
		listaDiasSemana.add("Miércoles");
		listaDiasSemana.add("Jueves");
		listaDiasSemana.add("Viernes");
		listaDiasSemana.add("Sábado");
		listaDiasSemana.add("Domingo");
		listaDiasSemana.add("Domingo");		// Permite duplicar elementos.
		
		// Obtener el valor del un elemento determinado de la lista (Video 148).
		String elementoList = listaDiasSemana.get(1);
		System.out.println("El elemento que está en la posición 2 es: " + elementoList);
		
		// Se imprime la lista de tipo List.
		imprimirLista(listaDiasSemana);
		
	// 2. Inteface Set (Video 144 y 149).
		
		// Declaración de un Set indicando el tipo de dato genérico que va a tener dicho Set.
		Set <String> setDiasSemana = new HashSet <String>();

		// Añadimos en el Set de forma dinámica todos los días de la semana.
		setDiasSemana.add("Lunes");
		setDiasSemana.add("Martes");
		setDiasSemana.add("Miércoles");
		setDiasSemana.add("Jueves");
		setDiasSemana.add("Viernes");
		setDiasSemana.add("Sábado");
		setDiasSemana.add("Domingo");
		setDiasSemana.add("Domingo");		// No permite duplicar elementos.	
		
		// Se imprime la lista de tipo Set.
		imprimirLista(setDiasSemana);
	
	// 3. Interface Map (Video 145 y 149).
		
		// Declaración de un mapa indicando el tipo de dato genérico que va a tener dicho mapa.
		Map <String, String> mapaNombres = new HashMap <String, String> ();
		
		// Añadimos al Mapa de forma dinámica varios elementos que contienen el valor de nombres.
		// Para ello, se debe de utilizar el método "put()" en el cual se debe de pasar como primer argumento un objeto que va a ser la "key" y
		// como segundo argumento, debe ser otro objeto que va a ser el "valor" que va a tener la "key".
		
		mapaNombres.put("Nombre1", "Alfonso");
		mapaNombres.put("Nombre2", "Isabel");
		mapaNombres.put("Nombre3", "Álex");
		mapaNombres.put("Nombre3", "Lale");		// El duplicado lo que produce es que actualiza el "valor" del "key" con este nuevo valor.
		
		// Para obtener el valor de un elemento del Mapa, se utiliza el método "get()" y se debe de indicar la "key" que queremos obtener.
		String elementoMapa = mapaNombres.get("Nombre3");
		System.out.println("Elemento Mapa 3: " + elementoMapa);

		// Se imprime los Keys del mapa con el método "keySet()" ya que esto devuelve un Set (lista no ordenada) con todos los keys.
		imprimirLista(mapaNombres.keySet());
		
		// Se imprime los valores asociados a los keys del mapa utilizando el método "values()" ya que esto devuelve un Set (lista no ordenada
		// con todos los valores asociados a las keys).
		imprimirLista(mapaNombres.values());
	}
	
	// Se crea un método para imprimir los datos por consola (Video 144).
	// El tipo del argumento a pasar tiene que ser el tipo más generico, en este caso, la interface Collection, ya que es la interface 
	// padre para los tipos List y Set.
	// Para restringir el tipo de dato que va a recibir la variable "tipoLista" se indica el tipo que va a contener la colección y para ello se
	// utiliza las "<>" y se indica el tipo de los datos que va a contener la lista (Video 148 y 149).
	
	public static void imprimirLista(Collection <String> tipoLista)
	{
		
		// Se recorre con un bucle "foreach" todos los elementos de la lista, indicando que la variable es de tipo "String" debido a que ya sabemos
		// el tipo del objeto con el que se va a trabajar, en este caso, la variable "elementosLista" y también indicando el nombre de la lista, 
		// en este caso, "tipoLista".
		
		for (String elementoLista : tipoLista) 
		{
			System.out.println("Elemento: " + elementoLista);
		}
	}
}
