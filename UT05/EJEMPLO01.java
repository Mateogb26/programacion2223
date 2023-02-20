import java.util.*;

/**
 *
 * @author joaquin
 */
public class UT05 {
    static int num1=0,num2=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int multiplicacion =0;
        
        try {            
            
            System.out.println("Introduce num1:");
            num1 = sc.nextInt();
            System.out.println("Introduce num2:");
            num2 = sc.nextInt();
            
            
        }
        catch (InputMismatchException e) {
            System.out.println("No has escrito un número");
            
        }
        
        multiplicacion = num1 * num2;
        System.out.println(multiplicacion);
        
    }
    
}
```
