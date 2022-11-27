package org.example.manejoTiendaUXZ;

public class Producto {
    private final int value;

    public Producto(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "value=" + value +
                '}';
    }
}
