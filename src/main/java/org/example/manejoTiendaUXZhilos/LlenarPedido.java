package org.example.manejoTiendaUXZhilos;

import org.example.manejoTiendaUXZ.Pedido;

import java.util.Arrays;

public class LlenarPedido extends Thread{
    private final int[] values = new int[90000];
    private final Tienda tienda;

    public LlenarPedido(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public void run(){
        for (int k=0;k<values.length;k++){
            /*System.out.println("Llenando pedidos...");*/
            values[k] = (int) (Math.random()*100000+1);
            tienda.setPedidos(values[k],k);
        }
        System.out.println(Arrays.toString(values));

        /*System.out.println(Arrays.toString(values));*/
    }

}
