package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        int chon;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");

        do {
            System.out.println("Enter your choice: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Hinh chu nhat");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Hinh tam giac vuong");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hinh tam giac can");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice!");

            }
        } while (chon < 3);
    }
}
