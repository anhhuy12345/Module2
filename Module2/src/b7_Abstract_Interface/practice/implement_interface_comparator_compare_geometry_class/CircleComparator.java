package b7_Abstract_Interface.practice.implement_interface_comparator_compare_geometry_class;

import b6_Inheritance.practice.Circle.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    // dùng để so sánh nhiều thứ, ví dụ so sánh bán kính không được thì so sánh tên, lớp trước và sau khi so sánh không bị thay đổi
    @Override
    public int compare(Circle circle1, Circle circle2) {
        if(circle1.getRadius()>circle2.getRadius()) {
            return 1;
        } else if(circle1.getRadius()<circle2.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
}
