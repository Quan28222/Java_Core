package com.example.JavaCore.Bai4_OOP.SinhVien;

public class Student {
    private String hoTen;
    double diem;

    public Student() {
    }

    public Student(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    public void hienThiThongTin() {
        System.out.println("hoTen: " + hoTen + "\n" + "Diem: " + diem);
    }

    public double tinhTongTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    public double tinhTongTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    // support method(private) va service method(public)
    private boolean checkDiem() {
        return this.diem > 24;
    }

    public void checkHopLeDiem() {
        if (checkDiem()) {
            System.out.println("Diem hop le");
        } else {
            System.out.println("Diem khong hop le");
        }
    }

    //  parameter list
    public double tongDiem(double... arr) {
        double tong = 0;
        for (double x : arr) {
            tong += x;
        }
        return tong++;
    }
}
