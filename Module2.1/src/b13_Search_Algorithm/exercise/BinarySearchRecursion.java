package b13_Search_Algorithm.exercise;


import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursion {
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, left, mid - 1, target);
        }
        if (target > arr[mid]) {
            return binarySearch(arr, mid + 1, right, target);
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter Array:");
        int[] arr = new int[10] ;
        int size=-1;
        do {
            System.out.print("enter the number (<10) of element into the array: ");
            size=scanner.nextInt();
        }while (size>10);
        // nhập phần từ vào mảng
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        //xuất mảng cho trước
        System.out.println("Element in array");
        for (int n : arr
        ) {
            System.out.print("  " + n);
        }
        int target = 9;

        int left = 0;
        int right = arr.length - 1;

        int index = binarySearch(arr, left, right, target);
        if (index != -1) {
            System.out.println("\n"+"Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

}
