import java.util.Scanner;

public class Pedidos {
    
    // El atributo idPedido almacena un valor numérico con 
    // el identificador único de cada pedido
    public int idPedido;

    // Un Array con la lista de productos
    public String listaProductos[] = new String[10];

    // Un contador para llevar el número de productos del pedido
    private int contadorProductos=0;

    // El constructor recibe el id del producto
    public Pedidos(int idPedido) {        
        this.idPedido = idPedido;
    }

    // Método para añadir un producto a la lista
    // Al ser un Array, debo llevar un contador
    // para ver por donde voy 
    public void agregarProducto() {        
        if (contadorProductos<10) {
            String producto;
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el producto:");            
            producto = sc.nextLine();
            listaProductos[contadorProductos] = producto;
            contadorProductos++;
        }
        else {
            System.out.println("Límite de productos rebasado");
        }
        
    }


    // Método para quitar un producto a la lista
    // Al ser un Array, debo llevar un contador
    // para ver por donde voy 
    public void quitarProducto() {
        if (contadorProductos>0) {
            contadorProductos--;
            listaProductos[contadorProductos] = null;            
        }
        else {
            System.out.println("No hay productos");
        }
        
    }

    // Muestro el Array con la lista de productos
    public void verListaProductos() {
        for (String elProducto : listaProductos) {
            if (elProducto != null) {
                System.out.println(elProducto);
            }
        }
    }


}
