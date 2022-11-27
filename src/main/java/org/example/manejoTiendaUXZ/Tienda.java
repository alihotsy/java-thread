package org.example.manejoTiendaUXZ;

import java.security.SecureRandom;
import java.util.Arrays;

public class Tienda {
    private final Producto[] productos = new Producto[90000];
    private final Pedido[] pedidos = new Pedido[90000];
    private final Stock[] stock = new Stock[90000];

    public void llenarProductos() {
        for(int i=0;i<productos.length;i++){
            productos[i] = new Producto((int) (Math.random()*100000+1));
        }
        System.out.println(Arrays.toString(productos));
    }

    public void llenarPedidos() {
        for (int k=0;k<pedidos.length;k++){
            pedidos[k] = new Pedido((int) (Math.random()*100000+1));
        }
        System.out.println(Arrays.toString(pedidos));
    }

    public void controlStock() {
        for(int z=0; z<stock.length;z++){
            if(productos[z].getValue() == pedidos[z].getValue()){
                stock[z] = new Stock(pedidos[z].getValue());
            }

            if(pedidos[z].getValue() > productos[z].getValue()){
                stock[z] = new Stock(2*(pedidos[z].getValue() - productos[z].getValue()));
            }

            if(pedidos[z].getValue() < productos[z].getValue()){
                stock[z] = new Stock(pedidos[z].getValue());
            }

        }
        System.out.println(Arrays.toString(stock));
    }
    public String mayorPedido() {
        int may = 0;

        for (Pedido pedido : pedidos) {
            if (pedido.getValue() > may) {
                may = pedido.getValue();
            }
        }

        return "El mayor pedido es de: " + may;
    }
}

