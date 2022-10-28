package b5_Access_Modifier.exercise.Only_Write;

public class MainStudent {
    public static void main(String[] args) {
        //private nó không chạy và sẽ báo lỗi tại setClass và setName
        Student student = new Student();
        student.setClasses("C00822G1");
        student.setName("Huy");
        System.out.println("Name " + student.getName() + " Class " + student.getClasses());
//        System.out.println("Name "+ test.setName()+ " Class " +test.setClasses());
    }
}
