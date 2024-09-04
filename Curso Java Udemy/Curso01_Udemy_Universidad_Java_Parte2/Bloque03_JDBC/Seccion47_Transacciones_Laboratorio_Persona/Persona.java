/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 189: Uso de JDBC en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion47_Transacciones_Laboratorio_Persona;

// Declaración de la clase Persona con los campos de la tabla Persona de BBDD.

public class Persona 
{
  
  // Declaración de los atributos de clase con los nombres de las columnas de la tabla Persona.
  
  private int idPersona;
  private String nombre;
  private String apellidos;
  private String email;
  private String telefono;
  
  // Declaración de los constructores.
  
  public Persona()
  {}

  // Declaración del constructor con los atributos que se van a necesitar para insertar un nuevo registro (INSERT).
  // El atributo "idPersona" no se incluye porque es autoincrementable con una secuencia.
  public Persona(String nombre, String apellidos, String email, String telefono)
  {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    this.telefono = telefono;
  }

  // Declaración del constructor con los atributos de clase que se van a necesitar para actualizar un registro (UPDATE).
  // Se indica el atributo "idPersona" porque es la PK y se utilizaría como filtro en el Where del Update.
  public Persona(int idPersona, String nombre, String apellidos, String email, String telefono)
  {
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.email = email;
    this.telefono = telefono;
  }
  
  // Declaración del constructor del atributo que es PK en la tabla que se va a necesitar para borrar un registro ya que se va a utilizar en el
  // Where del Delete (DELETE).
  public Persona(int idPersona)
  {
    this.idPersona = idPersona;
  }

  // Declaración de los métodos get() y set() de cada atributo de clase.
  
  public int getIdPersona() 
  {
    return idPersona;
  }

  public void setIdPersona(int idPersona) 
  {
    this.idPersona = idPersona;
  }

  public String getNombre() 
  {
    return nombre;
  }

  public void setNombre(String nombre) 
  {
    this.nombre = nombre;
  }

  public String getApellidos() 
  {
    return apellidos;
  }

  public void setApellidos(String apellidos) 
  {
    this.apellidos = apellidos;
  }

  public String getEmail() 
  {
    return email;
  }

  public void setEmail(String email) 
  {
    this.email = email;
  }

  public String getTelefono() 
  {
    return telefono;
  }

  public void setTelefono(String telefono) 
  {
    this.telefono = telefono;
  }

  // Declaración del método "toString()".
  
  @Override
  public String toString() 
  {
    return "Persona: [idPersona: " + idPersona + ", nombre: " + nombre + ", apellidos: " + apellidos + ", email: " + email + ", telefono: " + telefono + "]";
  }
}
