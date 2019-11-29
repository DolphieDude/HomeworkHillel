package com.cherevatyi.task2;

public class Bag extends Good {
    public int size;

    Bag () {
        super();
        this.size = 1;
    }
    Bag (double priceIn, int quantityIn, int sizeIn) {
        super(priceIn, quantityIn);
        this.size = sizeIn;
    }
}
