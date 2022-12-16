import java.util.Arrays;
import java.util.Scanner;

public class ejercicioUno {
    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<numeros.length ; i++) {
            numeros[i] = entrada.nextInt();
        }
        System.out.println(Arrays.toString(numeros));

        int numeroActual = numeros[numeros.length-1];
        for (int i=numeros.length-1; i>0; i--) {                         
            numeros[i] = numeros[i-1];                
        }
        numeros[0] = numeroActual;
        System.out.println(Arrays.toString(numeros));
    }
}
