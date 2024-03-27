package com.example.JavaCore.Bai4_OOP.KeThua;

public class NhanVienHanhChinh extends NhanVien{

    protected int phong;

    public NhanVienHanhChinh(String hoTen, String queQuan, int sdt, int phong) {
        super(hoTen, queQuan, sdt);
        this.phong = phong;
    }

    public NhanVienHanhChinh(String hoTen, String queQuan, int sdt) {
        super(hoTen, queQuan, sdt);
    }

    @Override
    public String toString() {
        return "NhanVienHanhChinh{" +
                "hoTen='" + hoTen + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", sdt=" + sdt +
                ", luongCoBan=" + luongCoBan +
                '}';
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}
