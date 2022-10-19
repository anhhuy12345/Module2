package Case_Study.Controller;


import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
           new DisplayMainMenu();
            choice = scanner.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("please enter again menu 1:");
                continue;
            }

            switch (choice) {
                case 1:
                    new EmployeeController().employee();
                    break;
                case 2:
                    new ManagementController().management();
                    break;
                case 3:
                    new FacilityController().facility();
                    break;
                case 4:
                    new BookingController().book();
                    break;
                case 5:
                    new PromotionController().promotion();
                    break;
                case 6:
                    System.out.println(" See You again!!");
                    return;
                default:
                    System.out.println("please enter again 1-6");

            }
        } while (true);


    }
}


