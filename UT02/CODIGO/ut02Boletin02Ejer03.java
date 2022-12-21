import java.rmi.server.ExportException;
import java.util.Scanner;

public class ut02Boletin02Ejer03 {
    public static void main(String[] args) {
        int exponente;
        double base , resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce base:");
        base = sc.nextDouble();

        do {
            System.out.println("Introduce exponente:");
            exponente = sc.nextInt();
        } while (exponente<0);

        

        for (int j=1; j<=exponente; j++) {            
            System.out.print(base+"^"+j+"=");
            //Este bucle calcula la potencia
            resultado=base;
            for (int i=1;i<j; i++) {
                resultado = resultado*base;            
            }
            System.out.println(resultado);
        }
        

    }
}
