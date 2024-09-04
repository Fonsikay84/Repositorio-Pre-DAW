/*
|--------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 193: Pool de conexiones en Java																																																					 |
|--------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion49_PoolConexiones;

// Declaración de la clase Usuario.

public class UsuarioDto 
{	
	
	// Declaración de los atributos de clase.
	
	private int idUsuario;
	private String username;
	private String password;
	
	// Declaración de los constructores.
	
	public UsuarioDto()
	{}
	
	// Sentencia Insert.
	public UsuarioDto(String usuario, String password)
	{
		this.username = usuario;
		this.password = password;
	}

	// Sentencia Update.
	public UsuarioDto(int idUsuario, String usuario, String password)
	{
		this.idUsuario = idUsuario;
		this.username = usuario;
		this.password = password;
	}
	
	// Sentencia Delete.
	public UsuarioDto(int idUsuario)
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