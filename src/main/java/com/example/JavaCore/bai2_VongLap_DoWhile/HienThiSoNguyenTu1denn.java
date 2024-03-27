package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class HienThiSoNguyenTu1denn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();

        System.out.print("Cac so nguyen to tu 1 -> n: ");
        for(int i = 0; i <= n; i++){
            if(isSNT(i)){
                System.out.print(i + "\t");
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
