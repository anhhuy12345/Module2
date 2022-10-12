//lớp hình tròn
//Thiết kế và triển khai lớp Circle (hình tròn) và lớp con của nó Cylinder (hình trụ).
// Lớp Circle có những thuộc tính mô tả bán kính, màu sắc, các getter/setter cho các thuộc tính đó,
// và những thuộc tính liên đới như diện tích. Lớp Cylinder mở rộng lớp Circle
// bằng cách bổ sung thuộc tính chiều cao cũng như có thể có thêm phương thức lấy thể tích.
//Cả hai lớp đều phải cài đè phương thức toString để in ra thông tin chi tiết các thuộc tính của đổi tượng.
package b6_Inheritance.exercise.Circle_Cylinder.Circle;

public class Circle {
    private double radius=1.0;
    private String color="Green";

    //constructor
    public Circle() {}
    public Circle(double radius, String color) {
        this.radius=radius;
        this.color=color;
    }

    //getter setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //tính diện tích hình tròn
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    //tính chu vi hình tròn
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                " , Area= " + getArea() +
                " , Perimeter"+ getPerimeter()+
                '}';
    }
}
