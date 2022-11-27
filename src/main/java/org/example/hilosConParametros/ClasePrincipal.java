package org.example.hilosConParametros;

public class ClasePrincipal {
    public static void main(String[] args) {
        Proceso hilo1 = new Proceso(5, "Hilo 1");
        Proceso hilo2 = new Proceso(10, "Hilo 2");

        hilo1.start();
        hilo2.start();
    }
}
