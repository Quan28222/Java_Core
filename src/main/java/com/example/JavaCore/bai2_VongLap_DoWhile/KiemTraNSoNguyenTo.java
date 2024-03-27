package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class KiemTraNSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();

        System.out.printf(n + " so nguyen to dau tien la: ");
        int dem = 0;
        int i = 2;
//        while (dem < n) {
//            if (isSNT(i)) {
//                System.out.printf("%d ", i);
//                dem++;
//            }
//            i++;
//        }

        int check = 2;
        for (int j = 0; j < 1; j++) {
            j--;
            if (dem < n) {
                if (isSNT(check)) {
                    System.out.printf("%d ", check);
                    dem++;
                }
                check++;
            } else {
                break;
            }
        }

    }

    public static boolean isSNT(int n) {
        if (1 <= n && n <= 3) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        } else {
            int b = (int) Math.sqrt(n);
            for (int i = 2; i <= b; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
