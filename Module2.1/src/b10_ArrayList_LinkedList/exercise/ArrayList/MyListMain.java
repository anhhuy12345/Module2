package b10_ArrayList_LinkedList.exercise.ArrayList;

public class MyListMain {
    //tạo class student
    public static class Student {
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

    public static void main(String[] args) {
        Student student1 = new Student(1, "Huy");
        Student student2 = new Student(2, "Hung");
        Student student3 = new Student(3, "Nga");
        Student student4 = new Student(4, "Diem");
        Student student5 = new Student(5, "Thang");
        Student student6 = new Student(6, "Son");

        //khởi tạo mảng
        MyList<Student> studentMyList = new MyList<>();
        //thêm phần tử vào mảng
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student6);

        //add phần tử vào mảng vị trí bất kì
        studentMyList.add(4, student5);


        //xuất mảng
        for (int i = 0; i < studentMyList.size(); i++) {
            //lấy phần từ trong mảng và gán nó kiểu Student
            Student studentTest = (Student) studentMyList.elements[i];
            System.out.print("id: " + studentTest.id + " ");
            System.out.print("name: " + studentTest.name);
            System.out.println();
        }

        System.out.println("size present: " + studentMyList.size());

        //lấy ra phần tử vị trí bất kì
        System.out.println("student index 3 :" + studentMyList.get(3).getName());

        //xuất vị trí của phần tử bất kì
        System.out.println("student5 has index: " + studentMyList.indexOf(student5));

        //kiểm tra phần tử có trong mảng không
        System.out.println("check element in array: " + studentMyList.contains(student6));

        //kiểm tra copy mảng
        MyList<Student> copyStudent = new MyList<>();
        copyStudent = studentMyList.clone();
        //xuất copy mảng
        System.out.println("\ncopy Array: ");
        for (int i = 0; i < copyStudent.size(); i++) {
            //lấy phần từ trong mảng và gán nó kiểu Student
            Student studentCopy = (Student) studentMyList.elements[i];
            System.out.print("id: " + studentCopy.id + " ");
            System.out.print("name: " + studentCopy.name);
            System.out.println();
        }
        System.out.println("size present: " + studentMyList.size());


        System.out.println("\nREMOVE element: ");
        //test phần tử bị xoá
        studentMyList.remove(4);
        for (int i = 0; i < studentMyList.size(); i++) {
            //lấy phần từ trong mảng và gán nó kiểu Student
            Student studentCopy = (Student) studentMyList.elements[i];
            System.out.print("id: " + studentCopy.id + " ");
            System.out.print("name: " + studentCopy.name);
            System.out.println();
        }
        System.out.println("size present after remove: " + studentMyList.size());
    }
}
