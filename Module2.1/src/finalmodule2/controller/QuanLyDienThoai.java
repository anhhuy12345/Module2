package finalmodule2.controller;



import finalmodule2.service.QuanLyDienThoaiService;

import java.util.Scanner;

public class QuanLyDienThoai {
    private  static QuanLyDienThoaiService quanLyDienThoaiService= new QuanLyDienThoaiService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        String input;
        String chon;
        do {
            System.out.println("1.Thêm mới");
            System.out.println("2. Xóa ");
            System.out.println("3.Xem danh sách Điện thoại");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Thoát");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Thêm mới");
                    System.out.println("Chọn 1:Điện thoại chính hãng");
                    System.out.println("Chọn 2: Điện thoại xách tay");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            quanLyDienThoaiService.addNewDienThoaiChinhHang();


                            break;
                        case "2":
                            quanLyDienThoaiService.addNewDienThoaiXachTay();

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Xóa");
                    System.out.println("Chọn 1: Xóa điện thoại xách tay");
                    System.out.println("Chọn 2: Xóa điện thoại chính hãng");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1": {
                            System.out.println("chọn yes or no ");
                            chon = scanner.nextLine();
                            switch (chon) {
                                case "yes":
                                    quanLyDienThoaiService.xoaDienThoaiXachTay();


                                    break;


                                case "no":
                                    quanLyDienThoaiService.displayDienThoaiXachTay();


                                    break;
                            }
                            break;
                        }
                        case "2":
                            System.out.println("chọn yes or no ");
                            chon = scanner.nextLine();
                            switch (chon) {
                                case "yes":
                                    quanLyDienThoaiService.xoaDienThoaiChinhHang();

                                    break;

                                case "no":
                                    quanLyDienThoaiService.displayDienThoaiChinhHang();


                                    break;

                            }
                            break;
                    }

                    break;
                case 3:
                    System.out.println("xem");
                    System.out.println("Chọn 1:xem điện thoại xách tay");
                    System.out.println("Chọn 2: xem điện thoại chính hãng");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            quanLyDienThoaiService.displayDienThoaiXachTay();

                            break;

                        case "2":
                            quanLyDienThoaiService.displayDienThoaiChinhHang();

                            break;
                    }
                    break;
                case 5:
                    return;

                default:
                    System.out.println("chọn sai");
                    break;

            }

        }
        while (choose != 5);


    }
}
