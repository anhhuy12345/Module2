package Extend_Exercise.Service.Impl;

import Extend_Exercise.Model.Motobike;
import Extend_Exercise.Service.MotobikeService;
import Extend_Exercise.Util.ReadAndWrite;
import Extend_Exercise.Util.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotoBikeServiceImpl implements MotobikeService {
    public static final String REGEX = "[0-9]{2}(-)[A-Z][0-9|A-Z](-)[0-9]{3}(.)[0-9]{2}$";
    public static final String PATH = "E:\\Codegym\\Module2\\src\\Extend_Exercise\\Data\\Motobike.csv";
    public static final String HEADER = "LicensePlate, MenuFacture, Year, Boss, Wattage";
    ReadAndWrite<Motobike> motobikeReadAndWrite = new ReadAndWrite<>();

    public List<Motobike> getListMotobike() {
        List<String> stringListMotor = motobikeReadAndWrite.readFromFile(PATH);
        List<Motobike> motorList = new ArrayList<>();
        for (String motor : stringListMotor) {
            String[] motorArray = motor.split(",");
            motorList.add(new Motobike(motorArray[0], motorArray[1], motorArray[2], motorArray[3], Integer.parseInt(motorArray[4])));
        }
        return motorList;
    }

    public Motobike inputMotor() {
        try {
            System.out.print("input License Plate : ");
            String licenseplate = Regex.regexCar(scanner.nextLine(), REGEX, "ERROR REGEX LISCENSE PLATE");

            System.out.print("input Manu Facture : ");
            String menufacture = scanner.nextLine();

            System.out.print("input year: ");
            String year = scanner.nextLine();

            System.out.print("input Boss: ");
            String boss = scanner.nextLine();

            //chống lỗi việc nhập số -> chuỗi
            System.out.print("input wattage: ");
            int wattage = Integer.parseInt(scanner.nextLine());

            return new Motobike(licenseplate, menufacture, year, boss, wattage);
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return null;
    }

    public List<Motobike> getTruckList() {

        List<String> stringList = motobikeReadAndWrite.readFromFile(PATH);

        List<Motobike> motorList = new ArrayList<>();
        for (String motorString : stringList) {
            String[] stringProperty = motorString.split(",");
            motorList.add(new Motobike(stringProperty[0], stringProperty[1], stringProperty[2]
                    , stringProperty[3], Integer.parseInt(stringProperty[4])));

        }
        return motorList;
    }


    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        List<Motobike> motorList = getListMotobike();
        motorList.add(inputMotor());
        motobikeReadAndWrite.writeToFile(motorList, PATH, HEADER);
    }

    @Override
    public void delete() {

        List<Motobike> motorList = getListMotobike();

        if (getListMotobike().size() == 0) {
            System.out.println("No data!!!!");
        } else {
            display();
            boolean check = true;

            System.out.print("input License Plate you want delete: ");
            String licensePlate = scanner.nextLine();
            for (int i = 0; i < motorList.size(); i++) {
                if (licensePlate.equals(motorList.get(i).getLicensePlate())) {
                    System.out.println("Are you sure you want to delete?");
                    while (check) {
                        System.out.println("------Delete Vehicle------");
                        System.out.println("1.\t Yes");
                        System.out.println("2.\t Return");
                        int choice = 0;
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Input not Number, Please re-input!");
                            e.printStackTrace();
                        }
                        switch (choice) {
                            case 1:
                                System.out.println(motorList.remove(i));
                                this.motobikeReadAndWrite.writeToFile(motorList, PATH, HEADER, false);
                                System.out.println("Delete Success!!");
                                return;
                            case 2:
                                return;

                        }
                    }
                }
            }
        }
    }

    @Override
    public void display() {

        List<Motobike> motorList2 = getListMotobike();
        if (getListMotobike().size() == 0) {
            System.out.println("No data!!!!");
        } else {

            while (motorList2.contains(null)) {
                motorList2.remove(null);
            }

            System.out.println("\n----------List MotorBike----------");
            for (Motobike motobike : motorList2) {
                System.out.println(motobike.toString());
            }
        }
    }
}
