package Quest;

import java.util.Scanner;

public class Regex {
    private static final Scanner scanner = new Scanner(System.in);

    public static String regexClass(String temp, String regex,String error){
        boolean check = true;
        do{
            if(temp.matches(regex)){
                check = false;
            } else {
                System.err.println(error);
                temp = scanner.nextLine();
            }
        }while (check);
        return temp;
    }
//"^[a-z A-Z]{1,50}$"
    public static void main(String[] args) {
        final String REGEX ="^(C)[0-9]{4}(G)[0-9]{1}$";
        System.out.print("input Class : ");
        String Class  = Regex.regexClass(scanner.nextLine(), REGEX, "PLEASE RE-INPUT!");
        System.out.println(Class);

    }
}
