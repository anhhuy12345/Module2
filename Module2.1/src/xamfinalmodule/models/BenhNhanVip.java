package xamfinalmodule.models;

public  class BenhNhanVip extends BenhNhan {
    public String loaiVip;
    public String thoiHan;

    public BenhNhanVip() {

    }

    public BenhNhanVip(String id, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDo, String loaiVip, String thoiHan) {
        super(id, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo);
        this.loaiVip = loaiVip;
        this.thoiHan = thoiHan;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }

    @Override
    public String toString() {
        return super.toString()+
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHan='" + thoiHan + '\'' +
                '}';
    }
    public String getToCV(){
        return this.id+","+this.maBenhAn+","+this.tenBenhNhan+","+this.ngayNhapVien+","+this.ngayRaVien+","+this.liDo+","
                +this.loaiVip+","+this.thoiHan;
    }
}
