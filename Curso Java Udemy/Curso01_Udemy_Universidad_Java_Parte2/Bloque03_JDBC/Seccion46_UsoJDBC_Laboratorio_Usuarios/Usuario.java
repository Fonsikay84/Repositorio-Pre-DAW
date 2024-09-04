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

// Declaración de la clase Usuario.

public class Usuario 
{	
	
	// Declaración de los atributos de clase.
	
	private int idUsuario;
	private String username;
	private String password;
	
	// Declaración de los constructores.
	
	public Usuario()
	{}
	
	// Sentencia Insert.
	public Usuario(String usuario, String password)
	{
		this.username = usuario;
		this.password = password;
	}

	// Sentencia Update.
	public Usuario(int idUsuario, String usuario, String password)
	{
		this.idUsuario = idUsuario;
		this.username = usuario;
		this.password = password;
	}
	
	// Sentencia Delete.
	public Usuario(int idUsuario)
	{
		this.idUsuario = idUsuario;
	}
	
	// Declaración de los métodos "get()" y "set()" de cada uno de los atibutos de clase.
	
	public int getIdUsuario()
	{
		return this.idUsuario;
	}
	
	public void setIdUsuario(int idUsuario)
	{
		this.idUsuario = idUsuario;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String usuario)
	{
		this.username = usuario;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	// Declaración del método "toString()".
	
	@Override
	public String toString()
	{
		return "Usuario: [ID Usuario: " + this.idUsuario + ", Usuario = " + this.username + ", Password: " + this.password + "]";
	}
	
}