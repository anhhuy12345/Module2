package Extend_Exercise_Two.Controler;

import Extend_Exercise.Controller.*;


import Extend_Exercise_Two.Model.Customer;
import Extend_Exercise_Two.Model.InternationalCustomer;
import Extend_Exercise_Two.Service.CustomerService;
import Extend_Exercise_Two.Service.Impl.CustomerServiceImpl;
import Extend_Exercise_Two.Service.Service;

import java.util.Scanner;

public class Test {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayAddVehicle() {
        CustomerService service = new CustomerServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("------ Electricity Bill Management------");
            System.out.println("1.\t Add Vietnam");
            System.out.println("2.\t Add Truck");
            System.out.println("3.\t Add Motobike");
            System.out.println("4.\t Return");
            System.out.println("4.\t Return");
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
                   service.addNewVN();
                    break;
                case 2:
                 service.addNewNN();
                    break;
                case 3:
                    service.display();


                    break;
                case 4:
                    service.find();

                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Test.displayAddVehicle();
    }
}
