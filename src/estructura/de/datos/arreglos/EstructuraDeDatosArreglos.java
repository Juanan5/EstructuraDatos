

package estructura.de.datos.arreglos;

// @author juanc
public class EstructuraDeDatosArreglos {

    
    public static void main(String[] args) {

        String arregloA[]; // declarar el arreglo
        arregloA= new String[4]; // creamos el arreglo
        //llenar arreglo
        arregloA[0]=" Hola";
        arregloA[1]=" Casa";
        arregloA[2]=" Perro";
        arregloA[3]=" Oso";
        
        //obteniendo informacion
        System.out.println(" valor de arreglo en la posicion 0 "+arregloA[0]);
        System.out.println(" valor de arreglo en la posicion 1 "+arregloA[1]);
        System.out.println(" valor de arreglo en la posicion 2 "+arregloA[2]);
        System.out.println(" valor de arreglo en la posicion 3 "+arregloA[3]);
  
    }

}
