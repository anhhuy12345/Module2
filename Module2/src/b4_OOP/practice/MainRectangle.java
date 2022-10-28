package b4_OOP.practice;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter Height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle: \n "+rectangle.display());
        System.out.println("Perimeter of your rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of rectangle: "+rectangle.getArea());
    }
}
