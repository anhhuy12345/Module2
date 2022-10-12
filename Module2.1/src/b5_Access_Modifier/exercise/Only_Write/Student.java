package b5_Access_Modifier.exercise.Only_Write;

public class Student {
    private String name = "John";
    private String classes = "C02";

    //constructor
    public Student() {
    }

    //Hai phương thức có access modifier là public: setName và setClasses.

    String getName() {
        return name;
    }

    String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


//    protected void setName(String name) {
//        this.name = name;
//    }
//
//    protected void setClasses(String classes) {
//        this.classes = classes;
//    }


//    private void setName(String name) {
//        this.name = name;
//    }
//
//    private void setClasses(String classes) {
//        this.classes = classes;
//    }


//    void setName(String name) {
//        this.name = name;
//    }
//
//    void setClasses(String classes) {
//        this.classes = classes;
//    }
}
