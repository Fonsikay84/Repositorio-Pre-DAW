/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 150: Manejo de Archivos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion42_ManejoArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivos 
{
	
	// 1. Declaración del método para crear el archivo físico en el HDD (Video 150).
	public static void crearArchivo(String nombreArchivo)
	{
		
		// 1.1. Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
		File archivo = new File(nombreArchivo);
		
		// 1.2. Debido a que la creación del objeto "PrintWriter" puede dar error, hay que incluirlo dentro de un bloque de excepciones "try catch" 
		// para enmascarar el error de que si no puede crear el archivo llamado "FileNotFoundException".
		try 
		{
			
			// 1.3. Creación de un objeto de la clase "PrintWriter" que va a abrir el archivo fisicamente en el HDD.
			PrintWriter salida = new PrintWriter(archivo);
			
			// 1.4. Creación del archivo fisicamente en el HDD en el momento del cierre del archivo.
			salida.close();
			
			System.out.println("Se ha creado el archivo: " + nombreArchivo + " correctamente.");
			
		} 
		catch (FileNotFoundException w_error) 
		{
			// Se imprime el error por consola.
			w_error.printStackTrace(System.out);	
		}
	}
	
	// 2. Declaración del método para añadir información en el archivo creado (Video 152).
	public static void escribirArchivo(String nombreArchivo, String contenidoArchivo)
	{
		
		// 2.1. Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
		File archivo = new File(nombreArchivo);
		
		// 2.2. Debido a que la clase "PrintWriter" puede dar error, hay que incluirlo dentro de un bloque de excepciones "try catch" 
		// para enmascarar el error de que si no puede encontrar el archivo. Esta excepción se llama "FileNotFoundException".
		try 
		{
			
			// 2.3. Creación de un objeto de la clase "PrintWriter" que va a abrir el archivo fisicamente en el HDD.
			PrintWriter salida = new PrintWriter(archivo);
			
			// 2.4. Se utiliza el método "println" para añadir la información al archivo. Éste método puede pasarse por argumento cualquier tipo
			// de objeto.
			salida.println(contenidoArchivo);
			
			// 2.5. Se guarda la información añadida en el momento del cierre del archivo.
			salida.close();
			
			System.out.println("Se ha escrito en el archivo: " + nombreArchivo + " correctamente.");
			
		} 
		catch (FileNotFoundException w_error) 
		{
			// Se imprime el error por consola.
			w_error.printStackTrace(System.out);	
		}
	}
	
	// 3. Declaración del método para añadir información a la ya existente en el archivo creado (Video 153).
	public static void anexarContenidoArchivo(String nombreArchivo, String contenidoArchivo)
	{
		
		// 3.1. Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
		File archivo = new File(nombreArchivo);
		
		// 3.2. Debido a que la clase "PrintWriter" puede dar error, hay que incluirlo dentro de un bloque de excepciones "try catch" 
		// para enmascarar el error de que si no puede encontrar el archivo. Esta excepción se llama "FileNotFoundException".
		try 
		{
			
			// 3.3. Creación de un objeto de la clase "FileWriter" que va a permitir anexar información a la que ya exista en el archivo.
			FileWriter anexar = new FileWriter(archivo, true);	// Si se pasa por argumento "true" indica que se anexa información.
																													// Si se pasa por argumento "false" indica que no se anexa información. 
			
			// 3.4. Creación de un objeto de la clase "PrintWriter" que va a abrir el archivo fisicamente en el HDD y se le pasa el objeto FileWriter.
			PrintWriter salida = new PrintWriter(anexar);
			
			// 3.5. Se utiliza el método "println" para añadir la información al archivo. Éste método puede pasarse por argumento cualquier tipo
			// de objeto.
			salida.println(contenidoArchivo);
			
			// 3.6. Se guarda la información añadida en el archivo en el momento del cierre del archivo.
			salida.close();
			
			System.out.println("Se ha anexado la nueva información en el archivo: " + nombreArchivo + " correctamente.");
			
		} 
		// Error: No se encuentra el archivo (PrintWriter).
		catch (FileNotFoundException w_error) 
		{
			// Se imprime el error por consola.
			w_error.printStackTrace(System.out);	
		} 
		catch (IOException w_error) 
		{
			// Se imprime el error por consola.
			w_error.printStackTrace(System.out);	
		}
	}

	// 4. Declaración del método para leer la información que contiene el archivo creado (Video 154).
	public static void obtenerContenidoArchivo(String nombreArchivo)
	{
		
		// 4.1. Creación de un objeto de tipo File en memoria donde se le pasa el argumento "nombreArchivo".
		File archivo = new File(nombreArchivo);

		// 4.2. Debido a que la clase "PrintWriter" puede dar error, hay que incluirlo dentro de un bloque de excepciones "try catch" 
		// para enmascarar el error de que si no puede encontrar el archivo. Esta excepción se llama "FileNotFoundException".
		try 
		{
			// 4.3. Creación de un objeto de tipo FileReader para poder leer el contenido del archivo "nombreArchivo".
			FileReader lector = new FileReader(archivo);
			
			// 4.4. Creación de un objeto de tipo BufferedReader para poder almacenar en el buffer toda la información que existe en el archivo.
			// 			Se le pasa como argumento el objeto de FileReader creado anteriomente.
			BufferedReader entrada = new BufferedReader(lector);
			
			// 4.5. Se realiza la lectura de la primera linea completa de nuestro archivo y se guarda en la variable "lectura".
			String lectura = entrada.readLine();
			
			// 4.6. Se realiza la lectura del documento completo hasta que no encuentre un null con un bucle While (no hay mas información que leer).
			
			// Se declara una varible contador de las líneas que tiene el archivo de modo informativo.
			int linea = 0;
			
			while (lectura != null)
			{
				// Se incrementa el contador de líneas.
				++linea;
				
				// Se imprime la información de la línea completa leida.
				System.out.println("Línea (" + linea + "): " + lectura);
				
				// Se lee la siguiente línea del archivo.
				lectura = entrada.readLine();
			}
			
			// 4.6. Se cierra el archivo.
			entrada.close();

			System.out.println("Se ha leido toda la información del archivo: " + nombreArchivo + " correctamente.");
			
		} 
		// Error: No se encuentra el archivo (PrintWriter).
		catch (FileNotFoundException w_error) 
		{
			// Se imprime el error por consola.
			w_error.printStackTrace(System.out);	
		} 
		catch (IOException w_error) 
		{
			// Se imprime el error por consola.
			w_error.printStackTrace(System.out);	
		}
	}
}
