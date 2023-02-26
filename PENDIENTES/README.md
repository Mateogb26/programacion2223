# ALUMNOS PENDIENTES
Los alumnos con la materia pendiente deben entregar los siguientes boletines:

### UTO2  - Boletín 02.
### UTO3 - Boletines ARRAYS y STRINGS.
### UTO04 - Ejercicios 7, 8 y 9.


Las **UT01** , **UT05** y **UT06** se evaluarán mediante un examen basado los ejemplos siguientes:

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

### UT07 - PRÁCTICA FINAL DE BASES DE DATOS CON JAVA
Realizar una aplicación que permita gestionar una biblioteca utilizando Java y MySql como gestor de bases de datos.

Las características de la aplicación son:

- Existirán dos roles básicos de usuarios del sistema: 
  - **Administrador**: realizará las tareas  de introducción, modificación y consulta tanto de los datos de los lectores como de los fondos bibliográficos.
  -  **Lector**: realizará tanto consultas de los fondos como solicitar préstamos sobre los fondos bibliográficos. 


La funcionalidad de la aplicación cubrirá los siguientes aspectos:  

- Permitirá gestionar todos los usuarios del sistema, dando de alta, baja y modificando datos de todos los roles del sistema manteniendo la seguridad adecuada. Inicialmente sólo existirá un administrador. Los lectores disponen de un carnet de biblioteca que permite identificarlos mediante un ID de ocho caracteres generado al azar y ÚNICO.
- Permitirá realizar un control de los fondos bibliográficos de la biblioteca, dando de alta o baja libros y sus copias existentes.  De cada volumen se almacenarán los siguientes datos: autor(es), título, editorial, año de edición, número de páginas e ISBN.        
- Se podrá solicitar préstamos a los lectores y el sistema llevará un control total sobre los préstamos, anotando cuando se realiza un préstamo y cuando su devolución. Cuando se procese un préstamo y el libro esté disponible se se avisará al lector de que su préstamo está disponible y se almacenará en la tabla correspondiente. Cada lector tendrá un método en la aplicación  para ver el estado de sus préstamos. Cuando un préstamo no sea aprobado también se almacenara en otra tabla donde el lector tendrá la opción de realizar una reserva.   
- El sistema llevará control de las reservas y las servirá a medida que los volúmenes estén disponibles. 
- No se permitirán más préstamos a un lector cuando tenga en su poder un volumen fuera de plazo.


**OPCIONAL**: 

- Todas las tareas del programa se realizarán mediante un interfaz gráfico de usuario de los habituales en los sistemas de ventanas de los sistemas operativos actuales.
- El sistema ofrecerá a cualquier usuario ciertas estadísticas sobre el uso de la biblioteca: número de préstamos por volumen y por lector, el número total de préstamos de la biblioteca en un periodo de tiempo.

En la documentación de la práctica se indicará que framework se ha usado (Graddle, Maven , ...) , los problemas encontrados, asi como todos los métodos explicados.



