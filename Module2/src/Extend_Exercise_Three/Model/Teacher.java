package Extend_Exercise_Three.Model;

public class Teacher extends Person {
    private String teachClass;
    private int salary;

    public Teacher(int id, String name, String birthday, String teachClass, int salary) {
        super(id, name, birthday);
        this.teachClass = teachClass;
        this.salary = salary;
    }

    public String getTeachClass() {
        return teachClass;
    }

    public void setTeachClass(String teachClass) {
        this.teachClass = teachClass;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + teachClass  +
                "," + salary ;
    }
}
