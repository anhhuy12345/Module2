package Case_Study.Model;

public class Employee extends Person {
    private String education;
    private String level;
    private double wage;

    public Employee() {
    }

    public Employee(String id, String name, String birthday, String sex, int indentityCard, int phoneNumber, String email, String education, String level, double wage) {
        super(id, name, birthday, sex, indentityCard, phoneNumber, email);
        this.education = education;
        this.level = level;
        this.wage = wage;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String toStringPerson() {
        return "Employee: " + super.toStringPerson() +
                "Education: " + education +"\n"+
                "Level: " + level +"\n"+
                "Wage: " + wage;
    }
}
