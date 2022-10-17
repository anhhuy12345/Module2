package b10_ArrayList_LinkedList.exercise.LinkedList;

public class MyLinkedList<E> {
    //Phần từ đầu tiên của liên kết
    private Node head;
    //số lượng phần tử của danh sách
    private int numNodes = 0;

    private class Node {
        private Node next;
        Object data;

        //constructor
        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    //constructor
    public MyLinkedList() {
    }

    //add phần tủ vào đầu liên kết
    public void addFirst(E element) {
        //khai báo biến tạm trỏ đến giá trị của head
        Node temp = this.head;
        // biến head lúc này sẽ gán bằng biến mình nhập vào
        this.head = new Node(element);
        //trỏ head hiện tại với head ban đầu là temp
        this.head.next = temp;
        numNodes++;
    }

    //Thêm phần tủ vào cuối danh sách
    
}
