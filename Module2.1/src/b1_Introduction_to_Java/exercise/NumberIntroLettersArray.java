//chuyển đổi số thành chừ theo cách array
//tạo 3 mảng tương ứng với hàng trăm, hàng chục và hàng đơn vị
//xét các số tương ứng trong từng mảng sau đó cộng lại
package b1_Introduction_to_Java.exercise;


import java.util.Scanner;

public class NumberIntroLettersArray {

    final static String[] ones = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
    final static String[] twos = {" ", " ", " TWENTY", " THIRTY", " FORTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
    private static void numberToWord(int num, String val) {
       System.out.print(num > 19 ? twos[num / 10] + " " + ones[num % 10] : ones[num]);
        System.out.print(num > 0 ? val : "");
    }
    public static void main(String[] args) {
        System.out.print("Input a number:");
        int num = new Scanner(System.in).nextInt();
        numberToWord(((num / 100) % 10), num % 100 != 0 ?" HUNDRED AND":" HUNDRED");
        numberToWord((num % 100), " ");
        if(num==0){
            System.out.println("ZERO");
        }
    }
}