package com.example.JavaCore.Bai4_OOP.KeThua;

public abstract class NhanVien {
    protected String hoTen;
    protected String queQuan;
    protected int sdt;
    protected  double luongCoBan = 850;


    public NhanVien(String hoTen, String queQuan, int sdt) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.sdt = sdt;
    }
    public abstract double tinhLuong();
}
