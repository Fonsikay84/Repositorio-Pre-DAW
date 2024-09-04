/*
|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 185, 186: Uso de JDBC en Java																																																						 |
|--------------------------------------------------------------------------------------------------------------------------------------------------|
|																																																																									 |
|	Se solicita crear un proyecto Java con las siguientes características:																																					 |
|																																																																									 |	
|		- Crear una tabla llamada "usuario" en MySQL en el esquema: test y con los siguientes campos:																									 |
|																																																																									 |
|			* idUsuario (int) PK autoincrementable.																																																			 |
|			* usuario (String).																																																													 |
|			* password (String).																																																												 |
|																																																																									 |
|		- Crear las clases similares al ejercicio JDBC para el manejo de las operaciones en la tabla "usuario":																				 |
|																																																																									 |
|			* Consultar los registros de usuarios.																																																			 |
|			* Insertar un nuevo usuario.																																																								 |
|			* Actualizar un usuario.																																																										 |
|			* Eliminar un usuario.																																																											 |
|																																																																									 |
|		- Utilizar para ello la creación de un ménu en el que pueda el usuario elegir la opción a realizar.																						 |
|																																																																									 |
|--------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion46_UsoJDBC_Laboratorio_Usuarios;

import java.util.Scanner;

public class LaboratorioUsuarios 
{

	public static void main(String[] args) 
	{
		
		// Declaración de las variables necesarias.
		
		int opcion = 0;
		int idUsuarioActualizar = 0;
		int idUsuarioEliminar = 0;
		Scanner datosConsola = null;
		IUsuarioDAO usuarioDAO = null;
		
		// Creación de un objeto de tipo UsuarioDAO.
		usuarioDAO = new UsuarioDAO();

		while(opcion != 5)
		{
			
			System.out.println("\n--------------------------------------------------");
			System.out.println("BIENVENIDOS A LA APLICACIÓN DE GESTIÓN DE USUARIOS");
			System.out.println("--------------------------------------------------");
			System.out.println("\nMENÚ");
			System.out.println("\n  1.- Consultar todos los usuarios.");	
			System.out.println("  2.- Insertar un nuevo usuario.");		
			System.out.println("  3.- Actualizar un usuario.");		
			System.out.println("  4.- Eliminar un usuario.");				
			System.out.println("  5.- Salir.");		
			
			// Se pide al usuario que introduzca la opción del menú que quiere realizar.
			System.out.print("\n- Introduzca la opción: ");
			datosConsola = new Scanner(System.in);
			opcion = Integer.parseInt(datosConsola.nextLine());
			
			
			// Según la opción elegida.
			switch (opcion) 
			{
				
				// 1. Prueba sobre el método "consultarUsuarios()".
				case 1:
					
					usuarioDAO.consultarUsuarios();
					break;
				
				// 2. Prueba sobre el método "insertarUsuarios()".
				case 2:
					
					Usuario usuarioInsertar = new Usuario("Alex", "alexlopez");
					usuarioDAO.insertarUsuarios(usuarioInsertar);
					break;
				
				// 3. Prueba sobre el método "usuarioActualizar()".
				case 3:
					
					// Se muestran todos los usuarios existentes.
					usuarioDAO.consultarUsuarios();
					
					// Se solicita indicar el usuario a actualizar.
					System.out.print("\n- Introduzca el ID del usuario a modificar: ");
					datosConsola = new Scanner(System.in);
					idUsuarioActualizar = Integer.parseInt(datosConsola.nextLine());
					
					// Se actualiza el usuario indicado.
					Usuario usuarioActualizar = new Usuario(idUsuarioActualizar, "alexito", "peke2022");
					usuarioDAO.actualizarUsuarios(usuarioActualizar);
					break;
				
				// 4. Prueba sobre el método "eliminarUsuarios()".
				case 4:
					
					// Se muestran todos los usuarios existentes.
					usuarioDAO.consultarUsuarios();
					
					// Se solicita indicar el usuario a eliminar.
					System.out.print("\n- Introduzca el ID del usuario a eliminar: ");
					datosConsola = new Scanner(System.in);
					idUsuarioEliminar = Integer.parseInt(datosConsola.nextLine());
					
					// Se elimina el usuario indicado.
					Usuario usuarioEliminar = new Usuario(idUsuarioEliminar);
					usuarioDAO.eliminarUsuarios(usuarioEliminar);
					break;
				
				// 5. Salir de la aplicación.
				case 5:
					
					System.out.println("\nINFORMACIÓN: Cierre de la aplicación \"Gestión de Usuarios\".");
					break;
				
				// 6. Error de la aplicación.
				default:
					
					System.out.println("\nERROR: No se reconoce la opción insertada.");
					break;
			}
		}
	}
}
