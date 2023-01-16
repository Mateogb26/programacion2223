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
- Tamaño del array
- Valor Mayor del array
- Valor Menor del array.
Todos han de ser privados.
