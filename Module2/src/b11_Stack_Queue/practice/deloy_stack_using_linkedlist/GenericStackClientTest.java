package b11_Stack_Queue.practice.deloy_stack_using_linkedlist;

public class GenericStackClientTest {
    public static void main(String[] args) {
        GenericStackClient genericStackClient = new GenericStackClient();
        System.out.println("1. Stack of integers");
        genericStackClient.stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        genericStackClient.stackOfStrings();
    }
}
