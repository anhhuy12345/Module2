package b10_ArrayList_LinkedList.practice.deloy_class_linkedlist_simple;

//Lớp MyLinkedList gồm
//Các thuộc tính
//numNodes size xác định số phần tử trong danh sách, mặc định gán là 0.
//head đối tượng lớp Node
//Các phương thức:
//Phương thức khởi tạo một tham số khởi tạo node đầu tiên trong danh sách
//Phương thức thêm một phần tử mới vào danh sách: add()
//Phương thức thêm một phần tử mới vào đầu danh sách: addFirst()
//Phương thức truy cập một phần tử trong danh sách: get()
//Phương thức printList() in các phần tử trong danh sách
//Lớp MyLinkedListTest chứa phương thức main() để thực thi ứng dụng
public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        this.head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        //constructor
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //Cài đặt phương thức add
    //Mục đích: Thêm đối tượng vào vị trí thứ index trong danh sách
    //Tham số đầu vào: vị trí thêm (index), đối tượng thêm (data)

    public void add(int index, E data) {
        Node temp = head;
        Node holder; // biến tạm giữ cho biến sau vị trí ta muốn gắn vào
        // temp -> data muốn đưa vào -> holder

        // trường hợp thêm vào vị trí đâu
        if (index == 0) {
            addFirst(data);
        } else {
            //temp.next=null thì nó ở vị trí cuối, dùng cho trường hợp muốn gắn biến vào vị trí cuối của mảng
            //ban đầu temp đã nằm ở vị trí 0
            for (int i = 1; i < index && temp.next != null; i++) {
                temp = temp.next;
            }

            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }
    }


    //Cài đặt phương thức addFirst()
    //Mục đích: Thêm đối tượng vào vị trí đầu tiên trong danh sách
    //Tham số đầu vào: đối tượng thêm (data)

    public void addFirst(E data) {
        Node temp = this.head;
        this.head = new Node(data);
        this.head.next = temp;
        numNodes++;
    }

    //Cài đặt phương thức get()
    //Mục đích: Lấy phần tử ở vị trí index từ danh sách
    //Tham số đầu vào: vị trí cần lấy (index)

    public E get(int index) {
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    //Cài đặt phương thức printList
    //Mục đích: Hiển thị danh sách các phần tử trong danh sách

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
