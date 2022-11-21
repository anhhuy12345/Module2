package Exam3.Controller;

import java.util.Scanner;

public class DoctorController {
    Scanner scanner = new Scanner(System.in);

    public void doctor() {
        boolean check = true;
        while (check) {
            System.out.println("bac si");
            System.out.println("1. them vao danh sach");
            System.out.println("2. hien thi danh sach ");
            System.out.println("2. quay lai ");
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
                return;
            case 2:
                return;
            case 3:
                return;

            default:

        }

    }
}
