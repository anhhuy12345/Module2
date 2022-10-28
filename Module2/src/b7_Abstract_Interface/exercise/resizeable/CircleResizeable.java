package b7_Abstract_Interface.exercise.resizeable;

import b6_Inheritance.practice.Circle.Circle;

public class CircleResizeable extends Circle implements Resizeable {

    //constructor
    public CircleResizeable(){}
    public CircleResizeable(double radius){
        super(radius);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Area BEFORE increase size of Circle: "+this.getArea());
        System.out.println("Area AFTER increase size of Circle: "+percent+"% is: "+(this.getArea()+(this.getArea()*percent/100)));
    }
}
