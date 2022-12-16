import java.util.Arrays;
import java.util.Scanner;

public class ejercicioTres {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double numeros[] = new double[10];
        double numero;
        int mayores=0;

        for (int i=0; i<numeros.length ; i++) {
            numeros[i] = Math.random();
        }
        System.out.println("Valores creados->");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Introduce numero entre 0 y 1");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextDouble();

        for (int i=0; i<numeros.length ; i++) {
            if (numeros[i] >= numero) {
                mayores++;
            }
        }
        System.out.println("Hay " + mayores +
        " numeros mayores de " + numero);
        
        entrada.close();
    }
}
