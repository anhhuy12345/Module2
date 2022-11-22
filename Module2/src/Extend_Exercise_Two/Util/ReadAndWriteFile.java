package Extend_Exercise_Two.Util;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ReadAndWriteFile<T> {
    public void writeToFile(Collection<T> collection, String path, String inputHeader) {
        this.writeToFile(collection, path, inputHeader, false);
    }


    public void writeToFile(Collection<T> collection, String path, String inputHeader, boolean append) {
        File file = new File(path);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {

            writer.write(inputHeader);


            for (T element : collection) {

                writer.newLine();


                writer.write(element.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //đọc file
    public List<String> readFromFile(String path) {
        File file = new File(path);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;

            line = reader.readLine();
            while ((line = reader.readLine()) != null) {

                list.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
