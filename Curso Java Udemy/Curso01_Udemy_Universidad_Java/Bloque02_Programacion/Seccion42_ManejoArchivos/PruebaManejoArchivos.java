/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 151: Manejo de Archivos en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion42_ManejoArchivos;

public class PruebaManejoArchivos 
{

	public static void main(String[] args) 
	{
		
	// 1. Creación del archivo de forma fisica (Video 151).
		
		// 1.1. Declaración de unas variables donde se indica la ruta y el nombre del archivo a crear.
		// 			Para indicar la barra invertida de la ruta, se debe de indicar dos barras.
		String ruta = "C:\\CFGS\\Curso01_Udemy_Universidad_Java\\Bloque02_Programacion\\Seccion42_ManejoArchivos\\";
		String nombre = "prueba.txt";
		
		// 1.2. Se declara una variable que contenga la ruta y el nombre del archivo a crear si se quiere que se cree en un directorio determinado.
		String nombreArchivo = ruta + nombre;
		
		// 1.3. Se llama al método "ManejoArchivos.crearArchivo()" para que se realice la creación del archivo.
		ManejoArchivos.crearArchivo(nombreArchivo);
		
		// Si se quiere sólo indicar el nombre del archivo y no la ruta, pues el archivo se crea en la carpeta principal del proyecto.
		// En este caso, la ruta principal del proyecto es: "C:\CFGS\Curso01_Udemy_Universidad_Java"
		// Se llama de nuevo al método "ManejoArchivos.crearArchivo()" para que se realice la creación del archivo sin indicar la ruta.
		// ManejoArchivos.crearArchivo(nombre);

	// 2. Escribir contenido en el archivo anteriormente creado (Video 152).
		
		// 2.1. Se declara una variable con la información que va a contener el archivo.
		String contenidoArchivo1 = "Hola desde Java.";
		
		// 2.2. Se llama al método "escribirArchivo()" para incluir la información pasada por argumento en el archivo indicado.
		ManejoArchivos.escribirArchivo(nombreArchivo, contenidoArchivo1);
		
	// 3. Anexar contenido al ya existente en el archivo anteriormente creado (Video 153).
		
		// 3.1. Se declara una variable con la información que va a añadir al contenido del archivo.
		String contenidoArchivo2 = "Adios desde Java.";
		
		// 3.2. Se llama al método "anexarContenidoArchivo()" para anexar la información pasada por argumento en el archivo indicado.
		ManejoArchivos.anexarContenidoArchivo(nombreArchivo, contenidoArchivo2);
		
	// 4. Obtener la información que tiene un archivo anteriormente creado (Video 154).
		
		// 4.1. Se llama al método "obtenerContenidoArchivo()" para leer la información del archivo indicado.
		ManejoArchivos.obtenerContenidoArchivo(nombreArchivo);
		
	}
}
