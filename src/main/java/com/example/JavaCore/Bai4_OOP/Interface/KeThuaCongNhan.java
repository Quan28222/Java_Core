package com.example.JavaCore.Bai4_OOP.Interface;

public class KeThuaCongNhan implements CongNhan {
    @Override
    public void thongTin(String hoTen, String sdt, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNgayCong) {

        return luongNgay * soNgayCong;
    }
}
