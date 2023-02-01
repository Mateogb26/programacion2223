### Arrays vs ArrayList
Cuando hablamos de Arrays en Java o cualquier otro lenguaje de programación, el formato o sintaxis más común que nos viene a la mente es bastante similar a esto:

```java
int[] miArray = new int[5];
```

Esta es la sintaxis utilizada para crear un Array en Java de tamaño fijo.

Analizando la sentencia vemos los siguientes elementos:
- **miArray**: esta es la variable de referencia que apuntará a un objeto de tipo Array en la memoria del programa.
- **int[]:** especifica el tipo de datos de los elementos que se almacenarán en el objeto Array. Por ejemplo, aquí, todos los elementos de miArray  deben ser de tipo int.
- **new**: Al ser un objeto, debemos instanciarlo.
- **int[5]**: esto significa que estamos creando un Array con un tamaño fijo o una longitud de 5. Podemos almacenar o, más bien, decir que el Array puede apuntar a 5 valores enteros solo con un rango de índices de 0 a 4.

Inconvenientes del uso de Arrays en Java

-  Tamaño fijo: el tamaño o la longitud de la matriz debe especificarse desde el principio, es decir, en el momento de la inicialización de la matriz. Una vez asignado un tamaño fijo, no se puede cambiar en ningún momento de la ejecución del programa. Si intentamos insertar o cruzar el límite de tamaño fijo, no se agregarán valores adicionales a la matriz o se generará un error.
-  No se pueden eliminar elementos, solo reemplazar: una vez que comenzamos a llenar la matriz y se llena por completo, solo podemos reemplazar un elemento existente en alguna posición de índice con un nuevo elemento. No podemos eliminar el elemento agregando uno nuevo y también el tamaño de la matriz permanece constante durante todo el proceso.
-  Las operacines internas con Arrays son tediosas y llevan mucho tiempo: supongamos que queremos verificar si un elemento en particular está presente dentro del Array o no. Para esto, debemos iterar sobre cada valor o usar algunos métodos Java incorporados. Para encontrar el valor máximo y mínimo, debemos volver a iterar.
-  Este tipo de Arrays es muy difícil de utilizar cuando el número de elementos que se van a insertar no se puede decidir al principio y depende completamente del usuario.
-  Hay muchos más casos en los que los Arrays estándar no se utilizan para realizar operaciones de almacenamiento de tipos de datos similares.

Cuando suceden estos problemas,  utilizamos los  **ArrayLists**.

`ArrayList` en Java es una clase de la biblioteca estándar de Java que permite almacenar y acceder a una colección dinámica de elementos. Aquí están algunos puntos clave a considerar sobre ArrayList en Java:

- Es una clase genérica, por lo que puede almacenar cualquier tipo de objeto o tipo primitivo.
- Puede tener un tamaño dinámico que cambia automáticamente a medida que se agrega o se elimina un elemento.
- Puede acceder a los elementos de la lista mediante un índice numérico, al igual que un Array convencional.
- Ofrece una serie de métodos útiles para manipular la lista, como agregar, eliminar, buscar y ordenar elementos.
- La implementación de ArrayList es eficiente en términos de tiempo de acceso y agregar elementos, pero es más lenta que un Array convencional cuando se realiza una búsqueda.

### Métodos utilizados con frecuencia cuando se trabaja con ArrayLists.

- **Crear un ArrayList con elementos**: Desde Java 9, existe el método:
  i) `List.of` que devuelve una lista inmutable, pero podemos pasarla al constructor ArrayList para crear una lista mutable con esos elementos. Podemos agregar y quitar elementos a esta lista sin ningún problema.

```java
ArrayList<String> amigos =  new ArrayList< (List.of("Pepe", "Maria", "Juan"));
```

- **Agregar nuevos elementos**: para agregar elementos a ArrayList, usamos el método `add` de dos formas:
     i) `.add(Object)` : Crea o agrega un nuevo elemento al final de ArrayList.
     ii) `.add(int index, Object)` : Agrega un elemento en la posición de índice especificada y desplaza todos los demás elementos un lugar a la derecha después de este valor de índice especificado. Si el último valor del índice es menor que el especificado, el nuevo elemento se agrega al último del Array.
	 
