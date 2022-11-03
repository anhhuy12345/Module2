package Case_Study.Controller;

import Case_Study.Service.Implement.BookingServiceImpl;
import Case_Study.Service.Service;

import java.util.Scanner;

public class BookingMenu {
    private  static Scanner scanner = new Scanner(System.in);
    public static void displayBookingMenu() {
        Service bookingList = new BookingServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("\n----------Booking Menu----------");
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tReturn main menu");
            System.out.print("input Booking Menu: ");

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
                    bookingList.addNew();
                    break;
                case 2:
                    bookingList.display();
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
