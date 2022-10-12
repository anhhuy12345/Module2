package b6_Inheritance.exercise.Circle_Cylinder.Circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle=new Circle();
        System.out.println(circle);

        circle=new Circle(2.0, "yellow");
        System.out.println(circle);
    }
}
