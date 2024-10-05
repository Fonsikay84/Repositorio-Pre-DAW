/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 150, 151, 152, 153, 154, 155, 156: Ejercicio - Clase EJ02_Aritmetica
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear dos objetos de la clase EJ02_Aritmetica con la siguiente información:
|  
| Objeto 1.
|
|   - operando1: 5
|   - operando2: 7
|
| Objeto 2.
|
|   - operando1: 12
|   - operando2: 16
|
| Se debe de utilizar los métodos "sumar()", "restar()", "multiplicar()" y "dividir()".
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion12_ClasesObjetos;

public class EJ02_PruebaAritmetica 
{
  public static void main(String[] args) 
  {
    
    System.out.println("*** EJEMPLO CLASE ARITMETICA ***\n");
    
    // Declaración de los objetos de la clase "EJ02_Aritmetica".
    EJ02_Aritmetica aritmetica1 = new EJ02_Aritmetica(5, 7);
    EJ02_Aritmetica aritmetica2 = new EJ02_Aritmetica(12, 16);
    
    // Se obtiene los datos del operando1 con el método get().
    System.out.println("Valor operando1: " + aritmetica1.getOperando1());
    System.out.println("Valor operando2: " + aritmetica1.getOperando2());
    
    // Se modifica el valor del operando1 con el método set().
    aritmetica1.setOperando1(20);
    aritmetica1.setOperando2(15);
    System.out.println("Valor operando1: " + aritmetica1.getOperando1());
    System.out.println("Valor operando2: " + aritmetica1.getOperando2());
    
    // Uso de los métodos de la clase EJ02_Aritmetica.
    aritmetica1.sumar();
    aritmetica1.restar();
    aritmetica1.multiplicar();
    aritmetica1.dividir();
    
    aritmetica2.sumar();
    aritmetica2.restar();
    aritmetica2.multiplicar();
    aritmetica2.dividir();    
  }
}
