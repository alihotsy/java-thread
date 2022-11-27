package org.example;

import org.example.hilos.Proceso1;
import org.example.hilos.Proceso2;

public class Main {
    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1(1);
        Thread hilo2 = new Thread( new Proceso2());
        Proceso1 hilo3 = new Proceso1(3);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}