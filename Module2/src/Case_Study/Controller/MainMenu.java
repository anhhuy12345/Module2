package Case_Study.Controller;

import java.util.Scanner;

public class MainMenu {
    private  static  Scanner scanner = new Scanner(System.in);
    public static void mainMenu() {
        boolean check = true;
        //check để xem người nhập có nhập những số trong menu hay không
        while (check) {
            System.out.println("\n----------Main Menu----------");
            System.out.println("1\tEmployee Management");
            System.out.println("2\tCustomer Management");
            System.out.println("3\tFacility Management ");
            System.out.println("4\tBooking Management");
            System.out.println("5\tPromotion Management");
            System.out.println("6\tExit");
            System.out.print("input Menu: ");

            //cho choice bằng 0 vì nó không nằm từ 1->6 và chương trình chạy bình thường
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input not Number, Please re-input!");
                e.printStackTrace();
            }

            //xem chọn vào menu nào
            switch (choice) {
                case 1:
                    EmployeeMenu.displayEmployeeMenu();
                    break;
                case 2:
                    CustomerMenu.displayCustomerMenu();
                    break;
                case 3:
                    FacilityMenu.displayFacilityMenu();
                    break;
                case 4:
                    BookingMenu.displayBookingMenu();
                    break;
                case 5:
                    PromotionMenu.displayPromotionMenu();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
