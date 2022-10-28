package b13_Search_Algorithm.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = inputString.charAt(i);
            frequentChar[ascii] += 1;
        }
        System.out.println(Arrays.toString(frequentChar));
        int max = 0;
        char character = 0;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                character = (char) j;
                frequentChar[j] = -1;
            }
        }

        int max1 = 0;
        char character1 = 0;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max1) {
                max1 = frequentChar[i];
                character1 = (char) i;
            }
        }
        if (max == max1) {
            System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
            System.out.println("The most appearing letter is '" + character1 + "' with a frequency of " + max1 + " times");
        } else {
            System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
        }
    }
}

