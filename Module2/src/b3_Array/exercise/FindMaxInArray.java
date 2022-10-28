package b3_Array.exercise;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập chiều dài của ma trận
        System.out.print("Input row: ");
        int row = scanner.nextInt();
        System.out.print("Input column: ");
        int col = scanner.nextInt();

        //Khai báo mảng 2 chiều
        int[][] arr = new int[row][col];
        //Nhập các phần tử mảng 2 chiều
        System.out.println("Enter the element into two dimensional array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the element [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        //Xuất mảng 2 chiều
        System.out.println("Two dimensional array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }

        //tìm số lớn nhất của mảng 2 chiều
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max element in array: " + max);
    }
}
