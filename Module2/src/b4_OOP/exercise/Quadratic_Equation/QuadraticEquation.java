//Trường dữ liệu a, b, và c thuộc kiểu private double đại diện cho 3 hệ số.
//Phương thức khởi tạo với 3 tham số để khởi tạo các giá trị cho a, b và c.
//Phương thức gettter cho a, b và c.
//Phương thức getDiscriminant() trả về delta theo công thức delta = b2 - 4ac.
//Phương thức getRoot1() và getRoot2() trả về 2 nghiệm của phương trình
package b4_OOP.exercise.Quadratic_Equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getter setter

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //tính delta
    public double getDiscriminant() {
        double delta = Math.pow(getB(), 2) - 4 * getA() * getC();
        return delta;
    }

    //tính nghiệm thứ 1
    public double getRoot1() {
        if (getDiscriminant() >= 0) {
            double r1 = (-getB() + Math.sqrt(getDiscriminant())) / (2 * getA());
            return r1;
        } else {
            return 0;
        }
    }

    //tính nghiệm thứ 2
    public double getRoot2() {
        if (getDiscriminant() >= 0) {
            double r2 = (-getB() - Math.sqrt(getDiscriminant())) / (2 * getA());
            return r2;
        } else {
            return 0;
        }
    }
}
