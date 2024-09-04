/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 191: Patrones de diseño en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion48_PatronesDisenio.personas.jdbc;

import java.sql.SQLException;
import java.util.List;

import Seccion48_PatronesDisenio.personas.dto.PersonaDto;

public interface IPersonaDao
{
	
	public abstract List<PersonaDto> consultarPersonas() throws SQLException;
	public abstract void insertarPersona(PersonaDto persona) throws SQLException;
	public abstract void actualizarPersona(PersonaDto persona) throws SQLException;
	public abstract void eliminarPersona(PersonaDto persona) throws SQLException;
	
}
