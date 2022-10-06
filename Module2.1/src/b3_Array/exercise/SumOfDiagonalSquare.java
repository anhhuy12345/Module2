//Viết một ứng dụng cho phép người dùng nhập vào một ma trận vuông của các số thực
//sau đó tính ra cho người dùng tổng của các số ở đường chéo chính
//Ma trận vuông là một ma trận có chiều cao và chiều rộng bằng nhau.
//Đường chéo chính là tập hợp các phần tử được định vị bằng tọa độ [i][i].
package b3_Array.exercise;

import java.util.Scanner;

public class SumOfDiagonalSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //nhập chiều dài ma trận
        int row, col;
        do {
            System.out.print("Input row: ");
            row = scanner.nextInt();
            System.out.print("Input column: ");
            col = scanner.nextInt();
        } while (row != col);
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
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println("");
        }
        //Tính tổng đường chéo
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][i];
        }
     //   int total1 = 0;
    //    for (int i = 0; i < arr.length - 1; i--) {
   //         total1 -= arr[i-1][i-1];
     //   }

        System.out.print("\nTotal maindiagonal in array: " + total);
    }
}

