/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 103: Laboratorio Final.									 																																																									|
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
| 6. Clase Orden: La clase Orden almacena los pedidos de las computadoras.																																													| 
|									Está relacionada con la clase "Computadora".																																																			|
|																																																																																		|
|		6.1. Responsabilidades: Crear objetos de tipo Orden.																																																						|
|														Administrar las computadoras.																																																						|
|																																																																																		|
|		6.2. Atributos.																																																																									|
|																																																																																		|
|			- idOrden:							final 				int					-> Almacena un identificador único por cada objeto que se cree de tipo "Orden".										  				|
|			- computadoras[]:											Computadora -> Almacena un arreglo de objetos de tipo "Computadora" para poder almancenar cada uno de las computadoras  |
|																					 	 							 que vamos a agregar a nuestra órden.																																			|
|			- contadorOrdenes:			static 				int					-> Atributo que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo "Orden" y  	|
| 																 		 		 	 			 				 es la que se va a asignar al atributo "idOrden".																													|
|			- contadorComputadoras:				 				int					-> Atributo que se va a incrementar en el constructor de la clase "Computadora" para saber cuantas  				|
																						 			 				 computadoras existen en la órden.																																				|
|			- MAX_COMPUTADORAS:			final static  int 				-> Almacena el número máximo de computadoras que puede tener una órden.																			|
|																																																																																		|
|		6.3. Constructores.																																																																							|
|																																																																																		|
|			+ Orden()	-> Constructor vacío que inicializa el atributo "idOrden" utilizando para ello el atributo "contadorOrdenes".																				|
|									 Inicializa el arreglo de computadoras utilizando el atributo "maxComputadoras".																																	|
|																																																																																		|	
|		6.4. Métodos.																																																																										|
|																																																																																		|
|			+ agregarComputadora(computadora: Computadora):	void -> Método que recibe un objeto de tipo "Computadora" y se encarga de agregar las computadoras al 				|
|																														  arreglo de computadoras verificando siempre que no nos pasemos del máximo de computadoras permitidas. |																												
|			+ mostrarOrden(): 										 					void -> Muestra por consola el detalle de la órden con su id y cada uno de las computadoras.									|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|		
*/

package Seccion24_LaboratorioFinal.com.gm.mundopc;

// Declaración de la clase "Orden".
public class Orden 
{

	// 1. Declaración de los atributos de clase.
	
	private final int idOrden;
	private Computadora computadoras[];
	private static int contadorOrdenes;
	private final static int MAX_COMPUTADORAS = 5;
	
	// 2. Declaración del constructor.
	
	public Orden()
	{
		
		// Se inicializa el contador de objetos.
		Orden.contadorOrdenes++;
		this.idOrden = Orden.contadorOrdenes;
		
		// Se inicializa el arreglo de computadoras.
		this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	// 3. Declaración de los métodos.
	
	public void agregarComputadora(Computadora computadora)
	{
		for (int i = 0; i < computadoras.length; i++) 
		{
			if (this.computadoras[i] == null)
			{
				this.computadoras[i] = computadora;
				break;
			}
		}
	}
	
	public void mostrarOrden()
	{
		System.out.println("\nÓRDEN " + this.idOrden + ":");
		
		for (int i = 0; i < computadoras.length; i++) 
		{
			if (computadoras[i] != null)
			{
				System.out.println(computadoras[i].toString());
			}
		}
	}	
}
