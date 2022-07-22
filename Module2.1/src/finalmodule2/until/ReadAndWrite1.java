package finalmodule2.until;

import finalmodule2.service.DienThoaiChinhHang;
import finalmodule2.service.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite1 {
        final static String DIENTHOAI_XACHTAY = "E:\\bai_tap_codegym\\module2\\src\\finalmodule2\\data\\dienthoaixachtay.csv";
        final static String DIENTHOAI_CHINHHANG = "E:\\bai_tap_codegym\\module2\\src\\finalmodule2\\data\\dienthoaichinhhang.csv";

        public static void writeDienThoaiXachTay(List<DienThoaiXachTay> dienThoaiXachTayList, boolean append) {
            File file = new File(DIENTHOAI_XACHTAY);

            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file, append);
                bufferedWriter = new BufferedWriter(fileWriter);
                for (DienThoaiXachTay o : dienThoaiXachTayList) {
                    bufferedWriter.write(o.getToCV());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                e.getStackTrace();
            }

        }

        public static void writeDienThoaiChinhHang(List<DienThoaiChinhHang> dienThoaiChinhHangList, boolean append) {
            File file = new File(DIENTHOAI_CHINHHANG );

            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file, append);
                bufferedWriter = new BufferedWriter(fileWriter);
                for (DienThoaiChinhHang o : dienThoaiChinhHangList) {
                    bufferedWriter.write(o.getToCV());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                fileWriter.close();

            } catch (IOException e) {
                e.getStackTrace();
            }


        }

        public static List<DienThoaiXachTay> readDienThoaiXachTay() {
            List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();

            File file = new File(DIENTHOAI_XACHTAY);
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);

                String line = null;
                String[] array = null;
                while ((line = bufferedReader.readLine()) != null) {
                    array = line.split(",");
                    DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
                    dienThoaiXachTayList.add(dienThoaiXachTay);

                }
                bufferedReader.close();
                fileReader.close();


            } catch (IOException e) {
                e.getStackTrace();
            }
            return dienThoaiXachTayList;
        }

        public static List<DienThoaiChinhHang> readDienThoaiChinhHang() {
            List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
            File file = new File(DIENTHOAI_CHINHHANG);
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);

                String line = null;
                String[] array = null;
                while ((line = bufferedReader.readLine()) != null) {
                    array = line.split(",");
                    DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
                    dienThoaiChinhHangList.add(dienThoaiChinhHang);
                }
                bufferedReader.close();
                fileReader.close();


            } catch (IOException e) {
                e.getStackTrace();
            }
            return dienThoaiChinhHangList;

        }
}
