package Exam3.Model;

public class Doctor extends Person{
    private String yearWork;

    public Doctor(){

    }



    public Doctor(String id, String name, String sex, String yearWork) {
        super(id, name, sex);
        this.yearWork = yearWork;
    }

    public String getYearWork() {
        return yearWork;
    }

    public void setYearWork(String yearWork) {
        this.yearWork = yearWork;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString()+
                "yearWork='" + yearWork + '\'' +
                '}';
    }
}
