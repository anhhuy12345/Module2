package b10_ArrayList_LinkedList.exercise.LinkedList;


public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Huy");
        Student student2 = new Student(2, "Hung");
        Student student3 = new Student(3, "Quang");
        Student student4 = new Student(4, "Cong");
        Student student5 = new Student(5, "Diem");
        Student student6 = new Student(6, "Viet");
        Student a = null;
        //thêm 1 phần tử vào ĐẦU liên kết
        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addFirst(student2);
        studentMyLinkedList.addFirst(student3);

        //thêm 1 phần từ vào vị trí BẤT KÌ
        studentMyLinkedList.add(3, student4);

        //thêm phần tử ở CUỐI liên kết
        studentMyLinkedList.addLast(student5);

        // xuất phần tử trong liên kết lúc đầu
        System.out.println("Linked List ban đầu");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            // khai báo phần tử trong liên kết là kiểu Student
            Student studentElement = studentMyLinkedList.get(i);
            System.out.print("name: " + studentElement.getName());
            System.out.println(", id: " + studentElement.getId());
        }

        // xuất phần tử trong liên kết cuối
        System.out.println();
        System.out.println("Linked List lúc sau");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            Student studentElement = studentMyLinkedList.get(i);
            System.out.print("name: " + studentElement.getName());
            System.out.println(" , id: " + studentElement.getId());
        }

        MyLinkedList<Student> myLinkedListCopy = studentMyLinkedList.clone();
        System.out.println();
        System.out.println("Linked List lúc sau khi copy");
        for (int i = 0; i < myLinkedListCopy.size(); i++) {
            Student studentElement = myLinkedListCopy.get(i);
            System.out.print("name: " + studentElement.getName());
            System.out.println(" id: " + studentElement.getId());
        }

        System.out.println("student2 có trong liên kết hay không " + studentMyLinkedList.contains(student2));
        System.out.println("studentt2 ở vị trí thứ: " + studentMyLinkedList.indexOf(student2));

        Student studentFirst = studentMyLinkedList.getFirst();
        System.out.println("Học sinh đầu tiên là: " + studentFirst.getName() + " " + studentFirst.getId());
        Student studentLast = studentMyLinkedList.getLast();
        System.out.println("Học sinh cuối là: " + studentLast.getName() + " " + studentLast.getId());

        System.out.println("\nPhần tử student 6 có thêm vào được mảng không: " + studentMyLinkedList.add(a));
        System.out.println();

        System.out.println("Linked List sau khi thêm student6: ");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            Student studentElement = studentMyLinkedList.get(i);
            System.out.print("name: " + studentElement.getName());
            System.out.println(", id: " + studentElement.getId());
        }

        studentMyLinkedList.clear();
        System.out.println();
        System.out.println("Linked List sau khi xoá ");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {
            Student studentElement = studentMyLinkedList.get(i);
            System.out.println("name: " + studentElement.getName());
            System.out.print(", id" + studentElement.getId());
        }
    }
}
