/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Videos 114, 115, 116: Modificadores de acceso en Java
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion30_ModificadorAcceso.Paquete1;

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
	
	// 3. Modificador de acceso default: Se tiene acceso a los atributos, constructores y métodos desde las clases que están en el mismo paquete (Video 116).
		
		System.out.println("\nModificador de acceso Default.\n");
		
		// Uso de una clase creada como default.
		ClaseDefault claseDef = new ClaseDefault();												// Permite usar el constructor al ser default en la declaración y estar en el mismo paquete.
		
		// Uso de un atributo de clase creada como default.
		claseDef.atributoDefault = "Modificación atributo default.";			// Permite usar los atributos de clase al ser default en la declaración y estar en el mismo paquete.
		System.out.println("- Atributo: " + claseDef.atributoDefault);
		
		// Uso del método creado como default.
		claseDef.metodoDefault();																					// Permite usar los métodos al ser default en la declaración y estar en el mismo paquete.
		System.out.println("- Clase: " + claseDef.toString());
		
	// 4. Modificador de acceso private: Sólo se pueden acceder a los atributos, constructores y métodos desde la clase que está declarada (Video 117).
		
		System.out.println("\nModificador de acceso Private.\n");
		
		// Uso de una clase creada como private.
		ClasePrivate clasePrivate = new ClasePrivate("Constructor public.");			// No permite usar el constructor al ser private, por lo que se ha creado uno public.
		
		// Uso de un atributo de clase y método creada como private.
		clasePrivate.setAtributoPrivado("Modificación atributo private.");				// No permite usar los atributos de forma directa al ser private, se tiene que usar los métodos get() y set().
		System.out.println("- Atributo: " + clasePrivate.getAtributoPrivado());		// No se permite usar los métodos privados, por lo que se ha llamado desde el método getAtributoPrivado().		
	}

}
