package finalmodule2.service;


import finalmodule2.until.ReadAndWrite1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyDienThoaiService {
    static Scanner scanner = new Scanner(System.in);
    static int count = 0;
    public static List<DienThoaiXachTay> dienThoaiXachTayList = new ArrayList<>();
    public static List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();

    public static DienThoaiXachTay getDienThoaiXachTay() {
        String id = String.valueOf(++count);
        System.out.println("Nhap tenDienThoai");



        System.out.println("Nhap tên điện thoại");
        String tenDienThoai = scanner.nextLine();
        System.out.println("Nhap giá bán");
        String giaBan = scanner.nextLine();
        System.out.println("nhập số lượng");
        String soLuong = scanner.nextLine();
        System.out.println("Nhập nhà sản xuất");
        String nhaSanXuat = scanner.nextLine();
        return new DienThoaiXachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);


    }

    public void displayDienThoaiXachTay() {
        List<DienThoaiXachTay> dienThoaiXachTayList = ReadAndWrite1.readDienThoaiXachTay();
        for (DienThoaiXachTay o : dienThoaiXachTayList) {
            System.out.println(o.toString());
        }
    }

    public void addNewDienThoaiXachTay() {

        DienThoaiXachTay dienThoaiXachTay = getDienThoaiXachTay();
        dienThoaiXachTayList.add(dienThoaiXachTay);
        ReadAndWrite1.writeDienThoaiXachTay(dienThoaiXachTayList, true);

    }

    public static List<DienThoaiXachTay> xoaDienThoaiXachTay() {
        List<DienThoaiXachTay> dienThoaiXachTayList = ReadAndWrite1.readDienThoaiXachTay();

        System.out.println("Nhap ten dien thoai ");

        String tenDienThoai1 = scanner.nextLine();

        for (int i = 0; i < dienThoaiXachTayList.size(); i++) {
            if ((dienThoaiXachTayList.get(i).getTenDienThoai().contains(tenDienThoai1))) {
                dienThoaiXachTayList.remove(dienThoaiXachTayList.get(i));
                ReadAndWrite1.writeDienThoaiXachTay(dienThoaiXachTayList, false);
            }
        }
        return dienThoaiXachTayList;

    }

    public static DienThoaiChinhHang getDienThoaiChinhHang() {
        String id = String.valueOf(count++);




        System.out.println("Nhap tên điện thoại");
        String tenDienThoai = scanner.nextLine();
        System.out.println("Nhap giá bán");
        String giaBan = scanner.nextLine();
        System.out.println("nhập số lượng");
        String soLuong = scanner.nextLine();
        System.out.println("Nhập nhà sản xuất");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Thời Gian Bảo Hàng");
        String thoiGianBaoHanh = scanner.nextLine();
        System.out.println("Phạm Vi Bảo Hành");
        String phamVi = scanner.nextLine();

        return new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh,phamVi);

    }

    public void displayDienThoaiChinhHang() {
        List<DienThoaiChinhHang> dienThoaiChinhHangList = ReadAndWrite1.readDienThoaiChinhHang();
        for (DienThoaiChinhHang o : dienThoaiChinhHangList) {
            System.out.println(o.toString());
        }
    }

    public void addNewDienThoaiChinhHang() {
        DienThoaiChinhHang dienThoaiChinhHang = getDienThoaiChinhHang();
        dienThoaiChinhHangList.add(dienThoaiChinhHang);
        ReadAndWrite1.writeDienThoaiChinhHang(dienThoaiChinhHangList, true);
    }

    public static List<DienThoaiChinhHang> xoaDienThoaiChinhHang() {

        List<DienThoaiChinhHang> dienThoaiChinhHangList = ReadAndWrite1.readDienThoaiChinhHang();

        System.out.println("Nhap ten dien thoai");

        String tenDienThoai2 = scanner.nextLine();

        for (int i = 0; i < dienThoaiChinhHangList.size(); i++) {
            if ((dienThoaiChinhHangList.get(i).getTenDienThoai().contains(tenDienThoai2))) {
                dienThoaiChinhHangList.remove(dienThoaiChinhHangList.get(i));
                ReadAndWrite1.writeDienThoaiChinhHang(dienThoaiChinhHangList, false);
            }
        }
        return dienThoaiChinhHangList;
    }
}
