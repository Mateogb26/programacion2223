package main;

import datos.Documentos;

public class App {
    static Documentos miDocumento = new Documentos();
    public static void main(String[] args) {
        miDocumento.nuevaLinea("Hola como estas");
        miDocumento.nuevaLinea("Segunda Linea");        
    }        
}
