package xamfinalmodule.service;

import xamfinalmodule.models.BenhNhanThuong;
import xamfinalmodule.models.BenhNhanVip;
import xamfinalmodule.utils.ReadAndWrite;
import xamfinalmodule.utils.Regex;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyBenhAnService {
    static Scanner scanner = new Scanner(System.in);
    static int count = 0;
    public static List<BenhNhanThuong> benhNhanThuongList = new ArrayList<>();
    public static List<BenhNhanVip> benhNhanVipList = new ArrayList<>();

    public static BenhNhanThuong getBenhNhanThuong() {
        String id = String.valueOf(++count);



        System.out.println("Nhap ma benh an");
        String maBenhAn = scanner.nextLine();
//        while (!Regex.idBenhAnValidate(maBenhAn)){
//            System.out.println("Sai định dạng với định dạng là BA-XXX");
//            maBenhAn=scanner.nextLine();
//        }
//        Regex.idBenhAnValidate(maBenhAn);



        System.out.println("Nhap ten Benh Nhân");
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Ngay ra viện");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Ngay Nhập viện");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Lý do");
        String liDo = scanner.nextLine();
        System.out.println("Phí nằm viện");
        String phiNamVien = scanner.nextLine();
        return new BenhNhanThuong(id, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo, phiNamVien);


    }

    public void displayBenhNhanThuong() {
        List<BenhNhanThuong> benhNhanThuongList = ReadAndWrite.readBenhNhanThuong();
        for (BenhNhanThuong o : benhNhanThuongList) {
            System.out.println(o.toString());
        }
    }

    public void addNewBenhNhan() {

        BenhNhanThuong benhNhanThuong = getBenhNhanThuong();
        benhNhanThuongList.add(benhNhanThuong);
        ReadAndWrite.writeBenhNhanThuong(benhNhanThuongList, true);

    }

    public static List<BenhNhanThuong> xoaBenhNhanThuong() {
        List<BenhNhanThuong> benhNhanThuongList = ReadAndWrite.readBenhNhanThuong();

        System.out.println("Nhap ma benh an ");

        String maBenh = scanner.nextLine();

        for (int i = 0; i < benhNhanThuongList.size(); i++) {
            if ((benhNhanThuongList.get(i).getMaBenhAn().contains(maBenh))) {
                benhNhanThuongList.remove(benhNhanThuongList.get(i));
                ReadAndWrite.writeBenhNhanThuong(benhNhanThuongList, false);
            }
        }
        return benhNhanThuongList;

    }

    public static BenhNhanVip getBenhNhanVip() {
        String id = String.valueOf(count++);
        System.out.println("Nhap ma benh an");


        String maBenhAn = scanner.nextLine();
        System.out.println("Nhap ten Benh Nhân");

//        while (!Regex.idBenhAnValidate(maBenhAn)){
//            System.out.println("Sai định dạng với định dạng là BA-XXX");
//            maBenhAn=scanner.nextLine();
//        }
//        Regex.idBenhAnValidate(maBenhAn);
        String tenBenhNhan = scanner.nextLine();
        System.out.println("Ngay ra viện");
        String ngayRaVien = scanner.nextLine();
        System.out.println("Ngay Nhập viện");
        String ngayNhapVien = scanner.nextLine();
        System.out.println("Lý do");
        String liDo = scanner.nextLine();
        System.out.println("Loai Vip");
        String loaiVip = scanner.nextLine();
        System.out.println("Thời hạn vip");
        String thoiHan = scanner.nextLine();

        return new BenhNhanVip(id, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo, loaiVip, thoiHan);

    }

    public void displayBenhNhanVip() {
        List<BenhNhanVip> benhNhanVipList = ReadAndWrite.readBenhNhanVip();
        for (BenhNhanVip o : benhNhanVipList) {
            System.out.println(o.toString());
        }
    }

    public void addNewBenhVip() {
        BenhNhanVip benhNhanVip = getBenhNhanVip();
        benhNhanVipList.add(benhNhanVip);
        ReadAndWrite.writeBenhNhanVip(benhNhanVipList, true);
    }

    public static List<BenhNhanVip> xoaBenhNhanVip() {

        List<BenhNhanVip> benhNhanVipList = ReadAndWrite.readBenhNhanVip();

        System.out.println("Nhap ma benh an ");

        String maBenh = scanner.nextLine();

        for (int i = 0; i < benhNhanVipList.size(); i++) {
            if ((benhNhanVipList.get(i).getMaBenhAn().contains(maBenh))) {
                benhNhanVipList.remove(benhNhanVipList.get(i));
                ReadAndWrite.writeBenhNhanVip(benhNhanVipList, false);
            }
        }
        return benhNhanVipList;


//        List<BenhNhanVip> benhNhanVipList = ReadAndWrite.readBenhNhanVip();
//
//        System.out.println("Nhap ma benh an ");
//        String maBenh = scanner.nextLine();
//        for (int i = 0; i < benhNhanVipList.size(); i++) {
//            if ((benhNhanVipList.get(i).getMaBenhAn().contains(maBenh))) {
//
//                benhNhanVipList.remove(benhNhanThuongList.get(i));
//                ReadAndWrite.writeBenhNhanVip(benhNhanVipList, false);
//            }
//        }
//        return benhNhanVipList;
//
//    }
    }

}
