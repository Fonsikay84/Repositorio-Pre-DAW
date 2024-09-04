/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 158: Laboratorio Final.									 																																																									|
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
| - Paquete peliculas.datos	  																																																																			|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 3. Interface IAccesoDatos: La interface IAccesoDatos define los métodos para interactuar con el archivo que administrará el catálogo de películas.								| 
|														 La clase hija AccesoDatosImpl es la que va a agrega el comportamiento de los métodos para interactuar con el archivo que administrará  |
|														 el catálogo de películas.																																																							|
|														 																																																																				|
|																																																																																		|
|		3.1. Responsabilidades: Contiene las operaciones a ejecutar en el archivo de "pelicula.txt".																																		|
|																																																																																		|	
|		3.2. Métodos.																																																																										|
|																																																																																		|
|			+ existe(nombreArchivo: String):																					boolean 				-> Indica si el archivo ya existe.																	|
|			+ listar(nombre: String): 																								List<Pelicula>	-> Muestra los datos del catálogo de películas.											|
|			+ escribir(pelicula: Pelicula, nombreArchivo: String, anexar: boolean): 	void						-> Escribe o añade una nueva película al catálogo de películas.			|
|			+ buscar(nombreArchivo: String, buscar: String):													String					-> Busca una película en el catálogo de películas.									|
|			+ crear(nombreArchivo: String): 																					void						-> Crea el archivo "pelicula.txt".																	|
|			+ borrar(nombreArchivo: String):																					void						-> Elimina el archivo "pelicula.txt".																|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion43_LaboratorioFinal.peliculas.datos;

import java.util.List;
import Seccion43_LaboratorioFinal.peliculas.domain.Pelicula;
import Seccion43_LaboratorioFinal.peliculas.excepciones.AccesoDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.EscrituraDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.LecturaDatosEx;

public interface IAccesoDatos 
{
	
	// Declaración de los métodos de la interface "IAccesoDatos".
	
	// Comprueba si existe el archivo.
	public abstract boolean existe(String nombreArchivo);
	
	// Opción 1: Iniciar catálogo de películas.
	public abstract void crear(String nombreArchivo) throws AccesoDatosEx;
	
	// Opción 2: Agregar película.
	public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx, AccesoDatosEx;
	
	// Opción 3: Listar películas.
	public abstract List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx, AccesoDatosEx;
	
	// Opción 4: Buscar película.
	public abstract String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx, AccesoDatosEx;
	
	// Opción 5: Eliminar catálogo de películas.
	public abstract void borrar(String nombreArchivo) throws AccesoDatosEx;
	
}