package com.cherevatyi.task2;

public abstract class Good {
    //private final static String DF_NAME = "Thing";
    private final static double DF_PRICE = 20.5;

    //private String name;
    public double price;
//    private int quantity;

    Good () {
        //this.name = DF_NAME;
        this.price = DF_PRICE;
//        this.quantity = 1;
    }
    Good (double priceIn/* int quantityIn*/) {
        this.price = priceIn;
//        this.quantity = quantityIn;
    }
/*
    public void add (int quantityIn) {
        this.quantity += quantityIn;
    }
    public double sell (int quantityIn) {
        this.quantity -= quantityIn;
        return this.price * quantityIn;
    }

    public int getQuantity () {
        return this.quantity;
    }
*/
}
