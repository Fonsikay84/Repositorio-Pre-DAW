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

package Seccion47_Transacciones;

import java.sql.SQLException;

import Seccion46_UsoJDBC_Laboratorio_Usuarios.Usuario;

public interface IUsuarioDAO 
{
	
	// Declaración de los métodos de la interface "IUsuarioDAO".
	
	public abstract void consultarUsuarios() throws SQLException;
	public abstract void insertarUsuarios(Usuario usuario) throws SQLException ;
	public abstract void actualizarUsuarios(Usuario usuario) throws SQLException ;
	public abstract void eliminarUsuarios(Usuario usuario) throws SQLException ;
	
}
