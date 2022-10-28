package b5_Access_Modifier.exercise.Access_Modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    //constructor
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

//    private double getRadius() {
//        return this.radius;
//    }
//
//    private double getArea() {
//        return this.radius * this.radius * Math.PI;
//    }
    //private chỉ ó main trong cùng class mới chạy được còn ngoài thì k đc
//    public static void main(String[] args) {
//        //access modifier la public
//        Circle circle1=new Circle(5);
//        System.out.println("Area circle is: "+circle1.getArea());
//        System.out.println("radius circle is: "+circle1.getRadius());
//
//        //thay đổi modifier la default
//        Circle circle2=new Circle(6);
//        System.out.println("Area circle is: "+circle2.getArea());
//        System.out.println("radius circle is: "+circle2.getRadius());
//    }

}
