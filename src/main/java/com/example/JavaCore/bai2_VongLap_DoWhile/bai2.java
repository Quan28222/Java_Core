package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhap vao so n: ");
            n = scanner.nextInt();



        for (int i = 0; i < n; i++) {
//            System.out.println("n: " +i);
            System.out.printf("n: %d\n", (int) Math.pow(i, 2));
        }

        } while (n < 5);
        System.out.println("nhap vay thoi: ");
    }
}
