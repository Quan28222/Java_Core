package com.example.JavaCore.bai2_VongLap_DoWhile;

import java.util.Scanner;

public class VongLapFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap vao ky tu: ");
        String c = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(c);
        }
    }
}
