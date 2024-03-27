package com.example.JavaCore.Bai4_OOP.QuanLyDiem;

public class test {
    public static void main(String[] args) {
        // khoi tao doi tuong
        KhoaToan khoaToan1 = new KhoaToan("Con", "123", 8, 8, 8 );
        double DiemTB = khoaToan1.TinhDiemTB();
        System.out.println("Diem Tb cua khoa toan la: "+DiemTB);

        // khoi tao doi tuong
        KhoaAnh khoaAnh = new KhoaAnh("Son Soi", "2222", 8, 9, 10);
        double DiemTB2 = khoaAnh.TinhDiemTB();
        System.out.println("Diem TB cua khoa anh la: "+DiemTB2);

        // khoi tao doi tuong
        KhoaVan khoaVan = new KhoaVan("Tien Bry", "4444", 5, 9, 10);
        double DiemTB3 = khoaVan.TinhDiemTB();
        System.out.println("Diem TB cua khoa van la: "+DiemTB3);
    }
}
