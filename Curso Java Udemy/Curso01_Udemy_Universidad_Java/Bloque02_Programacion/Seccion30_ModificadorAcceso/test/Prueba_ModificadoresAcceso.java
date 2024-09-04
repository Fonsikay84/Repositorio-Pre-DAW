/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 114, 115: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.test;

import Seccion30_ModificadorAcceso.Paquete1.*;
import Seccion30_ModificadorAcceso.Paquete2.ClaseHijaProtected;

public class Prueba_ModificadoresAcceso 
{

	public static void main(String[] args) 
	{	
		
	// 1. Modificador de acceso public: Tiene acceso a todos los atributos, constructores y métodos (Video 114).
		System.out.println("Modificador de acceso Public.\n");
		// Uso de una clase creada como pública.
		ClasePublic clasePub = new ClasePublic();
		System.out.println("- Clase: " + clasePub.toString());
		
		// Uso de un atributo de clase creada como pública.
		System.out.println("- Atributo: " + clasePub.atributoPublic);
		
		// Uso del método creado como público.
		clasePub.metodoPublic();
		
	// 2. Modificador de acceso protected: Sólo tienen acceso a los atributos, constructores y métodos desde las clases que son hijas (Video 115).
		
		// Uso de una clase creada como protected.
		// ClaseProtected clasePro = new ClaseProtected();					 						No permite usar el constructor al ser protected en la declaración.
		
		// Uso de un atributo de clase creada como protected.
		//System.out.println("- Atributo: " + clasePro.atributoPublic);					No permite usar los atributos de clase al ser protected en la declaración.
		
		// Uso del método creado como protected.	
		//clasePro.metodoPublic();																							No permite usar los métodos al ser protected en la declaración.
		
		System.out.println("\nModificador de acceso Protected con la clase hija.\n");
		
		// Uso de una clase hija de la clase padre protected.
		ClaseHijaProtected clasehija = new ClaseHijaProtected();												
		System.out.println("- Clase hija: " + clasehija.toString());
		
	}

}
