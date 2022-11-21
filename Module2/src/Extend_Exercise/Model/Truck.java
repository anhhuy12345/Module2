package Extend_Exercise.Model;

public class Truck extends Vehicle {
    private int weight;

    public Truck(String licensePlate, String manufacture, String year, String boss, int weight) {
        super(licensePlate, manufacture, year, boss);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() +
                weight;
    }
}
