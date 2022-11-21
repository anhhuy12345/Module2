package Extend_Exercise_Two.Util;

import java.util.Scanner;

public class Regex {
    private static Scanner scanner = new Scanner(System.in);

    public static String regexID(String temp, String regex, String error) {
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
