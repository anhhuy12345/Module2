package Extend_Exercise_Two.Controler;


import Extend_Exercise_Two.Service.Impl.CustomerServiceImpl;
;

import java.util.Scanner;

public class Choose {
    private static final Scanner scanner = new Scanner(System.in);

    public static void customerChoose() {
         CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------Type Customer------");
            System.out.println("1.\t VietNam Customer");
            System.out.println("2.\t International Customer");
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
                    customerService.getVNList();
                    break;
                case 2:
                    customerService.getNNList();
                    break;
                case 3:
                   Test.displayAddVehicle();
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
