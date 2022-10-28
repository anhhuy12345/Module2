package b2_Loop.exercise;

public class FirstTwentyPrime {
    public static void main(String[] args) {
        int count = 2, number = 3;
        System.out.print("First 20 Primes: 2 3");
        while (count < 20) {
            number++;
            boolean checkPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    checkPrime = false;
                }
            }
            if (checkPrime) {
                System.out.print("  " + number);
                count++;
            }
        }
    }
}
