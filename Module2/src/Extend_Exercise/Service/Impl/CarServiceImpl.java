package Extend_Exercise.Service.Impl;


import Extend_Exercise.Model.Car;
import Extend_Exercise.Model.MenuFacture;
import Extend_Exercise.Service.CarService;
import Extend_Exercise.Util.ReadAndWrite;
import Extend_Exercise.Util.Regex;

import java.util.*;

public class CarServiceImpl implements CarService {
    public static final String REGEXTRAVELCAR = "[0-9]{2}(A)(-)[0-9]{3}(.)[0-9]{2}$";
    public static final String REGEXCOACH = "[0-9]{2}(B)(-)[0-9]{3}(.)[0-9]{2}$";
    public static final String REGEXCOACH1 = "(Coach)$";
    public static final String REGEXTRAVELCAR1 = "(TravelCar)$";


    public static final String PATH = "E:\\Codegym\\Module2\\src\\Extend_Exercise\\Data\\car.csv";
    public static final String HEADER = "LicensePlate, MenuFacture, Year, Boss, Seat, Type";

    ReadAndWrite<Car> carReadAndWrite = new ReadAndWrite<>();

    public List<MenuFacture> getFactureList() {

        List<String> stringList = carReadAndWrite.readFromFile("src\\Extend_Exercise\\Data\\manufacture.csv");

        List<MenuFacture> factures = new ArrayList<>();
        for (String factureString : stringList) {
            String[] stringProperty = factureString.split(",");
            factures.add(new MenuFacture(stringProperty[0], stringProperty[1], stringProperty[2]));
        }
        return factures;
    }

    public Car inputCoachCar() {
        try {
            System.out.print("input License Plate : ");
            String licenseplate = Regex.regexCar(scanner.nextLine(), REGEXCOACH, "ERROR REGEX LISCENSE PLATE");

            System.out.print("input Manu Facture : ");
            List<MenuFacture> factures = getFactureList();
            System.out.println("\n----------Menu Facture----------");
            for (MenuFacture menuFacture : factures) {
                System.out.println(menuFacture.toString());
            }
            System.out.println();
            String facture = scanner.nextLine();
            for (int i = 0; i < factures.size(); i++) {
                if (facture.equals(factures.get(i).getIdfacture())) {
                    facture = factures.get(i).getFacture();
                }
            }

            System.out.print("input year: ");
            String year = scanner.nextLine();

            System.out.print("input Boss: ");
            String boss = scanner.nextLine();

            //chống lỗi việc nhập số -> chuỗi
            System.out.print("input seat: ");
            int seat = Integer.parseInt(scanner.nextLine());

            System.out.print("input type: ");
            String type = Regex.regexCar(scanner.nextLine(), REGEXCOACH1, "ERROR REGEX TYPE(Coach)");

            return new Car(licenseplate, facture, year, boss, seat, type);
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return null;
    }

    public Car inputTravelCar() {
        try {
            System.out.print("input License Plate : ");
            String licenseplate = Regex.regexCar(scanner.nextLine(), REGEXTRAVELCAR, "ERROR REGEX LISCENSE PLATE");

            System.out.print("Manu Facture : ");
            List<MenuFacture> factures = getFactureList();
            System.out.println("\n----------Menu Facture----------");
            for (MenuFacture menuFacture : factures) {
                System.out.println(menuFacture.toString());
            }
            System.out.println();
            String facture = scanner.nextLine();
            for (int i = 0; i < factures.size(); i++) {
                if (facture.equals(factures.get(i).getIdfacture())) {
                    facture = factures.get(i).getFacture();
                }
            }


            System.out.print("input year: ");
            String year = scanner.nextLine();

            System.out.print("input Boss: ");
            String boss = scanner.nextLine();

            //chống lỗi việc nhập số -> chuỗi
            System.out.print("input seat: ");
            int seat = Integer.parseInt(scanner.nextLine());

            System.out.print("input type: ");
            String type = Regex.regexCar(scanner.nextLine(), REGEXTRAVELCAR1, "ERROR REGEX TYPE(TravelCar)");

            return new Car(licenseplate, facture, year, boss, seat, type);
        } catch (
                NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return null;
    }

    public List<Car> getCarList() {

        List<String> stringList = carReadAndWrite.readFromFile(PATH);

        List<Car> carList = new ArrayList<>();
        for (String carString : stringList) {
            String[] stringProperty = carString.split(",");
            carList.add(new Car(stringProperty[0], stringProperty[1], stringProperty[2], stringProperty[3], Integer.parseInt(stringProperty[4]), stringProperty[5]));
        }
        return carList;
    }


    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNewCoachCar() {

        List<Car> carList = getCarList();
        carList.add(inputCoachCar());
        carReadAndWrite.writeToFile(carList, PATH, HEADER);
    }

    @Override
    public void addNewTravelCar() {
        List<Car> carList = getCarList();
        carList.add(inputTravelCar());
        carReadAndWrite.writeToFile(carList, PATH, HEADER);

    }

    @Override
    public void delete() {

        List<Car> carList = getCarList();

        if (getCarList().size() == 0) {
            System.out.println("No data!!!!");
        } else {
            display();
            boolean check = true;


            System.out.print("input License Plate you want delete: ");
            String licensePlate = scanner.nextLine();
            for (int i = 0; i < carList.size(); i++) {
                if (licensePlate.equals(carList.get(i).getLicensePlate())) {
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
                                System.out.println(carList.remove(i));
                                this.carReadAndWrite.writeToFile(carList, PATH, HEADER, false);
                                System.out.println("Delete Success!!!");
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

        List<Car> carList2 = getCarList();
        if (getCarList().size() == 0) {
            System.out.println("No data!!!!");
        } else {

            while (carList2.contains(null)) {
                carList2.remove(null);
            }

            System.out.println("\n----------List Car----------");
            for (Car car : carList2) {
                System.out.println(car.toString());
            }
        }
    }

    @Override
    public void addNew() {
    }

}

