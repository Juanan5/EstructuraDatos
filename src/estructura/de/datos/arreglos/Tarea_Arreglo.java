
package estructura.de.datos.arreglos;


public class Tarea_Arreglo {
    
    public static void main(String[] args) {

      int suma = 0;
       int A [ ] = new  int [10];    //Arreglo A
       A[0]=5;
       A[1]=5;
       A[2]=5;
       A[3]=5;
       A[4]=5;
       A[5]=5; 
       A[6]=5; 
       A[7]=5; 
       A[8]=5; 
       A[9]=5; 
    
       int B [ ] = new  int [10];    // Arreglo B
       B[0]=1;
       B[1]=2;
       B[2]=3;
       B[3]=4;
       B[4]=5;
       B[5]=6;
       B[6]=7;
       B[7]=8;
       B[8]=9;
       B[9]=10;
       
       int C [ ]= new int[10]; //Arreglo c
       
        for (int i = 0; i < 10; i++)
        {
            C[i]= A[i] * B[i] ;
            suma = suma + C[i];
             }
        System.out.println(suma);
    }
}
