/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 101: Laboratorio Final.									 																																																									|
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
| 4. Clase Monitor: La clase Monitor almacena los monitores																																																					| 
|										Está relacionada con la clase "Computadora".																																																		|
|																																																																																		|
|		4.1. Responsabilidades: Crear objetos de tipo Monitor.																																																					|
|																																																																																		|
|		4.2. Atributos.																																																																									|
|																																																																																		|
|			- idMonitor:					final 	int	-> Almacena un identificador único por cada objeto que se cree de tipo "Monitor".									  												|
|			- marca:							String 			-> Almacena la marca del monitor.																																														|
|			- tamanio							double 			-> Almacena el tamaño del monitor.																																													|
|			- contadorMonitores:	static 	int	-> Atributo que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo "Monitor" y	es la 					|
| 																 		 		 que se va a asignar al atributo "idMonitor".																																							|
|		4.3. Constructores.																																																																							|
|																																																																																		|
|			- Monitor()																-> Constructor vacío que inicializa el atributo "idMonitor" utilizando para ello el atributo "contadorMonitores".		|
|			+ Monitor(marca: String, tamanio: double)	-> Inicializa los atributos "marca" y "tamanio" de la clase "Monitor".																							|	
|																																																																																		|	
|		4.4. Métodos.																																																																										|
|																																																																																		|
|			+ getIdMonitor():									int		 	-> Obtiene el valor del atributo "idMonitor".																																				|
|			+ getMarca():											String 	-> Obtiene el valor del atributo "marca".																																						|
|			+ setMarca(marca: String):				void 		-> Modifica el valor del atributo "marca".																																					|
|			+ getTamanio(): 									String 	-> Obtiene el valor del atributo "tamanio".																																					|
|			+ setTamanio(tamanio: double):		void 		-> Modifica el valor del atributo "tamanio".																																				|
|			+ toString():											String 	-> Muestra la información de todos los atributos de la clase "Monitor" por consola.																	|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|	
*/

package Seccion24_LaboratorioFinal.com.gm.mundopc;

// Declaración de la clase "Monitor".
public class Monitor 
{
	
	// 1. Declaración de los atributos de clase.
	
	private final int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;
	
	// 2. Declaración de los constructores.
	
	private Monitor()
	{
		
		// Se inicializa el contador de objetos.
		Monitor.contadorMonitores++;
		this.idMonitor = Monitor.contadorMonitores;
	}
	
	public Monitor(String marca, double tamanio)
	{
		// Se llama al constructor vacío de esta misma clase para inicializar el atributo de clase "idMonitor".
		this();
		
		this.marca = marca;
		this.tamanio = tamanio;
	}
	
	// 3. Declaración de los métodos "get" y "set" de los atributos de clase.
	
	public int getIdMonitor()
	{
		return this.idMonitor;
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public double getTamanio()
	{
		return this.tamanio;
	}
	
	public void setTamanio(double tamanio)
	{
		this.tamanio = tamanio;
	}
	
	// 4. Declaración del método "toString()".
	
	public String toString()
	{
		return "Monitor: [ID: " + this.idMonitor + " - Marca: " + this.marca + " - Tamaño: " + this.tamanio + "]";
	}
}
