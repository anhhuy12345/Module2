package Case_Study.Controller;

import Case_Study.Service.CustomerService;
import Case_Study.Service.Implement.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayCustomerMenu() {
        boolean check = true;
        //khởi tạo list customer
        CustomerService customerList = new CustomerServiceImpl();
        while (check) {
            System.out.println("\n----------Customer Menu----------");
            System.out.println("1.\tDisplay list customers");
            System.out.println("2.\tAdd new customer");
            System.out.println("3.\tEdit customer");
            System.out.println("4.\tReturn main menu");
            System.out.print("input Customer Menu: ");

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
                    customerList.display();
                    break;
                case 2:
                    customerList.addNew();
                    break;
                case 3:
                    customerList.edit();
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
