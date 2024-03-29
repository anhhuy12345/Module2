/*Tính tổng các số ở một cột xác định
Viết một ứng dụng cho phép người dùng nhập vào một mảng hai chiều của các số thực,
sau đó cho phép người dùng nhập vào thứ tự của một cột (tính từ 0) và
tính ra tổng các phần tử của cột đó.
 */
package b3_Array.exercise;

import java.util.Scanner;

public class SumOfNumberInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập chiều dài của ma trận
        System.out.print("Input row: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Input column: ");
        int col = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng 2 chiều
        int[][] arr = new int[row][col];
        //Nhập các phần tử mảng 2 chiều
        System.out.println("Enter the element into two dimensional array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter the element [" + i + "][" + j + "]: ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //Xuất mảng 2 chiều
        System.out.println("Two dimensional array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
        //nhập cột muốn tính tổng
        System.out.print("\nEnter the column: ");
        int totalCol = Integer.parseInt(scanner.nextLine());
        // tính tổng cột xác đinh
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][totalCol];
        }
        System.out.println("total column " + totalCol + " = " + total);
    }
}
