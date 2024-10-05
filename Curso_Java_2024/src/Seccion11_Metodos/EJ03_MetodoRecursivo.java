/*
---------------------------------------------------------------------------------------------------------------------------------------------------
| Video 146: Ejercicio - Método recursivo
---------------------------------------------------------------------------------------------------------------------------------------------------
| Enunciado: Se debe de crear un método recursivo llamado "metodoRecursivo()" que imprima los valores del 1 al 5.
---------------------------------------------------------------------------------------------------------------------------------------------------
*/

package Seccion11_Metodos;

public class EJ03_MetodoRecursivo 
{
  public static void main(String[] args) 
  {
    // Se llama al método "metodoRecursivo()".
    metodoRecursivo(1);
  }
  
  // Se declara el método recursivo "metodoRecursivo()".
  static void metodoRecursivo(int num)
  {
    if (num == 5) 
    {
      System.out.print(num + " \n" );
    }
    else
    {
      System.out.print(num + " ");
      metodoRecursivo(num + 1);
    }
  }
}
