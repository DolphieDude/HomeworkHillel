package com.cherevatyi.task2;

public class Copybook extends Good {
    public int amountOfSheets;

    Copybook () {
        super();
        this.amountOfSheets = 18;
    }
    Copybook (double priceIn, int quantityIn, int amountOfSheetsIn) {
        super(priceIn);
        this.amountOfSheets = amountOfSheetsIn;
    }
}
