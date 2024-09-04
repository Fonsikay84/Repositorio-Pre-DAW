/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 102: Laboratorio Final.									 																																																									|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|																																																																																		| 
| Proyecto 2: Proyecto MundoPC.																																																																			|
| 																																																																																	|	
| Se debe de simular un sistema de ventas de Computadoras en el cual vamos a poder crear una Órden y en esta órden, vamos a mostrar la información de las						| 
|	computadoras que hemos comprado, mostrando dicha información por consola.       																																									|
| Las computadoras que se compran incluyen un Monitor y dos dispositivos de entrada, un Teclado y un Ratón.																													|
|																																																																																		|
| - La clase "DispositivoEntrada" es padre de las clases "Teclado" y "Raton".																																												|	
|	- Las clases "Monitor", "Teclado" y "Raton" están relacionadas con la clase "Computadora".																																				|
|	- La clase "Computadora" está relacionada con la clase "Orden".																																																		|
| 																																																																																	|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| - Paquete com.gm.mundopc	  																																																																			|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 5. Clase Computadora: La clase Monitor almacena las computadoras junto al monitor, teclado y ratón asociados a la computadora.																		| 
|												Está relacionada con la clase "Orden" y con las clases "Monitor", "Teclado" y "Raton".																											|
|																																																																																		|
|		5.1. Responsabilidades: Crear objetos de tipo Computadora.																																																			|
|																																																																																		|
|		5.2. Atributos.																																																																									|
|																																																																																		|
|			- idComputadora:				final 	int	-> Almacena el identificador único por cada objeto que se cree de tipo "Computadora".						  												|
|			- nombre:								String 			-> Almacena el nombre de la computadora.																																									|
|			- monitor:							Monitor 		-> Almacena el objeto "Monitor" asociada a la computadora.																																|
|			- teclado:							Teclado 		-> Almacena el objeto "Teclado" asociada a la computadora.																																|
|			- raton:								Raton				-> Almacena el objeto "Raton" asociada a la computadora.																																	|
|			- contadorComputadoras:	static 	int -> Atributo que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo "Computadora" y es	  			|
| 																 		 	 		 la que se va a asignar al atributo "idComputadora".																																		|
|		5.3. Constructores.																																																																							|
|																																																																																		|
|			- Computadora()									-> Constructor vacío que inicializa el atributo "idComputadora" utilizando para ello el atributo "contadorComputadora".				|
|			+ Computadora(nombre: String , monitor: Monitor , teclado: Teclado, raton: Raton)	-> Inicializa todos los atributos de la clase "Computadora".								|	
|																																																																																		|	
|		5.4. Métodos.																																																																										|
|																																																																																		|
|			+ getIdComputadora():							int		 	-> Obtiene el valor del atributo "idComputadora".																																		|
|			+ getNombre():										String 	-> Obtiene el valor del atributo "nombre".																																					|
|			+ setNombre(nombre: String):			void 		-> Modifica el valor del atributo "nombre".																																					|
|			+ getMonitor(): 									Monitor	-> Obtiene el valor del atributo de tipo objeto "Monitor".																													|
|			+ setMonitor(monitor: Monitor):		void 		-> Modifica el valor del atributo de tipo objeto "Monitor".																													|
|			+ getTeclado(): 									Teclado	-> Obtiene el valor del atributo de tipo objeto "Teclado".																													|
|			+ setTeclado(teclado: Teclado):		void 		-> Modifica el valor del atributo de tipo objeto "Teclado".																													|
|			+ getRaton(): 										Raton		-> Obtiene el valor del atributo de tipo objeto "Raton".																														|
|			+ setRaton(raton: Raton):					void 		-> Modifica el valor del atributo de tipo objeto "Raton".																														|
|			+ toString():											String 	-> Muestra la información de todos los atributos de la clase "Computadora" por consola.															|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion24_LaboratorioFinal.com.gm.mundopc;

// Declaración de la clase "Computadora".
public class Computadora 
{
	
	// 1. Declaración de los atributos de clase.
	
	private final int idComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras;
	
	// 2. Declaración de constructores.
	
	private Computadora()
	{
		
		// Se inicializa el contador de objetos.
		Computadora.contadorComputadoras++;
		this.idComputadora = Computadora.contadorComputadoras;
	}
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton)
	{
		
		// Se llama al constructor vacío de esta misma clase para inicializar el atributo de clase "idComputadora".
		this();
		
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	// 3. Declaración de los métodos "get" y "set" de los atributos de clase.
	
	public int getIdComputadora()
	{
		return this.idComputadora;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public Monitor getMonitor()
	{
		return this.monitor;
	}
	
	public void setMonitor(Monitor monitor)
	{
		this.monitor = monitor;
	}
	
	public Teclado getTeclado()
	{
		return this.teclado;
	}
	
	public void setTeclado(Teclado teclado)
	{
		this.teclado = teclado;
	}
	
	public Raton getRaton()
	{
		return this.raton;
	}
	
	public void setRaton(Raton raton)
	{
		this.raton = raton;
	}
	
	// 4. Declaración del método "toString()".
	
	public String toString()
	{
		return "\n  - ID Computadora: " + this.idComputadora + "\n  - Nombre: " + this.nombre + "\n  - " + this.monitor.toString() + "\n  - " + this.teclado.toString() + "\n  - " + this.raton.toString();
	}
}
