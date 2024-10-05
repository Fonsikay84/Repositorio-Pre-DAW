/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 150, 151, 152, 153, 154, 155, 156: Ejercicio - Clase Aritmética
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear una clase llamada Aritmética que tenga los siguientes atributos y métodos:
|  
| Atributos.
|
|   - int operando1.
|   - int operando2.
| 
  Constructores.

    - Constructor vacío.
    - Constructor dos los argumentos de inicialización de atributos.
  
  Métodos get().

    + Método getOperando1().
    + Método getOperando2().

  Método set().

    + Método setOperando1().
    + Método setOperando2().

| Métodos.
|
|   + sumar(): Imprime por consola la suma de los dos operandos.
|   + restar(): Imprime por consola la resta de los dos operandos.
|   + multiplicar(): Imprime por consola la multiplicación de los dos operandos.
|   + dividir(): Imprime por consola la división de los dos operandos.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion12_ClasesObjetos;

public class EJ02_Aritmetica 
{
  
  // Declaración de atributos de clase.
  private int operando1;
  private int operando2;
  
  // Declaración del constructor vacío.
  public EJ02_Aritmetica()
  {
  }
  
  // Declaración del constructor con dos argumentos.
  public EJ02_Aritmetica(int operando1, int operando2)
  {
    // Se inicializa los atributos de clase.
    this.operando1 = operando1;
    this.operando2 = operando2;
  }
  
  // Se declaran los métodos get() y set() de los atributos de clase.
  public int getOperando1()
  {
    return this.operando1;
  }
  
  public void setOperando1(int operando1)
  {
    this.operando1 = operando1;
  }
  
  public int getOperando2()
  {
    return this.operando2;
  }
  
  public void setOperando2(int operando2)
  {
    this.operando2 = operando2;
  }
  
  // Declaración del método sumar().
  public void sumar()
  {
    // Declaración de variable.
    int resultado;
    
    // Se realiza la operación y se imprime el resultado por consola.
    resultado = this.operando1 + this.operando2;
    System.out.printf("La suma de %d y %d es: %d%n", this.operando1, this.operando2, resultado); 
  }
  
  // Declaración del método restar()
  public void restar()
  {
    // Declaración de variable.
    int resultado;
    
    // Se realiza la operación y se imprime el resultado por consola.
    resultado = this.operando1 - this.operando2;
    System.out.printf("La resta de %d y %d es: %d%n", this.operando1, this.operando2, resultado); 
  }
  
  // Declaración del método multiplicar()
  public void multiplicar()
  {
    // Declaración de variable.
    int resultado;
   
    // Se realiza la operación y se imprime el resultado por consola.
    resultado = this.operando1 * this.operando2;
    System.out.printf("La multiplicacion de %d y %d es: %d%n", this.operando1, this.operando2, resultado); 
  }
  
  // Declaración del método dividir()
  public void dividir()
  {
    // Declaración de variable.
    int resultado;
      
    // Se realiza la operación y se imprime el resultado por consola.
    resultado = this.operando1 / this.operando2;
    System.out.printf("La division de %d y %d es: %d%n%n", this.operando1, this.operando2, resultado); 
  }
}
