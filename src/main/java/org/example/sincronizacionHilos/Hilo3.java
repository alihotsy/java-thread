package org.example.sincronizacionHilos;

public class Hilo3 extends Thread {
    @Override
    public void run(){
        for(int i = 0;i<=10;i++){
            System.out.print("scri");

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Error en la clase Hilo 3 " + e);
            }
        }

    }
}
