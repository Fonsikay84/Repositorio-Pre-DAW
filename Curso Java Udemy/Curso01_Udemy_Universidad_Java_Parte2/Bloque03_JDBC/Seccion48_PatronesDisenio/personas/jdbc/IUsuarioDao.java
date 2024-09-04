/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 191: Patrones de diseño en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion48_PatronesDisenio.personas.jdbc;

import java.sql.SQLException;

import Seccion48_PatronesDisenio.personas.dto.UsuarioDto;

public interface IUsuarioDao 
{
	
	// Declaración de los métodos de la interface "IUsuarioDAO".
	
	public abstract void consultarUsuarios() throws SQLException;
	public abstract void insertarUsuarios(UsuarioDto usuario) throws SQLException;
	public abstract void actualizarUsuarios(UsuarioDto usuario) throws SQLException;
	public abstract void eliminarUsuarios(UsuarioDto usuario) throws SQLException;
	
}
