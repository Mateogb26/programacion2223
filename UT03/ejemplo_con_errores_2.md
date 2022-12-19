```code


import java.util.Scanner;

public class ejemplo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[10];
        boolean continuar = true;
        String opcion;

        while (continuar!=0) {
            System.out.println();
            System.out.println("MENU PRINCIPAL");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción y presiona intro: ");
            opcion = entrada.nextLine();
            
            switch opcion {
                
                case "a":
                    for (int i = 0; i < vector.length; i++)
                        System.out.print(Vector[i] + " ");
                    System.out.println();
                    break;
                    
                case "b":
                    int v, p;
                    System.out.print("Valor: ");
                    v = entrada.nextInt();
                    System.out.print("Posición: ");
                    p = entrada.nextInt();
                    if (p < 0 || p >= vector.length())
                        System.out.println("Posición fuera del límite");
                    else
                        vector[p] = v;
                    break;
                    
                case "c":
                    System.out.println("Fin del programa");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            entrada.nextLine();
        }
    }
}
```