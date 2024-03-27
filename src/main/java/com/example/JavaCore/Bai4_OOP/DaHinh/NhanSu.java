package com.example.JavaCore.Bai4_OOP.DaHinh;

public abstract class NhanSu {
    private String hoTen;
    private String gioiTinh;
    private int tuoi;

    public NhanSu() {

    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public NhanSu(String hoTen, String gioiTinh, int tuoi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public abstract double tinhLuongNS(int ngayCong);
}
