package b7_Abstract_Interface.exercise.colorable;

import b6_Inheritance.practice.Square.Square;
import b7_Abstract_Interface.exercise.resizeable.Resizeable;

public class SquareColorable extends Square implements Colorable {
    SquareColorable(){};
    public SquareColorable(double size){
        super(size);
    }

    @Override
    public void howToColor() {
        System.out.println(" Color All Four Size");
    }


}

