package b10_ArrayList_LinkedList.exercise.LinkedList;

public class Student {
    private int id;
    private String name;

    //contructor
    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
