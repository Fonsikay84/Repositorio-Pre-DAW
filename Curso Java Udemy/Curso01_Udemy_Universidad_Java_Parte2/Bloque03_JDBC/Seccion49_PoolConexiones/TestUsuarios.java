/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 193: Pool de conexiones en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion49_PoolConexiones;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TestUsuarios 
{

	public static void main(String[] args) 
	{
		
		// Declaración de las variables necesarias.
		
		int opcion = 0;
		int idUsuarioActualizar = 0;
		int idUsuarioEliminar = 0;
		Scanner datosConsola = null;
		IUsuarioDao usuarioDAO = null;
		Conexion_BBDD conexionOracle = null;
		Connection conexion = null;
		
		try 
		{
			// Se crea una conexión con la BBDD.
			conexionOracle = new Conexion_BBDD("Oracle");
			conexion = conexionOracle.crearConexionBBDD();
			
			// Se comprueba si está la función "autocommit" esta activada y si es así, se desactiva.
			if (conexion.getAutoCommit() == true)
			{
				conexion.setAutoCommit(false);
			}
			
			// Creación de un objeto de tipo UsuarioDAO pasandole la conexión realizada.
			usuarioDAO = new UsuarioDaoJDBC(conexion);
			
			while(opcion != 6)
			{
				
				System.out.println("\n--------------------------------------------------");
				System.out.println("BIENVENIDOS A LA APLICACIÓN DE GESTIÓN DE USUARIOS");
				System.out.println("--------------------------------------------------");
				System.out.println("\nMENÚ");
				System.out.println("\n  1.- Consultar todos los usuarios.");	
				System.out.println("  2.- Insertar un nuevo usuario.");		
				System.out.println("  3.- Actualizar un usuario.");		
				System.out.println("  4.- Eliminar un usuario.");				
				System.out.println("  5.- Guardar todos los cambios realizados a los datos de los usuarios.");
				System.out.println("  6.- Salir.");		
				
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
						
						UsuarioDto usuarioInsertar = new UsuarioDto("Alex", "alexlopez");
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
						UsuarioDto usuarioActualizar = new UsuarioDto(idUsuarioActualizar, "alexito", "peke062022");
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
						UsuarioDto usuarioEliminar = new UsuarioDto(idUsuarioEliminar);
						usuarioDAO.eliminarUsuarios(usuarioEliminar);
						break;
					
					// 5. Guardar los datos.
					case 5:
						
						// Se guardan los datos en la BBDD.
						conexion.commit();
						System.out.println("\nINFORMACIÓN: Se han guardado todos las modificaciones realizadas de forma correcta.");
						break;
						
					// 6. Salir de la aplicación.
					case 6:
						
						System.out.println("\nINFORMACIÓN: Cierre de la aplicación \"Gestión de Usuarios\".");
						break;
					
					// Error de la aplicación.
					default:
						
						System.out.println("\nERROR: No se reconoce la opción insertada.");
						break;
				}
			}			
		} 
		catch (SQLException w_error) 
		{
			System.out.println("ERROR: Error en sentencia SQL: " + w_error.getMessage());
			System.out.println("AVISO: Se va a realizar el Rollback de todos los cambios realizados.");
			
			// Se utiliza un bloque "try catch" para enmascarar el error "SQLException" que puede producirse por el Rollback.
			try 
			{
				conexion.rollback();
			} 
			catch (SQLException w_errorRollback) 
			{
				System.out.println("\nERROR: Error en el Rollback de los datos: " + w_errorRollback.getMessage());
			}
		}
	}
}
