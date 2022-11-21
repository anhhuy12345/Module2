package Extend_Exercise.Controller;

import Extend_Exercise.Service.Impl.CarServiceImpl;
import Extend_Exercise.Service.Impl.MotoBikeServiceImpl;
import Extend_Exercise.Service.Impl.TruckServiceImpl;
import Extend_Exercise.Service.VehicleService;

import java.util.Scanner;

public class DisplayMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayDisplayVehicle() {
        VehicleService carList = new CarServiceImpl();
        VehicleService truckList = new TruckServiceImpl();
        VehicleService motorList = new MotoBikeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------Display Vehicle------");
            System.out.println("1.\t Display Car");
            System.out.println("2.\t Display Truck");
            System.out.println("3.\t Display Motobike");
            System.out.println("4.\t Return");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                    carList.display();
                    break;
                case 2:
                    truckList.display();
                    break;
                case 3:
                    motorList.display();
                    break;
                case 4:
                    MainMenu.displayMainMenu();
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
