package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class SuDungWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Moi ban nhap mat khau: ");
        String matKhau = scanner.nextLine();

        while (!matKhau.equals("vung oi mo ra")){
            System.out.println("Khong dung! Moi ban nhap vao mat khau: ");
            matKhau = scanner.nextLine();
        }
    }
}
