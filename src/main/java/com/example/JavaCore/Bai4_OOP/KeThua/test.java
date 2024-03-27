package com.example.JavaCore.Bai4_OOP.KeThua;

public class test {
    public static void main(String[] args) {
        // Tao doi tuong NV1 truyen vao thong tin cho NV1
//        NhanVien nv1 = new NhanVien("Quan", "Ha Noi", 9999);
//        double luongNV1 = nv1.tinhLuong();
        // hien thi thong tin cua nhan vien 1
//        System.out.println("Luong cua NV 1 la: "+luongNV1);;

        // Tao doi tuong NhanVienHanhChinh
        NhanVienHanhChinh nvhc = new NhanVienHanhChinh("Son", "HaiPhong", 8888);
        double luongNVHC = nvhc.tinhLuong();
        System.out.println("Luong cua luongNVHC la: "+luongNVHC);

        // tao doi tuong NhanVienDiCa
        NhanVienDiCa nvdc = new NhanVienDiCa("Thai", "Ha Noi", 7777);
        double luongNVDC = nvdc.tinhLuong();
        System.out.println("Luong cua luongNVDC la: "+luongNVDC);

        NhanVienDiCa nvdc1 = new NhanVienDiCa("Hai", "Nam Dinh", 6666, 1);
        double luongnvdc1 = nvdc1.tinhLuong();
        System.out.println("Luong nhan vien di ca 1: "+luongnvdc1);
        System.out.println("Nhan vien di lam ca: "+nvdc1.ca);

        NhanVienHanhChinh nvhc1 = new NhanVienHanhChinh("A Phao", "HCM", 5555, 5);
        System.out.println(nvhc1);
        System.out.println("Nhan van cua phong: "+nvhc1.phong);
    }
}
