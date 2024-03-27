package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int  n, chon;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("====================================================");
            System.out.println("1. Tim ra so nguyen to");
            System.out.println("2. Tim ra n so nguyen to, n nhap vao tu ban phim");
            System.out.println("3. Thoat");
            System.out.println("====================================================");

            System.out.print("Moi ban chon: ");
            chon = scanner.nextInt();
            switch (chon){
                case 1:
                    System.out.println("Tim ra so nguyen to");

                    System.out.print("nhap n: ");
                    n = scanner.nextInt();

                    if (1 <= n && n <= 3) {
                        System.out.println(n + " la so nguyen to");
                    } else if (n % 2 == 0) {
                        System.out.println(n + " khong phai la so nguyen to");
                    } else {
                        int b = (int) Math.sqrt(n);
                        boolean isSNT = true;
                        for (int i = 2; i <= b; i++) {
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
                case 2:
                    System.out.println("Tim ra n so nguyen to, n nhap vao tu ban phim");
                    break;
                case 3:
                    System.out.println("Thoat");
                    break;
                default:
                    System.out.println("Nhap tu 1 den 3 thoi :)))");
            }
        }while (chon != 3);
    }
}
