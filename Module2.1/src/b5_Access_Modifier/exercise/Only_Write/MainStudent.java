package b5_Access_Modifier.exercise.Only_Write;

public class MainStudent {
    public static void main(String[] args) {
        //private nó không chạy và sẽ báo lỗi tại setClass và setName
        Student test = new Student();
        test.setClasses("C00822G1");
        test.setName("Huy");
        System.out.println("Name " + test.getName() + " Class " + test.getClasses());
//        System.out.println("Name "+ test.setName()+ " Class " +test.setClasses());
    }
}
