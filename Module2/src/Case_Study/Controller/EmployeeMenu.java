package Case_Study.Controller;

import Case_Study.Service.EmployeeService;
import Case_Study.Service.Implement.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeMenu {
    private  static Scanner scanner = new Scanner(System.in);
    public static void displayEmployeeMenu() {
        //khởi tạo list employee
        EmployeeService employeeList = new EmployeeServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n----------Employee Menu----------");
            System.out.println("1.\tDisplay list employees");
            System.out.println("2.\tAdd new employee");
            System.out.println("3.\tDelete employee");
            System.out.println("4.\tEdit employee");
            System.out.println("5.\tReturn main menu");
            System.out.print("input Employee Menu: ");
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
                    employeeList.display();
                    break;
                case 2:
                    employeeList.addNew();
                    break;
                case 3:
                    employeeList.delete();
                    break;
                case 4:
                    employeeList.edit();
                    break;
                case 5:
                    MainMenu.mainMenu();
                    break;
                default:
                    System.out.println(" Wrong number.Please re-input!!!!");
                    break;
            }
        }
    }
}
