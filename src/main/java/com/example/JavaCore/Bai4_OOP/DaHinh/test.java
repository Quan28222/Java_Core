package com.example.JavaCore.Bai4_OOP.DaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu nhanSu = new PhoPhong("Quan", "Nam", 20);
        // xuat luong cua nhanSu khi pho phong
        double luongPhoPhong = nhanSu.tinhLuongNS(30);
        System.out.println("Luong cua pho phong la: "+luongPhoPhong);
        System.out.println("Ten cua pho phong la: "+nhanSu.getHoTen());

        // thay doi chuc vu
        nhanSu = new TruongPhong(nhanSu.getHoTen(), nhanSu.getGioiTinh(), nhanSu.getTuoi());
        // xuat luong cua nhanSu khi truong phong
        double luongTruongPhong = nhanSu.tinhLuongNS(30);
        System.out.println("Luong cua pho phong la: "+luongTruongPhong);
        System.out.println("Ten cua pho phong la: "+nhanSu.getHoTen());
        System.out.println("Gioi Tinh cua pho phong la: "+nhanSu.getGioiTinh());
        System.out.println("Tuoi cua pho phong la: "+nhanSu.getTuoi());
    }
}