EJEMPLO:
```java
import java.util.ArrayList;
public class AddElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hola");
		list.add(1, "mundo");
		System.out.println(list);
  }
}
```

   SALIDA
```java
[hola, mundo]
```

- **Reemplazar un elemento existente**: Si queremos modificar, actualizar o reemplazar un elemento ya presente con uno nuevo, entonces usamos los siguientes métodos:
     i) `.set(int index, Object)`: Fija un nuevo elemento en la posición index especificada y reemplazará al existente.

EJEMPLO:
```java
import java.util.ArrayList;
public class AddElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hola");
		list.add("mundo");
		System.out.println(list);
		list.set(1, "desde el otro mundo");
	  System.out.println(list);
  }
}
```

   SALIDA
```java
[hola, mundo]
[hola, desde el otro mundo]
```

- **Eliminar un elemento existente**: Para eliminar o eliminar completamente un elemento, usamos:
     i) `.remove(Object)` : Elimina el objeto o elemento especificado de ArrayList. Si existe más de un elemento u objeto en ArrayList, entonces se elimina el que se encuentra primero o, mejor dicho, el valor de índice mínimo.
     ii) `.remove(int index)`- Elimina el elemento presente en la posición de índice especificada. Todos los elementos presentes después del valor de índice especificado se desplazarán un lugar a la izquierda. Aquí se reduce el tamaño real de la matriz.

```java
import java.util.ArrayList;
public class AddElement {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hola");
		list.add("mundo");
		list.add("desde el otro mundo");
		System.out.println(list);
		list.remove(0);
	    System.out.println(list);
		list.add("mundo");
		list.remove("mundo");
    }
}
```

   SALIDA
```java
[hola, mundo, desde el otro mundo]
[mundo, desde el otro mundo]
[desde el otro mundo, mundo]
```

- **Obtener un objeto o elemento**:  Para obtener un objeto o elemento presente en ArrayList, usamos: 
     i) `.get(int index)`: Obtenemos un objeto o elemento presente en la posición `index` especificada. A diferencia de los Arrays convecionales, no podemos usar o escribir algo como arr[3] para obtener el valor en la posición de índice 3. 
-  **Verificar la existencia de un elemento en particular**:  Si queremos verificar si un elemento u objeto en particular está presente en ArrayList o no, usamos:
     i) `.contains(Object)` —  Devuelve un valor booleano, es decir, verdadero si el elemento está presente y falso si el elemento u objeto no se puede encontrar en ArrayList. 
- **Obtener el valor de índice de un elemento**: Si queremos saber la posición o el valor de índice de un elemento u objeto en ArrayList, usamos:
     i) `.indexOf(Object)` — Esto devolverá un valor entero que es el valor de índice o la posición del elemento u objeto especificado. Si el objeto o elemento dado no se puede encontrar en ArrayList, devolverá -1. Por lo tanto, esto también se puede usar como una alternativa al método `.contains(Object)`.

- **Obtener la longitud de una lista en Java**: Para obtener la longitud de una lista, o el número de elementos, podemos usar el método `size()`.

EJEMPLO:
```java
import java.util.ArrayList;
import java.util.List;

public class GetSize {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Bienvenida");
        list.add("a mi vida");
        System.out.println(list.size());
    }
}
```
SALIDA
```java
2
```


Ahora, incorporemos todos estos métodos que hemos aprendido hasta ahora en un solo programa para comprender más claramente cómo funcionan todos ellos:

```java
ArrayList<Integer> list = new ArrayList<>(3);
list.add(15);
list.add(35);
list.add(47);
list.add(13);
list.add(17);
System.out.println(list); // [15, 35, 47, 13, 17]
int a = list.indexOf(47);
System.out.println(a); // 2
int num = list.get(1);
System.out.println(num); //35
System.out.println(list.contains(45)); // false
list.set(3, 72);
System.out.println(list); // [15, 35, 47, 72, 17]
list.remove(17);
System.out.println(list); // [15, 35, 47, 72]
list.add(1, 98);
System.out.println(list); // [15, 98, 35, 47, 72]
```

Puedes encontrar más información en los siguientes enlaces:

- https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
- https://www.freecodecamp.org/news/java-list-tutorial-util-list-api-example/

