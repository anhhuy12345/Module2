package b7_Abstract_Interface.exercise.resizeable;

import b6_Inheritance.practice.Rectangle.Rectangle;

public class RectangleResizeable extends Rectangle implements Resizeable {
    //constructor
    public RectangleResizeable(double width, double length) {
        super(width,length);
    }


    @Override
    public void resize(double percent) {
        System.out.println("Area BEFORE increase size of Rectangle: "+this.getArea());
        System.out.println("Area AFTER increase size of Rectangle: "+percent+"% is: "+(this.getArea()+(this.getArea()*percent/100)));
    }
}
