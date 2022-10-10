package b4_OOP.exercise.Stop_Watch_Exam.Stop_Watch_Use_Localtime;


import java.util.Arrays;

public class MainStopWatchLocalTime {
    public static void main(String[] args) {
        StopWatchLocalTime stopWatchLocalTime = new StopWatchLocalTime();
        stopWatchLocalTime.start1();
        System.out.print("Start time: " + stopWatchLocalTime.getStarTime1());
        //khởi tạo mảng 100000 phần từ
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 10000);
        }

        // xuất mảng ban đầu
        System.out.println("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }

        //sắp xếp lại mảng
        Arrays.sort(arr);

        //Xuất lại mảng sau khi sắp xếp
        System.out.println("\nnew arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }

        stopWatchLocalTime.end1();
        System.out.println("\nEndtime time: " + stopWatchLocalTime.getEndTime1());

        System.out.println("\nElapsed time: " + stopWatchLocalTime.getElapsetTime1());
    }
}
