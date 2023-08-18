
package estructura.de.datos.arreglos;

import java.util.Scanner;


public class ejercicio1 {
    
     public static void main(String[] args) {
        Scanner  Entrada = new Scanner(System.in);
        
        final int Max = 10;
        
        int edades [ ] = new  int [Max];        
        
        int Suma= 0 ;
        
         for (int i = 0; i < 10; i++) // cada que se recorra de nuevo sumara 1 a la i
        {
             System.out.println("Ingresa tu edad");
             edades[i]= Entrada.nextInt();
             Suma = edades[i] + Suma;
         }
         for (int i = 0; i < 10; i++)
         {
             System.out.println(edades[i]);
         }
         System.out.println( Suma);
         System.out.println(" buscar el elemento ingresado");
     }
 }
