package Case_Study.Controller;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            do {
                displayMainMenu();
                choice = scanner.nextInt();
                if (choice < 1 || choice > 6) {
                    System.out.println("please enter again:");
                } else
                    break;
            } while (true);

            switch (choice) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayManagerment();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBooking();
                    break;
                case 5:
                    displayPromotion();
                    return;
                case 6:
                    return;

            }
        }
    }

    //          Menu Chính
    public static void displayMainMenu() {
        System.out.println("------Main Menu------");
        System.out.println("1.\tEmployee Management");
        System.out.println("2.\tCustomer Management");
        System.out.println("3.\tFacility Management ");
        System.out.println("4.\tBooking Management");
        System.out.println("5.\tPromotion Management");
        System.out.println("6.\tExit");
        System.out.print("Enter Your Choice: \t");
    }

    public static void displayEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Employee Management------");
        System.out.println("1\tDisplay list employees");
        System.out.println("2\tAdd new employee");
        System.out.println("3\tDelete employee");
        System.out.println("4\tEdit employee");
        System.out.println("5\tReturn main menu");

        int choice1;

        do {

            choice1 = scanner.nextInt();
            if (choice1 < 1 || choice1 > 5) {
                System.out.println("please enter again:");
            } else
                break;
        } while (true);
        switch (choice1) {
            case 1:
                System.out.println("hihi");

                break;
            case 2:
                System.out.println("huhu");

                break;
            case 3:
                System.out.println("liu liu");
                break;
            case 4:
                System.out.println("byebye");
                return;
            case 5:
                break;

        }
    }

    public static void displayManagerment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Customer Management ------");
        System.out.println("1.\tDisplay list customers");
        System.out.println("2.\tAdd new customer");
        System.out.println("3.\tEdit customer");
        System.out.println("4.\tReturn main menu");
        int choice2;

        do {

            choice2 = scanner.nextInt();
            if (choice2 < 1 || choice2 > 4) {
                System.out.println("please enter again:");
            } else
                break;
        } while (true);
        switch (choice2) {
            case 1:
                System.out.println("hihi");
                break;
            case 2:
                System.out.println("huhu");
                break;
            case 3:
                System.out.println("liu liu");
                break;
            case 4:
                return;

        }

    }

    public static void displayFacility() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Facility Management  ------");
        System.out.println("1\tDisplay list facility");
        System.out.println("2\tAdd new facility");
        System.out.println("3\tDisplay list facility maintenance");
        System.out.println("4\tReturn main menu");
        int choice3;

        do {

            choice3 = scanner.nextInt();
            if (choice3 < 1 || choice3 > 4) {
                System.out.println("please enter again:");
            } else
                break;
        } while (true);
        switch (choice3) {
            case 1:
                System.out.println("hihi");
                ;
                break;
            case 2:
                System.out.println("huhu");
                ;
                break;
            case 3:
                System.out.println("liu liu");
                break;
            case 4:
                return;

        }
    }

    public static void displayBooking() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Booking Management------");
        System.out.println("1.\tAdd new booking");
        System.out.println("2.\tDisplay list booking");
        System.out.println("3\tReturn main menu");
        int choice4;

        do {

            choice4 = scanner.nextInt();
            if (choice4 < 1 || choice4 > 3) {
                System.out.println("please enter again:");
            } else
                break;
        } while (true);
        switch (choice4) {
            case 1:
                System.out.println("hihi");

                break;
            case 2:
                System.out.println("huhu");
                break;
            case 3:
                return;

        }

    }

    public static void displayPromotion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Promotion Management ------");
        System.out.println("1.\tDisplay list customers use service");
        System.out.println("2.\tDisplay list customers get voucher");
        System.out.println("3.\tReturn main menu");
        int choice5;

        do {

            choice5 = scanner.nextInt();
            if (choice5 < 1 || choice5 > 3) {
                System.out.println("please enter again:");
            } else
                break;
        } while (true);
        switch (choice5) {
            case 1:
                System.out.println("hihi");
                break;
            case 2:
                System.out.println("huhu");
                break;
            case 3:
                return;

        }

    }


}


