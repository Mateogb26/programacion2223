```java
import java.util.Scanner;
public class Exercise1 {

    private static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Escribe la temperatura en  Fahrenheit: ");
        int fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0) / 9.0);
        System.out.println(fahrenheit + " grados Fahrenheit son" 
              celsius + " grados Celsius");
    }
}
```
