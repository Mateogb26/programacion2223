###  01. Estadística

Crea una clase Estadística con las siguientes características:

#### Atributos:
- **listaNumeros**: de tipo List<Integer>, almacenará 10 números pedidos 
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

### 02. Banco

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



### 03. Tarjetas Regalo
Crear una aplicación para gestionar las tarjetas regalo de un comercio.
Para ello, implementaremos la clase TarjetaRegalo, con las siguientes características:

#### Atributos:
- **Saldo** - El saldo de la tarjeta.
- **Identificador** - Un Integer de 5 dígitos.

#### Métodos:
- Un **constructor** que recibirá como parámetro el saldo se lo carga a la tarjeta y 
se asigna de forma automática el Identificador. 
- **gastarSaldo**: Para gastar parte o todo el saldo de la tarjeta. Si se intenta gastar 
más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error. 
- **combinarTarjetas**: Dos tarjetas regalo se pueden fusionar creando una nueva 
  tarjeta con la suma del saldo que tenga cada una y un nuevo identificador. Tras la fusión, 
  las dos tarjetas originales se quedarían con 0 € de saldo.
  Ejemplo:
  ```java
  TarjetaRegalo tarjetaUno = new TarjetaRegalo(50);
  TarjetaRegalo tarjetaDos = new TarjetaRegalo(25);
  TarjetaRegalo tarjetaNueva = tarjetaUno.combinar(tarjetaDos);
  ```
  
- Además, se crearán los **getter** y **setter** necesarios.

### 02. Matemáticas

Crear una una clase que incluya una serie de operaciones matemáticas . Recuerda que puedes usar unas dentro de otras si es necesario. Observa bien lo que hace cada función ya que, si las implementas en el orden adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de implementar teniendo esPrimo.

1.  esCapicua: Devuelve verdadero si el número que se pasa como paráme- tro es capicúa y falso en caso contrario.
    
2.  esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
    
3.  siguientePrimo: Devuelve el menor primo que es mayor al número que se pasa como parámetro.
    
4.  potencia: Dada una base y un exponente devuelve la potencia.
    
5.  digitos: Cuenta el número de dígitos de un número entero.
    
6.  voltea: Le da la vuelta a un número.
    
7.  digitoN: Devuelve el dígito que está en la posición n de un número entero.
    
    Se empieza contando por el 0 y de izquierda a derecha.
    
8.  posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
    
    dentro de un número entero. Si no se encuentra, devuelve -1.
    
9.  quitaPorDetras: Le quita a un número n dígitos por detrás (por la
    
    derecha).
    
10.  quitaPorDelante: Le quita a un número n dígitos por delante (por la
    
    izquierda).
    
11.  pegaPorDetras: Añade un dígito a un número por detrás.
    
12.  pegaPorDelante: Añade un dígito a un número por delante.
    
13.  trozoDeNumero: Toma como parámetros las posiciones inicial y final
    
    dentro de un número y devuelve el trozo correspondiente.
    
14.  juntaNumeros: Pega dos números para formar uno.
