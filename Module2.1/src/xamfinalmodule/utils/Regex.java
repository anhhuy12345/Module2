package xamfinalmodule.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
public static final String REGEX_ID_BENHAN="(BA)[-][0-9]{3}";
static Scanner scanner= new Scanner(System.in);

public static boolean idBenhAnValidate(String regex){
    return Pattern.matches(REGEX_ID_BENHAN,regex);
}
}
