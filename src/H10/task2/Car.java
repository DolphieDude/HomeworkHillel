package H10.task2;

public class Car {
    private int weight;
    private String type;

    public Car(int weight, String type) {
        if (weight > 1) this.weight = weight;
        else this.weight = 1;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "type=\"" + this.type + "\";weight=" + this.weight + ";";
    }
}
