package Quest;

import Extend_Exercise.Util.Regex;

import java.util.Scanner;

public class RegexTest {
    private static Scanner scanner = new Scanner(System.in);

    public static String regexID(String temp, String regex) throws IdException {

        if (temp.matches(regex)) {
            return temp;
        }
        throw new IdException();
    }

    public static void main(String[] args) {
        final String REGEX = "^(C)[0-9]{4}(G1)$";
        System.out.print("input ID : ");


        do {
            String ID = scanner.nextLine();
            try {
                ID = RegexTest.regexID(ID, REGEX);
                System.out.println("ID của lớp là: "+ ID);
                break;
            } catch (IdException idException) {
                idException.printStackTrace();

            }
        } while (true);

    }
}
