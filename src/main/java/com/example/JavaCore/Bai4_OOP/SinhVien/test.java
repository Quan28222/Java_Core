package com.example.JavaCore.Bai4_OOP.SinhVien;

public class test {
    public static void main(String[] args) {
        // khoi tao doi tuong Student
        Student st1 = new Student();
        st1.hienThiThongTin();

        Student st2 = new Student();
        st2.hienThiThongTin();

        // truyen du lieu cho hoTen va diem cho class Student
        Student st4 = new Student("Thai Lo", 25);
        st4.hienThiThongTin();

        // thay doi du lieu trong Student
        Student st3 = new Student();
        st3.setHoTen("Quan");
        st3.setDiem(7.0);
        st3.hienThiThongTin();

        // tinh tong trong binh
        double dtb1 = st3.tinhTongTB(7.5, 7.2);
        System.out.println("Tong TB cua st3 la: "+dtb1);

        // test phuong thuc toString()
        System.out.println(st3);

        // test checkDiem()
        st4.checkHopLeDiem();

        // test overloading
        double dtb2 = st3.tinhTongTB(8, 7, 8);
        System.out.println("Diem TB cua 3 mon la: "+dtb2);

        double dtb3 = st3.tinhTongTB(8, 9);
        System.out.println("Diem TB cua 2 mon la: "+dtb3);

        double tongDiem = st3.tongDiem(7,8,9,0,10,5,6,7);
        System.out.println("Tong diem la: "+tongDiem);
    }
}
