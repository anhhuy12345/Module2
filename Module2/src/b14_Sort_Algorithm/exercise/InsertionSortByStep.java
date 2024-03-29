package b14_Sort_Algorithm.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class InsertionSortByStep {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        //nhập các phần tử vào mảng
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
        }

        //xuất mảng
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] array) {
        int temp, indexTemp;
        for (int i = 1; i < array.length; i++) {
            //lấy ra giá trị xét vị trí để chèn vào
            temp = array[i];
            indexTemp = i;
            //dời vị trí để tìm kiếm nơi cần chèn vào
            while (indexTemp > 0 && temp < array[indexTemp-1]) {
                array[indexTemp] = array[indexTemp - 1];
                indexTemp-- ;
            }
            //gắn phần tử vào nơi thích hợp
            array[indexTemp] = temp;
        }

        //xuất mảng sau khi sort
        System.out.print("Array after insertion sort: ");
        Arrays.stream(array).forEach(element-> System.out.printf("%-4d", element));
    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Stack<Integer> integers = new Stack<>();
//        //nhập phần tử
//        System.out.print("input number element: ");
//        int number = scanner.nextInt();
//        for (int i = 0; i < number; i++) {
//            System.out.print("input element [" + i + "]: ");
//            int element = scanner.nextInt();
//            integers.push(element);
//        }
//        System.out.println("Mảng ban đầu: " + integers.toString());
////        for (int n : integers
////        ) {
////            System.out.print(n + " ");
////        }
//        integers.stream().sorted().forEach(n -> System.out.print(n != integers.lastElement() ? n + ", " : n));
//
//        }
}
