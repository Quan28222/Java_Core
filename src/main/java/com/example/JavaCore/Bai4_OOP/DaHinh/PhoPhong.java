package com.example.JavaCore.Bai4_OOP.DaHinh;

public class PhoPhong extends NhanSu{
    public PhoPhong(String hoTen, String gioiTinh, int tuoi) {
        super(hoTen, gioiTinh, tuoi);
    }
    @Override
    public double tinhLuongNS(int ngayCong) {
        return 400 * ngayCong;
    }


}
