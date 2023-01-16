## EJEMPLO DE CLASE

Vamos a implementar un clase para trabajar con Arrays. 
Para ello, hemos creado una clase llamada BoletinArrays que incluye los metodos 
que vamos a desarrollar:

El código es el siguiente:

```java
import java.util.Arrays;
import java.util.Scanner;

public class boletinArrays {

    //variable estatica para definir el tamaño del aray
    private static int TAMANYO=10;
    // Guardo el array con el que voy a trabajar
    private int[] miArray = new int[TAMANYO];
    private int mayor;
    private int menor;
    
    public int[] rotarArray(int numeros[]) {
        
        int numeroActual = numeros[numeros.length-1];
        for (int i=numeros.length-1; i>0; i--) {                         
            numeros[i] = numeros[i-1];                
        }
        numeros[0] = numeroActual;
        return numeros;
        
    }

    public int[] generaArray () {
        int[] numeros = new int[] {8, 10, 2, 3, 5};
        return numeros;
    }

    public void funcion() {
       
    }
}
```

Para gestionar esta clase, vamos a escribir un programa que muestre un menú de opciones 
y llame a los métodos de la clase creada previamente.

Los métodos a implementar son:
- Insertar/modificar un elemento en una posición del array.
- Mostrar el array por pantalla.
- Calcular la media de los valores del array.
- Obtener el mayor valor del array.
- Obtener el menor valor del array.
- Rotar el array una posicion a la derecha.

Los atributos a usar son:
- Un array de tamaño fijo.
- Tamaño del array.
- Valor Mayor del array.
- Valor Menor del array.

Todos han de ser privados.

> LA APLICACIÓN PRINCIPAL SE PUEDE BASAR EN LA SIGUIENTE:

```java
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boletinArrays miBoletin = new boletinArrays();
        Scanner sc = new Scanner (System.in);
        int opcion=-1;
        do {
            System.out.println("******************************");
            System.out.println("*     METODOS DE ARRAYS      *");
            System.out.println("*    JOAQUIN RIOS VELASCO    *");
            System.out.println("******************************");
            System.out.println("ESCRIBE TU OPCIÓN:"); 
            System.out.println("1: Desplazar el ARRAY");
            System.out.println("2: Obtener el mayor valor del ARRAY");
            System.out.println("3: Obtener el menor valor del ARRAY");
            System.out.println("4: Modificar un valor del ARRAY");
            System.out.println("5: Obtener la media de los valores del ARRAY");
            System.out.println("0: SALIR");
            opcion = sc.nextInt();
            switch  (opcion) {
                case 1:
                System.out.println("has elegido 1");

                break;
                case 2:
                System.out.println("has elegido 2");
                break;
                case 3:

                break;
                default:
                break;
            }
            
        } while (opcion!=0);
        

        
    }
}
```
