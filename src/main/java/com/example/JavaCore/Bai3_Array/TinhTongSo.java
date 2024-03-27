package com.example.JavaCore.Bai3_Array;

import java.util.Scanner;

public class TinhTongSo {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so: ");
        int so = scanner.nextInt();

        for (int i = 1; i <= so ; i++) {
            sum += i;
        }
        System.out.println("Tong tu 1 den n la: " +sum);
    }
}
