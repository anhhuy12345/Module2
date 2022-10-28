package b7_Abstract_Interface.exercise.resizeable;

import b6_Inheritance.practice.Square.Square;

public class SquareResizeable extends Square implements Resizeable {
    //constructor
    public SquareResizeable(double side) {
        super(side);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area BEFORE increase size of Square: " + this.getArea());
        System.out.println("Area AFTER increase size of Square: " + percent + "% is: " + (this.getArea() + (this.getArea() * percent / 100)));
    }
}
