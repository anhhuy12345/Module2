package b12_Java_Collection_Framework.practice.sort_comparable_comparator;

public class Student implements Comparable<Student> {
    private String name;
    private Integer age;
    private String address;

    public Student() {
    }

    public Student(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    //so sánh theo tên
    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
