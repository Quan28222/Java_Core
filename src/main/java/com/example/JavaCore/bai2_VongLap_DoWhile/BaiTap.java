package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double vnd = 0;
        int soDien = 0;
        int thang = 1;
        double tong = 0;
        int[] soDienCacThang = new int[12];

        int i = 0;
        while (thang < 12) {

            System.out.print("\nMoi ban nhap so dien cua thang: ");
            thang = scanner.nextInt();
            System.out.print("Moi ban nhap so tien dien thang " + (thang) + ": ");
            soDien = scanner.nextInt();

            if (soDien <= 100) {
                vnd = soDien * 1.5;
                System.out.println("So tien dien thang " + (thang) + " la: " +vnd );
            } else if (soDien <= 200) {
                vnd = (100 * 1.5) + ((soDien - 100) * 1.8);
                System.out.println("So tien dien thang " + (thang) + " la: " +vnd );
            } else if (soDien <= 300) {
                vnd = (100 * 1.5) + (100 * 1.8) + ((soDien - 200) * 2.2);
                System.out.println("So tien dien thang " + (thang) + " la: " +vnd );
            } else {
                vnd = (100 * 1.5) + (100 * 1.8) + (100 * 2.2) + ((soDien - 300) * 2.8);
                System.out.println("So tien dien thang " + (thang) + " la: " +vnd );
            }
            tong += vnd;
        }

        System.out.print("\nTong so tien cua 1 nam la: " + tong);

    }

}
