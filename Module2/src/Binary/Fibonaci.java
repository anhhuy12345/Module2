package Binary;

import java.util.Scanner;

public class Fibonaci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui Lòng Nhập Số:");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        int f0 ;
        int f1 = 1;
        int fn = 1;

        if (n < 0) {
            return -1;
        } else if (n != 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

}
