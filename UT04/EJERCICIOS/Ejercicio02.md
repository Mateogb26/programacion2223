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
El método de retirar dinero no debe permitir entrar en números rojos, por lo tanto debemos comprobar que el saldo disponible es mayor que la cantidad a retirar.Para comprobar si se ha podido retirar el dinero, el método devuelve un boolean confirmando la operación:

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

Ahora sólo faltaría añadir cada movimiento en las retiradas e ingresos en nuestro ArrayList.
La clase Banco quedaría completada de esta manera:

```java
package Banco;

import java.util.ArrayList;

public class Banco {
    private Integer saldo;
    private ArrayList<Integer> movimientos;

    public Banco() {
        saldo=0;
        movimientos = new ArrayList<Integer>();
    }

    public void ingresarCantidad(Integer cantidad) {
        saldo = saldo + cantidad;
        movimientos.add(cantidad);
    }

    public boolean retirarCantidad(Integer cantidad) {
        if ( saldo>= cantidad) {
            saldo = saldo - cantidad;
            movimientos.add((0-cantidad));
            return true;
        }
        else {
            return false;
        }
    }

    public Integer getSaldo() {
        return saldo;
    }

    public ArrayList<Integer> getListaMovimientos() {
        return movimientos;
    }
}
```


Un ejemplo para probar esta clase podría ser el siguiente:
```java
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Banco miCuenta = new Banco();
        Integer opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            switch (opcion) {
                case 0:
                    System.out.println("SAYONARA, BABY");
                    break;
                case 1: 
                    ingresarDinero(miCuenta);
                    break;
                case 2:
                    retirarDinero(miCuenta);
                    break;
                case 3:
                    mostrarSaldo(miCuenta);
                    break;
                case 4:
                    verListaMovimientos(miCuenta);
                    break;                
                default:

                    break;
            }

        } while ( opcion !=0 );                      
    }





    public static void mostrarMenu () {
        System.out.println("******************************");
        System.out.println("*     METODOS DE ARRAYS      *");
        System.out.println("*       IES LOS ALBARES      *");
        System.out.println("******************************");
        System.out.println("ESCRIBE TU OPCIÓN:");
        System.out.println("1: Ingresar Dinero");
        System.out.println("2: Retirar Dinero");
        System.out.println("3: Consultar Saldo");
        System.out.println("4: Ver lista de movimientos");
        //System.out.println("5: ");
        System.out.println("0: SALIR");
    }

    public static Integer leerOpcion() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();                
    }

    public static void verListaMovimientos(Banco miCuenta) {
        ArrayList<Integer> miListaMovimientos = 
            miCuenta.getListaMovimientos();
        for (Integer elMovimiento : miListaMovimientos) {
            if (elMovimiento < 0) {
                System.out.println("Retirada: " + elMovimiento);
            } else {
                System.out.println("Ingreso: " + elMovimiento);
            }
        }
    }


    public static void ingresarDinero(Banco miCuenta) {
        System.out.println("¿Cuanto dinero vas a ingresar?");
        Scanner sc = new Scanner(System.in);
        Integer dinero = sc.nextInt();
        miCuenta.ingresarCantidad(dinero);
    }

    public static void retirarDinero(Banco miCuenta) {
        System.out.println("¿Cuanto dinero vas a retirar?");
        Scanner sc = new Scanner(System.in);
        Integer dinero = sc.nextInt();
        boolean retirado = miCuenta.retirarCantidad(dinero);
        if (!retirado) {
            System.out.println("SALDO INSUFICIENTE");
        }
    }

    public static void mostrarSaldo(Banco miCuenta) {
        System.out.println("EL SALDO ES " + miCuenta.getSaldo());
    }
    
    
}

```
