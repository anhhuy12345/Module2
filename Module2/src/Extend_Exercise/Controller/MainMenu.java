package Extend_Exercise.Controller;


import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("------VEHICLE MANAGEMENT PROGRAM------");
            System.out.println("1.\t Add Vehicle ");
            System.out.println("2.\t Display Vehicle");
            System.out.println("3.\t Delete Vehicle");
            System.out.println("4.\t Exit");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                    AddMenu.displayAddVehicle();
                    break;
                case 2:
                    DisplayMenu.displayDisplayVehicle();
                    break;
                case 3:
                    DeleteMenu.displayDeleteVehicle();
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
