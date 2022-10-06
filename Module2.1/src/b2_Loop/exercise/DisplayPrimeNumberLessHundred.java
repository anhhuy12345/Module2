package b2_Loop.exercise;

public class DisplayPrimeNumberLessHundred {
    public static void main(String[] args) {
        int number = 3;
        System.out.print("Prime number less 100: 2  3");
        while (number < 100) {
            number++;
            boolean checkPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    checkPrime = false;
                }
            }
            if (checkPrime) {
                System.out.print("  " + number);
            }
        }
    }
}
