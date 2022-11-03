package Case_Study.Controller;

import Case_Study.Service.FacilityService;
import Case_Study.Service.Implement.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityMenu {
    private  static Scanner scanner = new Scanner(System.in);
    public static void displayFacilityMenu() {
        boolean check = true;
        // khởi tạo map list facility
        FacilityService facilityList = new FacilityServiceImpl();
        while (check) {
            System.out.println("\n----------Facility Menu----------");  //Quản lý cơ sở
            System.out.println("1.\tDisplay list facility");
            System.out.println("2.\tAdd new facility");
            System.out.println("3.\tDisplay list facility maintenance");  //bảo trì
            System.out.println("4.\tReturn main menu");
            System.out.print("input Facility Menu: ");

            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    facilityList.display();
                    break;
                case 2:
                    while (true) {
                        System.out.println("1.\tAdd New Villa");
                        System.out.println("2.\tAdd New Room");
                        System.out.println("3.\tBack to menu");
                        System.out.print("Input facility: ");
                        //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
                        int inputFacility = 0;
                        try {
                            inputFacility = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Input not Number, Please re-input!");
                            e.printStackTrace();
                        }
                        switch (inputFacility) {
                            case 1:
                                facilityList.addNewVilla();
                               break;
                            case 2:
                                facilityList.addNewRoom();
                                break;
                            case 3:
                                displayFacilityMenu();
                                return;
                            default:
                                System.out.println("Please Re-input!!!");
                        }
                    }
                case 3:
                    facilityList.displayMaintenance();
                    break;
                case 4:
                    MainMenu.mainMenu();
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
