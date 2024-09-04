/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 163: Laboratorio Final.									 																																																									|
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
| 2. Interface ICatalogoPeliculas: La interface ICatalogoPeliculas define los métodos para implementar las reglas de negocio de nuestra aplicación.									| 
|																																																																																		|
|		2.1. Responsabilidades: Contiene las operaciones necesarias de la aplicación "Catálogo Películas".																															|
|														La clase hija CatalogoPeliculasImpl es la que va a agrega el comportamiento de los métodos para implementar las reglas de negocio  			|
|														de nuestra aplicación.																																																									|
|														El paquete "negocio" va a ser el paquete intermediario entre la interfaz con el usuario (método main) y el guardado de la información 	|
|														(paquete datos).																																																												|
|		2.2. Métodos.																																																																										|
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

import Seccion43_LaboratorioFinal.peliculas.excepciones.AccesoDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.EscrituraDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.LecturaDatosEx;

public interface ICatalogoPeliculas 
{
	
	// Declaración de los métodos de la interface "ICatalogoPeliculas".
	
	public abstract void iniciarCatalogoPeliculas(String nombreArchivo) throws AccesoDatosEx;
	public abstract void agregarPelicula(String nombrePelicula, String nombreArchivo) throws EscrituraDatosEx, AccesoDatosEx;
	public abstract void listarPeliculas(String nombreArchivo) throws LecturaDatosEx, AccesoDatosEx;
	public abstract void buscarPelicula(String nombreArchivo, String buscar) throws LecturaDatosEx, AccesoDatosEx;
	public abstract void eliminarCatalogoPeliculas(String nombreArchivo) throws AccesoDatosEx;
	
}
