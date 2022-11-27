package org.example.sincronizacionHilos;

public class Hilo4 extends Thread{
    @Override
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.println("pt");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error en la clase Hilo 4 " + e);
            }
        }
    }
}
