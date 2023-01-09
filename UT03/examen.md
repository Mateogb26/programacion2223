1. ¿Cuál es la sintaxis correcta para generar “Hello World” en Java?
A. System.out.println("HelloWorld");  
B. Console. WriteLine("Hello World");  
C. print ("Hello World");  
D. echo("Hello World");  


2. Con cuál de las siguientes sentencias se puede realizar un bucle infinito?
A. while.  
B. for.  
C. Las dos opciones while y for son correctas.  
D. Las dos opciones while y for son incorrectas.  


3. Java es la abreviatura de “JavaScript”.  
A. Falso.  
B. Verdadero. 

4. ¿Cómo se insertan comentarios en Java?  
A. # Esto es un comentario.  
B. /* Esto es un comentario */.  
C. \\ Esto es un comentario.  
D. ?? Esto es un comentario.  


5. ¿Qué tipo de datos se utiliza para crear una variable que debe almacenar texto?   
A. string.      
B. Txt.  
C. String.   
D. myString.  

6. ¿Cómo se crea una variable con el valor numérico 5?   
A. X = 5;   
B. float x = 5;   
C. int x = 5;    
D. num X = 5   

7. ¿Cómo creas una variable con el número real 2.8?   
A. byte X = 2.8f;  
B. int x = 2.8f;   
C. X = 2.8f;   
D. float X = 2.8f;   

8. ¿Qué método se puede usar para encontrar la longitud de una cadena?   
A. length()   
B. getSize()   
C. len()   
D. getLength()   

9. ¿Qué operador se usa para sumar dos valores?   
A. el signo &   
B. el signo *   
C. el signo ++   
D. el signo +   

10. El valor de una variable de tipo cadena puede estar entre comillas simples.   
A. Falso.  
B. Verdadero.  

11. Si se desea ejecutar un bloque de instrucciones hasta que se cumple una condición, pero que se ejecute como mínimo una vez, se deberá emplear:   
A. while.   
B. do while.   
C. for.   
D. Todas las opciones son correctas.   

12. ¿Qué método se puede utilizar para devolver una cadena en mayúsculas?  
A. upperCase().  
B. tuc().  
C. toUpperCase().  
D. touppercase().  

13. ¿Qué operador se puede usar para comparar dos valores?
A. <>   
B. ==    
C. ><    
D. Todos    

12. Es posible hacer un bucle infinito con una sentencia do while?   
A. Sí, haciendo que la condición evaluada de while siempre sea true.   
B. Sí, haciendo que el bloque do que se ejecuta como mínimo una vez sea en sí mismo un bucle infinito.   
C. Las dos opciones son correctas.    
D. Las dos opciones son incorrectas.   

13. Para declarar un array en Java, definimos el tipo de variable junto con...  
A. {}   
B. ()   
C. []   
D. - -   

14. Identifica la afirmación correcta entre las siguientes:  
A. El método length de un array devuelve el número de elementos en él contenidos.   
B. El campo length de un String devuelve el número de caracteres en él contenidos.   
C. A partir de un array se puede invocar a su método toString para obtener una cadena de texto que contenga los elementos en el array contenidos.   
D. Todas las opciones son incorrectas.   


15. ¿Qué valor tomará la variables tras la ejecución de la instrucción s=3+2+"4"+3+2;?  
A. 545.   
B. 5432.    
C. 32432.   
D. 14.   

16. Los índices de un array comienzan con:
A. 1   
B. 0   
C. NULL   

17. ¿Cómo empiezas a escribir una declaración if en Java?
A. if (x > y)
B. if x > y:
C. if x > y then:
D. if x>y {

18. ¿Cómo se comienza un bucle while en Java?   
A. while (× > y)    
B. x > y while {     
C. while x > y {     
D. while x > y:    

19. ¿Qué declaración se usa para detener un bucle?   
A. break   
B. return   
C. stop   
D. exit   

```code
1: import java.util.Scanner;
2:
3: public class example {
4: 
5:    public static void main(String[] args) {
6:
7:        Scanner entrada = new Scanner(System.in);
8:        int elArray[] = new int[10];
9:        boolean continuar = true;
10:       String opcion;
11:
12:       while (continuar!=0) {
13:           System.out.println();
14:           System.out.println("MENU PRINCIPAL");
15:           System.out.println("a. Mostrar valores");
16:           System.out.println("b. Ver tamaño");
17:           System.out.println("c. Salir");
18:           System.out.print("Elige una opción y presiona intro: ");
19:           opcion = entrada.nextLine();
20:
21:           if  (opcion== "a") {
22:               for (int i = 0; i < elarray.length; i++) {
23:                   System.out.print(elArray[i] + " ");
24:               }
25:               System.out.println();
26:           }
27:           if (opcion=="b") {
28:               System.out.println("El tamaño del array es " + 
29:                       elArray.length());
30:           }
31:           if (opcion=="b") {
32:               System.out.println("Fin del programa");
33:               continuar = false;
34:           }
35:           entrada.nextLine();
36:      }
37:    }
38: }
