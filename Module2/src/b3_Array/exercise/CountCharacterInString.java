package b3_Array.exercise;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai báo một chuỗi và gán cho nó một giá trị
        System.out.print("enter string: ");
        String string = scanner.nextLine();

        // xuất chuỗi
        System.out.print("String: " + string);

        //nhập và đếm số ký tự đó trong chuỗi
        System.out.print("\nEnter the character: ");
        int count = 0;
        char character = scanner.nextLine().charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if (character == string.charAt(i)) {
                count++;
            }
        }
        System.out.print("Total character in string: " + count);
    }
    //cách đếm ký tự cố định
//public static void main(String[] args) {
//    String chuoi;
//    char kyTu = 'a';
//    int count = 0;
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Nhập vào chuỗi bất kỳ: ");
//    chuoi = scanner.nextLine();
//
//    // duyệt từ đầu đến cuối chuỗi
//    for (int i = 0; i < chuoi.length(); i++) {
//        // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
//        if (chuoi.charAt(i) == kyTu) {
//            count++;
//        }
//    }
//
//    System.out.println("Số lần xuất hiện của ký tự " + kyTu +
//            " trong chuỗi " + chuoi + " = " + count);
//}
}
