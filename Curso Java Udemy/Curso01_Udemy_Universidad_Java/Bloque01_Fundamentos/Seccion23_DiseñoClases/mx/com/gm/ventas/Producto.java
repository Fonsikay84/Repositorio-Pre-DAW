/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 93: Diseño de clases en Java.																																																															|
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
|			- idProducto:					int 		-> Atributo (final) que va a almacenar un identificador único por cada objeto que se cree de tipo Producto.										  |
|			- nombre:							String 	-> Nombre del producto.																																																					|
|			- precio:							double 	-> Precio del producto.																																																					|
|			- contadorProductos: 	int 		-> Atributo (estático) que se va a incrementar en el constructor de nuestra clase por cada objeto de tipo producto y						|
| 																		 es la que se va a asignar al atributo "idProducto".																																					|
|		1.3. Constructores.																																																																							|
|																																																																																		|
|			- Producto() 								 								-> Se encarga de incrementar el contador de productos e inicializar el valor del atributo "idProducto".						|
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
*/

package Seccion23_DiseñoClases.mx.com.gm.ventas;

// Creación de la clase Producto (Video 93).
public class Producto 
{
	
	// 1. Declaración de atributos de la clase.
	
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	// 2. Declaración de constructores.
	
	// 2.1. Constructor vacío.
	
	private Producto()
	{
		
		// Incrementa el contador de productos e inicializar el valor del atributo "idProducto".
		contadorProductos++;
		this.idProducto = Producto.contadorProductos;
	}
	
	// 2.2. Constructor con dos argumentos.
	public Producto(String nombre, double precio)
	{

		// Se llama al constructor vacío.
		this();
		
		// Se inicializa los atributos de la clase.
		this.nombre = nombre;
		this.precio = precio;
	}
	
	// 3. Declaración de métodos get y set de los atributos de clase.
	
	public int getIdProducto()
	{
		return this.idProducto;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public double getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(double precio)
	{
		this.precio = precio;
	}
	
	// 4. Declaración del método "toString()" para la clase Producto.
	
	public String toString() 
	{
		return "+ Producto " + this.idProducto + ":\t" + this.nombre + "\t" + this.precio + " €";
		
	}
}
