package org.example.hilos;

public class Proceso2 implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Proceso 2");
        }
    }
}
