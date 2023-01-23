# EJERCICIO 02: Banco

Crear una clase Banco que ofrezca los siguientes métodos:

- Ingresar dinero.
- Retirar dinero.
- Ver saldo.
- Ver lista de movimientos.

Los atributos de la clase almacenarán un ArrayList de Integer con la lista de 
los movimientos y un Integer que almacene el saldo.

En primer lugar vamos a crear la clase, junto con los atributos:

```java
import java.util.ArrayList;

public class Banco {
    private Integer saldo;
    private ArrayList<Integer> movimientos;

    
}
```
Ahora vamos con los métodos:
- El método ingresarCantidad debe recibir la cantidad de dinero a ingresar y debe modificar el saldo de la cuenta sin devolver nada.

```java
public void ingresarCantidad(Integer cantidad) {
        saldo = saldo + cantidad;
}
```


