package xamfinalmodule.models;

public class BenhNhanThuong extends BenhNhan {
    public String phiNamVien;

    public BenhNhanThuong() {

    }

    public BenhNhanThuong(String id, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDo, String phiNamVien) {
        super(id, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo);
        this.phiNamVien = phiNamVien;
    }

//    public BenhNhanThuong(String id, String maBenhAn, String tenBenhNhan, String ngayNhapVien, String ngayRaVien, String liDo) {
//        super(id, maBenhAn, tenBenhNhan, ngayNhapVien, ngayRaVien, liDo);
//        this.phiNamVien = phiNamVien;
//    }



    public String getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(String phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return super.toString() +
                "phiNamVien='" + phiNamVien + '\'' +
                '}';
    }
    public String getToCV(){
return this.id+","+this.maBenhAn+","+this.tenBenhNhan+","+this.ngayNhapVien+","+this.ngayRaVien+","+this.liDo+","+phiNamVien;
    }
}
