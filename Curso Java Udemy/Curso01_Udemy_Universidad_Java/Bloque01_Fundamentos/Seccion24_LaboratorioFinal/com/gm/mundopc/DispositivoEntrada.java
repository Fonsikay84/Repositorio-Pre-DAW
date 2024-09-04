/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 100: Laboratorio Final.									 																																																									|
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
| 1. Clase DispositivoEntrada: La clase DispositivoEntrada almacena los dispositivos de entrada.																																		|
|															 Es padre de las clases "Teclado" y "Raton".																																													|
|																																																																																		|
|		1.1. Responsabilidades: Crear objetos de tipo Dispositivo de entrada.																																														|
|																																																																																		|
|		1.2. Atributos.																																																																									|
|																																																																																		|
|			- tipoEntrada:	String	-> Almacena el tipo de dispositivo de entrada.																																												|
|			- marca: 				String 	-> Almacena la marca del dispositivo de entrada.																																											|	
| 																		 																																																															|
|		1.3. Constructores.																																																																							|
|																																																																																		|
|			+ DispositivoEntrada(String tipoEntrada, String marca) -> Se encarga de inicializar los atributos de la clase "tipoEntrada" y "marca".												|
|																																																																																		|	
|		1.4. Métodos.																																																																										|
|																																																																																		|
|			+ getTipoEntrada(): 										String 	-> Obtiene el valor del atributo "tipoEntrada".																																|
|			+ setTipoEntrada(tipoEntrada: String):	void 		-> Modifica el valor del atributo "tipoEntrada".																															|
|			+ getMarca():														String 	-> Obtiene el valor del atributo "marca".																																			|
|			+ setMarca(marca: String):							void 		-> Modifica el valor del atributo "marca".																																		|
|			+ toString():														String 	-> Muestra la información de todos los atributos de la clase "DispositivoEntrada" por consola.								|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|	
*/

package Seccion24_LaboratorioFinal.com.gm.mundopc;

// Declaración de la clase "DispositivoEntrada".

public class DispositivoEntrada 
{
	
	// 1. Declaración de los atributos de la clase.
	
	private String tipoEntrada;
	private String marca;
	
	// 2. Declaración del constructor.

	public DispositivoEntrada(String tipoEntrada, String marca)
	{
		this.tipoEntrada = tipoEntrada;
		this.marca = marca;
	}
	
	// 3. Declaración de los métodos "get" y "set" de los atributos de clase.
	
	public String getTipoEntrada()
	{
		return this.tipoEntrada;
	}
	
	public void setTipoEntrada(String tipoEntrada)
	{
		this.tipoEntrada = tipoEntrada;
	}
	
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	// 4. Declaración del método "toString()".
	
	public String toString() 
	{
		return "Dispositivo Entrada: [Tipo Entrada: " + this.tipoEntrada + " - Marca: " + this.marca + "]";
	}
}
