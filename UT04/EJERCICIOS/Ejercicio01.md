### EJERCICIO 01: Estadística

Crea una clase Estadística con las siguientes características:

#### Atributos:

- **listaNumeros**: de tipo List, almacenará 10 números pedidos 
  por teclado en el constructor de la clase.

#### Métodos:

- **Mayor**: obtiene el mayor de los números.
- **Menor**: obtiene el menor de los números.
- **Media**: obtiene la media de los números.

> NOTA: Para usar List, podéis ver aquí el siguiente ejemplo:

```java
List<String> items = List.of("1", "a", "2", "a", "3", "a");
      items.forEach(item -> {
          if (item.equals("a")) {
              System.out.println("A");
          } else {
              System.out.println("Not A");
          }
      });
```

El código de base es el siguiente:

```java
  package ejercicios;

import java.util.List;

public class Estadistica {

    private List<Integer> listaNumeros;

    public Estadistica () {
        // Aqui deberiamos obtener los números
        listaNumeros = List.of(1,2,3,4,5,4,2,8,3,4);

    }

    public Integer mayor() {
        return 5;
    }

    public Integer menor() {
        return 2;
    }

    public double media () {
        return 5.2;
    }

}
```
