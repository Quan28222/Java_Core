package com.example.JavaCore.Bai1;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten cua ban: ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s", name);
    }
}
