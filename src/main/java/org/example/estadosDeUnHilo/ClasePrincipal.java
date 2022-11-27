package org.example.estadosDeUnHilo;

public class ClasePrincipal {
    public static void main(String[] args) {
        HiloProceso hilo1 = new HiloProceso();
        HiloProceso hilo2 = new HiloProceso();

        hilo1.start();

        try {
            HiloProceso.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Error en el hilo 1 "+ e);
        }

        hilo2.start();
        hilo2.stop();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("Error en el hilo 2 " + e);
        } finally {
            System.out.println("Fin del programa");
        }

    }
}
