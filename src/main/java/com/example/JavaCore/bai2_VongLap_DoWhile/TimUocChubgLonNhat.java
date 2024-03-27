package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class TimUocChubgLonNhat {
    public static void main(String[] args) {
        // khoi tao bien
        int a, b;
        Scanner scanner = new Scanner(System.in);

        // cho nguoi dung nhap vao
        System.out.print("Nhap vao a: ");
        a = scanner.nextInt();

        System.out.print("Nhap vao b: ");
        b = scanner.nextInt();

        //  Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("Khong co uoc chung lon nhat");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Uoc chung lon nhat la: " + a);
    }
}
