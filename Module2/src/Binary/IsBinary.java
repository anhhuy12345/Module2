package Binary;

import java.util.Scanner;

public class IsBinary {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        System.out.println("nhap so: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count != 2)
                System.out.println(" Nót Prime is " + i);
            count = 0;


        }
    }
}
