## 21-02-2023

#### EJEMPLO DE LECTURA POR TECLADO Y GRABADO EN FICHERO

```java
public static void escribe() {
        Scanner sc = new  Scanner(System.in);
        String linea = "*";
        try {            
            FileWriter myWriter = new FileWriter("filename.txt");
            while (!linea.equals("fin")) {
                System.out.println("ESCRIBE LINEA (fin para terminar):");
                linea = sc.nextLine();
                myWriter.write(linea + "\n");
            }            
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
```
