package b16_IO_Text_File.exercise.copy_file;

import java.util.Scanner;

public class TestCopyFile {
    public static void main(String[] args) {
        //Nhập nơi file cần copy
        System.out.print("Enter the path source: ");
        //  E:\Codegym\Module2.1\src\b16_IO_Text_File\practice\total_number_file\number.txt
        Scanner scanner = new Scanner(System.in);
        String pathSource = scanner.nextLine();
        //Nhập nơi file cần copy đến
        System.out.print("Enter the path target: ");
        //E:\Codegym\Module2.1\src\b16_IO_Text_File\exercise\copy_file\number.txt
        String pathTarget = scanner.nextLine();
        //khởi tạo copy file
        FileCopy fileCopy = new FileCopy();
        fileCopy.copyFile(pathSource, pathTarget);
        System.out.println("Copy file thành công!");
        //đọc file nguồn
        System.out.println("data file source");
        fileCopy.readFromFile(pathSource);
        //đọc file sau khi copy
        System.out.println("data file target");
        fileCopy.readFromFile(pathTarget);
    }
}
