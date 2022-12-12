/* 
* EJEMPLO01-App.java
* Autor: Joaquin Rios
* Aplicacion que simula la clase y el objeto coche
*/
package EJEMPLO01;
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        coche miToyota = new coche();
        miToyota.repostar(30);
        miToyota.conducir(300);
    }
}
