package finalmodule2.service;

import finalmodule2.model.DienThoai;

import java.util.Scanner;

public class DienThoaiXachTay extends DienThoai {
    public String quocGiaXachTay;
    public String trangThai;

    public DienThoaiXachTay(String id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat) {

    }

    public DienThoaiXachTay(String id, String tenDienThoai,  String giaBan, String soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenDienThoai, giaBan,soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }




    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return super.toString() +
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                "trangThai='" + trangThai + '\'' +
                '}';
    }
    public String getToCV(){
        return this.id+","+this.tenDienThoai+","+this.giaBan+","+this.soLuong+","+this.nhaSanXuat;
    }
}


