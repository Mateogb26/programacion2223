# ALUMNOS PENDIENTES
Los alumnos con la materia pendiente deben entregar los siguientes boletines:
- #### UTO2 - Boletín 03
- #### UTO3 - Boletines ARRAYS y STRINGS

### Ejemplo de Ejercicios:
#### EJERCICIO A
Indica que muestra el siguiente código por pantalla:

```java
static void ejercicioCinco() {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("hola" , "mundo"));
        list.add("hola");
        list.add("mundo");
        list.add("hola");
        list.set(1, "desde el otro mundo");
        list.remove("mundo");
        for (String elemento : list) {
            if (!elemento.equals("hola")) {
                System.out.println(elemento);
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




