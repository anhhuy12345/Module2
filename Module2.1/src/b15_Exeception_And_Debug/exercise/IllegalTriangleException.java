package b15_Exeception_And_Debug.exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

//Viết một ứng dụng nhập vào 3 cạnh của hình tam giác.
// Kiểm tra nếu giá trị nhập vào là số âm hoặc tổng 2 cạnh không lớn hơn cạnh còn lại thì sinh ngoại lệ.
public class IllegalTriangleException {
    public static void main(String[] args) throws ExceptionTriangle {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check the 3 sides of the triangle: ");
        System.out.println("Input side 1: ");
        int sideOne = scanner.nextInt();
        System.out.println("Input side 2: ");
        int sideTwo = scanner.nextInt();
        System.out.println("Input side 3: ");
        int sideThree = scanner.nextInt();
//        try {
//            checkTriangle(sideOne, sideTwo, sideThree);
//            System.out.println("3 side of triangle: " + sideOne + " " + sideTwo + " " + sideThree);
//
//        } catch (ExceptionTriangle e) {
//            e.printStackTrace();
//        }
//        System.out.println("3 side of triangle: " + sideOne + " " + sideTwo + " " + sideThree);

        //cách không sử dụng try catch
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        illegalTriangleException.checkTriangle(sideOne, sideTwo, sideThree);
        System.out.print("3 cạnh của tam giác là " + sideOne + ", " + sideTwo + ", " + sideThree);


    }

    public static void checkTriangle(int sideOne, int sideTwo, int sideThree) throws ExceptionTriangle {
        if ((sideOne + sideTwo) > sideThree && (sideOne + sideThree) > sideTwo && (sideThree + sideTwo) > sideOne) {
            return;
        }
        throw new ExceptionTriangle("Triangle not exist!!!");
    }


}