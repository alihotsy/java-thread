package org.example.hilos;

public class Proceso1 extends Thread {
    private final int value;
    public Proceso1(int value){
        this.value = value;
    }

    @Override
    public void run(){
      for(int i=1;i<=5;i++){
          System.out.println("Proceso "+value);
      }
    }
}
