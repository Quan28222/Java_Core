package com.example.JavaCore.Bai1;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap nam: ");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d la nam nhuan", year);
                } else {
                    System.out.printf("%d khong phai nam nhuan", year);
                }
            } else {
                System.out.printf("%d la nam nhuan", year);
            }
        } else {
            System.out.printf("%d khong phai nam nhuan", year);
        }
    }
}
