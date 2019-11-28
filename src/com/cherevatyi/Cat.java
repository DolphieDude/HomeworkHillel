package com.cherevatyi;

public class Cat {
    private static final int DF_AGE = 2, DF_WEIGHT = 5;

    private String name, color;
    private int age, weight;

    Cat  (String nameIn, String colorIn, int ageIn, int weightIn) {
        this.name = nameIn;
        this.color = colorIn;
        if (ageIn > 0) this.age = ageIn;
        else this.age = DF_AGE;
        if (weightIn > 0) this.weight = weightIn;
        else this.weight = DF_WEIGHT;
    }

    @Override
    public String toString () {
        return new StringBuilder("name = ").append(this.name)
                .append("; color = ").append(this.color)
                .append("; age = ").append(this.age)
                .append("; weight = ").append(this.weight)
                .append(";").toString();
    }
}
