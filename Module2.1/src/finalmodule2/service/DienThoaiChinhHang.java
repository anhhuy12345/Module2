package finalmodule2.service;

import finalmodule2.model.DienThoai;

public class DienThoaiChinhHang extends DienThoai {
    public String thoiGianBaoHanh;
    public String phamViBaoHanh;

    public DienThoaiChinhHang(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7) {

    }

    public DienThoaiChinhHang(String id, String tenDienThoai, String giaBan, String soLuong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(String thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                "phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
    public String getToCV(){
        return this.id+","+this.tenDienThoai+","+this.giaBan+","+this.soLuong+","+this.nhaSanXuat;
    }
}
