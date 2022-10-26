package b16_IO_Text_File.practice.number_max;

import java.util.List;
import java.util.Scanner;

public class TestFileFindMax {
    public static void main(String[] args) {
        System.out.print("Enter the path: ");
        Scanner scanner = new Scanner(System.in);
        // đường dẫn E:\Codegym\Module2.1\src\b16_IO_Text_File\practice\number_max\numbermax.txt
        String path = scanner.nextLine();
        ReadAndWriteFile writeFile = new ReadAndWriteFile();
        //nhập data và list và vào file
        List<Integer> listFindMax = writeFile.writeToFile(path);
        //tìm số lớn nhất trong list
        int max = FindMaxValue.findMax(listFindMax);
        // ghi thêm dòng max của file
        writeFile.writeMaxToFile(path, max);
        System.out.println("List number write success");
        System.out.println("Result in file: ");
        // đọc file
        writeFile.readFromFile(path);
    }
}
