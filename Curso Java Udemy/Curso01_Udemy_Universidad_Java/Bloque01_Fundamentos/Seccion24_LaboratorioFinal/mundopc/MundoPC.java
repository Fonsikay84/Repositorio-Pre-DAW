/*
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Videos 104: Laboratorio Final.									 																																																									|
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
| - Paquete mundopc	  																																																																							|
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 																																																																																	|
| 7. Clase MundoPC: La clase MundoPC se encarga de agregar objetos de tipo "Computadora" con todos sus dispositivos a una Órden.																		|
|																																																																																		|	
|		7.1. Responsabilidades: Ejecutar la prueba de la aplicación de MundoPC.																																													|
|																																																																																		|	
|		7.2. Métodos.																																																																										|
|																																																																																		|
|			+ main(args: String[]): void -> Creamos los objetos de tipo "DispositivoEntrada", "Teclado", "Raton", "Monitor", "Computadora" para añadirlo a una Órden y 		|
|																			finalmente mandar a imprimir por consola las ordenes que se hayan creado.																											|
|																																																																																		|	
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
*/

package Seccion24_LaboratorioFinal.mundopc;

import Seccion24_LaboratorioFinal.com.gm.mundopc.*;

// Declaración de la clase principal "MundoPC".
public class MundoPC 
{

	public static void main(String[] args) 
	{
		
		String vTipoEntradaBlu = "Bluetooth";
		String vMarcaHP = "HP";
		String vMarcaSam = "Samsung";
		String vMarcaHib = "Hibrido " + vMarcaHP + "-" + vMarcaSam;
		
		// Creación de objetos de todos los tipos.
		
		Monitor monitorHP = new Monitor(vMarcaHP, 21.00);
		Teclado tecladoHP = new Teclado(vTipoEntradaBlu, vMarcaHP);
		Raton ratonHP = new Raton(vTipoEntradaBlu, vMarcaHP);
		Computadora computadoraHP = new Computadora("Computadora " + vMarcaHP, monitorHP, tecladoHP, ratonHP);
		
		Monitor monitorSam = new Monitor(vMarcaSam, 28.00);
		Teclado tecladoSam = new Teclado(vTipoEntradaBlu, vMarcaSam);
		Raton ratonSam = new Raton(vTipoEntradaBlu, vMarcaSam);
		Computadora computadoraSam = new Computadora("Computadora " + vMarcaSam, monitorSam, tecladoSam, ratonSam);
		
		Raton ratonHibrido = new Raton(vTipoEntradaBlu, vMarcaHib);
		Computadora computadoraHibrido = new Computadora("Computadora " + vMarcaHib, monitorSam, tecladoHP, ratonHibrido);
		
		// Clase Órden.
		
		Orden ordenComputadora = new Orden();
		ordenComputadora.agregarComputadora(computadoraHP);
		ordenComputadora.agregarComputadora(computadoraSam);
		ordenComputadora.agregarComputadora(computadoraHibrido);
		ordenComputadora.mostrarOrden();
		
		
		// Clase Raton.
		Raton raton1 = new Raton("Ratón USB", "Uineer");
		//System.out.println(raton1.toString());
		Raton raton2 = new Raton("Ratón Wifi", "Pionner");
		//System.out.println(raton2.toString());
		Raton raton3 = new Raton("Ratón por cable", "Canon");
		//System.out.println(raton3.toString());
		
		// Clase Teclado.
		Teclado teclado1 = new Teclado("Teclado Inalámbrico", "Trust");
		//System.out.println(teclado1.toString());
		Teclado teclado2 = new Teclado("Teclado Wifi", "HP");
		//System.out.println(teclado2.toString());
		
		// Clase Monitor.
		Monitor monitor1 = new Monitor("Samsung", 21.00);
		//System.out.println(monitor1.toString());
		Monitor monitor2 = new Monitor("LG", 28.00);
		//System.out.println(monitor2.toString());
		
		// Clase Computadora.
		Computadora computadoraFonsi = new Computadora("Portátil Fonsi", monitor1, teclado1, raton2);
		//System.out.println(computadoraFonsi.toString());
		Computadora computadoraIsa = new Computadora("Portátil Isa", monitor2, teclado2, raton1);
		//System.out.println(computadoraIsa.toString());
		Computadora computadoraAlex = new Computadora("Portátil Álex", monitor1, teclado2, raton3);
		//System.out.println(computadoraAlex.toString());
		
		// Clase Órden.
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraFonsi);
		orden1.agregarComputadora(computadoraAlex);
		orden1.agregarComputadora(computadoraIsa);
		orden1.mostrarOrden();
		
		Orden orden2 = new Orden();
		orden2.agregarComputadora(computadoraIsa);
		orden2.agregarComputadora(computadoraIsa);
		orden2.mostrarOrden();
		
		Orden orden3 = new Orden();
		orden3.agregarComputadora(computadoraFonsi);
		orden3.agregarComputadora(computadoraIsa);
		orden3.agregarComputadora(computadoraAlex);
		orden3.agregarComputadora(computadoraIsa);
		orden3.agregarComputadora(computadoraFonsi);
		orden3.mostrarOrden();
		
	}
}
