/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 92, 93, 94, 95, 96, 97, 98: Diseño de clases en Java.																																																			|
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
| 1. Clase Producto: La clase Producto se agrega a una órden y esta relación entre las dos clases se llama relación de agregación.																	|
|																																																																																		|
|		1.1. Responsabilidades: Crear objetos de tipo Producto.																																																					|
|																																																																																		|
|		1.2. Atributos.																																																																									|
|																																																																																		|
|			- idProducto:					int 		-> Atributo (final) que va a almacenar un identificador único por cada objeto que se cree de tipo Producto.						          |
|			- nombre:							String 	-> Nombre del producto.																																																					|
|			- precio:							double 	-> Precio del producto.																																																					|
|			- contadorProductos: 	int 		-> Atributo (privado, estático) que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo producto y		|
| 																		 es la que se va a asignar al atributo "idProducto".																																					|
|		1.3. Constructores.																																																																							|
|																																																																																		|
|			- Producto() 								 								-> Se encarga de incrementar el contador de órdenes e inicializar el valor del atributo "idProducto".							|
|			+ Producto(nombre: String, precio double)		-> Llama internamente al constructor vacío "Producto()" para poder inicializar el atributo "idProducto".					|
|																																																																																		|
|		1.4. Métodos.																																																																										|
|																																																																																		|
|			+ getIdProducto():						int			-> Obtiene el valor del atributo "IdProducto".																																					|
|			+ getNombre(): 								String 	-> Obtiene el valor del atributo "nombre".																																							|
|			+ setNombre(nombre: String):	void 		-> Modifica el valor del atributo "nombre".																																							|
|			+ getPrecio():								double 	-> Obtiene el valor del atributo "precio".																																							|
|			+ setPrecio(precio: double):	void 		-> Modifica el valor del atributo "precio".																																							|
|			+ toString():									String 	-> Muestra la información de todos los atributos de la clase "Producto" por consola.																		|
|																																																																																		|
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
| - Paquete mx.com.gm.ventas.test  																																																																	|	
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 3. Clase Ventas Test: La clase Producto se agrega a una órden y esta relación entre las dos clases se llama relación de agregación.																|
|																																																																																		|	
|		3.1. Responsabilidades: Ejecutar la prueba de la aplicación de Ventas.																																													|
|																																																																																		|	
|		3.2. Métodos.																																																																										|
|																																																																																		|
|			+ main(args: String[]): void -> Creamos los objetos de tipo Producto, nuestras ordenes y finalmente mandar a imprimir las ordenes que se hayan creado.				|
|																																																																																		|	
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/