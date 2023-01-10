import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {        
        Scanner sc = new Scanner(System.in);
        int opcion;
        Pedidos pedidoUno = new Pedidos(1);

        System.out.println("***********************************");
        System.out.println("*        LISTA DE LA COMPRA       *");
        System.out.println("***********************************");

        while (true) {
            System.out.println("Elige opción");
            System.out.println("1: AGREGAR PRODUCTO");
            System.out.println("2: ELIMINAR ULTIMO PRODUCTO");
            System.out.println("0: SALIR");
            opcion = sc.nextInt();
            if (opcion == 1) {
                // POR HACER
            }
            if (opcion == 2) {
                // POR HACER
            }
            if (opcion == 0 ) {
                break;
            }
        }
        System.out.println("HASTA LA PRÓXIMA");


    }
}
