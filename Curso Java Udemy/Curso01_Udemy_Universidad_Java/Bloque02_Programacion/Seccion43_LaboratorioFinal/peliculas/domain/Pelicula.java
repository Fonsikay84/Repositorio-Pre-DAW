/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 157: Laboratorio Final.									 																																																									|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|																																																																																		| 
| Proyecto 3: Proyecto Catálogo de peliculas.																																																												|
| 																																																																																	|	
| Se debe de simular un sistema de catálogo de peliculas las cuales se van a almacenar en un archivo de texto. 																											|
|																																																																																		|
| - La clase "AccesoDatosEx" es padre de las clases "EscrituraDatosEx" y "LecturaDatosEx".																																					|	
|	- Las clase "AccesoDatosImpl" está relacionada con la interface "AccesoDatos".																																										|
|	- Las clase "CatalogoPeliculasImpl" está relacionada con la interface "CatalogoPeliculas".																																				|
| 																																																																																	|
|	Paquetes:																																																																													|
| 																																																																																	|
|		1. Crear un paquete de excepciones mx.com.gm.películas.excepciones, similar a la lección de excepciones vistas en el curso, según se muestra en el diagrama 		|
|			 de clases.																																																																										|
|		2. Crear un paquete mx.com.gm.películas.domain que incluya una clase llamada Pelicula. 																																					|
|		 	 Las clases almacenadas en este paquete, se conoce como las clases del dominio del problema.																																	|
|		3. Crear un paquete llamado mx.com.gm.películas.datos la cual incluye una interface y una clase que implementa dicha interface. 																|
|		 	 El objetivo de estas clases es agregar la funcionalidad para interactuar con el archivo donde se va a guardar la información del catálogo de películas.			|
|		4. Crear el paquete llamado mx.com.gm.peliculas.negocio el cual incluye las clases para definir la funcionalidad de nuestra aplicación, también conocido como		|
|		 	 las reglas de negocio de la aplicación.																																																											|
|		5. Finalmente crearemos la clase CPJLaboratorioFinal, que significa CursoProgramacionJavaLaboratorioFinal, el cual incluye un menú de opciones para escoger la	|
|		 	 opción a procesar en el programa.																																																														|
| 																																																																																	|		 	 
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| - Paquete peliculas.domain  																																																																			|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 1. Clase Película: La clase Pelicula nos servirá para representar el objeto Pelicula.																																							| 
|																																																																																		|
|		1.1. Responsabilidades: Representa los objetos Pelicula utilizados en la aplicación Catálogo de películas.																											|
|																																																																																		|
|		1.2. Atributos.																																																																									|
|																																																																																		|
|			- nombre:											String 	-> Almacena el nombre de la película.																																										|
|																																																																																		|
|		1.3. Constructores.																																																																							|
|																																																																																		|
|			+ Pelicula()													-> Constructor vacío.																																																		|
|			+ Pelicula(nombre: String)						-> Inicializa el atributo de la clase "Pelicula".																																				|	
|																																																																																		|	
|		1.4. Métodos.																																																																										|
|																																																																																		|
|			+ getNombre():								String 	-> Obtiene el valor del atributo "nombre".																																							|
|			+ setNombre(nombre: String):	void 		-> Modifica el valor del atributo "nombre".																																							|
|			+ toString():									String 	-> Muestra la información del atributo de la clase "Pelicula" por consola.																							|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion43_LaboratorioFinal.peliculas.domain;

public class Pelicula 
{
	
	// Declaración del atributo de clase.
	
	private String nombre;
	
	// Declaración de los constructores.
	
	public Pelicula()
	{}
	
	public Pelicula(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Declaración de los métodos get() y set() para el atributo de clase "nombre".
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	// Declaración del método "toString()".
	
	@Override
	public String toString()
	{
		return "Película: [Nombre: " + this.nombre + "]";
	}
}
