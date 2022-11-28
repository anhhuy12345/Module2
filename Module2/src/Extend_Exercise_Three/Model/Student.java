package Extend_Exercise_Three.Model;

public class Student extends Person {
    private String classMate;
    private int score;

    public Student(int id, String name, String birthday, String classMate, int score) {
        super(id, name, birthday);
        this.classMate = classMate;
        this.score = score;
    }

    public String getClassMate() {
        return classMate;
    }

    public void setClassMate(String classMate) {
        this.classMate = classMate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return super.toString() +
                "," + classMate +
                "," + score
                ;
    }
}
