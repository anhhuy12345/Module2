package Extend_Exercise.Controller;

import Extend_Exercise.Service.CarService;
import Extend_Exercise.Service.Impl.CarServiceImpl;
import Extend_Exercise.Service.VehicleService;

import java.util.Scanner;

public class CarMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void carChoose() {
        CarService carList = new CarServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------Type Car------");
            System.out.println("1.\t Coach Car");
            System.out.println("2.\t Travel Car");
            System.out.println("3.\t Return");

            int inputCar = 0;
            try {
                inputCar = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }
            switch (inputCar) {
                case 1:
                    carList.addNewCoachCar();
                    break;
                case 2:
                    carList.addNewTravelCar();
                    break;
                case 3:
                   AddMenu.displayAddVehicle();
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
