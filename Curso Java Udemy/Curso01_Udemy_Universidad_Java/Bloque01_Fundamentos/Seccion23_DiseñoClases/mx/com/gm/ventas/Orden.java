/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 94, 95, 96, 97: Diseño de clases en Java.																																																			|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|																																																																																		| 
| Proyecto 1: Sistema de ventas.																																																																		|
| 																																																																																	|	
| Se debe de simular un sistema de ventas en el cual vamos a poder crear una orden y a ésta orden le podemos agregar varios productos.															|
| Cada producto va a tener un precio y vamos a poder calcular el total de la orden, es decir, la suma de todos los productos que se han agregado a una orden.				|	
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| - Paquete mx.com.gm.ventas  																																																																			|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 2. Clase Orden.																																																																										|
| 																																																																																	|
|		2.1. Responsabilidades:	Crear objetos de tipo Orden.																																																						|
|														Administrar los productos.																																																							|
| 	2.2. Atributos.																																																																									|
| 																																																																																	|
| 		- idOrden: 					int 			-> Atributo (final) que va a almacenar un identificador único por cada objeto que se cree de tipo Orden.												|
| 		- productos[]: 			Producto 	-> Un arreglo de objetos de tipo Producto para poder almancenar cada uno de los productos que vamos a agregar a nuestra orden.	|
| 		- contadorOrdenes: 	int 			-> Atributo (estático) que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo orden y	es la que se  |
|                                      va a asignar al atributo "idOrden".																																													|
|			+ MAX_PRODUCTOS:		int = 10	-> Constante (estática y final) que indica el nº máximo de productos que vamos a poder agregar a nuestro arreglo de productos  	| 
|                                      que se inicializa con el valor de 10.																																												|
| 	2.3. Constructores.																																																																							|
|																																																																																		|
|			+ Orden() -> Se encarga de incrementar el contador de órdenes e inicializar el valor del atributo "idOrden".																									|
|									 Inicializa el arreglo de productos utilizando la constante "MAX_PRODUCTOS".																																			|
|																																																																																		|
|		2.4. Métodos.																																																																										|
|																																																																																		|
|			+ agregarProducto(producto: Producto): void 	-> Método que recibe un objeto de tipo "Producto" y se encarga de agregar los productos al arreglo de						|
|			 																							   "productos" verificando siempre que no nos pasemos del máximo de productos permitidos (MAX_PRODUCTOS).				|
|			+ CalcularTotal(): 										 double -> Método que suma todos los precios de cada producto que tengamos en nuestra órden.														|
|			+ mostrarOrden(): 										 void 	-> Método para mostrar por consola el detalle de la órden con su id y cada uno de los productos y finalmente el	|
|			 																								 total de la órden.																																														|
|																																																																																		|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|	
*/

package Seccion23_DiseñoClases.mx.com.gm.ventas;

// Creación de la clase Orden (Video 94).
public class Orden 
{
	
	// 1. Declaración de atributos de la clase.
	
	private final int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	public static final int MAX_PRODUCTOS = 10;
	
	// 2. Declaración de constructores.
	
	public Orden()
	{
		
		// Incrementamos el contador de Órdenes para inicializar el atributo de clase "idOrden".
		Orden.contadorOrdenes++;
		this.idOrden = Orden.contadorOrdenes;
		
		// Inicializamos el arreglo de "productos"
		this.productos = new Producto[Orden.MAX_PRODUCTOS]; 
	}
	
	// 3. Declaración de los métodos.
	
	// Metodo para agregar un nuevo producto (Video 95).
	public void agregarProducto(Producto producto) 
	{
		// Recorremos el arreglo y si hay un elemento vacío, pues añade el nuevo producto y sale del bucle.
		for (int i = 0; i < this.productos.length; i++) 
		{
			if (this.productos[i] == null)
			{
				this.productos[i] = producto;
				break;
			}
		}
	}
	
	// Método para calcular el precio total de los productos vendidos (Video 96).
	public double calcularTotal()
	{
		
		double totalPrecio = 0;
		
		// Recorre todo el arreglo y si existe un producto, pues suma el precio de dicho producto con los precios de los otros productos. 
		for (int i = 0; i < this.productos.length; i++) 
		{
			if (this.productos[i] != null)
			{
				totalPrecio = totalPrecio + this.productos[i].getPrecio();
			}
		}
		return totalPrecio;
	}
	
	// Método para mostrar por consola el detalle de la órden (Video 97).
	public void mostrarOrden()
	{
		
		// Se muestra la información de la Órden.
		System.out.println("\nORDEN Nº " + this.idOrden);
		System.out.println("\nPRODUCTOS\n");
		
		// Se recorre el arreglo y si encuentra un producto, pues lo muestra por consola.
		for (int i = 0; i < this.productos.length; i++) 
		{
			if (this.productos[i] != null)
			{
				System.out.println(this.productos[i]);
			}
		}		
		
		// Llama al método de calcularTotal para obtener el total de precios de todos los productos añadidos a la órden.
		System.out.println("\nTOTAL: " + this.calcularTotal() + " €");
		System.out.println("\n-------------------------------------------------------------");
	}
}
