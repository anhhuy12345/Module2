package Exam1;

import java.util.Scanner;

public class KiemTraSoChinhPhuong {
    public static void main(String[] args) {
        int i =0;
        int num = 0;
        String sptrString = "";
        for ( i = 2; i < 100; i++) {
            for (num = 2; num < 100; num++) {
                if (i == num * num) {
                    sptrString = sptrString + i + " ";
                }
            }
        }
        System.out.println(" So Chinh phuong La");
        System.out.println(sptrString);
    }
}
