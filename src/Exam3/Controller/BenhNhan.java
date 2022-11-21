package Exam3.Controller;

import java.util.Scanner;

public class BenhNhan {
    Scanner scanner = new Scanner(System.in);

    public void benhNhan() {
        boolean check = true;
        while (check) {
            System.out.println("Benh Nhan");
            System.out.println("1. them benh nhan");
            System.out.println("2. hien thi danh sach benh nhan ");
            System.out.println("2. thoat");
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
