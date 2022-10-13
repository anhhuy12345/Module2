package b7_Abstract_Interface.exercise.colorable;

import b6_Inheritance.practice.Square.Square;

public class SquareColorableMain {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(2.0);
        squares[2] = new SquareColorable(5);
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Area square " + i + " is: " + squares[i].getArea());

            if (squares[i] instanceof SquareColorable) {
                System.out.println("Square has Colorable is Square " + i + ": ");
                ((SquareColorable) squares[i]).howToColor();
            }
        }
    }
}
