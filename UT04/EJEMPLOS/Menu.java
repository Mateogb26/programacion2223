import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> listaOpciones;

    public Menu(ArrayList<String> listaOpciones) {
        this.listaOpciones = listaOpciones;
    }

    public void verMenu() {
        System.out.println("***********************************");
        System.out.println("*        LISTA DE LA COMPRA       *");
        System.out.println("***********************************");
        int contador = 1;
        for (String opcion : listaOpciones) {
            System.out.println(contador + ": " + opcion);
            contador++;
        }        
        System.out.println("0: SALIR");
    }

    public int leerOpcion() {
        System.out.println("------------------------------");
        System.out.print("ELIGE TU OPCIÓN: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        return opcion;
    }
}
