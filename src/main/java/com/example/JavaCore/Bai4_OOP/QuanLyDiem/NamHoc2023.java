package com.example.JavaCore.Bai4_OOP.QuanLyDiem;

public class NamHoc2023 {
    // thuoc tinh
    protected String hoTen;
    protected String cccd;

    public NamHoc2023(String hoTen, String cccd) {
        this.hoTen = hoTen;
        this.cccd = cccd;
    }

    // phuong thuc
    public double TinhDiemTB(){
        System.out.println("Day la phuong thuc tinh diem TB cua class cha");
        return 10;
    }
}
