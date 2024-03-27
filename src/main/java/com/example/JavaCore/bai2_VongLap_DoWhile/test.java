package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();

        if (1 <= n && n <= 3) {
            System.out.println(n + " la so nguyen to");
        } else if (n % 2 == 0) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            int [] checkSoNT ;
            int b = (int) Math.sqrt(n);
            boolean isSNT = true;
            for (int i = 2; i < n; i++) {
                for (int j = 2; j <= b; j++) {
                    if (n % j == 0) {
                        isSNT = false;
                        break;
                    }
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
