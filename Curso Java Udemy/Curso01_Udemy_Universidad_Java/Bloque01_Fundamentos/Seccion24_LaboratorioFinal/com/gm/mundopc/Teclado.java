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
| 2. Clase Teclado: La clase Teclado almacena los teclados.																																																					|
|										Es hija de la clase "DispositivoEntrada". 																																																			|
|										Está relacionada con la clase "Computadora".																																																		|
|																																																																																		|
|		2.1. Responsabilidades: Crear objetos de tipo Teclado.																																																					|
|																																																																																		|
|		2.2. Atributos.																																																																									|
|																																																																																		|
|			- idTeclado:					final		int -> Almacena un identificador único por cada objeto que se cree de tipo Teclado.									  													|
|			- contadorTeclados:		static 	int -> Atributo que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo Teclado y es la que se				|
| 																 				 va a asignar al atributo "idTeclado".																																										|
|		2.3. Constructores.																																																																							|
|																																																																																		|
|			+ Teclado(String tipoEntrada, String marca)	-> Inicializa los atributos de la clase padre "DispositivosEntrada" junto a los atributos propios de "Teclado".		|
|																																																																																		|	
|		2.4. Métodos.																																																																										|
|																																																																																		|
|			+ toString():					String 	-> Muestra la información de todos los atributos de la clase "Raton" por consola.																								|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|	
*/

package Seccion24_LaboratorioFinal.com.gm.mundopc;

// Declaración de la clase "Teclado" hija de "DispositivoEntrada".
public class Teclado extends DispositivoEntrada
{
	
	// 1. Declaración de los atributos de clase.
	
	private final int idTeclado;
	private static int contadorTeclados;
	
	// 2. Declaración del constructor.
	
	public Teclado(String tipoEntrada, String marca)
	{
		
		// Se llama al constructor con dos argumentos que tiene la clase padre "DispositivoEntrada" para inicializar sus atributos de clase.
		super(tipoEntrada, marca);
		
		// Se inicializa el contador de objetos.
		Teclado.contadorTeclados++;
		this.idTeclado = Teclado.contadorTeclados;
	}
	
	// 3. Declaración del método "toString()".
	
	public String toString()
	{
		return "Teclado: [ID: " + this.idTeclado + " - " + super.toString() + "]";
	}
}
