package com.example.JavaCore.Bai4_OOP.Interface;

public interface CongNhan {
    // Tap cac thuoc tinh chi duoc phep la hang so
     static final double phuCap = 15;
     // cac phuong thuc
    public abstract void thongTin(String hoTen, String sdt, int namSinh);
    public abstract double tinhLuong(double luongNgay, int soNgayCong);
}
