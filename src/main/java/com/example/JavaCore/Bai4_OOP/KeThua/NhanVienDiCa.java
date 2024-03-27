package com.example.JavaCore.Bai4_OOP.KeThua;

public class NhanVienDiCa extends NhanVien {

    protected  int ca;

    public NhanVienDiCa(String hoTen, String queQuan, int sdt, int ca) {
        super(hoTen, queQuan, sdt);
        this.ca = ca;
    }

    public NhanVienDiCa(String hoTen, String queQuan, int sdt) {
        super(hoTen, queQuan, sdt);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan * 1.05; // cao hon 5% so voi NhanVienHanhChinh
    }
}
