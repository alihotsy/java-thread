package org.example.manejoTiendaUXZhilos;

import org.example.manejoTiendaUXZ.Pedido;

import java.util.Arrays;

public class Tienda {
    private final int[] pedidos = new int[90000];
    private final int[] productos = new int[90000];
    private final int[] stock = new int[90000];


    public void mayorPedido() {
        int may = 0;

        for (int pedido : pedidos) {
            if (pedido > may) {
                may = pedido;
            }
        }

        System.out.println("El mayor pedido es de: " + may);
    }

    public void llenarStock(){

        for(int z=0; z<stock.length;z++){
            if(productos[z] == pedidos[z]){
                stock[z] = pedidos[z];
            }

            if(pedidos[z] > productos[z]){
                stock[z] = 2*(pedidos[z] - productos[z]);
            }

            if(pedidos[z] < productos[z]){
                stock[z] = pedidos[z];
            }

        }
        System.out.println(Arrays.toString(stock));
    }



    public int[] getPedidos() {
        return pedidos;
    }

    public void setPedidos(int value, int i) {
        this.pedidos[i] = value;
    }

    public int[] getProductos() {
        return productos;
    }

    public void setProductos(int value, int i) {
        this.productos[i] = value;
    }


}
