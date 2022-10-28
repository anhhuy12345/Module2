package b3_Array.exercise;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5, 7, 4, 6, 9, 8, 3, 2};
        // xuất mảng
        System.out.print("element in array:");
        for (int n : arr) {
            System.out.print("  " + n);
        }
        // nhập phần tử muốn xoá
        int index_del = -1;
        System.out.print("\nEnter the element you want to delete: ");
        int deleteNumber = scanner.nextInt();

        //đếm trong mảng có bao nhiêu phần từ cần xoá
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleteNumber) {
                count++;
            }
        }

        //khai báo mảng mới có độ dài giảm đi
        int[] newArray = new int[arr.length - count];

        //làm lại mảng mới, không chứa phần tử cần xoá
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (arr[i] != deleteNumber) {
                newArray[j] = arr[i];
            } else {
                j--;
            }
        }

        //Xuất mảng mới
        System.out.print("element in array after delete element:");
        for (int n : newArray
        ) {
            System.out.print("  " + n);
        }
    }
}
