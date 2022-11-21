package Binary;

import java.util.Scanner;

public class FindNumberNotBinary {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the number: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("element in array:");
        for (int n : arr) {
            if(isPrime(n)){
                System.out.println(n+" là số nguyên tố!");
            } else {
                System.out.println(n+" không là số nguyên tố!");
            }
        }

    }
}

