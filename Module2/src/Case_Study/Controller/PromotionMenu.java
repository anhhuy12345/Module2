package Case_Study.Controller;

import Case_Study.Service.Implement.PromotionServiceImpl;
import Case_Study.Service.PromotionService;

import java.util.Scanner;

public class PromotionMenu {
    private  static Scanner scanner = new Scanner(System.in);
    public static void displayPromotionMenu() {
        PromotionService promotionService = new PromotionServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n----------Promotion Menu----------");
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");
            System.out.print("input Promotion Menu: ");

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
                    promotionService.displayCustomerListUseServiceInYear();
                    break;
                case 2:
                    promotionService.displayCustomerListGetVoucher();
                    break;
                case 3:
                    MainMenu.mainMenu();
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
