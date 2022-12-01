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
        final String REGEX ="^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        System.out.print("input Class : ");
        String Class  = Regex.regexClass(scanner.nextLine(), REGEX, "PLEASE RE-INPUT!");
        System.out.println(Class);

    }
}
