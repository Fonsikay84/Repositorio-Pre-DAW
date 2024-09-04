/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 98: Diseño de clases en Java.																																																															|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|																																																																																		| 
| Proyecto 1: Sistema de ventas.																																																																		|
| 																																																																																	|	
| Se debe de simular un sistema de ventas en el cual vamos a poder crear una orden y a ésta orden le podemos agregar varios productos.															|
| Cada producto va a tener un precio y vamos a poder calcular el total de la orden, es decir, la suma de todos los productos que se han agregado a una orden.				|	
| 																																																																																	|
|	- La clase "Producto" está relacionada con la clase "Orden".																																																			|
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
|			+ main(args: String[]): void -> Creamos los objetos de tipo "Producto" para añadirlo a una Órden y finalmente mandar a imprimir por consola las ordenes que		|
| 																		se hayan creado.																																																							|
|																																																																																		|	
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion23_DiseñoClases.mx.com.gm.ventas.test;

import Seccion23_DiseñoClases.mx.com.gm.ventas.Orden;
import Seccion23_DiseñoClases.mx.com.gm.ventas.Producto;

// Creación de la clase VentaTest (Video 98).
public class VentasTest 
{
	public static void main(String[] args) 
	{
		
		// Creación de los productos.
		Producto producto1 = new Producto("Café", 1.50);
		Producto producto2 = new Producto("Té", 1.25);
		Producto producto3 = new Producto("Infusión", 1.00);
		Producto producto4 = new Producto("Coca Cola", 1.50);
		Producto producto5 = new Producto("Fanta Naranja", 1.50);
		Producto producto6 = new Producto("Fanta Limón", 1.50);
		Producto producto7 = new Producto("Zumo", 2.50);
		Producto producto8 = new Producto("Tónica", 1.75);
		Producto producto9 = new Producto("Ron Legendario", 6.50);
		Producto producto10 = new Producto("Puerto de Indias", 7.50);
		
		// Creación de la Orden nº 1.
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.agregarProducto(producto3);
		orden1.agregarProducto(producto4);
		orden1.agregarProducto(producto5);
		orden1.mostrarOrden();

		// Creación de la Orden nº 2.
		Orden orden2 = new Orden();
		orden2.agregarProducto(producto6);
		orden2.agregarProducto(producto7);
		orden2.agregarProducto(producto8);
		orden2.agregarProducto(producto9);
		orden2.agregarProducto(producto10);
		orden2.mostrarOrden();
		
		// Creación de la Orden nº 3.
		Orden orden3 = new Orden();
		orden3.agregarProducto(producto2);
		orden3.agregarProducto(producto4);
		orden3.agregarProducto(producto6);
		orden3.agregarProducto(producto8);
		orden3.agregarProducto(producto10);
		orden3.agregarProducto(producto1);
		orden3.agregarProducto(producto3);
		orden3.agregarProducto(producto5);
		orden3.agregarProducto(producto7);
		orden3.agregarProducto(producto9);
		orden3.mostrarOrden();

	}
}
