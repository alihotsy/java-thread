package org.example.manejoTiendaUXZhilos;

import org.example.manejoTiendaUXZ.Producto;

import java.util.Arrays;

public class LlenarProducto extends Thread{
    private final int[] values = new int[90000];
    private final Tienda tienda;
    public LlenarProducto(Tienda tienda){
        this.tienda = tienda;
    }

    @Override
    public void run() {
        for(int i=0;i<values.length;i++){
            /*System.out.println("Llenando productos...");*/
            values[i] = (int) (Math.random()*100000+1);
            tienda.setProductos(values[i],i);
        }
        System.out.println(Arrays.toString(values));

       /*System.out.println(Arrays.toString(values));*/
    }
}
