# ALUMNOS PENDIENTES
Los alumnos con la materia pendiente deben entregar los siguientes boletines:
- #### UTO2 - Boletín 03
- #### UTO3 - Boletines ARRAYS y STRINGS

### Ejemplo de Ejercicios:
#### EJERCICIO A
Indica que muestra el siguiente código por pantalla:
```java
public class App {
    static int pepe=5;
    static int[] juan = { 1, 2, 3 };
    public static void main(String[] args)  {
        try {
            
            System.out.println(juan[3]);

            pepe = 12/0;

               
        }                
        catch (ArithmeticException e) {
            System.out.println("División por cero");
            pepe = 0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Valor fuera de limites");

        }        
  }
}
```


#### EJERCICIO B
Indica los errores del siguiente:
```java
import java.util.Array;

public class App {
    public  void main() throws Exception {        
        ArrayList<String> list = new ArrayList<>();
        list.add("hola");
        list.add(mundo);
        list.add("desde el otro mundo");
        list.remove(0);        
        list.order(list);
        list.Remove("mundo");
        list.remove(3)
        System.out.println(list.length);
    }
}
```




