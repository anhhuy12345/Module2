package Extend_Exercise.Util;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);

    //phương thức chuyển hoá dữ liệu gồm:
    // - chuỗi người dùng nhập vào
    // - chuỗi regex để chuẩn hoá dữ liệu
    // - tin nhắn lỗi khi người dùng nhập sai chuẩn hoá
    public static String regexCar(String temp, String regex, String error) {
        boolean check = true;
        // nếu người dùng nhập sai thì phải nhập lại
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.err.println(error);
                //cho người dùng nhập lại
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }
}
