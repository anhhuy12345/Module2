package Extend_Exercise.Model;

public class Motobike extends Vehicle {
    private int wattage;

    public Motobike(String licensePlate, String manufacture, String year, String boss, int wattage) {
        super(licensePlate, manufacture, year, boss);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString() +
                wattage ;
    }
}
