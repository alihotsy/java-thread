package org.example.manejoTiendaUXZhilos;

import org.example.manejoTiendaUXZ.Stock;

import java.util.Arrays;

public class LlenarStock {
    private final int[] values = new int[90000];
    private final Tienda tienda;

    public LlenarStock(Tienda tienda) {
        this.tienda = tienda;
    }


    public void llenarStock(){
        int[] productos = tienda.getProductos();
        int[] pedidos = tienda.getPedidos();

        for(int z=0; z<values.length;z++){
            System.out.println("Llenando stock...");
            if(productos[z] == pedidos[z]){
                values[z] = pedidos[z];
            }

            if(pedidos[z] > productos[z]){
                values[z] = 2*(pedidos[z] - productos[z]);
            }

            if(pedidos[z] < productos[z]){
                values[z] = pedidos[z];
            }

        }
        System.out.println(Arrays.toString(values));
    }
}
