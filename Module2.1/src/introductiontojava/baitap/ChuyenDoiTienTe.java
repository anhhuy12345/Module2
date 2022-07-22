package introductiontojava.baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = scanner.nextDouble();
        double amount = usd * vnd;
        System.out.println(usd + " usd = "+amount+ " vnd");
    }
}
