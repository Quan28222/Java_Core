package com.example.JavaCore.Bai4_OOP.QuanLyDiem;

public class KhoaToan extends NamHoc2023{
    private double diem1 = 0;
    private double diem2 = 0;
    private double diem3 = 0;
    public KhoaToan(String hoTen, String cccd) {
        super(hoTen, cccd);
    }

    public KhoaToan(String hoTen, String cccd, double diem1, double diem2, double diem3) {
        super(hoTen, cccd);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    // override

    @Override
    public double TinhDiemTB() {
        double DiemTB = (diem1 + diem2 + diem3) / 3;
        return DiemTB;
    }
}
