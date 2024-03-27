package com.example.JavaCore.bai2_VongLap_DoWhile;


import java.util.Scanner;

public class TinhSoTienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrSoDien = new int[12];
        double[] arrTienDien = new double[12];
        double vnd;
        double tong = 0;
        for (int i = 0; i < arrSoDien.length; i++) {
            System.out.print("Moi ban nhap so dien thang " +(i+1) +":");
            arrSoDien[i] = scanner.nextInt();
            if (arrSoDien[i] <= 100) {
                vnd = arrSoDien[i] * 1.5;
            } else if (arrSoDien[i] <= 200) {
                vnd = (100 * 1.5) + ((arrSoDien[i] - 100) * 1.8);
            } else if (arrSoDien[i] <= 300) {
                vnd = (100 * 1.5) + (100 * 1.8) + ((arrSoDien[i] - 200) * 2.2);
            } else {
                vnd = (100 * 1.5) + (100 * 1.8) + (100 * 2.2) + ((arrSoDien[i] - 300) * 2.8);
            }
            arrTienDien[i] = vnd;
        }

        for (int i = 0; i < arrTienDien.length; i++) {
            System.out.println("Danh sach tong so tien dien cua thang " +(i+1) +" la: " + arrTienDien[i]) ;
            tong += arrTienDien[i];
        }
        System.out.println("Tong so tien dien cua 1 nam la: " + tong);
    }
}
