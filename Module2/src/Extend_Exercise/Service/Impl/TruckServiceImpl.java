package Extend_Exercise.Service.Impl;

import Extend_Exercise.Model.Car;
import Extend_Exercise.Model.MenuFacture;
import Extend_Exercise.Model.Truck;
import Extend_Exercise.Service.TruckService;
import Extend_Exercise.Util.ReadAndWrite;
import Extend_Exercise.Util.Regex;

import java.util.*;

public class TruckServiceImpl implements TruckService {
    public static final String REGEX = "[0-9]{2}(C)(-)[0-9]{3}(.)[0-9]{2}$";

    public static final String PATH = "E:\\Codegym\\Module2\\src\\Extend_Exercise\\Data\\truck.csv";
    public static final String HEADER = "LicensePlate, MenuFacture, Year, Boss,weight";

    ReadAndWrite<Truck> truckReadAndWrite = new ReadAndWrite<>();

    public List<Truck> getListTruck() {
        List<String> stringListTruck = truckReadAndWrite.readFromFile(PATH);
        List<Truck> truckList = new ArrayList<>();
        for (String truck : stringListTruck) {
            String[] truckArray = truck.split(",");
            truckList.add(new Truck(truckArray[0], truckArray[1], truckArray[2], truckArray[3], Integer.parseInt(truckArray[4])));
        }
        return truckList;
    }
    public List<MenuFacture> getFactureList() {

        List<String> stringList = truckReadAndWrite.readFromFile("src\\Extend_Exercise\\Data\\manufacture.csv");

        List<MenuFacture> factures = new ArrayList<>();
        for (String factureString : stringList) {
            String[] stringProperty = factureString.split(",");
            factures.add(new MenuFacture(stringProperty[0], stringProperty[1], stringProperty[2]));
        }
        return factures;
    }

    public Truck inputTruck() {
        try {
            System.out.print("input License Plate : ");
            String licenseplate = Regex.regexCar(scanner.nextLine(), REGEX, "ERROR REGEX LISCENSE PLATE");

            System.out.print("input Menu Facture : ");
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
            System.out.print("input weight: ");
            int weight = Integer.parseInt(scanner.nextLine());

            return new Truck(licenseplate, facture, year, boss, weight);
        } catch (NumberFormatException e) {
            System.err.println("Input not Number, Please re-input!");
            e.printStackTrace();
        }
        return null;
    }

    public List<Truck> getTruckList() {

        List<String> stringList = truckReadAndWrite.readFromFile(PATH);

        List<Truck> truckList = new ArrayList<>();
        for (String truckString : stringList) {
            String[] stringProperty = truckString.split(",");
            truckList.add(new Truck(stringProperty[0], stringProperty[1], stringProperty[2], stringProperty[3], Integer.parseInt(stringProperty[4])));
        }
        return truckList;
    }


    Scanner scanner = new Scanner(System.in);

    @Override
    public void addNew() {
        List<Truck> truckList = getTruckList();
        truckList.add(inputTruck());
        truckReadAndWrite.writeToFile(truckList, PATH, HEADER);
    }

    @Override
    public void delete() {

        List<Truck> truckList = getTruckList();

        if (getTruckList().size() == 0) {
            System.out.println("No data!!!!");
        } else {
            display();
            boolean check = true;

            System.out.print("input License Plate you want delete: ");
            String licensePlate = scanner.nextLine();
            for (int i = 0; i < truckList.size(); i++) {
                if (licensePlate.equals(truckList.get(i).getLicensePlate())) {
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
                                System.out.println(truckList.remove(i));
                                this.truckReadAndWrite.writeToFile(truckList, PATH, HEADER, false);
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

        List<Truck> truckList2 = getTruckList();
        if (getTruckList().size() == 0) {
            System.out.println("No data!!!!");
        } else {

            while (truckList2.contains(null)) {
                truckList2.remove(null);
            }

            System.out.println("\n----------List Truck----------");
            for (Truck truck : truckList2) {
                System.out.println(truck.toString());
            }
        }
    }
}
