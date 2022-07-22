package xamfinalmodule.controller;

import xamfinalmodule.service.QuanLyBenhAnService;

import java.util.Scanner;

public class QuanLyBenhAn {
private  static QuanLyBenhAnService quanLyBenhAnService= new QuanLyBenhAnService();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        String input;
        String chon;
        do {
            System.out.println("1.Thêm mới");
            System.out.println("2. Xóa ");
            System.out.println("3.Xem danh sách bệnh án");
            System.out.println("4.Thoát");

            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Thêm mới");
                    System.out.println("Chọn 1:Thêm mới bệnh nhân thường");
                    System.out.println("Chọn 2: Thêm Mới bệnh nhân vip");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            quanLyBenhAnService.addNewBenhNhan();


                            break;
                        case "2":
                            quanLyBenhAnService.addNewBenhVip();

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Xóa");
                    System.out.println("Chọn 1: Xóa bệnh nhân thường");
                    System.out.println("Chọn 2: Xóa bệnh nhân vip");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1": {
                            System.out.println("chọn yes or no ");
                            chon = scanner.nextLine();
                            switch (chon) {
                                case "yes":
                                    quanLyBenhAnService.xoaBenhNhanThuong();


                                    break;


                                case "no":
                                    quanLyBenhAnService.displayBenhNhanThuong();


                                    break;
                            }
                            break;
                        }
                        case "2":
                            System.out.println("chọn yes or no ");
                            chon = scanner.nextLine();
                            switch (chon) {
                                case "yes":
                                    quanLyBenhAnService.xoaBenhNhanVip();
//

                                    break;

                                case "no":
                                    quanLyBenhAnService.displayBenhNhanVip();


                                    break;

                            }
                            break;
                    }

                    break;
                case 3:
                    System.out.println("xem");
                    System.out.println("Chọn 1:xem bênh nhân thường");
                    System.out.println("Chọn 2: xem bệnh nhân vip");
                    input = scanner.nextLine();
                    switch (input) {
                        case "1":
                            quanLyBenhAnService.displayBenhNhanThuong();

                            break;

                        case "2":
                            quanLyBenhAnService.displayBenhNhanVip();

                            break;
                    }
                    break;
                case 4:
                    return;

                default:
                    System.out.println("chọn sai");
                    break;

            }

        }
        while (choose != 4);


    }
}
