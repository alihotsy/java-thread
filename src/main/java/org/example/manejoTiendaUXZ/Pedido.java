package org.example.manejoTiendaUXZ;

public class Pedido {

    private final int value;

    public Pedido(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "value=" + value +
                '}';
    }
}
