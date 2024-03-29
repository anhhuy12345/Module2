package Binary;

import java.util.Arrays;
import java.util.Scanner;

public class CountElementInArray {
    public static void main(String[] args) {
        int n;

        // biến đếm số phần tử được nhập từ bàn phím có trong mảng
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int A[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(A));
        
        System.out.println("Enter the number: ");

        int number = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (A[i] == number) {
                count++;
            }
        }

        System.out.println("Số phần tử " + number + " có trong mảng = " + count);
    }
}
