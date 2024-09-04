/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 164: Laboratorio Final.									 																																																									|
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
| - Paquete peliculas.negocio  																																																																			|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 5. Clase CatalogoPeliculasImpl: La clase CatalogoPeliculasImpl agrega el comportamiento de los métodos para implementar las reglas de negocio de nuestra 					|
|																	aplicación.																																																												| 
|																																																																																		|
|		5.1. Responsabilidades: Contiene la implementación de las operaciones necesarias de la aplicación "Catálogo de películas".																			|	
|																																																																																		|
|		5.2. Atributos.																																																																									|
|																																																																																		|
|			- datos:								IAccesoDatos	-> Usa los métodos para interactuar con el archivo que administrará el catálogo de películas.														|
|																																																																																		|
|		5.3. Constructores.																																																																							|
|																																																																																		|
|			+ CatalogoPeliculasImpl()							-> Constructor vacío.																																																		|
|																																																																																		|
|		5.4. Métodos.																																																																										|
|																																																																																		|
|			+ iniciarCatalogoPeliculas(nombreArchivo: String):									void	-> Crea el archivo "pelicula.txt".																									|
|			+ agregarPelicula(nombrePelicula: String, nombreArchivo: String):		void 	-> Añade una pelicula al catálogo de películas.																			|
|			+ listarPeliculas(nombreArchivo: String): 													void	-> Muestra los datos del catálogo de películas.																			|
|			+ buscarPelicula(nombreArchivo: String, buscar: String): 						void	-> Busca una película en el catálogo de películas.																	|
|			+ eliminarCatalogoPeliculas(nombreArchivo: String):									void	-> Borrar el archivo "pelicula.txt".																								|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion43_LaboratorioFinal.peliculas.negocio;

import java.util.List;

import Seccion43_LaboratorioFinal.peliculas.datos.AccesoDatosImpl;
import Seccion43_LaboratorioFinal.peliculas.datos.IAccesoDatos;
import Seccion43_LaboratorioFinal.peliculas.domain.Pelicula;
import Seccion43_LaboratorioFinal.peliculas.excepciones.AccesoDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.EscrituraDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas
{	
	
	// Declaración del atributo de clase.
	
	private IAccesoDatos datos = new AccesoDatosImpl();
	
	// Declaración del constructor para inicializar el atributo de clase con la clase que implementa "AccesoDatosImpl()".
	
	public CatalogoPeliculasImpl()
	{
		this.datos = new AccesoDatosImpl();
	}
	
	// Implementación de los métodos de la interface "ICatalogoPeliculas".
	
	// Declaración del método "iniciarCatalogoPeliculas()" (Video 165).
	public void iniciarCatalogoPeliculas(String nombreArchivo) throws AccesoDatosEx
	{
		
		// Se llama al método "crear()" de la interface IAccesoDatos.
		this.datos.crear(nombreArchivo);			
	}
	
	// Declaración del método "agregarPelicula()" (Video 164).
	public void agregarPelicula(String nombrePelicula, String nombreArchivo) throws EscrituraDatosEx, AccesoDatosEx
	{
		
		// Se crea un objeto Pelicula para que almacene el nombre de pelicula que se le pasa por argumento y éste se pase al método "escribir()" de la interface IAccesoDatos
		Pelicula pelicula = new Pelicula(nombrePelicula);		

		// Se llama al método "escribir()" de la interface IAccesoDatos.
		this.datos.escribir(pelicula, nombreArchivo, true);
	}
	
	// Declaración del método "listarPeliculas()" (Video 165).
	public void listarPeliculas(String nombreArchivo) throws LecturaDatosEx, AccesoDatosEx
	{
		
		// Contador de películas.
		int contadorPeliculas = 0;
		
		// Se llama al método "listar()" de la interface IAccesoDatos que devuelve la lista de tipo Pelicula.
		List<Pelicula> catalogoPeliculas = this.datos.listar(nombreArchivo);
		
		// Se recorre toda la lista para luego mostrar por pantalla cada una de las peliculas que contiene el archivo.
		for (Pelicula peliculas : catalogoPeliculas) 
		{

			// Se incrementa el contador de peliculas.
			contadorPeliculas++;
			System.out.println("- Película " + contadorPeliculas + ": " + peliculas.getNombre() + ".");
		}
	}
	
	// Declaración del método "buscarPelicula()" (Video 165).
	public void buscarPelicula(String nombreArchivo, String buscar) throws LecturaDatosEx, AccesoDatosEx
	{
		
		// Se llama al método "buscar()" de la interface IAccesoDatos.
		String mensaje = this.datos.buscar(nombreArchivo, buscar);
		System.out.println(mensaje);
	}
	
	// Declaración del método "eliminarCatalogoPeliculas()" (Video 165).
	public void eliminarCatalogoPeliculas(String nombreArchivo) throws AccesoDatosEx
	{
		
		// Se llama al método "borrar()" de la interface IAccesoDatos.
		this.datos.borrar(nombreArchivo);
	}
}
