package org.example.manejoTiendaUXZ;

public class ClasePrincipal {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Tienda tienda = new Tienda();
        tienda.llenarProductos();
        tienda.llenarPedidos();
        tienda.controlStock();
        System.out.println(tienda.mayorPedido());
        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo sin emplear hilos: "+ (endTime - startTime) + " ms");
    }
}
