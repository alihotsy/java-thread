package org.example.hilosConParametros;

public class Proceso extends Thread {

    private final int parametro;

    public Proceso(int parametro,String name) {
        super(name);
        this.parametro = parametro;
    }

    @Override
    public void run(){
     for(int i=0; i<=parametro; i++) {
         System.out.println(i + " "+ this.getName());
     }
        System.out.println("");
    }
}
