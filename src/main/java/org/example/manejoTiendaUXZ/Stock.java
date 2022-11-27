package org.example.manejoTiendaUXZ;

public class Stock {
    private final int value;

    public Stock(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "value=" + value +
                '}';
    }
}
