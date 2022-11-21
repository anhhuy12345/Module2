package Exam3.Controller;


import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);

    public void MainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Main menu");
            System.out.println("1. benh nhan");
            System.out.println("2. bac si ");
        }
        int choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }


        switch (choice) {
            case 1:

            case 2:
            case 3:
            default:

        }

    }
}
