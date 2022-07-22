package xamfinalmodule.utils;

import xamfinalmodule.models.BenhNhanThuong;
import xamfinalmodule.models.BenhNhanVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    final static String BENHNHAN_THUONG = "E:\\bai_tap_codegym\\module2\\src\\xamfinalmodule\\data\\benhnhanthuong.csv";
    final static String BENHNHAN_VIP = "E:\\bai_tap_codegym\\module2\\src\\xamfinalmodule\\data\\benhnhanvip.csv";

    public static void writeBenhNhanThuong(List<BenhNhanThuong> benhNhanThuongList, boolean append) {
        File file = new File(BENHNHAN_THUONG);

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhNhanThuong o : benhNhanThuongList) {
                bufferedWriter.write(o.getToCV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.getStackTrace();
        }

    }

    public static void writeBenhNhanVip(List<BenhNhanVip> benhNhanVipList, boolean append) {
        File file = new File(BENHNHAN_VIP);

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (BenhNhanVip o : benhNhanVipList) {
                bufferedWriter.write(o.getToCV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.getStackTrace();
        }


    }

    public static List<BenhNhanThuong> readBenhNhanThuong() {
        List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();

        File file = new File(BENHNHAN_THUONG);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                BenhNhanThuong benhNhanThuong = new BenhNhanThuong(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
                benhNhanThuongList.add(benhNhanThuong);

            }
            bufferedReader.close();
            fileReader.close();


        } catch (IOException e) {
            e.getStackTrace();
        }
        return benhNhanThuongList;
    }

    public static List<BenhNhanVip> readBenhNhanVip() {
        List<BenhNhanVip> benhNhanVipList = new ArrayList<>();
        File file = new File(BENHNHAN_VIP);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String[] array = null;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                BenhNhanVip benhNhanVip = new BenhNhanVip(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7]);
                benhNhanVipList.add(benhNhanVip);
            }
            bufferedReader.close();
            fileReader.close();


        } catch (IOException e) {
            e.getStackTrace();
        }
        return benhNhanVipList;

    }
}
