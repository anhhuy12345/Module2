package Case_Study.Controller;

import java.util.Scanner;

public class PromotionController {
    public void promotion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Promotion Management ------");
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        int choice;

        do {

            choice = scanner.nextInt();
            if (choice < 1 || choice> 3) {
                System.out.println("please enter again:");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("hihi");
                    break;
                case 2:
                    System.out.println("huhu");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("please enter again 1-3");

            }
        } while (true);


    }
}
