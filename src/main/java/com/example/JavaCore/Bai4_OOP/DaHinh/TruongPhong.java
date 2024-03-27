package com.example.JavaCore.Bai4_OOP.DaHinh;

public class TruongPhong extends NhanSu{

    public TruongPhong(String hoTen, String gioiTinh, int tuoi) {
        super(hoTen, gioiTinh, tuoi);
    }

    public TruongPhong() {

    }

    @Override
    public double tinhLuongNS(int ngayCong) {
        return 500 * ngayCong;
    }
}
