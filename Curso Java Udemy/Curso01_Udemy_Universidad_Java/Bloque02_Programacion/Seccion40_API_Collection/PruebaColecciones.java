/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 143, 144, 145: API Collection en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion40_API_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PruebaColecciones 
{

	public static void main(String[] args) 
	{
		
	// 1. Interface Listas (Video 143).
		
		// Declaración de una lista utilizando para ello la clase "ArrayList()" debido a que "List" es una Interface y no puede crear objetos de la 
		// interface, sino de sus clases hijas relacionadas.
		List listaDiasSemana = new ArrayList();
		
		// Añadimos en la lista de forma dinámica todos los días de la semana.
		listaDiasSemana.add("Lunes");
		listaDiasSemana.add("Martes");
		listaDiasSemana.add("Miércoles");
		listaDiasSemana.add("Jueves");
		listaDiasSemana.add("Viernes");
		listaDiasSemana.add("Sábado");
		listaDiasSemana.add("Domingo");
		listaDiasSemana.add("Domingo");		// Permite duplicar elementos.
		
		// Obtener el valor del un elemento determinado de la lista.
		String elemento = (String) listaDiasSemana.get(3);
		System.out.println("El elemento que se encuentra en la posición 4 es: " + elemento);
		
		// Se imprime la lista de tipo List.
		imprimirLista(listaDiasSemana);
		
	// 2. Inteface Set (Video 144).
		
		// Declaración de una set utilizando para ello la clase "HashSet()" debido a que "Set" es una Interface y no puede crear objetos de la 
		// interface, sino de sus clases hijas relacionadas.
		Set setDiasSemana = new HashSet();

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
	
	// 3. Interface Map (Video 145).
		
		// Declaración de un Mapa utilizando para ello la clase "HashMap()" debido a que "Map" es una Interface y no puede crear objetos de la 
		// interface, sino de sus clases hijas relacionadas.
		
		Map mapaNombres = new HashMap();
		
		// Añadimos al Mapa de forma dinámica varios elementos que contienen el valor de nombres.
		// Para ello, se debe de utilizar el método "put()" en el cual se debe de pasar como primer argumento un objeto que va a ser la "key" y
		// como segundo argumento, debe ser otro objeto que va a ser el "valor" que va a tener la "key".
		
		mapaNombres.put("Nombre1", "Alfonso");
		mapaNombres.put("Nombre2", "Isabel");
		mapaNombres.put("Nombre3", "Álex");
		mapaNombres.put("Nombre3", "Lale");		// El duplicado lo que produce es que actualiza el "valor" del "key" con este nuevo valor.
		
		// Para obtener el valor de un elemento del Mapa, se utiliza el método "get()" y se debe de indicar la "key" que queremos obtener.
		System.out.println("Elemento Map: " + mapaNombres.get("Nombre1"));

		// Se imprime los Keys del mapa con el método "keySet()" ya que esto devuelve un Set (lista no ordenada) con todos los keys.
		imprimirLista(mapaNombres.keySet());
		
		// Se imprime los valores asociados a los keys del mapa utilizando el método "values()" ya que esto devuelve un Set (lista no ordenada
		// con todos los valores asociados a las keys).
		imprimirLista(mapaNombres.values());
	}
	
	// Se crea un método para imprimir los datos por consola (Video 144).
	// El tipo del argumento a pasar tiene que ser el tipo más generico, en este caso, la interface Collection, ya que es la interface 
	// padre para los tipos List y Set.
	public static void imprimirLista(Collection tipoLista)
	{
		
		// Se recorre con un bucle "foreach" todos los elementos de la lista, indicando que la variable es de tipo "Object" y que se llama 
		// "elementosLista" y también indicando el nombre de la lista, en este caso, "tipoLista".
		
		for (Object elementoLista : tipoLista) 
		{
			System.out.println("Elemento: " + elementoLista);
		}
	}
}
