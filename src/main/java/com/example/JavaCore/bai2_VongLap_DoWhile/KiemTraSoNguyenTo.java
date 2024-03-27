package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("nhap n: ");
        n = scanner.nextInt();
        if (n == 1) {
            System.out.println(n + " khong phai so nguyen to");
        } else if (2 <= n && n <= 3) {
            System.out.println(n + " la so nguyen to");
        } else if (n % 2 == 0) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            int b = (int) Math.sqrt(n);
            boolean isSNT = true;
            for (int i = 2; i < b; i++) {
                if (n % i == 0) {
                    isSNT = false;
                    break;
                }
            }
            if (isSNT) {
                System.out.println("La so nguyen to");
            } else {
                System.out.println("Khong phai so nguyen to");
            }
        }
    }
}
