package b16_IO_Text_File.practice.total_number_file;

import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        System.out.print("Enter the path: ");
        // đường dẫn: E:\Codegym\Module2.1\src\b16_IO_Text_File\practice\total_number_file\number.txt
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample fileExample = new ReadFileExample();
        fileExample.writeToFile(path);
        System.out.println("List number write success");
        System.out.println("Sum number in file: ");
        fileExample.readFromFile(path);
    }
}
