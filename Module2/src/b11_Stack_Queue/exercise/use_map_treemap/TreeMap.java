//Chương trình đếm các lần xuất hiện của từ trong một văn bản
// và hiển thị các từ và sự xuất hiện của chúng theo thứ tự
// trong bảng chữ cái của các từ.

package b11_Stack_Queue.exercise.use_map_treemap;


import sun.security.mscapi.CKeyPairGenerator;

import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new java.util.TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input String: ");
        String input = scanner.nextLine();
        String inputLowerCase = input.toLowerCase();
        String[] stringArray = inputLowerCase.split("");
        for (int i = 0; i < stringArray.length; i++) {
            if (stringIntegerMap.containsKey(stringArray[i])) {
                //cộng giá trị value thêm 1
                stringIntegerMap.put(stringArray[i], stringIntegerMap.get(stringArray[i]) + 1);
            } else {
                stringIntegerMap.put(stringArray[i],1);
            }
        }
        //xuất kết quả
        for (String key : stringIntegerMap.keySet()
        ) {
            System.out.print(key + ": ");
            System.out.println(stringIntegerMap.get(key));
        }
    }
}


