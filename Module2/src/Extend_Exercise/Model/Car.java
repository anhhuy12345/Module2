package Extend_Exercise.Model;

import java.util.List;

//Inheritance:extends
public class Car extends Vehicle {
    // Encapsulation: private, getter, setter
    private int seats;
    private String type;

    //
    public Car(String licensePlate, String manufacture, String year, String boss, int seats, String type) {
        super(licensePlate, manufacture, year, boss);
        this.seats = seats;
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
//Polymorphism: override,

    @Override
    public String toString() {
        return super.toString() +
                seats + "," +
                type ;
    }
//    public String toStringDisplay(){
//        return "Car = " +super.toStringDisplay()+
//                "Seat = "+ seats+
//                " Type = "+type;
//    }
}
