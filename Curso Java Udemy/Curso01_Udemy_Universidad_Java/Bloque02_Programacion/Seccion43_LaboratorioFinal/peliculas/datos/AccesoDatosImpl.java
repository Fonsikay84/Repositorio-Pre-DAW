/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 159, 160, 161: Laboratorio Final.									 																																																									|
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
| 5. Clase AccesoDatosImpl: La clase AccesoDatosImpl agrega el comportamiento de los métodos para interactuar con el archivo que administrará el catálogo de 				|
|														películas.																																																															| 
|																																																																																		|
|		5.1. Responsabilidades: Contiene las operaciones a ejecutar en el archivo de "pelicula.txt".																																		|
|																																																																																		|	
|		5.2. Métodos.																																																																										|
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import Seccion43_LaboratorioFinal.peliculas.domain.Pelicula;
import Seccion43_LaboratorioFinal.peliculas.excepciones.AccesoDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.EscrituraDatosEx;
import Seccion43_LaboratorioFinal.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements IAccesoDatos 
{
	
	// Implementación de los métodos de la interface "IAccesoDatos".
	
	// Declaración del método que comprueba si existe el archivo (Video 159).
	public boolean existe(String nombreArchivo)
	{
		
		// Creación de un objeto de tipo File en memoria donde se l pasa el argumento "nombreArchivo".		
		File archivo = new File(nombreArchivo);
		
		// Si el archivo existe, devuelve true, sino pues devuelve false.
		if (archivo.exists() == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 

	// Opción 1: Iniciar catálogo de películas -> Declaración del método que crea el archivo "peliculas.txt" fisicamente en el HDD (Video 162).
	public void crear(String nombreArchivo) throws AccesoDatosEx
	{
		
		// Si el archivo indicando no existe en el directorio.
		if (existe(nombreArchivo) != true)
		{
			// Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
			File archivo = new File(nombreArchivo);
			
			// Se crea un bloque try catch donde se produce el error para enmascarar y que no salte como error sino que informe del error producido y lo 
			// muestre por la consola.
			try
			{	
				
				// Creación de un objeto de la clase "PrintWriter" que va a abrir el archivo fisicamente en el HDD.
				PrintWriter salida = new PrintWriter(archivo);
				
				// Creación del archivo fisicamente en el HDD en el momento del cierre del archivo.
				salida.close();
				
				System.out.println("\nINFORMACIÓN: El archivo " + nombreArchivo + " se ha creado correctamente.");			
			}
			
			// ERROR: El sistema no puede encontrar la ruta especificada.
			catch (FileNotFoundException w_error) 
			{
				// Imprime el error por consola.
				w_error.printStackTrace();
				throw new AccesoDatosEx("ERROR - Método Crear: El sistema no puede encontrar la ruta especificada: " + nombreArchivo);
			}
			// ERROR: Error general.
			catch (Exception w_error) 
			{
				// Imprime el error por consola.
				w_error.printStackTrace();
				throw new AccesoDatosEx("ERROR GENERAL - Método Crear: " + w_error.getMessage());
			}
		}
		else
		{
			// Imprime el error controlado por consola.
			throw new LecturaDatosEx("ERROR - Método Crear: El archivo " + nombreArchivo + " ya existe en el sistema.");			
		}
	}

	// Opción 2: Agregar película -> Declaración del método que añade las peliculas en el archivo "peliculas.txt" (Video 160).
	public void escribir (Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx, AccesoDatosEx
	{
		
		// Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
		File archivo = new File(nombreArchivo);
		
		// Si el archivo indicando existe en el directorio.
		if (existe(nombreArchivo) == true)
		{
			
			// Debido a que la clase "PrintWriter" puede dar error, hay que incluirlo dentro de un bloque de excepciones "try catch" 
			// para enmascarar el error de que si no puede encontrar el archivo. Esta excepción se llama "FileNotFoundException".
			try 
			{
				
				// Creación de un objeto de la clase "FileWriter" que va a permitir anexar información a la que ya exista en el archivo.
				FileWriter anexarPelicula = new FileWriter(archivo, anexar);
				
				// Creación de un objeto de la clase "PrintWriter" que va a abrir el archivo fisicamente en el HDD y se le pasa el objeto FileWriter.
				PrintWriter salida = new PrintWriter(anexarPelicula);
				
				// Se utiliza el método "println" para anexar la nueva película al archivo.
				salida.println(pelicula.getNombre());
				
				// Se guarda el archivo fisicamente en el HDD en el momento del cierre del archivo.
				salida.close();
				
				System.out.println("\nINFORMACIÓN: Se ha añadido la película \"" + pelicula.getNombre() + "\" correctamente en el catálogo de películas.");				
			}
		
			// ERROR: Error general.
			catch (Exception w_error) 
			{
				// Imprime el error por consola.
				w_error.printStackTrace();
				throw new EscrituraDatosEx("ERROR - Método Escribir: " + w_error.getMessage());
			}
		}
		// Si el archivo no existe.
		else
		{
			// Imprime el error controlado por consola.
			throw new EscrituraDatosEx("ERROR - Método Escribir: El sistema no puede encontrar la ruta/archivo especificada: " + nombreArchivo);
		}
	}

	// Opción 3: Listar películas -> Declaración del método que lee todas las películas que existen en el archivo "peliculas.txt" (Video 159).
	public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx, AccesoDatosEx
	{

		// Se crea un objeto de tipo Lista que se va a almacenar cada una de las películas que existen en el archivo.
		List<Pelicula> catalogoPeliculas = new ArrayList<Pelicula>();
		
		// Si el archivo indicando existe en el directorio.
		if (existe(nombreArchivo) == true)
		{		
			// Creación de un objeto de tipo File en memoria donde se l pasa el argumento "nombreArchivo".
			File archivo = new File(nombreArchivo);
			
			// Se ha creado un bloque "try catch" para enmascarar los errores.
			try 
			{
				
				// Creación de un objeto de tipo FileReader para poder leer el contenido del archivo "peliculas.txt".
				FileReader lector = new FileReader(archivo);
				
				// Creación de un objeto de tipo BufferedReader para poder almacenar en el buffer toda la información que existe en el archivo.
				BufferedReader bufferDatos = new BufferedReader(lector);
				
				// Se realiza la lectura de la primera linea completa de nuestro archivo y se guarda en la variable "datosArchivo".
				String datosArchivo = bufferDatos.readLine();
				
				// Se crea un objeto de tipo Película guardando como nombre el obtenido de la lectura del archivo.
				//Pelicula pelicula = new Pelicula(datosArchivo);
				
				System.out.println("\nLISTADO DEL CATÁLOGO DE PELÍCULAS\n");
				// Mientras existan datos de texto en el archivo.
				while(datosArchivo != null)
				{
	
					// Se crea de nuevo un objeto de tipo Película guardando como nombre el obtenido de la lectura del archivo.
					Pelicula pelicula = new Pelicula(datosArchivo);
					
					// Se añade la película leía del archivo a la lista de películas.				
					catalogoPeliculas.add(pelicula);
					
					// Se lee la siguiente línea del archivo.
					datosArchivo = bufferDatos.readLine();
	
				}

				// Se cierra el buffer de datos del archivo.
				bufferDatos.close();
				
			} 

			// ERROR: El sistema no puede leer el archivo.
			catch (IOException w_error) 
			{
				// Se imprime el error por consola.
				w_error.printStackTrace();
				throw new LecturaDatosEx("ERROR - Método Listar: El sistema no puede leer el archivo: " + nombreArchivo);	
			}
			// ERROR: Error general.
			catch (Exception w_error) 
			{
				// Imprime el error por consola.
				w_error.printStackTrace();
				throw new AccesoDatosEx("ERROR GENERAL - Método Listar: " + w_error.getMessage());
			}
		}
		// Si el archivo no existe.
		else
		{
			// Imprime el error controlado por consola.
			throw new LecturaDatosEx("ERROR - Método Listar: El sistema no puede encontrar la ruta/archivo especificada: " + nombreArchivo);
		}
		
		// Se retorna la lista de películas existente en el archivo.
		return catalogoPeliculas;
	}
		
	// Opción 4: Buscar película -> Declaración del método que indica si existe una película en el archivo "peliculas.txt" (Video 161).
	public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx, AccesoDatosEx 
	{
		
		// Declaración de variables.
		
		int numlinea = 1;
		boolean existePelicula = false;
		String mensaje = null;
		
		// Si el archivo indicando existe en el directorio.
		if (existe(nombreArchivo) == true)
		{
		
			// Debido a que la clase "Scanner" puede dar error, hay que incluirlo dentro de un bloque de excepciones "try catch" 
			// para enmascarar el error de que si no puede encontrar el archivo. Esta excepción se llama "FileNotFoundException".
			try 
			{
				
				// Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
				File archivo = new File(nombreArchivo);
				
				// Creación de un objeto de tipo FileReader para poder leer el contenido del archivo "peliculas.txt".
				FileReader lector = new FileReader(archivo);
				
				// Creación de un objeto de tipo BufferedReader para poder almacenar en el buffer toda la información que existe en el archivo.
				BufferedReader bufferDatos = new BufferedReader(lector);
				
				// Se realiza la lectura de la primera linea completa de nuestro archivo y se guarda en la variable "datosArchivo".
				String datosArchivo = bufferDatos.readLine();
				
				// Mientras existan datos de texto en el archivo.
				while(datosArchivo != null)
				{
					
					// Si se pasa por el argumento "buscar" un nombre de película y existe una línea igual al nombre de pelicula a buscar es que ha encontrado la película en el archivo.
					// Se utiliza el método "equalsIgnoreCase" para comparar las dos cadenas y que no afecte si estan en mayúsculas o minúsculas.
					if(buscar != null && buscar.equalsIgnoreCase(datosArchivo) == true)
					{
						// Si se ha encontrado, cambia la variable "existePelicula" a true y se termina el bucle.
						existePelicula = true;							
						break;
					}
					
					// Si no se ha encontrado todavia, pues se lee la siguiente línea del archvo y se incrementa el contador de líneas.
					datosArchivo = bufferDatos.readLine();
					numlinea++;
				}
				
				// Si se ha encontrado la película, se indica por mensaje.
				if (existePelicula == true)
				{
					mensaje = "\nINFORMACIÓN: La película \"" + buscar + "\" aparece en la línea " + numlinea + " del catálogo de películas.";												
				}
				// Si no se ha encontrado la película, se indica por mensaje.
				else
				{
					mensaje = "\nINFORMACIÓN: La película \"" + buscar + "\" no existe en el catálogo de películas.";
				}
			}

			// ERROR: Error general.
			catch (Exception w_error) 
			{
				// Imprime el error por consola.
				w_error.printStackTrace();
				throw new LecturaDatosEx("ERROR GENERAL - Método Buscar: " + w_error.getMessage());
			}
		}
		// Si el archivo no existe.
		else
		{
			// Imprime el error controlado por consola.
			throw new LecturaDatosEx("ERROR - Método Buscar: El sistema no puede encontrar la ruta/archivo especificada: " + nombreArchivo);
		}
	
		// Se retorna el mensaje indicando si se ha encontrado la película o no en el archivo.
		return mensaje;
	}
	
	
	// Opción 5: Eliminar catálogo de películas -> Declaración del método que borra el archivo "peliculas.txt" de forma física  (Video 162).
	public void borrar(String nombreArchivo) throws AccesoDatosEx
	{
		
		// Si el archivo indicando existe en el directorio.
		if (existe(nombreArchivo) == true)
		{
			// Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
			File archivo = new File(nombreArchivo);
			
			// Se crea un bloque try catch donde se produce el error para enmascarar y que no salte como error sino que informe del error producido y lo 
			// muestre por la consola.
			try
			{	
				
				// Se borra el archivo y si devuelve true es que se ha borrado correctamente.
				if(archivo.delete() == true)
				{
					System.out.println("\nINFORMACIÓN: El archivo " + nombreArchivo + " se ha borrado correctamente.");
				}
				// Si no se ha borrado correctamente el archivo.
				else
				{
					throw new AccesoDatosEx("\nERROR - Método Borrar: El archivo " + nombreArchivo + " no se ha borrado correctamente.");
				}
			}
			// ERROR: Error general.
			catch (Exception w_error) 
			{
				// Imprime el error por consola.
				w_error.printStackTrace(System.out);
			}
		}
		// Si no existe el archivo a borrar.
		else
		{
			// Imprime el error controlado por consola.
			throw new AccesoDatosEx("\nERROR - Método Borrar: El archivo " + nombreArchivo + " ya no existe en el sistema.");
		}
	}
}
