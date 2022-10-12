package Case_Study.Controller;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            mainMenu();
            choice = scanner.nextInt();
            if (choice < 1 || choice > 7) {
                System.out.println("please enter again:");
            } else
                break;
        } while (true);
        switch (choice) {
            case 1:
                addNewservice();
                break;
            case 2:
                showService();
                break;
            case 3:
                break;
        }
    }

    //          Menu Chính
    public static void mainMenu() {
        System.out.println("------Main Menu------");
        System.out.println("1.\tAdd New Services.");
        System.out.println("2.\tShow Services.");
        System.out.println("3.\tAdd New Customer");
        System.out.println("4.\tShow Information of Customer");
        System.out.println("5.\tAdd New Booking");
        System.out.println("6.\tShow Information of Employee");
        System.out.println("7.\tExit");
        System.out.print("Enter Your Choice: \t");
    }

    public static void addNewservice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------Add New Service------");
        System.out.println("1.\tAdd New Villa");
        System.out.println("2.\tAdd New House");
        System.out.println("3.\tAdd New Room");
        System.out.println("4.\tBack to menu");
        System.out.println("5.\tExit");

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
                mainMenu();
                return;
            case 5:
                System.out.println("byebye");
                break;

        }
    }

    public static void showService() {
        System.out.println("------Show Service------");
        System.out.println("1.\tShow all Villa");
        System.out.println("2.\tShow all House");
        System.out.println("3.\tShow all Room");
        System.out.println("4.\tShow All Name Villa Not Duplicate");
        System.out.println("5.\tShow All Name House Not Duplicate");
        System.out.println("6.\tShow All Name Name Not Duplicate");
        System.out.println("7.\tBack to menu");
        System.out.println("8.\tExit");
    }


}


