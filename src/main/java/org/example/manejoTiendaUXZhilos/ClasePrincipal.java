package org.example.manejoTiendaUXZhilos;

public class ClasePrincipal {
    public static void main(String[] args) {

        long startTimer = System.currentTimeMillis();
        Tienda tienda = new Tienda();
        LlenarPedido hilo1 = new LlenarPedido(tienda);
        LlenarProducto hilo2 = new LlenarProducto(tienda);

        hilo1.start();
        hilo2.start();

        while(hilo1.isAlive() || hilo2.isAlive()){
            System.out.println("Loading...");
        }

        tienda.llenarStock();
        tienda.mayorPedido();

        long endTimer = System.currentTimeMillis();

        System.out.println("Tiempo al ejecutar con hilos: " + (endTimer - startTimer) + " ms");
    }
}
