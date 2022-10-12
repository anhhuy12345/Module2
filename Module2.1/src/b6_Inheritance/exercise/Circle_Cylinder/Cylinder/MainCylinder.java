package b6_Inheritance.exercise.Circle_Cylinder.Cylinder;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder=new Cylinder(3.0,2.0,"Red");
        System.out.println(cylinder);
    }
}
