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
El método de ratirar dinero no debe permitir entrar en números rojos, por lo tanto debemos comprobar que el saldo disponible es mayor que la cantidad a retirar.Para comprobar si se ha podido retirar el dinero, el método devuelve un boolean confirmando la operación:

```java
public boolean retirarCantidad(Integer cantidad) {
    if ( saldo>= cantidad) {
        saldo = saldo -cantidad;
        return true;
    }
    else {
        return false;
    }
}
```

Para leer los dos atributos de la clase usamos los `getter`:
```java
public Integer getSaldo() {
    return saldo;
}

public ArrayList<Integer> getListaMovimientos() {
    return movimientos;
}
```
Por último, nos falta crear el constructor, que hara el proceso de inicialización de los
atributos de la clase:

```java
public Banco() {
    saldo=0;
    movimientos = new ArrayList<Integer>();
}
```

Si no incializamos las variables, nos dará un error de tipo `NullPointerException`.

Ahora sólo faltaría añadir cada movimiento

Un ejemplo para probar esta clase podría ser el siguiente:
```java
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Banco miCuenta = new Banco();
        ArrayList<Integer> miListaMovimientos;

        miCuenta.ingresarCantidad(25);
        miCuenta.ingresarCantidad(35);
        miCuenta.retirarCantidad(50);
        System.out.println("SALDO: " + miCuenta.getSaldo());
        miListaMovimientos = miCuenta.getListaMovimientos();
        for (Integer elMovimiento : miListaMovimientos) {
            if (elMovimiento<0) {
                System.out.println("Retirada: " + elMovimiento);
            }
            else {
                System.out.println("Ingreso: " + elMovimiento);
            }
        }

    }
    
    
}
```
