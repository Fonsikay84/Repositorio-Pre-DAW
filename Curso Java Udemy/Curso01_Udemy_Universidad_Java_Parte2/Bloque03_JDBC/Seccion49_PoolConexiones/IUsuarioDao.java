/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 193: Pool de conexiones en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion49_PoolConexiones;

import java.sql.SQLException;

public interface IUsuarioDao 
{
	
	// Declaración de los métodos de la interface "IUsuarioDAO".
	
	public abstract void consultarUsuarios() throws SQLException;
	public abstract void insertarUsuarios(UsuarioDto usuario) throws SQLException;
	public abstract void actualizarUsuarios(UsuarioDto usuario) throws SQLException;
	public abstract void eliminarUsuarios(UsuarioDto usuario) throws SQLException;
	
}
