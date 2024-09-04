/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 120, 121: Polimorfismo en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion32_Polimorfismo;

public class Prueba_Polimorfismo 
{

	public static void main(String[] args) 
	{
		
		// Creación de un objeto de tipo empleado (Clase padre) y mostramos sus atributos. 
		Empleado empleado1 = new Empleado("Alfonso", 5000);
		//System.out.println("Empleado: " + empleado.obtenerDetalles());

		// Se llama al método "imprimir" pero pasandole el objeto de tipo Empleado (Clase Padre).		
		imprimir(empleado1);

		// Creación de un objeto de tipo Gerente (Clase hijo) y mostramos los atributos de la clase padre y de la clase hija.
		Gerente gerente1 = new Gerente("Isabel", 2000, "Contabilidad");
		//System.out.println("Gerente: " + gerente1.obtenerDetalles());
		
		// Se llama al método "imprimir" pero pasandole el objeto de tipo Gerente (Clase Hija).
		imprimir(gerente1);
		
	}
	
	// Definición del método "imprimir()" que según sea el tipo de objeto que se le pase como argumento, pues utilizará el método "obtenerDetalles()"
	// creado en la clase Padre (Empleado) o la creada en la clase Hija (Gerente).
	// Se declara el argumento de tipo "Empleado" porque siempre se tiene que declarar por el tipo de la clase con mas jerarquía, osea, si tiene clase
	// padre e hija, pues se crea de la padre, en cambio, si hubiera clase abuelo, padre, hijo, pues se crearía del tipo abuelo.
	
	public static void imprimir(Empleado empleado)
	{
		String detalles = empleado.obtenerDetalles();
		System.out.println("Datos: " + detalles);
	}
}
