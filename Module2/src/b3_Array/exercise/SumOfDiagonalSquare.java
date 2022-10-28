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
//        for (int i = 0; i < arr.length; i++) {
//            total += arr[i][i
//            ];
//        }
        int total1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++){
                if (i == j) {
                    total += arr[i][i];
                }
                if (j == arr[i].length - 1) {
                    total1 += arr[i][arr.length - 1 - i];
                }
            }
        }
        //tính đường chéo còn lại theo kiểu rườm rà hơn
//        int total1 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            total1 += arr[i][arr.length - 1 - i];
//        }
        System.out.print("\nTotal maindiagonal in array: " + total + " and " + total1);
    }
}
//Cách 2:
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[][] arr;
//        int size;
//        do {
//            System.out.println("nhap kich thuoc cua ma tran vuong(<20): ");
//            size = scanner.nextInt();
//            if (size > 20) {
//                System.out.println("Vui long nhap lai");
//            }
//        } while (size > 20);
//        arr = new int[size][size];
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print("phan tu thu [" + i + "]" + "[" + j + "] :");
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        int totalDiagonal1 = 0;
//        int totalDiagonal2 = 0;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                if (i == j) {
//                    totalDiagonal1 += arr[i][j];
//                }
//                if (j == size - i - 1) {
//                    totalDiagonal2 += arr[i][j];
//                }
//            }
//        }
//        System.out.println("Tong duong cheo chinh cua ma tran la: " + totalDiagonal1 + " and " + totalDiagonal2 );
//    }
//}



