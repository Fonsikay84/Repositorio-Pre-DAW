/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 166, 167: Laboratorio Final.									 																																																									|
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
|	Las opciones que muestra el menú de opciones para el usuario son:																																																	|
| 																																																																																	|
|		1.- Iniciar catalogo películas.																																																																	|
|		2.- Agregar película.																																																																						|
|		3.- Listar Películas.																																																																						|
|		4.- Buscar Película.																																																																						|
|		0.- Salir.																																																																											|
| 																																																																																	|		 	 
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| - Paquete Seccion43_LaboratorioFinal																																																															|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 5. Clase CPJLaboratorioFinal: La clase CPJLaboratorioFinal es la clase Principal donde se va a ejecutar las operaciones sobre el catálogo de películas.						| 
|																																																																																		|
|		5.1. Responsabilidades: Contiene el menú que permite al usuario seleccionar la acción a ejecutar sobre el catálogo de películas.																|	
|																																																																																		|
|		5.2. Atributos.																																																																									|
|																																																																																		|
|			+ scanner:						java.util.Scanner		-> Se solicita información por consola al usuario.																																	|
|			+ opcion: 						int 								-> Almacena la opción del menú que ha elegido el usuario.																														|
|			+ nombreArchivo:			String							-> Se detalla el nombre del archivo de texto del catálogo de películas.																							|
|			+ catalogoPeliculas:	ICatalogoPeliculas	-> Almacena el catálogo de películas.																																								|
|																																																																																		|
|		5.3. Métodos.																																																																										|
|																																																																																		|
|			+ main(args: String[]):		void 	-> Ejecuta la aplicación "Catálogo de películas".																																							|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion43_LaboratorioFinal;

import java.util.Scanner;
import Seccion43_LaboratorioFinal.peliculas.excepciones.AccesoDatosEx;
import Seccion43_LaboratorioFinal.peliculas.negocio.CatalogoPeliculasImpl;
import Seccion43_LaboratorioFinal.peliculas.negocio.ICatalogoPeliculas;

public class CPJLaboratorioFinal 
{

	// Declaración de atributos.
	
	public static Scanner scanner;
	public static int opcion;
	public static final String NOMBRE_ARCHIVO = "D:\\CursoJava\\Curso01_Udemy_Universidad_Java\\Bloque02_Programacion\\Seccion43_LaboratorioFinal\\archivo\\peliculas.txt";
	public static ICatalogoPeliculas catalogoPeliculas;
	
	// Declaración del metodo "main".
	public static void main(String[] args) throws AccesoDatosEx
	{
		
		// Variable que almacena el nombre de la película a añadir o a buscar en el catálogo de películas.
		String nombrePelicula;

		// Se utiliza un bucle do while para crear el menú de la aplicación.
		while(opcion != 6)
		{
			
			System.out.println("\n------------------------------------");
			System.out.println("BIENVENIDOS AL CATÁLOGO DE PELICULAS");
			System.out.println("------------------------------------");
			System.out.println("\nMENÚ");
			System.out.println("\n1.- Iniciar catálogo de películas.");	
			System.out.println("2.- Agregar película.");		
			System.out.println("3.- Listar películas.");		
			System.out.println("4.- Buscar película.");		
			System.out.println("5.- Eliminar catálogo de películas.");		
			System.out.println("6.- Salir.");		
			
			// Se pide al usuario que introduzca la opción del menú que quiere realizar.
			System.out.print("\n- Introduzca la opción: ");
			scanner = new Scanner(System.in);
			opcion = Integer.parseInt(scanner.nextLine()); 
			
			// Creación de un objeto de catálogo de películas.
			catalogoPeliculas = new CatalogoPeliculasImpl();
			
			// Según sea el valor de la opción.
			switch(opcion)
			{
			
				// Opción 1: Iniciar catálogo de películas.
				case 1:
				
					catalogoPeliculas.iniciarCatalogoPeliculas(NOMBRE_ARCHIVO);
					break;
					
				// Opción 2: Agregar película.
				case 2:
					
					// Se solicita al usuario el nombre de la película a agregar en el catálogo de películas.
					System.out.print("\n- Introduzca el nombre de la película a agregar: ");
					nombrePelicula = scanner.nextLine(); 
					
					catalogoPeliculas.agregarPelicula(nombrePelicula, NOMBRE_ARCHIVO);
					break;
					
				// Opción 3: Listar películas.
				case 3:
				
					catalogoPeliculas.listarPeliculas(NOMBRE_ARCHIVO);
					break;
					
				// Opción 4: Buscar película.
				case 4:
					
					// Se solicita al usuario el nombre de la película a buscar en el catálogo de películas.
					System.out.print("\n- Introduzca el nombre de la película a buscar: ");
					nombrePelicula = scanner.nextLine(); 
					
					catalogoPeliculas.buscarPelicula(NOMBRE_ARCHIVO, nombrePelicula);
					break;
					
				// Opción 5: Eliminar catálogo de películas.
				case 5:
					
					catalogoPeliculas.eliminarCatalogoPeliculas(NOMBRE_ARCHIVO);
					break;
				
				// Opción 6: Salida del programa.
				case 6:
					
					System.out.println("\nSe ha cerrado la aplicación de Catálogo de películas.");
					break;
				
				// Cualquier otra opción.
				default:
					
					System.out.println("\nERROR: La opción introducida no es correcta, introduzca una opción correcta.");
					break;
			}
		}
	}
}
