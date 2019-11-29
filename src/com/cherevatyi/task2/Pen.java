package com.cherevatyi.task2;

public class Pen extends Good {
    public String colorInk;

    Pen () {
        super();
        this.colorInk = "Blue";
    }
    Pen (double priceIn, int quantityIn, String colorInkIn) {
        super(priceIn, quantityIn);
        this.colorInk = colorInkIn;
    }

}
