package b14_Sort_Algorithm.exercise;

import java.util.Arrays;

//Minh hoạ thuật toán sắp xếp chèn
public class InsertionSort {
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

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        insertionSort(list);
    }
}
