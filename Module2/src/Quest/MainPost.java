package Quest;

import java.util.*;

public class MainPost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibonacci;
        int number;
        do {
            System.out.println("Enter Number:");
            number = Integer.parseInt(scanner.nextLine());
            if (number > 20 || number < 0) {
                System.out.println("Please Enter again <=20");
            }
        } while (number > 20);
        for (int i = 0; i < number; i++) {
            fibonacci = (number - 1) + (number - 2);
            System.out.println(fibonacci);
            break;
        }
    }
}
