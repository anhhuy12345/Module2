package b16_IO_Text_File.exercise.read_file_csv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestReadWriteFileCSV {
    public static void main(String[] args) {
        System.out.print("Enter the path: ");
        Scanner scanner = new Scanner(System.in);
        // đường dẫn E:\Codegym\Module2.1\src\b16_IO_Text_File\exercise\read_file_csv\ tên file.CSV
        String path = scanner.nextLine();
        ReadAndWriteFileCSV readAndWriteFileCSV = new ReadAndWriteFileCSV();
        List<Nation> nationList = new ArrayList<>();
        nationList.add(new Nation(1,"AU","Australia"));
        nationList.add(new Nation(2,"CN","China"));
        nationList.add(new Nation(3,"AU","Australia"));
        nationList.add(new Nation(5,"JP","Japan"));
        nationList.add(new Nation(6,"CN","China"));
        nationList.add(new Nation(7,"JP","Japan"));
        nationList.add(new Nation(8,"TH","Thailand"));

        //ghi file
        readAndWriteFileCSV.writeListNation(path, nationList);
        System.out.println("Ghi file thành công!");
        //đọc file
        readAndWriteFileCSV.readListNation(path);

    }
}
