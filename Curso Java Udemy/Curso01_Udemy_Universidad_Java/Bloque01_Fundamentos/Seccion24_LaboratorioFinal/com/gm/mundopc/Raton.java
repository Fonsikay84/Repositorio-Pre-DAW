/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 100: Laboratorio Final.								 																																																										|
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
| 3. Clase Raton: La clase Raton almacena los ratones 																																																							|
|									Es hija de la clase "DispositivoEntrada". 																																																				|
|									Está relacionada con la clase "Computadora".																																																			|
|																																																																																		|
|		3.1. Responsabilidades: Crear objetos de tipo Raton.																																																						|
|																																																																																		|
|		3.2. Atributos.																																																																									|
|																																																																																		|
|			- idRaton:						final 	int -> Almacena un identificador único por cada objeto que se cree de tipo Ratón.										  													|
|			- contadorRatones: 		static 	int -> Atributo que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo Ratón y es la que se					|
| 																 				 va a asignar al atributo "idRaton".																																											|
|		3.3. Constructores.																																																																							|
|																																																																																		|
|			+ Raton(String tipoEntrada, String marca)	-> Inicializa los atributos de la clase padre "DispositivosEntrada" junto a los atributos propios de "Raton".				|
|																																																																																		|	
|		3.4. Métodos.																																																																										|
|																																																																																		|
|			+ toString():					String 	-> Muestra la información de todos los atributos de la clase "Raton" por consola.																								|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|	
*/

package Seccion24_LaboratorioFinal.com.gm.mundopc;

// Declaración de la clase "Ratón" hija de "DispositivoEntrada".
public class Raton extends DispositivoEntrada
{
	
	// 1. Declaración de los atributos de clase.
	
	private final int idRaton;
	private static int contadorRatones;
	
	// 2. Declaración del constructor.
	
	public Raton(String tipoEntrada, String marca)
	{

		// Se llama al constructor con dos argumentos que tiene la clase padre "DispositivoEntrada" para inicializar sus atributos de clase.
		super(tipoEntrada, marca);
		
		// Se inicializa el contador de objetos.
		Raton.contadorRatones++;
		this.idRaton = Raton.contadorRatones;
	}
	
	// 3. Declaración del método "toString()".
	
	public String toString()
	{
		return "Ratón: [ID: " + this.idRaton + " - " + super.toString() + "]";
	}
}
