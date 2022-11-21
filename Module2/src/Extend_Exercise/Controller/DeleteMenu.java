package Extend_Exercise.Controller;

import Extend_Exercise.Service.Impl.CarServiceImpl;
import Extend_Exercise.Service.Impl.MotoBikeServiceImpl;
import Extend_Exercise.Service.Impl.TruckServiceImpl;
import Extend_Exercise.Service.VehicleService;

import java.util.Scanner;

public class DeleteMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayDeleteVehicle() {
        VehicleService carList = new CarServiceImpl();
        VehicleService truckList = new TruckServiceImpl();
        VehicleService motorList = new MotoBikeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------Delete Vehicle------");
            System.out.println("1.\t Delete Car");
            System.out.println("2.\t Delete Truck");
            System.out.println("3.\t Delete Motobike");
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
                    carList.delete();
                    break;
                case 2:
                    truckList.delete();
                    break;
                case 3:
                    motorList.delete();
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
