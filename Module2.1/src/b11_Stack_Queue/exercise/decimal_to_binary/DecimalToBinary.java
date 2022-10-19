package b11_Stack_Queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackBinary = new Stack<>();
        System.out.print("input Decimal: ");
        int dec = Integer.parseInt(scanner.nextLine());

        // thực hiện  chuyển thập phân sang nhị phân
        while (dec != 0) {
            stackBinary.push(dec % 2);
            dec = dec /2;
        }

        // xuất kết quả
        System.out.print("output binary: ");
        while (!stackBinary.empty()) {
            System.out.print(stackBinary.pop());
        }
    }
}
